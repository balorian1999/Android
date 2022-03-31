package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements TextWatcher {
    LinearLayout l1;
    Button bn,b2;
    EditText e1,e2;
    SharedPreferences fd;
    int b=0;
    int img[] = {R.drawable.vishnu,R.drawable.kitten1,R.drawable.kitten2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1 = findViewById(R.id.dd);
        bn = findViewById(R.id.toggleButton);
        b2 = findViewById(R.id.b2);
        e1 = findViewById(R.id.n1);
        e2 = findViewById(R.id.n2);
        fd = getSharedPreferences("sumfile",MODE_PRIVATE);

        e1.addTextChangedListener(this);
        e2.addTextChangedListener(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit = fd.edit();
                int a = Integer.valueOf(e1.getText().toString());
                int b = Integer.valueOf(e2.getText().toString());
                edit.putString("sum",Integer.toString(a+b));
                edit.apply();
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b == 0)
                {
                    l1.setBackground(getDrawable(img[b]));
                }
                if(b == 1)
                {
                    l1.setBackground(getDrawable(img[b]));

                }
                if(b == 2)
                {
                    l1.setBackground(getDrawable(img[b]));

                }
                if(b==2)
                {
                    b=0;
                }
                else
                {
                b=b+1;
                }
            }
        });
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        String sa = s.toString();
        if(sa != null &&  !sa.isEmpty()) {
            int a = Integer.valueOf(sa);

            if (a > 20) {
                s.replace(0, s.length(), "20");

            }
        }
    }
}