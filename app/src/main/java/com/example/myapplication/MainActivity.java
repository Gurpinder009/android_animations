package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable aniobj;

    ImageView img;
    Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.imageView);
        img.setBackgroundResource(R.drawable.animation);
        aniobj = (AnimationDrawable) img.getBackground();
        btn1 = findViewById(R.id.btn1);

        btn2 = findViewById(R.id.btn2);
    }

    public void onClick1(View view){
        aniobj.start();
        btn1.setText(R.string.stopFrameAnimation);
        btn1.setOnClickListener(this::StopAnimation);
    }


    public void StopAnimation(View view){
        aniobj.stop();
        btn1.setText(R.string.stframeAnimation);
        btn1.setOnClickListener(this::onClick1);
    }
    public void onClick2(View view){

        img.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));

//        startActivity(new Intent(this, TweenActivity.class));

    }


}




