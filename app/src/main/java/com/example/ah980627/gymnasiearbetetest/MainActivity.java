package com.example.ah980627.gymnasiearbetetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ah980627.gymnasiearbetetest.Stage1.Stage1ActivityHdd;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        public void Stage1OnClick(View v){

            if (v.getId()==R.id.button){
                Intent i = new Intent(MainActivity.this, Stage1ActivityHdd.class);
                startActivity(i);

            }


        }

    public void HowToPlayOnClick(View v){

        if (v.getId()==R.id.button2){
            Intent i = new Intent(MainActivity.this, HowToPlayActivity.class);
            startActivity(i);

        }


    }


    }

