package com.example.linear_layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout l1;
    Button b1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        l1 = new LinearLayout(this);
        b1 = new Button(this);
        t1 = new TextView(this);

        LinearLayout.LayoutParams vd = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        l1.setLayoutParams(vd);

        LinearLayout.LayoutParams dd  = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dd.setMargins(0,50,0,0);

        t1.setLayoutParams(dd);
        b1.setLayoutParams(dd);

        l1.setOrientation(LinearLayout.VERTICAL);
        l1.setVerticalGravity(Gravity.CENTER_VERTICAL);

        t1.setText("GAME ON!");
        t1.setGravity(Gravity.CENTER);
        t1.setTextSize(35);
        t1.setTextColor(Color.BLACK);
        t1.setTypeface(Typeface.DEFAULT_BOLD);

        b1.setText("LOGIN");
        b1.setBackgroundColor(Color.BLACK);
        b1.setTextColor(Color.WHITE);
        l1.addView(t1);
        l1.addView(b1);

        setContentView(l1);


    }
}
