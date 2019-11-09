package com.raywenderlich.news.repository.impl

import com.raywenderlich.news.model.News
import com.raywenderlich.news.repository.NewsRepository

/**
 * Repository implementation in memory
 */
class MemoryNewsRepository : NewsRepository {

  private val newsMap = mutableMapOf<Long, News>()

  init {
    (1..100).map { it.toLong() }.forEach { id ->
      insert(
        News(
          id,
          "title_$id from Repo",
          "Body $id Body $id Body $id Body $id Body $id Body $id Body $id Body $id"
        )
      )
    }
  }

  override fun byId(id: Long): News? = newsMap.get(id)

  override fun list(): List<News> = newsMap.values.sortedBy { it.id }

  override fun insert(news: News) {
    newsMap.put(news.id, news)
  }
}