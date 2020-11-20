## Dagger2_and_Coroutines_example


#### Dagger Library
<pre>
plugins {
    id 'kotlin-kapt'
}

implementation 'com.google.dagger:dagger:2.27'
kapt 'com.google.dagger:dagger-compiler:2.27'
</pre>


#### Retrofit Library
<pre>
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
</pre>


#### Logging Library
<pre>
    implementation 'com.squareup.okhttp3:logging-interceptor:4.8.0'
</pre>


#### Kotlin Coroutines Library
<pre>
        implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.6"
</pre>
