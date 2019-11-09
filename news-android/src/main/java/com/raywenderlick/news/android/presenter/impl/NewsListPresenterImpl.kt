package com.raywenderlick.news.android.presenter.impl

import com.raywenderlich.android.base.mvp.impl.BasePresenter
import com.raywenderlick.news.android.model.NewsListModel
import com.raywenderlick.news.android.presenter.NewsListPresenter
import com.raywenderlick.news.android.ui.list.NewsListView
import com.raywenderlick.news.di.NewsRepositoryFactory

/**
 * Presenter for the display of the list
 */
class NewsListPresenterImpl : BasePresenter<NewsListModel, NewsListView>(),
  NewsListPresenter {

  val newsRepository = NewsRepositoryFactory.instance

  override fun displayNewsList() {
    val newsList = newsRepository.list()
    view?.displayNews(NewsListModel(newsList))
  }
}