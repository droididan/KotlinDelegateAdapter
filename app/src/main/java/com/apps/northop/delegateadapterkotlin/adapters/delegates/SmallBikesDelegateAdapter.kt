package com.apps.northop.delegateadapterkotlin.adapters.delegates

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.R
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewTypeDelegateAdapter
import com.apps.northop.delegateadapterkotlin.ext.inflate
import com.apps.northop.delegateadapterkotlin.ext.load
import com.apps.northop.delegateadapterkotlin.model.SmallBike
import kotlinx.android.synthetic.main.small_bikes_item.view.small_bike_photo
import kotlinx.android.synthetic.main.small_bikes_item.view.title_small

/**
 * Created by idan on 11/07/2017.
 */
class SmallBikesDelegateAdapter : ViewTypeDelegateAdapter {
  override fun onCreateViewHolder(parent: ViewGroup): ViewHolder = SmallBikesViewHolder(parent)

  override fun onBindViewHolder(holder: ViewHolder, item: ViewType) {
    (holder as SmallBikesViewHolder).bind(item as SmallBike)
  }

  class SmallBikesViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
      parent.inflate(R.layout.small_bikes_item)) {
    fun bind(smallBike: SmallBike) = with(itemView) {
      val bikeTitle = "Type: ${smallBike.name}"
      title_small.text = bikeTitle
      small_bike_photo.load(smallBike.image)
    }
  }


}