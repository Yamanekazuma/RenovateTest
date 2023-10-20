enableFeaturePreview("VERSION_CATALOGS")
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                // https://github.com/google/play-services-plugins/issues/223
                "com.google.android.gms.oss-licenses-plugin" -> useModule("com.google.android.gms:oss-licenses-plugin:${requested.version}")
            }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url="https://pkgs.dev.azure.com/MicrosoftDeviceSDK/DuoSDK-Public/_packaging/Duo-SDK-Feed/maven/v1")
        maven(url="https://jitpack.io")
    }
}

include(":app")
rootProject.name = "RenovateTest"
