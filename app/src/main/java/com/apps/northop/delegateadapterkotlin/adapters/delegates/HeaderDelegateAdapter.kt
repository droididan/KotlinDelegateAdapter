package com.apps.northop.delegateadapterkotlin.adapters.delegates

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.R
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewTypeDelegateAdapter
import com.apps.northop.delegateadapterkotlin.ext.inflate
import com.apps.northop.delegateadapterkotlin.model.Header
import kotlinx.android.synthetic.main.header_item.view.header_title

/**
 * Created by idan on 11/07/2017.
 * show a header type
 */
class HeaderDelegateAdapter : ViewTypeDelegateAdapter {
  override fun onCreateViewHolder(parent: ViewGroup): ViewHolder = HeaderViewHolder(parent)

  override fun onBindViewHolder(holder: ViewHolder, item: ViewType) {
    (holder as HeaderViewHolder).bind(item as Header)
  }

  class HeaderViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.header_item)) {
    fun bind(header: Header) = with(itemView) {
      header_title.text = header.title
    }
  }
}