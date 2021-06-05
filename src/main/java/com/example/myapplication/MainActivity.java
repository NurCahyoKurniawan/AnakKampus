package com.example.myapplication;
import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webviewku;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        webviewku = (WebView)findViewById(R.id.webview1);
        websettingku = webviewku.getSettings();

        webviewku.setWebViewClient((new WebViewClient()));
        webviewku.loadUrl("https://www.google.com/");
    }
}