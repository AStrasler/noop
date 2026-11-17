// Root build file — declares plugin versions once; applied per-module in app/build.gradle.kts.
// Keep these versions aligned with the shared contract:
//   Android Gradle Plugin 8.x · Kotlin 2.1.0 · KSP and Compose Compiler matched to Kotlin · Room 2.6.x.
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "2.1.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0" apply false
    // KSP version is <kotlinVersion>-<kspVersion>; must track the Kotlin version exactly.
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
}
