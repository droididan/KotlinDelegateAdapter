package com.apps.northop.delegateadapterkotlin.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.apps.northop.delegateadapterkotlin.R.layout
import com.apps.northop.delegateadapterkotlin.adapters.BikesAdapter
import com.apps.northop.delegateadapterkotlin.ext.inflate
import com.apps.northop.delegateadapterkotlin.model.DataProvider
import kotlinx.android.synthetic.main.my_fragment.list

/**
 * Created by idan on 11/07/2017.
 */
class BikesFragment : Fragment() {

  private val adapter by lazy { BikesAdapter() }
  private val repo by lazy { DataProvider() }
  private val recycler by lazy {
    list.apply {
      setHasFixedSize(true)
      layoutManager = LinearLayoutManager(context)
    }
  }

  override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): View? {
    return container?.inflate(layout.my_fragment)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)
    adapter.addData(repo.getBikes())
    recycler.adapter = adapter
  }

  override fun onDestroy() {
    super.onDestroy()
  }
}