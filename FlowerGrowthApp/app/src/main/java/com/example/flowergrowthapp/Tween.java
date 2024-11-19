package com.example.flowergrowthapp;

import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Tween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        ImageView ivRotate = findViewById(R.id.ivTween);
        ivRotate.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotation));
    }
}