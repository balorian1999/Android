package com.example.frame_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout l1;
    ImageView im;
    TextView t1;
    ImageButton ff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=findViewById(R.id.card);
        im=findViewById(R.id.happy);
        t1=findViewById(R.id.wil);
        ff=findViewById(R.id.hbt);


        l1.setOnClickListener(this);
        im.setOnClickListener(this);
        ff.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.happy)
        {
            im.setVisibility(View.GONE);
            t1.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);
        }
        if(view.getId() == R.id.hbt)
        {
            l1.setVisibility(View.GONE);
            im.setVisibility(View.VISIBLE);
            t1.setVisibility(View.VISIBLE);

        }
    }
}