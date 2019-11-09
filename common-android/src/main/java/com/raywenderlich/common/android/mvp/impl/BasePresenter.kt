package com.raywenderlich.common.android.mvp.impl

import androidx.annotation.CallSuper
import com.raywenderlich.common.android.mvp.Model
import com.raywenderlich.common.android.mvp.Presenter
import com.raywenderlich.common.android.mvp.View

/**
 * Base class for Presenters¬
 */
abstract class BasePresenter<M : Model, V : View<M>> : Presenter<M, V> {

  /**
   * The View
   */
  protected var view: V? = null

  @CallSuper
  override fun bind(v: V) {
    view = v
  }


  @CallSuper
  override fun unbind() {
    view = null
  }
}