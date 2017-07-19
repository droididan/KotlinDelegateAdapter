package com.apps.northop.delegateadapterkotlin.adapters.common

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType

/**
 * Created by idan on 11/07/2017.
 * view type delegate adapter
 */
interface ViewTypeDelegateAdapter {
  fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
  fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}