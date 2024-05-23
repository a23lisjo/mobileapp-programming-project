package com.example.project;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myWebView = findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/index.html");
    }
}