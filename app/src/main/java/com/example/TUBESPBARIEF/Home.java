package com.example.TUBESPBARIEF;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    Animation smalltobig ,nothingtocome , btnanim ;
    TextView textView;
    Button btnn1 , btnn2 ,btnn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        smalltobig = AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        nothingtocome =AnimationUtils.loadAnimation(this,R.anim.nothingtocome);
        btnanim = AnimationUtils.loadAnimation(this,R.anim.btn_animation);

        textView = (TextView)findViewById(R.id.JudulPertama);
        btnn1 = (Button)findViewById(R.id.button1);
        btnn2 = (Button)findViewById(R.id.button2);
        btnn3 = (Button)findViewById(R.id.button3);

        textView.startAnimation(smalltobig);
        btnn1.startAnimation(btnanim);
        btnn2.startAnimation(btnanim);
        btnn3.startAnimation(btnanim);

    }

    public void btn1(View view){
        Intent btn1 = new Intent(this,news.class);
        startActivity(btn1);
    }

    public void btn2(View view){
        Intent btn2 = new Intent(this,MainActivity.class);
        startActivity(btn2);
    }

    public void btn3(View view){
        Intent btn3 = new Intent(this,juara.class);
        startActivity(btn3);
    }
}
