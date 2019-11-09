package com.raywenderlich.container.initialization

import com.raywenderlich.container.navigation.NavigationManager

/**
 * Initialization function
 */
typealias InitFunction = (NavigationManager) -> Unit

/**
 * Initialization Manager for the Container
 */
interface InitManager {

  /**
   * Each module is supposed to run this method in order to inform the
   * container they exist
   */
  fun registerModule(init: InitFunction)
}