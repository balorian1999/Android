package com.example.shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button b;
    EditText t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences df = getSharedPreferences("MyDetails",MODE_PRIVATE);
        b = (Button)findViewById(R.id.LOGIN);
        t1 = (EditText) findViewById(R.id.username);
        t2 = (EditText) findViewById(R.id.password);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usd = t1.getText().toString();
                String psd = t2.getText().toString();
                String fg = df.getString("name","").toString();
                String gh = df.getString("pass","").toString();
                if(usd.equalsIgnoreCase(fg) && psd.equalsIgnoreCase(gh))
                {
                    View lay= LayoutInflater.from(MainActivity2.this)
                            .inflate(R.layout.customlayout, null);
                    Toast t1 = new Toast(getApplicationContext());
                    t1.setDuration(Toast.LENGTH_LONG);
                    t1.setGravity(Gravity.CENTER,0,180);
                    t1.setView(lay);
                    t1.show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"LOGIN FAILURE "+fg,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}