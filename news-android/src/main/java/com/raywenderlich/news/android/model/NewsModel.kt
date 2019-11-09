package com.raywenderlich.news.android.model

import com.raywenderlich.common.android.mvp.Model
import com.raywenderlich.news.model.News

/**
 * The Model for the news
 */
data class NewsModel(val news: News) : Model