package com.raywenderlick.news.android.presenter

import com.raywenderlich.android.base.mvp.Presenter
import com.raywenderlick.news.android.model.NewsModel
import com.raywenderlick.news.android.ui.detail.NewsDetailView

/**
 * The Presenter for the News Detail
 */
interface NewsDetailPresenter : Presenter<NewsModel, NewsDetailView> {

  /**
   * Invoke in order to display the detail for the news
   */
  fun displayNewsDetail(newsId: Long)
}