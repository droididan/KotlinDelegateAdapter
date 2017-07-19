package com.apps.northop.delegateadapterkotlin.adapters.common

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewTypeDelegateAdapter
import java.util.ArrayList

/**
 * Created by idan ayalon on 11/07/2017.
 *
 */
open class BaseDelegateAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()

  var items: ArrayList<ViewType> = ArrayList()

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
      delegateAdapters.get(viewType).onCreateViewHolder(parent)

  override fun getItemCount(): Int = items.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) =
      delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, this.items[position])

  override fun getItemViewType(position: Int): Int {
    return this.items[position].getViewType()
  }

  fun addData(items: ArrayList<ViewType>) {
    this.items = items
    notifyDataSetChanged()
  }

}