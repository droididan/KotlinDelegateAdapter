package com.apps.northop.delegateadapterkotlin.ext

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by idan on 11/07/2017.
 */
fun ViewGroup.inflate(id: Int, attach: Boolean = false): View {
  return LayoutInflater.from(context).inflate(id, this, attach)
}

fun ImageView.load(res: String) {
  Picasso.with(context).load(res).into(this)
}