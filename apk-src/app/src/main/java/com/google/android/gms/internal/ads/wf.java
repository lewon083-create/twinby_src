package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wf {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f11797e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f11800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11801d;

    public static wf a(Context context, Executor executor) {
        String[] strArr = f11797e;
        wf wfVar = new wf();
        wfVar.f11798a = 0L;
        wfVar.f11799b = 0L;
        wfVar.f11800c = -1L;
        wfVar.f11801d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new vf(0, wfVar));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return wfVar;
    }
}
