package com.example.fonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.fd);

        Typeface tf = Typeface.createFromAsset(getAssets(),"font/Debrosee-ALPnL.ttf");
        t1.setTypeface(tf);
    }
}