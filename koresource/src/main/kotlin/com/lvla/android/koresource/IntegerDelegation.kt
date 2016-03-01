package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.IntegerRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class IntegerDelegation(val context: Context, @IntegerRes val resId: Int): ReadOnlyProperty<Any, Int> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = context.resources.getInteger(resId)
}