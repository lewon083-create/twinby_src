package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.util.AndroidLazyEvaluator;
import io.sentry.protocol.App;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ContextUtils {

    @SuppressLint({"NewApi"})
    @NotNull
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo33 = new AndroidLazyEvaluator<>(new a(1));

    @NotNull
    private static final AndroidLazyEvaluator<PackageInfo> staticPackageInfo = new AndroidLazyEvaluator<>(new a(2));

    @NotNull
    private static final AndroidLazyEvaluator<String> applicationName = new AndroidLazyEvaluator<>(new a(3));

    @SuppressLint({"NewApi"})
    @NotNull
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo33 = new AndroidLazyEvaluator<>(new a(4));

    @NotNull
    private static final AndroidLazyEvaluator<ApplicationInfo> staticAppInfo = new AndroidLazyEvaluator<>(new a(5));

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SideLoadedInfo {

        @Nullable
        private final String installerStore;
        private final boolean isSideLoaded;

        public SideLoadedInfo(boolean z5, @Nullable String str) {
            this.isSideLoaded = z5;
            this.installerStore = str;
        }

        @NotNull
        public Map<String, String> asTags() {
            HashMap map = new HashMap();
            map.put("isSideLoaded", String.valueOf(this.isSideLoaded));
            String str = this.installerStore;
            if (str != null) {
                map.put("installerStore", str);
            }
            return map;
        }

        @Nullable
        public String getInstallerStore() {
            return this.installerStore;
        }

        public boolean isSideLoaded() {
            return this.isSideLoaded;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SplitApksInfo {
        static final String SPLITS_REQUIRED = "com.android.vending.splits.required";
        private final boolean isSplitApks;
        private final String[] splitNames;

        public SplitApksInfo(boolean z5, String[] strArr) {
            this.isSplitApks = z5;
            this.splitNames = strArr;
        }

        @Nullable
        public String[] getSplitNames() {
            return this.splitNames;
        }

        public boolean isSplitApks() {
            return this.isSplitApks;
        }
    }

    private ContextUtils() {
    }

    public static boolean appIsLibraryForComposePreview(@NotNull Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NotNull
    public static Context getApplicationContext(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticAppInfo33.getValue(context) : staticAppInfo.getValue(context);
    }

    @Nullable
    public static String getApplicationName(@NotNull Context context) {
        return applicationName.getValue(context);
    }

    @NotNull
    public static String[] getArchitectures() {
        return Build.SUPPORTED_ABIS;
    }

    @Nullable
    public static DisplayMetrics getDisplayMetrics(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    @Nullable
    public static String getFamily(@NotNull ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    @Nullable
    public static String getKernelVersion(@NotNull ILogger iLogger) {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e3) {
            iLogger.log(SentryLevel.ERROR, "Exception while attempting to read kernel information", e3);
            return property;
        }
    }

    @Nullable
    public static ActivityManager.MemoryInfo getMemInfo(@NotNull Context context, @NotNull ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.log(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    @Nullable
    public static PackageInfo getPackageInfo(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 33 ? staticPackageInfo33.getValue(context) : staticPackageInfo.getValue(context);
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public static String getVersionCode(@NotNull PackageInfo packageInfo, @NotNull BuildInfoProvider buildInfoProvider) {
        return buildInfoProvider.getSdkInfoVersion() >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : getVersionCodeDep(packageInfo);
    }

    @NotNull
    private static String getVersionCodeDep(@NotNull PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    @Nullable
    public static String getVersionName(@NotNull PackageInfo packageInfo) {
        return packageInfo.versionName;
    }

    public static boolean isForegroundImportance() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PackageInfo lambda$static$0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PackageInfo lambda$static$1(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$static$2(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApplicationInfo lambda$static$3(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ApplicationInfo lambda$static$4(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static Intent registerReceiver(@NotNull Context context, @NotNull SentryOptions sentryOptions, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable Handler handler) {
        return registerReceiver(context, new BuildInfoProvider(sentryOptions.getLogger()), broadcastReceiver, intentFilter, handler);
    }

    public static void resetInstance() {
        staticPackageInfo33.resetValue();
        staticPackageInfo.resetValue();
        applicationName.resetValue();
        staticAppInfo33.resetValue();
        staticAppInfo.resetValue();
    }

    @Nullable
    public static SideLoadedInfo retrieveSideLoadedInfo(@NotNull Context context, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        String str;
        try {
            PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfo != null && packageManager != null) {
                str = packageInfo.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new SideLoadedInfo(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.log(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    @Nullable
    public static SplitApksInfo retrieveSplitApksInfo(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider) {
        Bundle bundle;
        ApplicationInfo applicationInfo = getApplicationInfo(context, buildInfoProvider);
        PackageInfo packageInfo = getPackageInfo(context, buildInfoProvider);
        if (packageInfo == null) {
            return null;
        }
        return new SplitApksInfo((applicationInfo == null || (bundle = applicationInfo.metaData) == null) ? false : bundle.getBoolean("com.android.vending.splits.required"), packageInfo.splitNames);
    }

    public static void setAppPackageInfo(@NotNull PackageInfo packageInfo, @NotNull BuildInfoProvider buildInfoProvider, @Nullable DeviceInfoUtil deviceInfoUtil, @NotNull App app) {
        app.setAppIdentifier(packageInfo.packageName);
        app.setAppVersion(packageInfo.versionName);
        app.setAppBuild(getVersionCode(packageInfo, buildInfoProvider));
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        app.setPermissions(map);
        if (deviceInfoUtil != null) {
            try {
                SplitApksInfo splitApksInfo = deviceInfoUtil.getSplitApksInfo();
                if (splitApksInfo != null) {
                    app.setSplitApks(Boolean.valueOf(splitApksInfo.isSplitApks()));
                    if (splitApksInfo.getSplitNames() != null) {
                        app.setSplitNames(Arrays.asList(splitApksInfo.getSplitNames()));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    @Nullable
    public static PackageInfo getPackageInfo(@NotNull Context context, int i, @NotNull ILogger iLogger, @NotNull BuildInfoProvider buildInfoProvider) {
        try {
            if (buildInfoProvider.getSdkInfoVersion() >= 33) {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i));
            }
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th2) {
            iLogger.log(SentryLevel.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    @SuppressLint({"NewApi", "UnspecifiedRegisterReceiverFlag"})
    @Nullable
    public static Intent registerReceiver(@NotNull Context context, @NotNull BuildInfoProvider buildInfoProvider, @Nullable BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable Handler handler) {
        if (buildInfoProvider.getSdkInfoVersion() < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4);
    }
}
