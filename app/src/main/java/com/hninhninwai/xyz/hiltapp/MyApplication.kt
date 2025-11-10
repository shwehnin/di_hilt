package com.hninhninwai.xyz.hiltapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Entry point for Hilt's DI system in app
// My application is created before any activity, service or broadcast receiver in the app
@HiltAndroidApp
class MyApplication : Application() {
    // @HiltAndroidApp : tells hilt to generate a DI container at the app level
}