package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText us;
    EditText ps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        us = (EditText) findViewById(R.id.username);
        ps = (EditText) findViewById(R.id.password);
     }
        public void submit (View v){
            String fd = us.getText().toString();
            String pd = ps.getText().toString();
            if(fd.equalsIgnoreCase("Vishnu") && pd.equalsIgnoreCase("vish@123")) {
                Toast.makeText(getApplicationContext(), "LOGIN SUCCESS FOR "+fd, Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplicationContext(), "LOGIN UNSUCCESSFUL", Toast.LENGTH_LONG).show();
            }
        }


}
