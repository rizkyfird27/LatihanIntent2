package com.example.intent2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button google;
    Button instagram;
    Button twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        google = (Button)findViewById(R.id.google);
        google.setOnClickListener(this);
        twitter = (Button)findViewById(R.id.twitter);
        twitter.setOnClickListener(this);
        instagram = (Button)findViewById(R.id.instagram);
        instagram.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.google:
                Intent google = new Intent (MainActivity.this, GoogleActivity.class);
                startActivity(google);
                break;
            case R.id.instagram:
                Intent instagram = new Intent (MainActivity.this, InstagramActivity.class);
                startActivity(instagram);
                break;
            case R.id.twitter:
                Intent facebook = new Intent (MainActivity.this, TwitterActivity.class);
                startActivity(facebook);
                break;
            default:
                break;

        }
    }
}
