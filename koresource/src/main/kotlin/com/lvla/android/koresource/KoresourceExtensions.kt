package com.lvla.android.koresource

import android.content.Context
import android.support.annotation.*
import android.support.v4.app.Fragment
import android.widget.ArrayAdapter

/**
 * Created by moyuru_aizawa on 2016/02/16.
 */
fun Context.animResource(@AnimRes resId: Int) = AnimDelegation(this, resId)
fun Context.boolResource(@BoolRes resId: Int) = BoolDelegation(this, resId)
fun Context.colorIntResource(@ColorRes resId: Int) = ColorIntDelegation(this, resId)
fun Context.dimenResource(@DimenRes resId: Int) = DimensionDelegation(this, resId)
fun Context.drawableResource(@DrawableRes id: Int) = DrawableDelegation(this, id)
fun Context.integerArrayResource(@ArrayRes resId: Int) = IntegerArrayDelegation(this, resId)
fun Context.stringResource(@StringRes resId: Int) = StringDelegation(this, resId)
fun Context.typedArrayResource(@ArrayRes  resId: Int) = TypedArrayDelegation(this, resId)
fun Context.integerResource(@IntegerRes resId: Int) = IntegerDelegation(this, resId)

fun Fragment.animResource(@AnimRes resId: Int) = AnimDelegation(activity, resId)
fun Fragment.boolResource(@BoolRes resId: Int) = BoolDelegation(activity, resId)
fun Fragment.colorIntResource(@ColorRes resId: Int) = ColorIntDelegation(activity, resId)
fun Fragment.dimenResource(@DimenRes resId: Int) = DimensionDelegation(activity, resId)
fun Fragment.drawableResource(@DrawableRes id: Int) = DrawableDelegation(activity, id)
fun Fragment.integerArrayResource(@ArrayRes resId: Int) = IntegerArrayDelegation(activity, resId)
fun Fragment.stringResource(@StringRes resId: Int) = StringDelegation(activity, resId)
fun Fragment.typedArrayResource(@ArrayRes  resId: Int) = TypedArrayDelegation(activity, resId)
fun Fragment.integerResource(@IntegerRes resId: Int) = IntegerDelegation(activity, resId)

fun android.app.Fragment.animResource(@AnimRes resId: Int) = AnimDelegation(activity, resId)
fun android.app.Fragment.boolResource(@BoolRes resId: Int) = BoolDelegation(activity, resId)
fun android.app.Fragment.colorIntResource(@ColorRes resId: Int) = ColorIntDelegation(activity, resId)
fun android.app.Fragment.dimenResource(@DimenRes resId: Int) = DimensionDelegation(activity, resId)
fun android.app.Fragment.drawableResource(@DrawableRes id: Int) = DrawableDelegation(activity, id)
fun android.app.Fragment.integerArrayResource(@ArrayRes resId: Int) = IntegerArrayDelegation(activity, resId)
fun android.app.Fragment.stringResource(@StringRes resId: Int) = StringDelegation(activity, resId)
fun android.app.Fragment.typedArrayResource(@ArrayRes  resId: Int) = TypedArrayDelegation(activity, resId)
fun android.app.Fragment.integerResource(@IntegerRes resId: Int) = IntegerDelegation(activity, resId)

fun <T> ArrayAdapter<T>.animResource(@AnimRes resId: Int) = AnimDelegation(context, resId)
fun <T> ArrayAdapter<T>.boolResource(@BoolRes resId: Int) = BoolDelegation(context, resId)
fun <T> ArrayAdapter<T>.colorIntResource(@ColorRes resId: Int) = ColorIntDelegation(context, resId)
fun <T> ArrayAdapter<T>.dimenResource(@DimenRes resId: Int) = DimensionDelegation(context, resId)
fun <T> ArrayAdapter<T>.drawableResource(@DrawableRes id: Int) = DrawableDelegation(context, id)
fun <T> ArrayAdapter<T>.integerArrayResource(@ArrayRes resId: Int) = IntegerArrayDelegation(context, resId)
fun <T> ArrayAdapter<T>.stringResource(@StringRes resId: Int) = StringDelegation(context, resId)
fun <T> ArrayAdapter<T>.typedArrayResource(@ArrayRes  resId: Int) = TypedArrayDelegation(context, resId)
fun <T> ArrayAdapter<T>.integerResource(@IntegerRes resId: Int) = IntegerDelegation(context, resId)