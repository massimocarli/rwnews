package com.raywenderlich.news.android.di

import com.raywenderlich.news.android.presenter.NewsDetailPresenter
import com.raywenderlich.news.android.presenter.NewsListPresenter
import com.raywenderlich.news.android.presenter.impl.NewsDetailPresenterImpl
import com.raywenderlich.news.android.presenter.impl.NewsListPresenterImpl
import dagger.Binds
import dagger.Module

@Module
abstract class NewsAndroidModule {

  @Binds
  abstract fun newsListPresenter(pres: NewsListPresenterImpl): NewsListPresenter

  @Binds
  abstract fun newsDetailPresenter(pres: NewsDetailPresenterImpl): NewsDetailPresenter

}