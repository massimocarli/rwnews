package com.raywenderlich.news.android.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.common.android.events.OnViewHolderItemSelected
import com.raywenderlich.news.model.News
import com.raywenderlich.news.android.R
import com.raywenderlich.news.android.model.NewsListModel

/**
 * The Adapter for the RecyclerView of the news
 */
class NewsListViewAdapter(
  private val model: NewsListModel,
  private val listener: OnViewHolderItemSelected<News?>? = null
) :
  RecyclerView.Adapter<NewsListItemViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsListItemViewHolder {
    val itemView =
      LayoutInflater.from(parent.context)
        .inflate(R.layout.news_list_item_layout, parent, false)
    return NewsListItemViewHolder(itemView, listener)
  }

  override fun getItemCount(): Int = model.newsList.size

  override fun onBindViewHolder(holder: NewsListItemViewHolder, position: Int) {
    holder.bind(model.newsList[position])
  }
}