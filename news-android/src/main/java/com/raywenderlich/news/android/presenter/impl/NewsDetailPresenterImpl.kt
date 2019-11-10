package com.raywenderlich.news.android.presenter.impl

import com.raywenderlich.common.android.di.FragmentScope
import com.raywenderlich.common.android.mvp.impl.BasePresenter
import com.raywenderlich.news.android.model.NewsModel
import com.raywenderlich.news.android.presenter.NewsDetailPresenter
import com.raywenderlich.news.android.ui.detail.NewsDetailView
import com.raywenderlich.news.repository.NewsRepository
import javax.inject.Inject

/**
 * Presenter for the display of the list
 */
@FragmentScope
class NewsDetailPresenterImpl @Inject constructor(
  private val newsRepository: NewsRepository
) : BasePresenter<NewsModel, NewsDetailView>(),
  NewsDetailPresenter {

  override fun displayNewsDetail(newsId: Long) {
    newsRepository.byId(newsId)?.let { news ->
      view?.displayNews(news)
    }
  }
}