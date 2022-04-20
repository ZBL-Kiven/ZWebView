package com.zj.web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zj.web.view.CusWebView

class MainActivity : AppCompatActivity() {

    private var webView: CusWebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.cus_web)
        runOnUiThread {
            webView?.loadUrl("https://www.baidu.com")
        }
    }
}