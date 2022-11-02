package com.cozyfex.dev.webview

import android.content.Context
import android.content.Intent
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast

class WebAppInterface(
    private val context: Context,
    private val webView: WebView,
) {
    @JavascriptInterface
    fun showToast(toast: String) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }
}