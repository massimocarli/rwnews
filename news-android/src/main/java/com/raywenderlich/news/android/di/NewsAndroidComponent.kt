package com.raywenderlich.news.android.di

import com.raywenderlich.common.android.di.FragmentScope
import com.raywenderlich.news.android.ui.detail.NewsDetailFragment
import com.raywenderlich.news.android.ui.list.NewsListFragment
import com.raywenderlich.news.di.NewsComponent
import dagger.Component

@Component(
  dependencies = arrayOf(NewsComponent::class),
  modules = arrayOf(NewsAndroidModule::class)
)
@FragmentScope
interface NewsAndroidComponent {

  fun inject(newsDetailFragment: NewsDetailFragment)

  fun inject(newsListFragment: NewsListFragment)

  @Component.Factory
  interface Factory {

    fun create(newsComponent: NewsComponent): NewsAndroidComponent
  }
}