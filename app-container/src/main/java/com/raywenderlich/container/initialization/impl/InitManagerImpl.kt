package com.raywenderlich.container.initialization.impl

import com.raywenderlich.container.initialization.InitFunction
import com.raywenderlich.container.initialization.InitManager
import com.raywenderlich.container.navigation.NavigationManager
import com.raywenderlich.container.navigation.di.NavigationManagerFactory

/**
 * Implementation for the InitManager interface
 */
class InitManagerImpl : InitManager {

  private val navigationManager: NavigationManager

  init {
    navigationManager = NavigationManagerFactory.instance
  }

  override fun registerModule(init: InitFunction) {
    init(navigationManager)
  }
}