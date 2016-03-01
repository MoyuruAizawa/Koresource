package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.BoolRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class BoolDelegation(val context: Context, @BoolRes val resId: Int): ReadOnlyProperty<Any, Boolean> {
    override fun getValue(thisRef: Any, property: KProperty<*>) = context.resources.getBoolean(resId)
}