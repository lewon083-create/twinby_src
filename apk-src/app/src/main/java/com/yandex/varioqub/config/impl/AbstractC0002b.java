package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.yandex.varioqub.config.impl.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0002b {
    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    public static String b() {
        Context context = AbstractC0004d.f15374a;
        if (context != null) {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        }
        Intrinsics.g("appContext");
        throw null;
    }

    public static PackageInfo c() {
        Context context = AbstractC0004d.f15374a;
        if (context != null) {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        }
        Intrinsics.g("appContext");
        throw null;
    }

    public static String d() {
        PackageInfo packageInfoC = c();
        return Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfoC.getLongVersionCode()) : String.valueOf(packageInfoC.versionCode);
    }
}
