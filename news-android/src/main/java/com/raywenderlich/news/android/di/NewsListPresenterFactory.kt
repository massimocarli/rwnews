package com.raywenderlich.news.android.di

import com.raywenderlich.common.Factory
import com.raywenderlich.news.android.presenter.impl.NewsListPresenterImpl

/**
 * A Factory for a NewsListPresenter
 */
object NewsListPresenterFactory : Factory<NewsListPresenterImpl> {
  override val instance: NewsListPresenterImpl
    get() = NewsListPresenterImpl()
}
