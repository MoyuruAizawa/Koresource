package com.lvla.android.koresource

import android.content.Context
import android.graphics.drawable.Drawable
import android.os.Build
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.RobolectricGradleTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.annotation.Config

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner::class)
@Config(constants = BuildConfig::class, sdk = intArrayOf(Build.VERSION_CODES.LOLLIPOP))
class ResourceTest {
    val context: Context = RuntimeEnvironment.application
    val boolResource: Boolean by BoolDelegation(context, R.bool.testBool)
    val colorIntResource: Int by ColorIntDelegation(context, R.color.testColor)
    val dimenResource: Float by DimensionDelegation(context, R.dimen.testDimen)
    val integerArrayResource: IntArray by IntegerArrayDelegation(context, R.array.testIntegerArray)
    val integerResource: Int by IntegerDelegation(context, R.integer.testInteger)
    val stringResource: String by StringDelegation(context, R.string.testString)
    val drawableResource: Drawable by DrawableDelegation(context, R.drawable.notification_template_icon_bg)

    @Test
    fun testBoolResource() {
        assertEquals(boolResource, context.resources.getBoolean(R.bool.testBool))
    }

    @Test
    fun testColorIntResource() {
        assertEquals(colorIntResource, context.resources.getColor(R.color.testColor))
    }

    @Test
    fun testDimenResource() {
        assertEquals(dimenResource, context.resources.getDimension(R.dimen.testDimen))
    }

    @Test
    fun testIntegerArrayResource() {
        assertArrayEquals(integerArrayResource, context.resources.getIntArray(R.array.testIntegerArray))
    }

    @Test
    fun testIntegerResource() {
        assertEquals(integerResource, context.resources.getInteger(R.integer.testInteger))
    }

    @Test
    fun testStringResource() {
        assertEquals(stringResource, context.getString(R.string.testString))
    }

    @Test
    fun testDrawableResource() {
        assertEquals(drawableResource, context.getDrawable(R.drawable.notification_template_icon_bg))
    }
}