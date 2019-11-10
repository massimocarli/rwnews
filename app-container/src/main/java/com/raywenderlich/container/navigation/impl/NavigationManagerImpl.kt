package com.raywenderlich.container.navigation.impl

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import com.raywenderlich.container.navigation.AnchorPoint
import com.raywenderlich.container.navigation.Destination
import com.raywenderlich.container.navigation.FragmentFactory
import com.raywenderlich.container.navigation.NavigationManager
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation for the NavigationManager
 */
@Singleton
class NavigationManagerImpl @Inject constructor() : NavigationManager {

  private val TAG = "NavigationManager"

  private lateinit var fragmentManager: FragmentManager

  override fun init(fm: FragmentManager) {
    fragmentManager = fm
  }

  private val fragmentNameMap = mutableMapOf<String, FragmentFactory>()
  private val fragmentPathMap = mutableMapOf<String, FragmentFactory>()
  private val anchorPoints = mutableMapOf<String, AnchorPoint>()

  override fun registerDestination(destination: Destination, fn: FragmentFactory) {
    fragmentNameMap[destination.name] = fn
    fragmentPathMap[destination.path] = fn
  }

  override fun addAnchorPoint(anchorPoint: AnchorPoint) {
    anchorPoints[anchorPoint.name] = anchorPoint
  }

  override fun displayFragment(
    destination: Destination,
    into: AnchorPoint,
    bundle: Bundle?,
    backStack: String?
  ) {
    val fragmentFactory = fragmentPathMap[destination.path]
    val anchorPoint = anchorPoints[into.name]
    if (fragmentFactory != null && anchorPoint != null) {
      fragmentManager.beginTransaction().apply {
        if (backStack != null) {
          addToBackStack(backStack)
        }
      }.replace(anchorPoint.id, fragmentFactory(bundle))
        .commit()
    } else {
      Log.w(
        TAG,
        "Destination ${destination.name} has not been registered! Please check the configuration!"
      )
      dump()
    }
  }

  override fun dump() {
    Log.i(TAG, "Available Fragment names:")
    fragmentNameMap.keys.forEach { name ->
      Log.i(TAG, name)
    }
    Log.i(TAG, "Available Fragment paths:")
    fragmentPathMap.keys.forEach { path ->
      Log.i(TAG, path)
    }
    Log.i(TAG, "Available Anchor points:")
    anchorPoints.keys.forEach { anchorPointName ->
      Log.i(TAG, anchorPointName)
    }
  }

}