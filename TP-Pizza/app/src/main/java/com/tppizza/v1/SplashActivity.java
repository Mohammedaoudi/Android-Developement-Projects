package com.tppizza.v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        image=findViewById(R.id.logo);
        TranslateAnimation vibrationAnimation = new TranslateAnimation(
                Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f,
                Animation.RELATIVE_TO_SELF, -0.05f, Animation.RELATIVE_TO_SELF, 0.05f
        );

        vibrationAnimation.setDuration(100);
        vibrationAnimation.setRepeatCount(Animation.INFINITE);
        vibrationAnimation.setRepeatMode(Animation.REVERSE);

        image.startAnimation(vibrationAnimation);

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2000);
                    Intent intent = new Intent(SplashActivity.this, ListPizzaActivity.class);
                    startActivity(intent);
                    SplashActivity.this.finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        t1.start();

    }


    @Override
    protected void onPause(){
        super.onPause();
        this.finish();
    }

}