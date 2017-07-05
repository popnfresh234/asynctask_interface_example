package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements AsyncListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAsyncTask myTask = new MyAsyncTask(this);
        myTask.execute();
    }

    @Override
    public void returnString(String myString) {
        Log.i("Interface method: ", myString);
    }
}
