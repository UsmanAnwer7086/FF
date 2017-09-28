package com.example.zaafirdar.fypprototype;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity3Activity extends ActionBarActivity {

    private ImageView iv;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        iv = (ImageView) findViewById(R.id.splashImage);
        tv = (TextView) findViewById(R.id.textView2);

        Animation myanimation = AnimationUtils.loadAnimation(this,R.anim.mytransition);

        iv.startAnimation(myanimation);
        tv.startAnimation(myanimation);



        Thread mythread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        mythread.start();
     }



}
