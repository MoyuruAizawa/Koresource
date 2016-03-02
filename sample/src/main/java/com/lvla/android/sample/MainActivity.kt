package com.lvla.android.sample

import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import com.lvla.android.koresource.*

class MainActivity : AppCompatActivity() {
    val sampleString: String by stringResource(R.string.sample_string)
    val sampleInteger: Int by integerResource(R.integer.sample_integer)
    val sampleBoolean: Boolean by boolResource(R.bool.sample_bool)
    val sampleColorInt: Int by colorIntResource(R.color.sample_color)
    val sampleDimen: Float by dimenResource(R.dimen.sample_dimen)
    val sampleDrawable: Drawable by drawableResource(R.drawable.abc_ic_menu_share_material)
    val sampleIntegerArray: IntArray by integerArrayResource(R.array.sample_integer_array)
    val sampleTypedArray: TypedArray by typedArrayResource(R.array.sample_color_array)
    val sampleAnim: Animation by animResource(R.anim.abc_fade_in)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
