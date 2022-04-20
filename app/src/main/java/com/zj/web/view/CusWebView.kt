package com.zj.web.view

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView
import com.zj.web.Constance
import com.zj.web.`in`.CusWebJI
import com.zj.zWeb.ZWebView

class CusWebView @JvmOverloads constructor(c: Context, attrs: AttributeSet? = null, def: Int = 0) : ZWebView<CusWebJI>(c, attrs, def) {


    private val webJI = CusWebJI()

    override val javaScriptClient: CusWebJI; get() = webJI

    override val webDebugEnable: Boolean = true

    override fun onPageFinished(view: WebView, url: String) {
        super.onPageFinished(view, url)
        val ij = Constance.getJsReadStr(context)
        evaluateJavascript(ij, null)
    }
}