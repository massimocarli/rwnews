package com.raywenderlich.news.android.init

import com.raywenderlich.container.initialization.InitFunction
import com.raywenderlich.container.navigation.AnchorPoint
import com.raywenderlich.container.navigation.Destination
import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.news.android.ui.detail.NewsDetailFragment
import com.raywenderlich.news.android.ui.list.NewsListFragment

enum class NewsAnchorPoints : AnchorPoint {
  HOME {
    override val id: Int
      get() = 0 // This doesn't matter
  }
}

enum class NewsDestinations : Destination {
  NEWS_LIST {
    override val path: String
      get() = "news/list"
  },
  NEWS_DETAIL {
    override val path: String
      get() = "news/detail"
  },
}

val initNewsList: InitFunction = fun(vm: NavigationManager) {
  vm.registerDestination(NewsDestinations.NEWS_LIST) {
    NewsListFragment()
  }
  vm.registerDestination(NewsDestinations.NEWS_DETAIL) { bundle ->
    NewsDetailFragment.create(bundle)
  }
}