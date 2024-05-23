package com.example.project;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    private WebView myWebView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myWebView = findViewById(R.id.webView);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new callback());
        myWebView.loadUrl("file:///android_asset/About/about.html");
    }

    private class callback extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        if (myWebView!=null && myWebView.canGoBack()){
            myWebView.goBack();

        }
        super.onBackPressed();
    }




}