package com.example.implicit_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Intent intent, chooser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proc(View v) {
          if(v.getId() == R.id.map)
          {
              intent = new Intent(Intent.ACTION_VIEW);
              intent.setData(Uri.parse("geo:11.0684,76.2682"));
              chooser = Intent.createChooser(intent,"LAUNCH MAPS");
              startActivity(chooser);
          }
        if(v.getId() == R.id.play)
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=org.telegram.messenger"));
            chooser = Intent.createChooser(intent,"GOOGLE PLAY");
            startActivity(chooser);
        }
        if(v.getId() == R.id.gmail)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto"));
            String to[] = {"vishnuvvishwnath@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"From");
            intent.putExtra(Intent.EXTRA_TEXT,"mail");
            intent.setType("message/rfc822");
            chooser = Intent.createChooser(intent,"GMAIL");
            startActivity(chooser);

        }
        if(v.getId() == R.id.messenger)
        {
            intent = new Intent(Intent.ACTION_SEND);
            Uri ImgUri = Uri.parse("android.resource://com.example.implicit_intent/drawable/"+R.drawable.crick2);
            intent.setType("image/png");
            intent.putExtra(Intent.EXTRA_STREAM,ImgUri);
            intent.putExtra(Intent.EXTRA_TEXT,"attached");
            chooser = Intent.createChooser(intent,"MESSENGER");
            startActivity(chooser);
        }
    }
}
