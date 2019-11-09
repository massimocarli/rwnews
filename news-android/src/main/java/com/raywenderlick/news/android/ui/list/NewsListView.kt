package com.raywenderlick.news.android.ui.list

import com.raywenderlich.android.base.mvp.View
import com.raywenderlick.news.android.model.NewsListModel

/**
 * This is a View in a MVP architecture for News list
 */
interface NewsListView : View<NewsListModel> {

  /**
   * Displays the list of news in the View
   */
  fun displayNews(newsList: NewsListModel)
}