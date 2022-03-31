package com.example.icecreamshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    TextView item, topping, total;
    Button bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bttn = (Button) findViewById(R.id.bttn);
        item = (TextView) findViewById(R.id.item);
        topping = (TextView) findViewById(R.id.topping);
        total = (TextView) findViewById(R.id.total);

        // getting values from bundle
        Bundle bundle = getIntent().getExtras();
        String a = bundle.getString("Item");
        String b = bundle.getString("Topping");
        int c = bundle.getInt("Price");

        // displaying bundle values
        item.setText(a);
        topping.setText(b);
        total.setText(String.valueOf(c));

        // order again button
        bttn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
