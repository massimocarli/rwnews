package com.raywenderlick.news.android.presenter

import com.raywenderlich.android.base.mvp.Presenter
import com.raywenderlick.news.android.model.NewsListModel
import com.raywenderlick.news.android.ui.list.NewsListView

/**
 * The Presenter for the NewsList
 */
interface NewsListPresenter : Presenter<NewsListModel, NewsListView> {

  /**
   * Invoke in order to display the news
   */
  fun displayNewsList()
}