package com.example.lectureroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class subLectureRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       int n=getIntent().getIntExtra("key",0);
       switch(n){
           case 1:
               setContentView(R.layout. lectureroom_1);
               break;
           case 2:
               setContentView(R.layout. lectureroom_2);
               break;
           case 3:
               setContentView(R.layout. lectureroom_3);
               break;
           case 4:
               setContentView(R.layout. lectureroom_4);
               break;
           case 5:
               setContentView(R.layout. lectureroom_5);
               break;
           case 6:
               setContentView(R.layout. lectureroom_6);
               break;
           case 7:
               setContentView(R.layout. lectureroom_7);
               break;
           case 8:
               setContentView(R.layout. lectureroom_8);
               break;
           case 9:
               setContentView(R.layout. lectureroom_9);
               break;
           case 10:
               setContentView(R.layout. lectureroom_10);
               break;


       }

    }
}
