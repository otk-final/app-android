package com.otk.android

import android.os.Bundle
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.facebook.react.ReactActivity
import com.facebook.react.ReactInstanceManager
import com.facebook.react.ReactRootView

class MainActivity : ReactActivity() {

    var DEV_BUNDLE_URL = "http://localhost:8081/index.bundle?platform=android"

    override fun getMainComponentName(): String {
        return "RNApp"
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val builder = ReactInstanceManager.builder()
//        builder.setApplication(application).setCurrentActivity(this)
//            .setBundleAssetName("index.android.bundle").setJSMainModulePath("index")
//            .addPackages(mutableListOf<ReactPackage>(MainReactPackage()))
//            .setUseDeveloperSupport(reactNativeHost.useDeveloperSupport)
//            .setInitialLifecycleState(LifecycleState.RESUMED)
//            .setJsEngineAsHermes(true)
//
//        /**
//         * dev
//         */
//        val loader: JSBundleLoader = object : JSBundleLoader() {
//            override fun loadScript(delegate: JSBundleLoaderDelegate?): String {
//                delegate?.setSourceURLs(
//                    DEV_BUNDLE_URL, DEV_BUNDLE_URL
//                );
//                return DEV_BUNDLE_URL
//            }
//        }
//        builder.setJSBundleLoader(loader)
//
//
//        /**
//         * view
//         */
//        val rootView = ReactRootView(this).apply {
//            startReactApplication(builder.build(), mainComponentName)
//        }
//        setContentView(rootView)
//    }
}


@Composable
fun RNComposableView(register: ReactInstanceManager, module: String, bundle: Bundle?) {
    AndroidView(modifier = Modifier.fillMaxSize(), factory = { context ->
        //init
        ReactRootView(context).apply {
            startReactApplication(register, module, bundle)
        }
    }, update = { view ->
        println("view update")
    })
}
