package com.lvla.android.sample

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.v4.content.res.ResourcesCompat
import com.lvla.android.koresource.*
import com.taroid.knit.should
import org.junit.Test

import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class ResourceTest {
    val context: Context = RuntimeEnvironment.application
    val boolResource: Boolean by BoolDelegation(context, R.bool.testBool)
    val colorIntResource: Int by ColorIntDelegation(context, R.color.testColor)
    val dimenResource: Float by DimensionDelegation(context, R.dimen.testDimen)
    val integerArrayResource: IntArray by IntegerArrayDelegation(context, R.array.testIntegerArray)
    val integerResource: Int by IntegerDelegation(context, R.integer.testInteger)
    val stringResource: String by StringDelegation(context, R.string.testString)
    val drawableResource: Drawable by DrawableDelegation(context, R.drawable.abc_ab_share_pack_mtrl_alpha)

    @Test
    fun testBoolResource() {
        boolResource.should be context.resources.getBoolean(R.bool.testBool)
    }

    @Test
    fun testColorIntResource() {
        colorIntResource.should be ResourcesCompat.getColor(context.resources, R.color.testColor, null)
    }

    @Test
    fun testDimenResource() {
        dimenResource.should be context.resources.getDimension(R.dimen.testDimen)
    }

    @Test
    fun testIntegerArrayResource() {
        integerArrayResource.should be context.resources.getIntArray(R.array.testIntegerArray)
    }

    @Test
    fun testIntegerResource() {
        integerResource.should be context.resources.getInteger(R.integer.testInteger)
    }

    @Test
    fun testStringResource() {
        stringResource.should be context.getString(R.string.testString)
    }

    @Test
    fun testDrawableResource() {
        drawableResource.should be ResourcesCompat.getDrawable(context.resources, R.drawable.abc_ab_share_pack_mtrl_alpha, null)!!
    }
}