package com.raywenderlick.news.android.presenter.impl

import com.raywenderlich.android.base.mvp.impl.BasePresenter
import com.raywenderlick.news.android.model.NewsModel
import com.raywenderlick.news.android.presenter.NewsDetailPresenter
import com.raywenderlick.news.android.ui.detail.NewsDetailView
import com.raywenderlick.news.di.NewsRepositoryFactory

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