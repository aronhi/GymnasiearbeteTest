package com.example.ah980627.gymnasiearbetetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;



public class Stage1ActivityGpu extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1_gpu);


        boolean box1 = true;
        boolean box2 = true;
        boolean box3 = true;
        boolean box4 = true;
        boolean box5 = true;
        boolean box6 = true;

        int correctbox1 = 0;

        String svar ="Grafikkort";
        String boxName1 = "";
        String boxName2 = "";
        String boxName3 = "";
        String boxName4 = "";
        String boxName5 = "";
        String boxName6 = "";
//skapar en arry med tal från 0 till 5
        Integer[] arr = new Integer[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //blandar om arrayen random
        Collections.shuffle(Arrays.asList(arr));


        //skapr en string array med datorkomponenters namn
        String[] getHardwareName = {"Hårddisk", "Grafikkort", "Processor", "PSU", "SSD", "Moderkort"};
        //ger komponenterna ett värde efter förta arrayen
        for (Integer arrNumber : arr) {
            String result = getHardwareName[arrNumber];
            if (box1) {
                boxName1 = result;
                box1 = false;
                if(result == svar){
                    correctbox1 = 1;
                }else {correctbox1 = correctbox1;}
            } else if (box2) {
                boxName2 = result;
                box2 = false;
                if(result == svar){
                    correctbox1 = 2;
                }else {correctbox1 = correctbox1;}
            } else if (box3) {
                boxName3 = result;
                box3 = false;
                if(result == svar){
                    correctbox1 = 3;
                }else {correctbox1 = correctbox1;}
            } else if (box4) {
                boxName4 = result;
                box4 = false;
                if(result == svar){
                    correctbox1 = 4;
                }else {correctbox1 = correctbox1;}
            } else if (box5) {
                boxName5 = result;
                box5 = false;
                if(result == svar){
                    correctbox1 = 5;
                }else {correctbox1 = correctbox1;}

            } else if (box6) {
            boxName6 = result;
            box5 = false;
            if(result == svar){
                correctbox1 = 6;
            }else {correctbox1 = correctbox1;}

        }

        }

        //spell out the text from the for loop
        TextView boxed1 = (TextView)findViewById(R.id.box1);
        boxed1.setText(boxName1);
        if(correctbox1 == 1){
            boxed1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityCpu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed1.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

        TextView boxed2 = (TextView)findViewById(R.id.box2);
        boxed2.setText(boxName2);

        if(correctbox1 == 2){
            boxed2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityCpu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed2.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

        TextView boxed3 = (TextView)findViewById(R.id.box3);
        boxed3.setText(boxName3);

        if(correctbox1 == 3){
            boxed3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityCpu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

        TextView boxed4 = (TextView)findViewById(R.id.box4);
        boxed4.setText(boxName4);

        if(correctbox1 == 4){
            boxed4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityCpu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed4.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

        TextView boxed5 = (TextView)findViewById(R.id.box5);
        boxed5.setText(boxName5);

        if(correctbox1 == 5){
            boxed5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityCpu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }
        TextView boxed6 = (TextView)findViewById(R.id.box6);
        boxed6.setText(boxName6);

        if(correctbox1 == 6){
            boxed6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, Stage1ActivityPsu.class);
                    startActivity(i);
                }
            });
        }else{
            boxed6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent i = new Intent(Stage1ActivityGpu.this, MainActivity.class);
                    startActivity(i);
                }
            });

        }

    }



}










