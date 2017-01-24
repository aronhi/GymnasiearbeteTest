package com.example.ah980627.gymnasiearbetetest.Stage1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ah980627.gymnasiearbetetest.R;
import com.example.ah980627.gymnasiearbetetest.Stage2Activity;

import java.util.Arrays;
import java.util.Collections;



public class Stage1ActivityRam extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        // do nothing.
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage1_ram);


        boolean box1 = true;
        boolean box2 = true;
        boolean box3 = true;
        boolean box4 = true;


        int correctbox1 = 0;

        String svar = "Internminne";
        String boxName1 = "";
        String boxName2 = "";
        String boxName3 = "";
        String boxName4 = "";

//skapar en arry med tal från 0 till 6
        Integer[] arr = new Integer[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //blandar om arrayen random
        Collections.shuffle(Arrays.asList(arr));


        //skapr en string array med datorkomponenters namn
        String[] getHardwareName = {"Grafikkort", "Internminne", "Nätaggregat", "SSD",};
        //ger komponenterna ett värde efter förta arrayen
        for (Integer arrNumber : arr) {
            String result = getHardwareName[arrNumber];
            if (box1) {
                boxName1 = result;
                box1 = false;
                if (result == svar) {
                    correctbox1 = 1;
                } else {
                    correctbox1 = correctbox1;
                }
            } else if (box2) {
                boxName2 = result;
                box2 = false;
                if (result == svar) {
                    correctbox1 = 2;
                } else {
                    correctbox1 = correctbox1;
                }
            } else if (box3) {
                boxName3 = result;
                box3 = false;
                if (result == svar) {
                    correctbox1 = 3;
                } else {
                    correctbox1 = correctbox1;
                }
            } else if (box4) {
                boxName4 = result;
                box4 = false;
                if (result == svar) {
                    correctbox1 = 4;
                } else {
                    correctbox1 = correctbox1;
                }
            }
        }

        //spell out the text from the for loop
        Button boxed1 = (Button) findViewById(R.id.box1);
        boxed1.setText(boxName1);
        if (correctbox1 == 1) {
            boxed1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Stage2Activity.class);
                    startActivity(i);
                }
            });
        } else {
            boxed1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Fail1Activity.class);
                    startActivity(i);
                }
            });

        }

        Button boxed2 = (Button) findViewById(R.id.box2);
        boxed2.setText(boxName2);

        if (correctbox1 == 2) {
            boxed2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Stage2Activity.class);
                    startActivity(i);
                }
            });
        } else {
            boxed2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Fail1Activity.class);
                    startActivity(i);
                }
            });

        }

        Button boxed3 = (Button) findViewById(R.id.box3);
        boxed3.setText(boxName3);

        if (correctbox1 == 3) {
            boxed3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Stage2Activity.class);
                    startActivity(i);
                }
            });
        } else {
            boxed3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Fail1Activity.class);
                    startActivity(i);
                }
            });

        }

        Button boxed4 = (Button) findViewById(R.id.box4);
        boxed4.setText(boxName4);

        if (correctbox1 == 4) {
            boxed4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Stage2Activity.class);
                    startActivity(i);
                }
            });
        } else {
            boxed4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(Stage1ActivityRam.this, Fail1Activity.class);
                    startActivity(i);
                }
            });

        }

    }



}











