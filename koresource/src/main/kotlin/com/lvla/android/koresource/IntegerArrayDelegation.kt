package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.ArrayRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class IntegerArrayDelegation(val context: Context, @ArrayRes val resId: Int): ReadOnlyProperty<Any, IntArray> {
    override fun getValue(thisRef: Any, property: KProperty<*>): IntArray = context.resources.getIntArray(resId)
}