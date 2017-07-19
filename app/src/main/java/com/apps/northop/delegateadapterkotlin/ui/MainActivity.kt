package com.apps.northop.delegateadapterkotlin.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.apps.northop.delegateadapterkotlin.R.id
import com.apps.northop.delegateadapterkotlin.R.layout
import kotlinx.android.synthetic.main.activity_main.toolbar


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    setSupportActionBar(toolbar)

    loadFragment(BikesFragment())

  }

  fun loadFragment(f: Fragment) {
    val ft = supportFragmentManager.beginTransaction()
    ft.replace(id.base_container, f)
    ft.addToBackStack(null)
    ft.commit()
  }
}
