package com.example.table_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.clear);

        t1=findViewById(R.id.mail);
        t2=findViewById(R.id.name);
        t3=findViewById(R.id.usname);
        t4=findViewById(R.id.pass);

        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");



    }
}