package com.delarosa.prueba.ui.common

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.delarosa.prueba.app.App

val Context.app: App
    get() = applicationContext as App

fun ImageView.loadUrl(url: String) {
    Glide.with(context).load(url).into(this)
}

@BindingAdapter("url")
fun ImageView.bindUrl(url: String?) {
    if (url != null) loadUrl(url)
}
