package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    sql dd;
    EditText name;
    EditText place;
    Button btn;
    Button btn2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        place=findViewById(R.id.place);
        btn=findViewById(R.id.btn);
        btn2=findViewById(R.id.btn2);
        tv=findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String a = name.getText().toString();
                String b = place.getText().toString();
                long id = dd.insertData(a,b);
                if (id < 0)
                    Toast.makeText(getApplicationContext(),"Unsucessfull",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"sucessfull",Toast.LENGTH_LONG).show();
            }

        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String st = dd.display();
                tv.setText(st);
            }
        });


     dd=new sql(this,"student",null,1);
     dd.getWritableDatabase();
    }

}
