package com.example.renny.nunua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        String url = "https://m.mobikwik.com/paymentoptions";
        WebView pay = (WebView) this.findViewById(R.id.web);
        pay.getSettings().setJavaScriptEnabled(true);
        pay.getSettings().setDomStorageEnabled(true);
        pay.loadUrl(url);

    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent msg) {
        switch (keyCode) {
            case (KeyEvent.KEYCODE_BACK):
                Intent we = new Intent(Payment.this, Congrats.class);
                startActivity(we);
                finish();
                return true;
        }
        return false;
    }
}
