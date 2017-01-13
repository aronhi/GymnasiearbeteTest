package com.example.ah980627.gymnasiearbetetest.Stage1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.ah980627.gymnasiearbetetest.R;

public class Fail1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail1);

        // Now get a handle to any View contained
        // within the main layout you are using
        View someView = findViewById(R.id.activity_fail1);

        // Find the root view
        View root = someView.getRootView();

        // Set the color
        root.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));

        RelativeLayout onclick = (RelativeLayout)findViewById(R.id.activity_fail1);
        onclick.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Fail1Activity.this, Stage1ActivityHdd.class);
                startActivity(i);


    }
});
        TextView onclick1 =(TextView)findViewById(R.id.textView4);
        onclick1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Fail1Activity.this, Stage1ActivityHdd.class);
                startActivity(i);


            }
        });
        TextView onclick3 =(TextView)findViewById(R.id.textView5);
        onclick3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(Fail1Activity.this, Stage1ActivityHdd.class);
                startActivity(i);


            }
        });




    }
}