package com.raywenderlich.news.model

/**
 * The Entity for the News
 */
data class News(
  val id: Long,
  val title: String,
  val body: String
)