package com.raywenderlich.container.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

/**
 * The name for the function which creates Fragment
 */
typealias FragmentFactory = (Bundle?) -> Fragment

/**
 * Use for register different anchor points
 */
interface AnchorPoint {
  val name: String
  val id: Int
}

/**
 * Defines a possible destination
 */
interface Destination {
  val name: String
  val path: String
}

/**
 * Object responsible to manage Navigation in the App
 */
interface NavigationManager {

  /**
   * Initialize the Fragment manager for navigation
   */
  fun init(fm: FragmentManager)

  /**
   * Registers anchor points
   */
  fun addAnchorPoint(anchorPoint: AnchorPoint)

  /**
   * Register a Fragment for the given path and name
   */
  fun registerDestination(destination: Destination, fn: FragmentFactory)

  /**
   * Displays the Fragment for the given name into the provided container. Bundle is optional
   */
  fun displayFragment(
    destination: Destination,
    into: AnchorPoint,
    bundle: Bundle? = null,
    backStack: String? = null
  )

  /**
   * Displays information about navigation
   */
  fun dump()
}