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
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
    }
    Integer[] arr = new Integer[5];
    String[] aHardwareName= {"Hårddisk", "Grafikkort", "Processor", "PSU", "SSD"};


    }



