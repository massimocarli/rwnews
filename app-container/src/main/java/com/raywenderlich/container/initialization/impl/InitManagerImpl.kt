package com.raywenderlich.container.initialization.impl

import com.raywenderlich.container.initialization.InitFunction
import com.raywenderlich.container.initialization.InitManager
import com.raywenderlich.container.navigation.NavigationManager
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Implementation for the InitManager interface
 */
@Singleton
class InitManagerImpl @Inject constructor(
  private val navigationManager: NavigationManager
) : InitManager {

  override fun registerModule(init: InitFunction) {
    init(navigationManager)
  }
}