package com.lvla.android.koresource

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.annotation.DrawableRes
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
class DrawableDelegation(val context: Context, @DrawableRes val id: Int): ReadOnlyProperty<Any, Drawable> {
    override fun getValue(thisRef: Any, property: KProperty<*>) =
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                context.getDrawable(id)
            } else {
                context.resources.getDrawable(id)
            }
}