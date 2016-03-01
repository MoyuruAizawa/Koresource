package com.lvla.android.koresource

import android.content.Context
import android.os.Build
import android.support.annotation.ColorRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class ColorIntDelegation(val context: Context, @ColorRes val resId: Int): ReadOnlyProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>) =
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                context.getColor(resId)
            } else {
                context.resources.getColor(resId)
            }
}