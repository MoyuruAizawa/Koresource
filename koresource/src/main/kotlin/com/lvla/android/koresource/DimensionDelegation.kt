package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.DimenRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class DimensionDelegation(val context: Context, @DimenRes val resId: Int): ReadOnlyProperty<Any, Float> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = context.resources.getDimension(resId)
}