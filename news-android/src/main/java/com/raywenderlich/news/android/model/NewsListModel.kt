package com.raywenderlich.news.android.model

import com.raywenderlich.common.android.mvp.Model
import com.raywenderlich.news.model.News

/**
 * Model for the NewsList
 */
data class NewsListModel(var newsList: List<News>) : Model