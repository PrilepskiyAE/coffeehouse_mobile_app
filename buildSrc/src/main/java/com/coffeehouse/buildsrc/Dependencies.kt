object Dependencies {

    object Compose {
        const val composeVerion = "1.5.0"
        const val composeMaterial3Version = "1.0.1"
        const val toolingUiVersion = "1.5.3"

        const val animation = "androidx.compose.animation:animation:$composeVerion"
        const val foundation = "androidx.compose.foundation:foundation:$composeVerion"
        const val material = "androidx.compose.material:material:$composeVerion"
        const val material3 = "androidx.compose.material3:material3:$composeMaterial3Version"
        const val material3Alfa = "androidx.compose.material3:material3:1.2.0-alpha11"
        const val runtime = "androidx.compose.runtime:runtime:$composeVerion"
        const val ui = "androidx.compose.ui:ui:$composeVerion"
        const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$toolingUiVersion"
        const val toolingUi = "androidx.compose.ui:ui-tooling:$composeVerion"
        const val foundationLayout = "androidx.compose.foundation:foundation-layout:$composeVerion"
        const val uiUtil = "androidx.compose.ui:ui-util:$composeVerion"
        const val constraint =
            "androidx.constraintlayout:constraintlayout-compose:$composeMaterial3Version"
    }

    object Navigation {
        const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:1.0.0"
        const val composeNavigation = "androidx.navigation:navigation-compose:2.5.3"
    }

    object Accompanist {
        const val permission = "com.google.accompanist:accompanist-permissions:0.32.0"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:0.24.11-rc"
    }

    object Core {
        const val coreKtx = "androidx.core:core-ktx:1.10.0"
        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        const val legacySupport = "androidx.legacy:legacy-support-v4:1.0.0"
        const val splash = "androidx.core:core-splashscreen:1.0.0"
    }

    object Ktor {
        const val ktorVersion = "2.2.4"

        const val client = "io.ktor:ktor-client-okhttp:$ktorVersion"
        const val auth = "io.ktor:ktor-client-auth:$ktorVersion"
        const val clientContentNegotiation = "io.ktor:ktor-client-content-negotiation:$ktorVersion"
        const val serialization = "io.ktor:ktor-serialization-kotlinx-json:$ktorVersion"
        const val logging = "io.ktor:ktor-client-logging-jvm:$ktorVersion"
        const val test = "io.ktor:ktor-client-mock:$ktorVersion"
    }

    object Hilt {
        const val hiltVersion = "2.45"

        const val android = "com.google.dagger:hilt-android:$hiltVersion"
        const val compiler = "com.google.dagger:hilt-compiler:$hiltVersion"
    }

    object Test {
        const val junit = "junit:junit:4.13.2"
        const val mockkVersion = "1.13.4"

        const val extJunit = "androidx.test.ext:junit:1.1.5"
        const val espressoX = "androidx.test.espresso:espresso-core:3.5.1"
        const val espresso = "com.android.support.test.espresso:espresso-core:3.0.2"
        const val kotlinTest = "org.jetbrains.kotlin:kotlin-test:1.8.10"
        const val mockkAndroid = "io.mockk:mockk-android:${mockkVersion}"
        const val mockk = "io.mockk:mockk:${mockkVersion}"
        const val mockkAgent = "io.mockk:mockk-agent:${mockkVersion}"
        const val rules = "com.android.support.test:rules:1.0.2"
        const val runner = "com.android.support.test:runner:1.4.0"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.6.4"
        const val truth = "com.google.truth:truth:1.1.3"
    }

    object Coroutines {
        const val kotlinxCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4"
    }

    object Lifecycle {
        const val lifeCycleVersion = "2.6.1"

        const val viewmodelCompose =
            "androidx.lifecycle:lifecycle-viewmodel-compose:$lifeCycleVersion"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycleVersion"
        const val compiler = "androidx.lifecycle:lifecycle-compiler:$lifeCycleVersion"
        const val common = "androidx.lifecycle:lifecycle-common:$lifeCycleVersion"
    }

    object Biometric {
        const val biometric = "androidx.biometric:biometric:1.1.0"
    }

    object Datastore {
        const val datastore = "androidx.datastore:datastore-preferences:1.0.0"
    }

    object Kotlin {
        const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0"
        const val serializationProtobuf =
            "org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.5.0"
    }

    object Crypto {
        const val tink = "com.google.crypto.tink:tink-android:1.6.1"
    }

    object Room {
        const val roomVersion = "2.5.1"

        const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
        const val roomKaptCompiler = "androidx.room:room-compiler:$roomVersion"
    }

    object Coil {
        const val coil = "io.coil-kt:coil-compose:2.5.0"
    }

    object SecurityCrypto {
        const val crypto = "androidx.security:security-crypto:1.0.0"
    }

    object Camera {
        const val cameraVersion = "1.0.1"
        const val camera = "androidx.camera:camera-camera2:$cameraVersion"
        const val lifecycle = "androidx.camera:camera-lifecycle:$cameraVersion"
        const val view = "androidx.camera:camera-view:1.0.0-alpha27"
    }

    object Arrow {
        const val arrowVersion = "1.2.0"
        const val arrowCore = "io.arrow-kt:arrow-core:$arrowVersion"
        const val arrowFxStm = "io.arrow-kt:arrow-fx-stm:$arrowVersion"
        const val arrowCoroutines = "io.arrow-kt:arrow-fx-coroutines:$arrowVersion"

        val arrowList = listOf(arrowCore, arrowFxStm, arrowCoroutines)
    }

    object Google {
        const val gmsLocation = "com.google.android.gms:play-services-location:21.0.1"
    }
}