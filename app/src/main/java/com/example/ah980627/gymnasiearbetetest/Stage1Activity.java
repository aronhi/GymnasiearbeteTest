package com.example.ah980627.gymnasiearbetetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.Collections;



public class Stage1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1);

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

        }


    }
}



