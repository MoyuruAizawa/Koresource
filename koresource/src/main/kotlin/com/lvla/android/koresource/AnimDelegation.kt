package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.AnimRes
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class AnimDelegation(val context: Context, @AnimRes val resId: Int): ReadOnlyProperty<Any, Animation> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = AnimationUtils.loadAnimation(context, resId)
}