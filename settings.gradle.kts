// pluginManagement {
//     repositories {
//         google()
//         mavenCentral()
//         gradlePluginPortal()
//     }
// }
// dependencyResolutionManagement {
//     repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//     repositories {
//         google()
//         mavenCentral()
//     }
// }
//
// rootProject.name = "com.example.foo"
// include(":app")

pluginManagement {
  repositories {
    google()
    mavenCentral()
  }
}
dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
  }
}

include(":app")
