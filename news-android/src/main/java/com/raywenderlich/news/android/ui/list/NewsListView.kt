package com.raywenderlich.news.android.ui.list

import com.raywenderlich.common.android.mvp.View
import com.raywenderlich.news.android.model.NewsListModel

/**
 * This is a View in a MVP architecture for News list
 */
interface NewsListView : View<NewsListModel> {

  /**
   * Displays the list of news in the View
   */
  fun displayNews(newsList: NewsListModel)
}