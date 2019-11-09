package com.raywenderlick.news.android.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.android.base.events.OnViewHolderItemSelected
import com.raywenderlick.news.android.R
import com.raywenderlick.news.android.model.NewsListModel
import com.raywenderlick.news.model.News

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