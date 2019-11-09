package com.raywenderlich.news.android.presenter.impl

import com.raywenderlich.common.android.mvp.impl.BasePresenter
import com.raywenderlich.news.android.model.NewsListModel
import com.raywenderlich.news.android.presenter.NewsListPresenter
import com.raywenderlich.news.android.ui.list.NewsListView
import com.raywenderlich.news.di.NewsRepositoryFactory

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