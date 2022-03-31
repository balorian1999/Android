package com.example.icecreamshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener, AdapterView.OnItemSelectedListener {
    ListView listView;
    Spinner spinner;
    ImageView image;
    Button bttn;

    int total;

    Bundle bundle = new Bundle();

    String items[] = {"Puttu Icecream", "Chocolate Brownie", "Green Apple Mojito"};
    String toppings[] = {"Select a topping", "Rainbow Springle", "Chocolate Syrup", "Whip Cream"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);
        spinner = (Spinner) findViewById(R.id.spinner);
        image = (ImageView) findViewById(R.id.image);
        bttn = (Button) findViewById(R.id.bttn);

        // to set items on list view
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(this);

        // to set items on spinner
        ArrayAdapter<String> adapter2 = new ArrayAdapter <>(this, android.R.layout.simple_spinner_item, toppings);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);
        spinner.setOnItemSelectedListener(this);

        // pay button click
        bttn.setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(this, listView.getItemAtPosition(position).toString() + " " + position, Toast.LENGTH_LONG).show();
        // to display image based on list click
        if(position == 0) {
            total = 0;
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.a123);
            bundle.putString("Item", "Puttu Icecream");
            total = total + 350;
        } else if (position == 1) {
            total = 0;
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.a320);
            bundle.putString("Item", "Chocolate Browine");
            total = total + 200;
        } else if (position == 2) {
            total = 0;
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.a123);
            bundle.putString("Item", "Green Apple Mojito");
            total = total + 80;
        }
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtras(bundle);
        startActivity(i);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        Toast.makeText(this, parent.getItemAtPosition(position).toString() + " " + position, Toast.LENGTH_LONG).show();
        // get toppings name and price
        if(position == 1) {
            total = total + 50;
            bundle.putInt("Price", total);
            bundle.putString("Topping", "Rainbow Springle");
        } else if(position == 2) {
            total = total + 60;
            bundle.putInt("Price", total);
            bundle.putString("Topping", "Chocolate Syrup");
        } else if(position == 3) {
            total = total + 10;
            bundle.putInt("Price", total);
            bundle.putString("Topping", "Whip Cream");
        } else if(position == 0) {
            total = total;
            bundle.putInt("Price", total);
            bundle.putString("Topping", "None");
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
