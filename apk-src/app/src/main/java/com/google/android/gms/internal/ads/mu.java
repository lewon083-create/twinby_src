package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8017h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f8018j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f8019k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f8020l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8021m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8022n;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mu(android.content.Context r8) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu.<init>(android.content.Context):void");
    }

    public static ResolveInfo e(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th2) {
            p9.k.C.f31302h.d("DeviceInfo.getResolveInfo", th2);
            return null;
        }
    }

    public final nu a() {
        return new nu(this.f8012c, this.f8013d, this.f8014e, this.f8015f, this.f8016g, this.f8017h, this.i, this.f8018j, this.f8022n, this.f8010a, this.f8011b, this.f8019k, this.f8020l, this.f8021m);
    }

    public final void b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th2) {
                p9.k.C.f31302h.d("DeviceInfo.gatherAudioInfo", th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r5.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            r0.getNetworkOperator()
            boolean r2 = ua.b.i()
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.K9
            q9.s r3 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r3 = r3.f31970c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r0.getNetworkType()
        L31:
            r4.f8011b = r2
            r0.getPhoneType()
            r0 = -2
            r4.f8010a = r0
            p9.k r0 = p9.k.C
            t9.g0 r0 = r0.f31297c
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r5 = t9.g0.d(r5, r0)
            if (r5 == 0) goto L5f
            android.net.NetworkInfo r5 = r1.getActiveNetworkInfo()
            if (r5 == 0) goto L59
            int r0 = r5.getType()
            r4.f8010a = r0
            android.net.NetworkInfo$DetailedState r5 = r5.getDetailedState()
            r5.ordinal()
            goto L5c
        L59:
            r5 = -1
            r4.f8010a = r5
        L5c:
            r1.isActiveNetworkMetered()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mu.c(android.content.Context):void");
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent intentRegisterReceiver = (!((Boolean) q9.s.f31967e.f31970c.a(al.f3082kc)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (intentRegisterReceiver != null) {
            intentRegisterReceiver.getIntExtra("status", -1);
            intentRegisterReceiver.getIntExtra("level", -1);
            intentRegisterReceiver.getIntExtra("scale", -1);
        }
    }

    public mu(Context context, nu nuVar) {
        al.a(context);
        b(context);
        c(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        jl.a(context);
        this.f8012c = nuVar.f8442a;
        this.f8013d = nuVar.f8443b;
        this.f8014e = nuVar.f8444c;
        this.f8015f = nuVar.f8445d;
        this.f8016g = nuVar.f8446e;
        this.f8017h = nuVar.f8447f;
        this.i = nuVar.f8448g;
        this.f8018j = nuVar.f8449h;
        this.f8022n = nuVar.i;
        this.f8019k = nuVar.f8452l;
        this.f8020l = nuVar.f8453m;
        this.f8021m = nuVar.f8454n;
    }
}
