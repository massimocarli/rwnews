package com.raywenderlich.news.di

import com.raywenderlich.common.Factory
import com.raywenderlich.news.repository.NewsRepository
import com.raywenderlich.news.repository.impl.MemoryNewsRepository

/**
 * A Factory for a NewsRepository
 */
object NewsRepositoryFactory : Factory<NewsRepository> {
  override val instance: NewsRepository
    get() = MemoryNewsRepository()
}