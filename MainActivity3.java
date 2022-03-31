package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView l1;
    String ds[] = {"cat","dog","boy"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        l1 = findViewById(R.id.anim);
        ArrayAdapter<String> ad = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ds);
        l1.setAdapter(ad);
        l1.setOnItemClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionsmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item1)
        {
            Toast.makeText(getApplicationContext(), "MainActivity1", Toast.LENGTH_SHORT).show();
            return  true;
        }
        if(id == R.id.item2)
        {
            Toast.makeText(getApplicationContext(), "MainActivity1", Toast.LENGTH_SHORT).show();
            return  true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView t = (TextView) view;
        Toast.makeText(getApplicationContext(), t.getText()+" "+position, Toast.LENGTH_SHORT).show();
    }
}