package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment2 extends Fragment {

    int count1=0;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView=inflater.inflate(R.layout.fragment_blank2, container, false);

        TextView minuse,reset, count;
        AppCompatButton addbutton;


        minuse=myView.findViewById(R.id.minuse);
        reset=myView.findViewById(R.id.reset);
        count=myView.findViewById(R.id.count);
        addbutton=myView.findViewById(R.id.addbutton);

        minuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count1!=0){

                    count1--;

                    count.setText(""+count1);



                }



            }
        });

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1++;

                count.setText(""+count1);




            }
        });




        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count1=0;

                count.setText(""+count1);




            }
        });

















        return myView ;
    }



}