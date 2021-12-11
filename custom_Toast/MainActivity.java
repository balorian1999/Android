package com.example.shared_preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity   {

    Button b;
    EditText us,pd;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.SUBMIT);
        us=(EditText)findViewById(R.id.username);
        pd=(EditText)findViewById(R.id.password);
        sp = getSharedPreferences("MyDetails",MODE_PRIVATE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit = sp.edit();
                String usd = us.getText().toString();
                String psd = pd.getText().toString();
                edit.putString("name",usd);
                edit.putString("pass",psd);
                edit.apply();

                Intent it = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(it);
            }
        });
    }
}
