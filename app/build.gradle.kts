plugins {
  id("com.android.application") version "8.4.1"
  id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
  namespace = "com.example.foo"
  compileSdk = 34
  defaultConfig {
    minSdk = 34
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
}

dependencies {
  implementation("dev.hotwire:turbo:7.0.2")
  implementation(platform("androidx.compose:compose-bom:2023.10.01"))
}
