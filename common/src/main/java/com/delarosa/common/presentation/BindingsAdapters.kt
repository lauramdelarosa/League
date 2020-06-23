package com.delarosa.common.presentation

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.delarosa.common.utils.loadUrl


@BindingAdapter("visible")
fun View.setVisible(visible: Boolean?) {
    visibility = visible?.let {
        if (visible) View.VISIBLE else View.GONE
    } ?: View.GONE
}

@BindingAdapter("url")
fun ImageView.bindUrl(url: String?) {
    if (url != null) loadUrl(url)
}