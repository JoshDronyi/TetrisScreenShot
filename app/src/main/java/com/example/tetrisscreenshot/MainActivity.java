package com.example.tetrisscreenshot;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("creating","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("starting","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("resuming","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("pausing","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("stopping","onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("DESTROYING!!!!!","KILL EVERYONE AND EVERYTHING!!!!!!");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Restarting","Good thing we didn't kill everyone and everything, right?");

    }
}
