# Koresource
Classes and Extension Functions for Kotlin Delegated Property to get Android Resources(string, dimen, integer, drawable....).
Extension Functions are available on subclasses of Activity , Fragment, SupportFragment and ArrayAdapter.
```kotlin
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

}
```

# Installation
```groovy
repositories {
    maven {
        url "http://dl.bintray.com/lvla/maven"
    }
}

dependencies {
    compile 'com.lvla.android:koresource:0.1.1'
}
```

# License
```
Copyright 2016 Moyuru Aizawa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
