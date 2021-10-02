package com.udacity.shoestore.ui

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.udacity.shoestore.R
import timber.log.Timber
import android.graphics.drawable.Drawable




/**
 * Uses the Glide library to load an image by URL into an [ImageView]
 */
@BindingAdapter("imageUrl")
fun ImageView.bindImage(imgUrl: String?) {
    Timber.w(" imgUrl -> %s", imgUrl)
    val imgUri = imgUrl?.toUri()?.buildUpon()?.scheme("https")?.build()
    Glide.with(context)
        .load(imgUri)
        .apply(
                RequestOptions()
                    .placeholder(R.drawable.loading_animation)
                    .error(R.drawable.ic_broken_image)
              )
        .into(this)
}

@BindingAdapter("android:src")
fun ImageView.setImageDrawable(drawable: Drawable?) {
    this.setImageDrawable(drawable)
}