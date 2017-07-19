package com.apps.northop.delegateadapterkotlin.adapters

import com.apps.northop.delegateadapterkotlin.adapters.common.BaseDelegateAdapter
import com.apps.northop.delegateadapterkotlin.adapters.delegates.BigBikesDelegateAdapter
import com.apps.northop.delegateadapterkotlin.adapters.delegates.HeaderDelegateAdapter
import com.apps.northop.delegateadapterkotlin.adapters.delegates.SmallBikesDelegateAdapter

/**
 * Created by idan on 11/07/2017.
 */
class BikesAdapter : BaseDelegateAdapter() {
  init {
    // add the types to your adapter
    delegateAdapters.put(AdapterTypes.BIG_BIKES, BigBikesDelegateAdapter())
    delegateAdapters.put(AdapterTypes.SMALL_BIKES, SmallBikesDelegateAdapter())
    delegateAdapters.put(AdapterTypes.HEADER, HeaderDelegateAdapter())

  }
}