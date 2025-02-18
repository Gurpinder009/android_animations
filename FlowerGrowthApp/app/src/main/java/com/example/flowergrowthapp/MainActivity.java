package com.example.flowergrowthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable lightsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgFrame=(ImageView)findViewById(R.id.ivFlower);
        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation=(AnimationDrawable)imgFrame.getBackground();
        Button button1=findViewById(R.id.btStart);
        Button button2=findViewById(R.id.btStop);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.stop();
                startActivity (new Intent(MainActivity.this, Tween.class));
            }
        });
    }

}



