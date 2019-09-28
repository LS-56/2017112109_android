package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Hello2 extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "Hello2";
    private static int objCount = 0;
    private int mObjCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        objCount++;
        mObjCount = objCount;
        Log.d(TAG, mObjCount + "-onCreate execute");
        settupClicks();
        setTitle("Hello2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,
                mObjCount = objCount; "-onStart execute");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, objCount++;
        mObjCount = objCount;
        "-onResume execute");
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
            intent = new Intent(Hello2.this, Hello1.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello2) {
            intent = new Intent(Hello2.this, Hello2.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.btToHello3) {
            intent = new Intent(Hello2.this, Hello3.class);
            startActivity(intent);
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
