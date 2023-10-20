plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.gms.oss.licenses)
    //alias(libs.plugins.gms.google.services)
    alias(libs.plugins.firebase.crashlytics)
    kotlin("kapt")
    alias(libs.plugins.dagger.hilt)
    alias(libs.plugins.detekt)
    alias(libs.plugins.serialization)
}

android {
    namespace = "jp.ac.nitech.nitechcommunity.renovatetest"
    compileSdk = 33

    defaultConfig {
        applicationId = "jp.ac.nitech.nitechcommunity.renovatetest"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Default
    implementation(libs.appcompat)
    implementation(libs.core.ktx)
    implementation(libs.constraintlayout)

    // Activity, Fragment
    implementation(libs.activity)
    implementation(libs.fragment)

    // Lifecycle runtime
    implementation(libs.lifecycle)

    // Preference
    implementation(libs.preference)

    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)
    implementation(libs.retrofit.serialization)
    implementation(libs.okhttp.logging.interceptor)

    // Kotlin serialization
    implementation(libs.serialization)

    // Coroutine
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.rx2)
    implementation(libs.coroutines)

    // MSAL
    implementation(libs.msal) { exclude(group = "com.microsoft.device.display") }
    implementation(libs.msal.common)
    implementation(libs.msal.legacy)

    // OSS licenses
    implementation(libs.oss.licenses)

    // Alt Beacon
    implementation(libs.beacon)

    // Navigation
    implementation(libs.navigation.runtime)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.navigation.features)
    androidTestImplementation(libs.navigation.testing)

    // Timetable
    implementation(libs.timetable)

    // Material
    implementation(libs.material)

    // RecyclerView
    implementation(libs.recyclerview)

    // Lottie
    implementation(libs.lottie)

    // NTP
    implementation(libs.truetime)

    // Room
    implementation(libs.room.runtime)
    implementation(libs.room.kts)
    kapt(libs.room.compiler)
    testImplementation(libs.room.testing)

    // Test
    testImplementation(libs.junit)
    androidTestImplementation(libs.test.runner)
    androidTestUtil(libs.test.orchestrator)
    androidTestImplementation(libs.test.rules)
    testImplementation(libs.test.core)
    androidTestImplementation(libs.test.espresso)
    androidTestImplementation(libs.test.junit)
    // androidTestImplementation(libs.support.annotations)
    // androidTestImplementation(libs.support.test.runner)
    // androidTestImplementation(libs.support.test.rules)
    androidTestImplementation(libs.hamcrest)

    // Firebase
//    implementation(platform(libs.firebase.bom))
//    implementation(libs.firebase.analytics)
//    implementation(libs.firebase.crashlytics)

    // Hilt
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)
    androidTestImplementation(libs.hilt.testing)
    kaptAndroidTest(libs.hilt.compiler)

    // CardView
    implementation(libs.cardview)

    // Paging
    implementation(libs.paging)

    // TSnackbar
    implementation(libs.tsnackbar)

    // Timber
    implementation(libs.timber)

    // Splash
    implementation(libs.splash)
}

kapt {
    correctErrorTypes = true
}
