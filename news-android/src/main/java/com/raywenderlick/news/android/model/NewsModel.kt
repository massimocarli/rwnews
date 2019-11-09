package com.raywenderlick.news.android.model

import com.raywenderlich.android.base.mvp.Model
import com.raywenderlick.news.model.News

/**
 * The Model for the news
 */
data class NewsModel(val news: News) : Model