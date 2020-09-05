package dependencies

object Dependencies {
    val kotlin = mapOf(
        "KOTLIN" to "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${PluginsVersions.KOTLIN}"
    )

    val ui = mapOf(
        "APPCOMPAT" to "androidx.appcompat:appcompat:${Versions.APP_COMPAT}",
        "CONSTRAINT_LAYOUT" to "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}",
        "MATERIAL" to "com.google.android.material:material:${Versions.MATERIAL}",
        "RECYCLERVIEW" to "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"
    )

    val retrofit = mapOf(
        "RETROFIT" to "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}",
        "RETROFIT_RX_ADAPTER" to "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT}",
        "RETROFIT_GSON" to "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    )

    val hilt = mapOf(
        "HILT" to "com.google.dagger:hilt-android:${Versions.HILT}"
    )
    val hiltCompile = mapOf(
        "HILT_COMPILER" to "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    )

    val detekt = mapOf(
        "DETEKT" to "io.gitlab.arturbosch.detekt:detekt-cli:${Versions.DETEKT}"
    )

    val ktx = mapOf(
        "CORE" to "androidx.core:core-ktx:${Versions.KTX}",
        "VIEWMODEL" to "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.KTX}",
        "LIFECYCLE" to "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0-alpha01:${Versions.KTX}",
        "LIVEDATA" to "androidx.lifecycle:lifecycle-livedata-ktx::2.2.0-alpha01:${Versions.KTX}"
    )

    val archComponents = mapOf(
        "ARCH_COMPONENTS" to "androidx.lifecycle:lifecycle-extensions:${Versions.ARCH_COMPONENTS}"
    )

    val picasso = "com.squareup.picasso:picasso:${Versions.PICASSO}"

    val chuckerInterceptor = mapOf(
        "CHUCKER_DEBUG" to "com.github.chuckerteam.chucker:library:${Versions.CHUCKER}",
        "CHUCKER_RELEASE" to "com.github.chuckerteam.chucker:library-no-op:${Versions.CHUCKER}"
    )
}