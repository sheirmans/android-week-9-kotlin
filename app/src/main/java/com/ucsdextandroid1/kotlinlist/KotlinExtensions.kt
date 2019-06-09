package com.ucsdextandroid1.kotlinlist

import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by rjaylward on 2019-06-08
 */

//TODO viewgroup inflate extension

//TODO picasso extension

fun ImageView.loadImageURL(url: String?, placeholder: Drawable = ColorDrawable(Utils.randomColor())) {
    Picasso.get().load(url)
            .placeholder(ColorDrawable(Utils.randomColor()))
            .into(this)

}

fun ViewGroup.inflate(layoutResId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutResId, this, attachToRoot)
}