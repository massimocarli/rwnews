package com.raywenderlich.news.android.ui.detail

import com.raywenderlich.common.android.mvp.View
import com.raywenderlich.news.android.model.NewsModel
import com.raywenderlich.news.model.News

/**
 * The View for the Detail
 */
interface NewsDetailView : View<NewsModel> {

  /**
   * Displays the given News
   */
  fun displayNews(news: News)
}