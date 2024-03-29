package com.raywenderlich.news.repository

import com.raywenderlich.news.model.News

/**
 * Repository for the News
 */
interface NewsRepository {

  /**
   * Retrieve the News by the Id if present
   */
  fun byId(id: Long): News?

  /**
   * All the news
   */
  fun list(): List<News>

  /**
   * Insert a news
   */
  fun insert(news: News)

  /**
   * Insert a list of news
   */
  fun insert(newsList: List<News>) = newsList.forEach { insert(it) }
}