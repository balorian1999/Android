package com.example.shared_pref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    SharedPreferences df;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b2 = (Button)findViewById(R.id.previous);
        t1 = (TextView)findViewById(R.id.username);
        t2 = (TextView)findViewById(R.id.password);
        df = getSharedPreferences("PrefUser",MODE_PRIVATE);
        String fg = df.getString("name","").toString();
        String gh = df.getString("pass","").toString();
        t1.setText(fg);
        t2.setText(gh);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iu = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(iu);
            }
        });
    }
}