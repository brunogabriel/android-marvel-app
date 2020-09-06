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
        "RETROFIT_GSON" to "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    )

    val hilt = mapOf(
        "HILT" to "com.google.dagger:hilt-android:${Versions.HILT}",
        "HILT_LIFECYCLE_VIEWMODEL" to "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.HILT_LIFECYCLE_VIEWMODEL}"
    )

    val hiltCompile = mapOf(
        "HILT_COMPILER" to "com.google.dagger:hilt-android-compiler:${Versions.HILT}",
        "HILT_LIFECYCLE_VIEWMODEL_COMPILER" to "androidx.hilt:hilt-compiler:${Versions.HILT_LIFECYCLE_VIEWMODEL}"
    )

    val detekt = mapOf(
        "DETEKT" to "io.gitlab.arturbosch.detekt:detekt-cli:${Versions.DETEKT}"
    )

    val ktx = mapOf(
        "CORE" to "androidx.core:core-ktx:${Versions.CORE_KTX}",
        "VIEWMODEL" to "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}",
        "LIFECYCLE" to "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_KTX}",
        "LIVEDATA" to "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}",
        "FRAGMENT" to "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"
    )

    val archComponents = mapOf(
        "ARCH_COMPONENTS" to "androidx.lifecycle:lifecycle-extensions:${Versions.ARCH_COMPONENTS}",
        "ARCH_EXTENSIONS" to "android.arch.lifecycle:extensions:${Versions.ARCH_COMPONENTS}"
    )

    val picasso = "com.squareup.picasso:picasso:${Versions.PICASSO}"

    val chuckerInterceptor = mapOf(
        "CHUCKER_DEBUG" to "com.github.chuckerteam.chucker:library:${Versions.CHUCKER}",
        "CHUCKER_RELEASE" to "com.github.chuckerteam.chucker:library-no-op:${Versions.CHUCKER}"
    )
}