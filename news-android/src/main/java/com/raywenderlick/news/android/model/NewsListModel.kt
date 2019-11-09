package com.raywenderlick.news.android.model

import com.raywenderlich.android.base.mvp.Model
import com.raywenderlick.news.model.News

data class NewsListModel(var newsList: List<News>) : Model