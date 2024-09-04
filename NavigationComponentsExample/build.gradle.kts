// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
    }

    dependencies {
        classpath(libs.androidx.navigation.safe.args.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id ("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
    id ("com.google.devtools.ksp") version "1.9.10-1.0.13" apply false
}
