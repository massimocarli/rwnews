package com.raywenderlich.news.android.presenter

import com.raywenderlich.common.android.mvp.Presenter
import com.raywenderlich.news.android.model.NewsListModel
import com.raywenderlich.news.android.ui.list.NewsListView

/**
 * The Presenter for the NewsList
 */
interface NewsListPresenter : Presenter<NewsListModel, NewsListView> {

  /**
   * Invoke in order to display the news
   */
  fun displayNewsList()
}