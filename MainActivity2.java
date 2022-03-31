package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    SharedPreferences fd;
    TextView tp;
    Button custom,list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tp = findViewById(R.id.sum);
        fd = getSharedPreferences("sumfile",MODE_PRIVATE);
        String f = fd.getString("sum","None");
        tp.setText(f);
        custom = findViewById(R.id.custom);
        list = findViewById(R.id.listview);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                Intent fd = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(fd);
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View vd = LayoutInflater.from(MainActivity2.this).inflate(R.layout.layout,null);
                Toast t1 = new Toast(getApplicationContext());
                t1.setDuration(Toast.LENGTH_LONG);
                t1.setGravity(Gravity.CENTER,0,180);
                t1.setView(vd);
                t1.show();
            }
        });

    }
}