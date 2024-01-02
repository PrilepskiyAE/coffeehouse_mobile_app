// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.google.dagger.hilt.android") version "2.45" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("com.android.application") version "7.4.2" apply false
    id("com.android.library") version "7.4.2" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}

subprojects {
    val compileSdkVersion = 34
    val targetSdkVersion = 34
    val minSdkVersion = 24

    apply {
        if (name.startsWith("app")) {
            plugin("com.android.application")
        } else {
            plugin("com.android.library")
        }
        plugin("kotlin-android")
    }

    extensions.configure("android", Action<com.android.build.gradle.TestedExtension> {
        (this as? com.android.build.gradle.internal.dsl.BaseAppModuleExtension)?.compileSdk =
            compileSdkVersion
        (this as? com.android.build.gradle.LibraryExtension)?.compileSdk = compileSdkVersion

        defaultConfig {
            targetSdk = targetSdkVersion
            minSdk = minSdkVersion
            versionCode = 1
            versionName = "0.1.0"

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            vectorDrawables {
                useSupportLibrary = true
            }
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_17
            targetCompatibility = JavaVersion.VERSION_17
        }
    })
}
