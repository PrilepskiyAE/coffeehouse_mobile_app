pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "coffeehouse mobile app"
include(":app")
include(":home-feature")
include(":favorite-feature")
include(":shop-feature")
include(":notification-feature")
include(":registration-feature")
include(":login-feature")
include(":database-core")
include(":datastore-core")
include(":network-core")
