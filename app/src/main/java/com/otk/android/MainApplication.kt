package com.otk.android

import android.app.Application
import com.facebook.react.BuildConfig
import com.facebook.react.ReactApplication
import com.facebook.react.ReactNativeHost
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.facebook.soloader.SoLoader


class MainApplication : Application(), ReactApplication {

    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }

    private val reactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
        override fun getUseDeveloperSupport(): Boolean {
            return BuildConfig.DEBUG
        }

        override fun getPackages(): MutableList<ReactPackage> {
            return mutableListOf<ReactPackage>(MainReactPackage())
        }

        override fun getJSMainModuleName(): String {
            return "index"
        }
    }


    override fun getReactNativeHost(): ReactNativeHost {
        return reactNativeHost
    }
}

