package com.example.ui_validations;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements TextWatcher, View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    EditText e1;
    TextView b1;
    CheckBox c1;
    ToggleButton t1;
    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.hh);

        e1 = findViewById(R.id.num);
        c1=findViewById(R.id.cd);
        t1=findViewById(R.id.theme);
        b1=findViewById(R.id.vd);

        e1.addTextChangedListener(this);
        c1.setOnClickListener(this);
        t1.setOnCheckedChangeListener(this);

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {
        String s = editable.toString();
        Float nums=0f;
        if(s!=null && !s.isEmpty())
        {
            nums = Float.parseFloat(s);
        }
        if(nums > 100)
        {
            editable.replace(0,editable.length(),"100");
        }

    }

    @Override
    public void onClick(View view) {
        if(c1.isChecked())
        {
            Toast.makeText(this,"Terms and Conditions",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"Accept Terms and Conditions",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b)
        {
           l1.setBackgroundColor(Color.DKGRAY);
           c1.setTextColor(Color.WHITE);
           e1.setTextColor(Color.WHITE);
           b1.setTextColor(Color.WHITE);

        }
        else
        {
            l1.setBackgroundColor(Color.LTGRAY);
            c1.setTextColor(Color.BLACK);
            e1.setTextColor(Color.BLACK);
            b1.setTextColor(Color.BLACK);
        }
    }
}