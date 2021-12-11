package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Lifecycle Created", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        Toast.makeText(getApplicationContext(), "Lifecycle Started", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(), "Lifecycle Resumed", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(), "Lifecycle Paused", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(), "Lifecycle Stopped", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(), "Lifecycle Restarted", Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "Lifecycle Destroyed", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
}
