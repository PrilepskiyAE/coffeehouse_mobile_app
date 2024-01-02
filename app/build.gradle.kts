plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("kotlinx-serialization")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.coffeehouse.ch_mobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.coffeehouse.ch_mobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.Core.coreKtx)
    implementation(Dependencies.Kotlin.serialization)
    implementation(Dependencies.Lifecycle.runtime)

    implementation(Dependencies.Compose.animation)
    implementation(Dependencies.Compose.foundation)
    implementation(Dependencies.Compose.material)
    implementation(Dependencies.Compose.material3)
    implementation(Dependencies.Compose.runtime)
    implementation(Dependencies.Compose.ui)
    implementation(Dependencies.Compose.toolingPreview)

    implementation(Dependencies.Navigation.hiltNavigation)
    implementation(Dependencies.Navigation.composeNavigation)

    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

    implementation(Dependencies.Test.junit)
    implementation(Dependencies.Test.extJunit)
    implementation(Dependencies.Test.espresso)
    implementation(Dependencies.Test.junit)
    implementation(Dependencies.Test.extJunit)
    implementation(Dependencies.Test.espresso)
    implementation(Dependencies.Biometric.biometric)
    implementation(Dependencies.Coil.coil)
}