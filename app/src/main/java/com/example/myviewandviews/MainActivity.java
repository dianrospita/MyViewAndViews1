package com.example.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }
        Button btnBeli = findViewById(R.id.btn_beli);
        btnBeli.setOnClickListener(this);

        Button btncs = findViewById(R.id.btn_cs);
        btncs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_beli:
                Intent intent = new Intent(MainActivity.this, BerhasilDibeli.class);
                startActivity(intent);
                break;
            case R.id.btn_cs:
                String phoneNumber = "082361199457";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
                startActivity(dialPhoneIntent);
                break;
        }
    }
}


