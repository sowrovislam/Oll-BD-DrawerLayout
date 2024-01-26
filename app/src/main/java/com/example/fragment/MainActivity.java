package com.example.fragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    MaterialToolbar materialToolbar;
    BottomNavigationView bottomNavigationView;
    NavigationView navigationView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerLayout);
        materialToolbar=findViewById(R.id.matrealtoolbar);
        bottomNavigationView=findViewById(R.id.bottomnavagation);
        navigationView=findViewById(R.id.navigationView);


        ActionBarDrawerToggle actionBarDrawerToggle=new ActionBarDrawerToggle(
                MainActivity.this,drawerLayout,materialToolbar,R.string.open_drawer,R.string.close_drawer);
       drawerLayout.addDrawerListener(actionBarDrawerToggle);


       //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new BlankFragment());
        fragmentTransaction.commit();




       //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        materialToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {

               if (item.getItemId()==R.id.exit){



                   new AlertDialog.Builder(MainActivity.this)

                           .setTitle("Do You Realy !! Exit")
                           .setMessage("tnx you sire")
                           .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {


                                   dialog.dismiss();

                               }
                           })

                           .setPositiveButton(" Exit", new DialogInterface.OnClickListener() {
                               @Override
                               public void onClick(DialogInterface dialog, int which) {
                                   finish();
                                   dialog.dismiss();

                               }
                           })


                           .show();

                   Toast.makeText(MainActivity.this, "Exit ", Toast.LENGTH_SHORT).show();

               }

               return false;
           }
       });


        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


       bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {


               if (item.getItemId()==R.id.home){


                   FragmentManager fragmentManager=getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                   fragmentTransaction.add(R.id.frameLayout,new BlankFragment());
                   fragmentTransaction.commit();


                   Toast.makeText(MainActivity.this, "HOME ", Toast.LENGTH_SHORT).show();

               } else if (item.getItemId()==R.id.bottomC) {


               } else if (item.getItemId()==R.id.bottomS) {



               }


               return true;
           }
       });


   //>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<




       navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {



               if (item.getItemId()==R.id.sms){

                   Toast.makeText(MainActivity.this, "i am home ", Toast.LENGTH_SHORT).show();

               }



               return true;
           }
       });
























    }






    }
