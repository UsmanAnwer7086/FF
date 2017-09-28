package com.example.zaafirdar.fypprototype;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.btn_load);

        btn.setOnClickListener(new View.OnClickListener( ) {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2Activity.class));
            }
        });



    }



}
