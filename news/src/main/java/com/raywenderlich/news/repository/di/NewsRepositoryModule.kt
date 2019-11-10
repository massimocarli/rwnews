package com.raywenderlich.news.repository.di

import com.raywenderlich.news.repository.NewsRepository
import com.raywenderlich.news.repository.impl.MemoryNewsRepository
import dagger.Binds
import dagger.Module

@Module
abstract class NewsRepositoryModule {

  @Binds
  abstract fun newsRepository(repo: MemoryNewsRepository): NewsRepository
}