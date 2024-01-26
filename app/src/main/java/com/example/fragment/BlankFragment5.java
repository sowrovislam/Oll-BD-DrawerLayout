package com.example.fragment;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;


public class BlankFragment5 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView5=inflater.inflate(R.layout.fragment_blank5, container, false);


        AppCompatButton button;

        TextInputEditText textInputEditText;

        TextToSpeech textToSpeech;

        textToSpeech=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });


        textInputEditText=myView5.findViewById(R.id.specked);

        button=myView5.findViewById(R.id.speckbutton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textInputEditText.length()!=0){

                    textToSpeech.speak(""+textInputEditText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null,null);







                }





            }
        });










        return myView5;
    }
}