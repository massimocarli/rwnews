package com.raywenderlich.news.android.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.news.android.R
import com.raywenderlich.news.android.di.DaggerNewsAndroidComponent
import com.raywenderlich.news.android.init.NewsAnchorPoints
import com.raywenderlich.news.android.init.NewsDestinations
import com.raywenderlich.news.android.model.NewsListModel
import com.raywenderlich.news.android.presenter.NewsListPresenter
import com.raywenderlich.news.android.ui.detail.NewsDetailFragment
import javax.inject.Inject


/**
 * This is the Fragment for displaying the list of news
 */
class NewsListFragment : Fragment(), NewsListView {

  @Inject
  lateinit var newsListPresenter: NewsListPresenter

  //@Inject
  lateinit var navigationManager: NavigationManager

  private lateinit var recyclerView: RecyclerView
  private lateinit var newsListViewAdapter: NewsListViewAdapter
  private val newsListModel = NewsListModel(emptyList())

  override fun onCreate(savedInstanceState: Bundle?) {
    DaggerNewsAndroidComponent.factory().create().inject(this)
    //DaggerNewsComponent.builder().build()
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val view = inflater.inflate(R.layout.news_list_layout, container, false)
    newsListPresenter.bind(this)
    initRecyclerView(view)
    return view
  }

  override fun onStart() {
    super.onStart()
    newsListPresenter.displayNewsList()
  }

  override fun displayNews(newsList: NewsListModel) {
    newsListModel.newsList = newsList.newsList
    newsListViewAdapter.notifyDataSetChanged()
  }

  override fun onDestroy() {
    super.onDestroy()
    newsListPresenter.unbind()
  }

  private fun initRecyclerView(view: View) {
    recyclerView = view.findViewById(R.id.recycler_view)
    recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    val dividerItemDecoration = DividerItemDecoration(
      context,
      LinearLayoutManager.VERTICAL
    )
    recyclerView.addItemDecoration(dividerItemDecoration)
    newsListViewAdapter = NewsListViewAdapter(newsListModel) { selectedNews ->
      val bundle = Bundle().apply {
        putLong(NewsDetailFragment.NEWS_ID, selectedNews?.id ?: -1)
      }
      navigationManager.displayFragment(
        NewsDestinations.NEWS_DETAIL,
        NewsAnchorPoints.HOME,
        bundle,
        "news"
      )
    }
    recyclerView.adapter = newsListViewAdapter
  }
}