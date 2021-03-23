package com.example.lectureroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.LinearLayout;


public class LectureRoom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_lecturerooom);

        Window win = getWindow();
        win.setContentView(R.layout.activity_main);

        LayoutInflater inflater = (LayoutInflater)getSystemService(

                Context.LAYOUT_INFLATER_SERVICE);

        LinearLayout linear = (LinearLayout)inflater.inflate(R.layout.activity_lecturerooom, null);

        linear.setBackgroundColor(Color.parseColor("#00ff0000"));
        linear.setGravity(Gravity.CENTER);
        linear.setPadding(5, 100,5,40);

        //파라미터를 세팅해줌

        LinearLayout.LayoutParams paramlinear = new LinearLayout.LayoutParams(

                LinearLayout.LayoutParams.MATCH_PARENT,

                LinearLayout.LayoutParams.MATCH_PARENT

        );



        //윈도우에 추가시킴
        win.addContentView(linear, paramlinear);

        //강의동 버튼 intent
            Button button01= findViewById(R.id.button01);
            button01.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                    intent.putExtra("key", 1);
                    startActivity(intent);

                }
            });
            Button button02 = findViewById(R.id.button02);
            button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 2);
                startActivity(intent);

            }
        });
        Button button03 = findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 3);
                startActivity(intent);

            }
        });
        Button button04 = findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 4);
                startActivity(intent);

            }
        });
        Button button05 = findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 5);
                startActivity(intent);

            }
        });
        Button button06 = findViewById(R.id.button06);
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 6);
                startActivity(intent);

            }
        });
        Button button07 = findViewById(R.id.button07);
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 7);
                startActivity(intent);

            }
        });
        Button button08 = findViewById(R.id.button08);
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 8);
                startActivity(intent);

            }
        });
        Button button09 = findViewById(R.id.button09);
        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 9);
                startActivity(intent);

            }
        });
        Button button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), subLectureRoom.class);
                intent.putExtra("key", 10);
                startActivity(intent);

            }
        });
        ImageButton res = findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Res.class);
                startActivity(intent);

            }
        });

        }
    }
