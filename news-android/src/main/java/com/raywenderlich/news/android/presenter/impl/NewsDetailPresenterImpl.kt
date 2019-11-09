package com.raywenderlich.news.android.presenter.impl

import com.raywenderlich.common.android.mvp.impl.BasePresenter
import com.raywenderlich.news.android.model.NewsModel
import com.raywenderlich.news.android.presenter.NewsDetailPresenter
import com.raywenderlich.news.android.ui.detail.NewsDetailView
import com.raywenderlich.news.di.NewsRepositoryFactory

/**
 * Presenter for the display of the list
 */
class NewsDetailPresenterImpl : BasePresenter<NewsModel, NewsDetailView>(),
  NewsDetailPresenter {

  val newsRepository = NewsRepositoryFactory.instance

  override fun displayNewsDetail(newsId: Long) {
    newsRepository.byId(newsId)?.let { news ->
      view?.displayNews(news)
    }
  }
}