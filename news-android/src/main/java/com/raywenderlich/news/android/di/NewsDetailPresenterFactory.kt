package com.raywenderlich.news.android.di

import com.raywenderlich.common.Factory
import com.raywenderlich.news.android.presenter.NewsDetailPresenter
import com.raywenderlich.news.android.presenter.impl.NewsDetailPresenterImpl

/**
 * A Factory for a NewsDetailPresenter
 */
object NewsDetailPresenterFactory : Factory<NewsDetailPresenter> {
  override val instance: NewsDetailPresenter
    get() = NewsDetailPresenterImpl()
}
