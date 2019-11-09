package com.raywenderlich.news.android.presenter

import com.raywenderlich.common.android.mvp.Presenter
import com.raywenderlich.news.android.model.NewsModel
import com.raywenderlich.news.android.ui.detail.NewsDetailView

/**
 * The Presenter for the News Detail
 */
interface NewsDetailPresenter : Presenter<NewsModel, NewsDetailView> {

  /**
   * Invoke in order to display the detail for the news
   */
  fun displayNewsDetail(newsId: Long)
}