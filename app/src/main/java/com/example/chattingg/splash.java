package com.example.chattingg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    ImageView logo1,logo2;
    TextView appname,names;

    Animation topAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        logo1=findViewById(R.id.logoimg);
        logo2=findViewById(R.id.ownone);
        appname=findViewById(R.id.logonameimg);
        names=findViewById(R.id.owntwo);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        logo1.setAnimation(topAnim);
        logo2.setAnimation(topAnim);
        appname.setAnimation(bottomAnim);
        names.setAnimation(bottomAnim);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent= new Intent(splash.this,registration.class );
                startActivity(intent);
                finish();
            }
        } ,900);
    }
}