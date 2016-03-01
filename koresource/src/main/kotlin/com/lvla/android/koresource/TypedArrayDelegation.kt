package com.lvla.android.koresource

import android.content.Context
import android.content.res.TypedArray
import android.support.annotation.ArrayRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class TypedArrayDelegation(val context: Context, @ArrayRes val resId: Int): ReadOnlyProperty<Any, TypedArray>{
    override fun getValue(thisRef: Any, property: KProperty<*>): TypedArray = context.resources.obtainTypedArray(resId)
}