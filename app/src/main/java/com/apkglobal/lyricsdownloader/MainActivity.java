package com.apkglobal.lyricsdownloader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "Welcome To Lyrics DownLoader", Toast.LENGTH_LONG).show();

        Button btn_latest,btn_bollywood,btn_hollywood,
                btn_punjabi,btn_signin,btn_about,btn_contact;


        btn_latest = (Button)findViewById(R.id.btn_latest);
        btn_bollywood = (Button)findViewById(R.id.btn_bollywood);
        btn_hollywood = (Button)findViewById(R.id.btn_hollywood);
        btn_punjabi = (Button)findViewById(R.id.btn_punjabi);
        btn_signin = (Button)findViewById(R.id.btn_signin);
        btn_about = (Button)findViewById(R.id.btn_about);
        btn_contact = (Button)findViewById(R.id.btn_contact);


        btn_latest.setOnClickListener(this);
        btn_bollywood.setOnClickListener(this);
        btn_hollywood.setOnClickListener(this);
        btn_punjabi.setOnClickListener(this);
        btn_signin.setOnClickListener(this);
        btn_about.setOnClickListener(this);
        btn_contact.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch (id)
        {
            case R.id.btn_latest:
                Intent latest = new Intent(MainActivity.this,LatestActivity.class);
                startActivity(latest);
                break;

            case R.id.btn_bollywood:
                Intent bollywood = new Intent(MainActivity.this,BollywoodActivity.class);
                startActivity(bollywood);
                break;

            case R.id.btn_hollywood:
                Intent hollywood = new Intent(MainActivity.this,HollywoodActivity.class);
                startActivity(hollywood);
                break;

            case R.id.btn_punjabi:
                Intent punjabi = new Intent(MainActivity.this,PunjabiActivity.class);
                startActivity(punjabi);
                break;

            case R.id.btn_signin:
                Intent signin = new Intent(MainActivity.this,SigninActivity.class);
                startActivity(signin);
                break;

            case R.id.btn_about:
                Intent about = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(about);
                break;

            case R.id.btn_contact:
                Intent contact = new Intent(MainActivity.this,ContactActivity.class);
                startActivity(contact);
                break;


        }

    }
}
