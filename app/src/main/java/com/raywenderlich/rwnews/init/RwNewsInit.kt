package com.raywenderlich.rwnews.init

import android.app.Application
import com.raywenderlich.container.initialization.di.InitManagerFactory
import com.raywenderlich.container.navigation.AnchorPoint
import com.raywenderlich.container.navigation.di.NavigationManagerFactory
import com.raywenderlich.rwnews.R
import com.raywenderlich.news.android.init.initNewsList


enum class AnchorPoints : AnchorPoint {
  // Here the anchor point which is shared with the different modules which must define
  // an AnchorPoint with the same name if they want to use it.
  HOME {
    override val id: Int
      get() = R.id.anchor
  }
}

/**
 * Application object for the RwBanking App
 */
class RwNewsApp : Application() {

  override fun onCreate() {
    super.onCreate()
    NavigationManagerFactory.singleton.addAnchorPoint(AnchorPoints.HOME)
    InitManagerFactory.instance.registerModule { navManager ->
      initNewsList(navManager)
    }
  }
}