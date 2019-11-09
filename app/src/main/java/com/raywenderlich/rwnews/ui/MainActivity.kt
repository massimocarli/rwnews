package com.raywenderlich.rwnews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.raywenderlich.container.navigation.di.NavigationManagerFactory
import com.raywenderlich.rwnews.R
import com.raywenderlich.rwnews.init.AnchorPoints
import com.raywenderlich.news.android.init.NewsDestinations

class MainActivity : AppCompatActivity() {

  val navigationManager = NavigationManagerFactory.instance

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    navigationManager.init(supportFragmentManager)
    navigationManager.displayFragment(NewsDestinations.NEWS_LIST, AnchorPoints.HOME)
  }

}
