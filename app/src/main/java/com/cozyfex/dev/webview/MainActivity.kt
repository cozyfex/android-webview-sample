package com.cozyfex.dev.webview

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        webView = WebView(this)
        webView!!.webViewClient = WebViewClient()
        webView!!.webChromeClient = WebChromeClient()
        webView!!.settings.javaScriptEnabled = true
        webView!!.settings.javaScriptCanOpenWindowsAutomatically = true
        setContentView(webView)
        webView!!.loadUrl(BuildConfig.WEBAPP_URL)
        webView!!.addJavascriptInterface(WebAppInterface(this, webView!!), "AppJS")
    }
}