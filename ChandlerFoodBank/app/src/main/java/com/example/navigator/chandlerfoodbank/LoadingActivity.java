package com.example.navigator.chandlerfoodbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        String str;
        WebView mWebview = new WebView(this);
        mWebview.getSettings().setJavaScriptEnabled(true);
        str = getIntent().getStringExtra("name");
        mWebview.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), description, Toast.LENGTH_SHORT).show();
            }
        });
        WebSettings settings = mWebview.getSettings();
        settings.setDomStorageEnabled(true);

        mWebview.loadUrl("http://default-environment-fmpvghe6z4.elasticbeanstalk.com/");
  //      mWebview.loadUrl();

//        str = "events";
//        mWebview.loadUrl("var note = document.getElementById('str');" +
//                "var screenPosition = note.getBoundingClientRect();" +
//                "window.scroll(screenPosition);");

        setContentView(mWebview);

    }
}
