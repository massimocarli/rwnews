package com.raywenderlick.news.android.ui.detail

import com.raywenderlich.android.base.mvp.View
import com.raywenderlick.news.android.model.NewsModel
import com.raywenderlick.news.model.News

/**
 * The View for the Detail
 */
interface NewsDetailView : View<NewsModel> {

  /**
   * Displays the given News
   */
  fun displayNews(news: News)
}