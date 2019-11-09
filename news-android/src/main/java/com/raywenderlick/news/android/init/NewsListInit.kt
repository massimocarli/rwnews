package com.raywenderlick.news.android.init

import com.raywenderlick.container.initialization.InitFunction
import com.raywenderlick.container.menu.MenuManager
import com.raywenderlick.container.navigation.AnchorPoint
import com.raywenderlick.container.navigation.Destination
import com.raywenderlick.container.navigation.NavigationManager
import com.raywenderlick.news.android.ui.detail.NewsDetailFragment
import com.raywenderlick.news.android.ui.list.NewsListFragment

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

val initNewsList: InitFunction = fun(vm: NavigationManager, _: MenuManager) {
  vm.registerDestination(NewsDestinations.NEWS_LIST) {
    NewsListFragment()
  }
  vm.registerDestination(NewsDestinations.NEWS_DETAIL) { bundle ->
    NewsDetailFragment.create(bundle)
  }
}