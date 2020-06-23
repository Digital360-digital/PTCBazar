package com.digital360.ptcbazar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView mWeb;

    WebChromeClient webChromeClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWeb=findViewById(R.id.webId);

        WebSettings settings=mWeb.getSettings();
        settings.setJavaScriptEnabled(true);
        mWeb.setWebViewClient(new WebViewClient());

        settings.setLoadsImagesAutomatically(true);
        mWeb.loadUrl("http://ptcbazar.com/");
    }
    @Override
    public void onBackPressed() {
        if (mWeb.canGoBack()){
            mWeb.goBack();
        }else
            super.onBackPressed();
    }
}
