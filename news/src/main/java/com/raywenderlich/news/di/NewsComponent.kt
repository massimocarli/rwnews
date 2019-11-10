package com.raywenderlich.news.di

import com.raywenderlich.common.di.FeatureScope
import com.raywenderlich.news.repository.NewsRepository
import com.raywenderlich.news.repository.di.NewsRepositoryModule
import dagger.Component

@Component(modules = arrayOf(NewsRepositoryModule::class))
@FeatureScope
interface NewsComponent {

  fun newsRepository(): NewsRepository
}