package com.raywenderlich.news.android.presenter.impl

import com.raywenderlich.common.android.di.FragmentScope
import com.raywenderlich.common.android.mvp.impl.BasePresenter
import com.raywenderlich.news.android.model.NewsListModel
import com.raywenderlich.news.android.presenter.NewsListPresenter
import com.raywenderlich.news.android.ui.list.NewsListView
import com.raywenderlich.news.repository.NewsRepository
import javax.inject.Inject

/**
 * Presenter for the display of the list
 */
@FragmentScope
class NewsListPresenterImpl @Inject constructor(
  private val newsRepository: NewsRepository
) : BasePresenter<NewsListModel, NewsListView>(),
  NewsListPresenter {

  override fun displayNewsList() {
    val newsList = newsRepository.list()
    view?.displayNews(NewsListModel(newsList))
  }
}