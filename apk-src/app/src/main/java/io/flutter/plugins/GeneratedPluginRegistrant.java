package io.flutter.plugins;

import aj.e0;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import bf.m;
import cj.d0;
import com.appsflyer.appsflyersdk.AppsflyerSdkPlugin;
import com.github.dart_lang.jni.JniPlugin;
import ef.c;
import fj.a1;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.embedding.engine.FlutterEngine;
import io.sentry.flutter.SentryFlutterPlugin;
import ni.h;
import oh.a;
import oi.j;
import pi.d;
import ri.f;
import ti.v0;
import xe.b;
import xi.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.f25544d.a(new AppMetricaPlugin());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e3);
        }
        try {
            flutterEngine.f25544d.a(new AppsflyerSdkPlugin());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin appsflyer_sdk, com.appsflyer.appsflyersdk.AppsflyerSdkPlugin", e7);
        }
        try {
            flutterEngine.f25544d.a(new h());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin camera_android_camerax, io.flutter.plugins.camerax.CameraAndroidCameraxPlugin", e10);
        }
        try {
            flutterEngine.f25544d.a(new b());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin cloudpayments, com.shushper.cloudpayments.CloudpaymentsPlugin", e11);
        }
        try {
            flutterEngine.f25544d.a(new nh.b());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e12);
        }
        try {
            flutterEngine.f25544d.a(new a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e13);
        }
        try {
            flutterEngine.f25544d.a(new j());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e14);
        }
        try {
            flutterEngine.f25544d.a(new d());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e15);
        }
        try {
            flutterEngine.f25544d.a(new f());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e16);
        }
        try {
            flutterEngine.f25544d.a(new qi.f());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin firebase_remote_config, io.flutter.plugins.firebase.firebaseremoteconfig.FirebaseRemoteConfigPlugin", e17);
        }
        try {
            flutterEngine.f25544d.a(new j8.a());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin flutter_image_compress_common, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e18);
        }
        try {
            flutterEngine.f25544d.a(new yl.a());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin flutter_login_vk, ru.innim.flutter_login_vk.FlutterLoginVkPlugin", e19);
        }
        try {
            flutterEngine.f25544d.a(new yk.a());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e20);
        }
        try {
            flutterEngine.f25544d.a(new si.a());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e21);
        }
        try {
            flutterEngine.f25544d.a(new lh.a());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin flutter_udid, de.gigadroid.flutter_udid.FlutterUdidPlugin", e22);
        }
        try {
            flutterEngine.f25544d.a(new c());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin flutter_yandex_ad, com.twinby.flutter_yandex_ad.FlutterYandexAdPlugin", e23);
        }
        try {
            flutterEngine.f25544d.a(new e8.c());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e24);
        }
        try {
            flutterEngine.f25544d.a(new v0());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin google_mobile_ads, io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin", e25);
        }
        try {
            flutterEngine.f25544d.a(new wi.c());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e26);
        }
        try {
            flutterEngine.f25544d.a(new se.a());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin http_proxy_override, com.littlegnal.http_proxy_override.HttpProxyOverridePlugin", e27);
        }
        try {
            flutterEngine.f25544d.a(new i());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e28);
        }
        try {
            flutterEngine.f25544d.a(new yi.a());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin in_app_purchase_android, io.flutter.plugins.inapppurchase.InAppPurchasePlugin", e29);
        }
        try {
            flutterEngine.f25544d.a(new mh.a());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin in_app_review, dev.britannio.in_app_review.InAppReviewPlugin", e30);
        }
        try {
            flutterEngine.f25544d.a(new JniPlugin());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e31);
        }
        try {
            flutterEngine.f25544d.a(new ph.a());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e32);
        }
        try {
            flutterEngine.f25544d.a(new zi.d());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e33);
        }
        try {
            flutterEngine.f25544d.a(new i8.a());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e34);
        }
        try {
            flutterEngine.f25544d.a(new SentryFlutterPlugin());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin sentry_flutter, io.sentry.flutter.SentryFlutterPlugin", e35);
        }
        try {
            flutterEngine.f25544d.a(new qh.a());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e36);
        }
        try {
            flutterEngine.f25544d.a(new e0());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e37);
        }
        try {
            flutterEngine.f25544d.a(new z7.a());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin sign_in_with_apple, com.aboutyou.dart_packages.sign_in_with_apple.SignInWithApplePlugin", e38);
        }
        try {
            flutterEngine.f25544d.a(new m());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e39);
        }
        try {
            flutterEngine.f25544d.a(new rh.a());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin sqlite3_flutter_libs, eu.simonbinder.sqlite3_flutter_libs.Sqlite3FlutterLibsPlugin", e40);
        }
        try {
            flutterEngine.f25544d.a(new bj.f());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e41);
        }
        try {
            flutterEngine.f25544d.a(new ih.b());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin varioqub_plugin, com.yandex.varioqub.flutter.VarioqubPlugin", e42);
        }
        try {
            flutterEngine.f25544d.a(new d0());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e43);
        }
        try {
            flutterEngine.f25544d.a(new a1());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e44);
        }
    }
}
