package com.example.ah980627.gymnasiearbetetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;



public class Stage1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);


        boolean box1 = true;
        boolean box2 = true;
        boolean box3 = true;
        boolean box4 = true;
        boolean box5 = true;

        boolean correctbox1=false;

        String svar ="Hårddisk";
        String boxName1 = "";
        String boxName2 = "";
        String boxName3 = "";
        String boxName4 = "";
        String boxName5 = "";
//skapar en arry med tal från 0 till 5
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //blandar om arrayen random
        Collections.shuffle(Arrays.asList(arr));


        //skapr en string array med datorkomponenters namn
        String[] getHardwareName = {"Hårddisk", "Grafikkort", "Processor", "PSU", "SSD"};
        //ger komponenterna ett värde efter förta arrayen
        for (Integer arrNumber : arr) {
            String result = getHardwareName[arrNumber];
            if (box1) {
                boxName1 = result;
                box1 = false;
                if(result == svar){
                    correctbox1 = true;
                }else {correctbox1 =false;}
            } else if (box2) {
                boxName2 = result;
                box2 = false;
            } else if (box3) {
                boxName3 = result;
                box3 = false;
            } else if (box4) {
                boxName4 = result;
                box4 = false;
            } else if (box5) {
                boxName5 = result;
                box5 = false;

            }
        }

        //spell out the text from the for loop
       if (correctbox1==true){TextView boxed1 = (TextView)findViewById(R.id.box1);
        boxed1.setText(boxName1);}

        TextView boxed2 = (TextView)findViewById(R.id.box2);
        boxed2.setText(boxName2);

        TextView boxed3 = (TextView)findViewById(R.id.box3);
        boxed3.setText(boxName3);

        TextView boxed4 = (TextView)findViewById(R.id.box4);
        boxed4.setText(boxName4);

        TextView boxed5 = (TextView)findViewById(R.id.box5);
        boxed5.setText(boxName5);

    }


    }










