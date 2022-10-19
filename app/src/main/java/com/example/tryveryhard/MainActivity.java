package com.example.tryveryhard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final int[] flag = {0};
    int map[][]=new int[2][9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0_0= findViewById(R.id.button0_0);
        button0_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=0,j=0;
                ButtonClick(i,j,button0_0);
            }
        });

        Button button0_1= findViewById(R.id.button0_1);
        button0_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=0,j=1;
                ButtonClick(i,j,button0_1);
            }
        });

        Button button0_2= findViewById(R.id.button0_2);
        button0_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=0,j=2;
                ButtonClick(i,j,button0_2);
            }
        });

        Button button1_0= findViewById(R.id.button1_0);
        button1_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=1,j=0;
                ButtonClick(i,j,button1_0);
            }
        });

        Button button1_1= findViewById(R.id.button1_1);
        button1_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=1,j=1;
                ButtonClick(i,j,button1_1);
            }
        });

        Button button1_2= findViewById(R.id.button1_2);
        button1_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=1,j=2;
                ButtonClick(i,j,button1_2);
            }
        });

    }
    public void ButtonClick(int i,int j,Button button){
        if(map[i][j] ==0)
        {
            button.setBackgroundResource(R.drawable.green_shixin);
            map[i][j] =1;
        }
        else
        {
            button.setBackgroundResource(R.drawable.green_kongxin);
            map[i][j]=0;
        }
    }
}