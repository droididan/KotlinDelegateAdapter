package com.apps.northop.delegateadapterkotlin.adapters.delegates

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.R
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewTypeDelegateAdapter
import com.apps.northop.delegateadapterkotlin.ext.inflate
import com.apps.northop.delegateadapterkotlin.ext.load
import com.apps.northop.delegateadapterkotlin.model.BigBike
import kotlinx.android.synthetic.main.big_bikes_item.view.big_bike_photo
import kotlinx.android.synthetic.main.big_bikes_item.view.title

/**
 * Created by idan on 11/07/2017.
 * big bike adapter
 */
class BigBikesDelegateAdapter : ViewTypeDelegateAdapter {
  override fun onCreateViewHolder(parent: ViewGroup): ViewHolder = BigBikesViewHolder(
      parent)

  override fun onBindViewHolder(holder: ViewHolder, item: ViewType) {
    // smart cast
    (holder as BigBikesViewHolder).bind(item as BigBike)

  }

  class BigBikesViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
      parent.inflate(R.layout.big_bikes_item)) {

    fun bind(bigBike: BigBike) = with(itemView) {
      val bikeTitle = "Type: ${bigBike.name}"
      title.text = bikeTitle
      big_bike_photo.load(bigBike.image)
    }
  }
}