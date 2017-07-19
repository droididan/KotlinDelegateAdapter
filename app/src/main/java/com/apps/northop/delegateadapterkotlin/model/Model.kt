package com.apps.northop.delegateadapterkotlin.model

import com.apps.northop.delegateadapterkotlin.adapters.AdapterTypes
import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType


data class SmallBike(val name: String, val image: String) : ViewType {
  override fun getViewType(): Int = AdapterTypes.SMALL_BIKES
}

data class BigBike(val name: String, val image: String) : ViewType {
  override fun getViewType(): Int = AdapterTypes.BIG_BIKES
}

data class Header(val title: String) : ViewType {
  override fun getViewType(): Int = AdapterTypes.HEADER
}