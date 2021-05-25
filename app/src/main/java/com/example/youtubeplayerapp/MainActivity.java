package com.example.youtubeplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    EditText urlInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.Play);
        urlInput = findViewById(R.id.URLinput);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = urlInput.getText().toString();
                if (url.length() != 0) {
                    Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                    intent.putExtra("URL", url);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Error! Enter URL!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}