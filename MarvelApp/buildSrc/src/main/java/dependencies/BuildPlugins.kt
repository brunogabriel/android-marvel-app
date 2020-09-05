package dependencies

// TODO: maybe remove it
object BuildPlugins {
    const val GRADLE = "com.android.tools.build:gradle:${PluginsVersions.GRADLE}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginsVersions.KOTLIN}"
    const val HILT = "com.google.dagger:hilt-android-gradle-plugin:${PluginsVersions.HILT}"
}