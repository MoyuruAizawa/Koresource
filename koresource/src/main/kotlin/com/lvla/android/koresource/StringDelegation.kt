package com.lvla.android.koresource

import android.content.Context
import android.os.Build
import android.support.annotation.StringRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class StringDelegation(val context: Context, @StringRes val resId: Int): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>) =
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                context.getString(resId)
            } else {
                context.resources.getString(resId)
            }
}