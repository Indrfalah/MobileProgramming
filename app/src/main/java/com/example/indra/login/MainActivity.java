package com.example.indra.login;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText pass,username;
    Button blogin, bregister, facebook, twitter, gmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        pass = (EditText)findViewById(R.id.pass);
       blogin = (Button) findViewById(R.id.blogin);
       blogin.setOnClickListener((View.OnClickListener) this);
       bregister = (Button) findViewById(R.id.bregister);
       bregister.setOnClickListener((View.OnClickListener) this);
        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener((View.OnClickListener) this);
        twitter = (Button) findViewById(R.id.twitter);
        twitter.setOnClickListener((View.OnClickListener) this);
        gmail= (Button) findViewById(R.id.gmail);
        gmail.setOnClickListener((View.OnClickListener) this);
    }


    public void onClick(View vk) {
        Intent intent = new Intent(this,registrer.class);
        startActivity(intent);
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);

        Uri facebook = Uri.parse("http://www.facebook.com");
        Intent intent3 = new Intent(Intent.ACTION_VIEW,facebook);
        startActivity(intent3);
        Uri gmail = Uri.parse("http://www.gmail.com");
        Intent intent4 = new Intent(Intent.ACTION_VIEW,gmail);
        startActivity(intent4);
        Uri twitter = Uri.parse("http://www.twitter.com");
        Intent intent5 = new Intent(Intent.ACTION_VIEW,twitter);
        startActivity(intent5);

    }
}
