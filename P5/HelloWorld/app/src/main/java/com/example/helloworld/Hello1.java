package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Hello1 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d(TAG, "onCreate execute");
        settupClicks();
        setTitle("Hello1");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart execute");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume execute");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause execute");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop execute");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy execute");
    }

    @Override
    public void onClick(View v) {
        Button b;
        Intent intent;
        if (v.getId() == R.id.btToHello1) {
            intent = new Intent(Hello1.this, Hello1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello2) {
            intent = new Intent(Hello1.this, Hello2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello3) {
            // intent = new Intent(Hello1.this, Hello3.class);
            //  startActivity(intent);
            Intent intent1 = new Intent(Intent.ACTION_VIEW);
            intent1.setData(Uri.parse("geo:0,0?z=4&q=business+near+city"));
            // intent1.setData(Uri.parse("tel:555-555-555"));
            startActivity(intent1);
        }
    }


    private void settupClicks() {
        Button b;
        b = (Button) findViewById(R.id.btToHello1);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello2);
        b.setOnClickListener(this);
        b = (Button) findViewById(R.id.btToHello3);
        b.setOnClickListener(this);
    }
}
