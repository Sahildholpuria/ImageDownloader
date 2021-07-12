package com.example.imagedownloader;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.submit_btn);

        button.setOnClickListener(v -> {

            String URL = editText.getText().toString();
            DownloadImage("",URL);
        });
    }

    private void DownloadImage(String filename,String url) {
        try {
            DownloadManager downloadManager = null;
            downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);

            Uri uri = Uri.parse(url);

            DownloadManager.Request request = new DownloadManager.Request(uri);

        }
        catch (Exception e){

            Toast.makeText(this, "Downloading Failed", Toast.LENGTH_SHORT).show();
        }
    }
}