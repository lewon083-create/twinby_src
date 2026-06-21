package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f13315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f13316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f13317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f13319f = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f13320g = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f13321h = new AtomicReference(new ArrayDeque());
    public final AtomicReference i = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f13322j = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f13323k = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f13324l = new AtomicReference(new ArrayDeque());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f13314a = new AtomicReference(null);

    public a0(Application application, Executor executor, z zVar, boolean z5) {
        this.f13318e = z5;
        this.f13315b = application;
        this.f13316c = zVar;
        this.f13317d = executor;
    }

    public final void a(Queue queue, int i, int i10, String str) {
        Bundle bundle;
        Long l10 = (Long) queue.poll();
        if (l10 != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l10.longValue();
            if (str != null) {
                i = i10;
            }
            AtomicReference atomicReference = this.f13323k;
            Queue queue2 = (Queue) atomicReference.get();
            z zVar = this.f13316c;
            Application application = zVar.f13626a;
            r2 r2VarM = s2.m();
            w1 w1VarM = e2.m();
            z1 z1VarM = a2.m();
            z1VarM.c();
            a2.p((a2) z1VarM.f13548c, i);
            if (str != null) {
                z1VarM.c();
                a2.n((a2) z1VarM.f13548c, str);
            }
            if (jCurrentTimeMillis > 0) {
                z1VarM.c();
                a2.o((a2) z1VarM.f13548c, jCurrentTimeMillis);
            }
            a2 a2Var = (a2) z1VarM.a();
            w1VarM.c();
            e2.r((e2) w1VarM.f13548c, a2Var);
            String str2 = zVar.f13630e;
            PackageInfo packageInfo = null;
            if (str2 == null) {
                try {
                    bundle = application.getPackageManager().getApplicationInfo(application.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException unused) {
                    bundle = null;
                }
                if (bundle != null) {
                    zVar.f13630e = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
                }
                if (TextUtils.isEmpty(zVar.f13630e)) {
                    Log.w("UserMessagingPlatform", "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
                }
                str2 = zVar.f13630e;
            }
            if (str2 != null) {
                w1VarM.c();
                e2.o((e2) w1VarM.f13548c, str2);
            }
            d2 d2Var = zVar.f13627b;
            if (d2Var == null) {
                b2 b2VarM = d2.m();
                b2VarM.c();
                d2.n((d2) b2VarM.f13548c);
                d2Var = (d2) b2VarM.a();
                zVar.f13627b = d2Var;
            }
            w1VarM.c();
            e2.s((e2) w1VarM.f13548c, d2Var);
            y1 y1Var = zVar.f13629d;
            if (y1Var == null) {
                x1 x1VarM = y1.m();
                int i11 = Build.VERSION.SDK_INT;
                x1VarM.c();
                y1.n((y1) x1VarM.f13548c, i11);
                String str3 = Build.MODEL;
                x1VarM.c();
                y1.o((y1) x1VarM.f13548c);
                x1VarM.c();
                y1.q((y1) x1VarM.f13548c);
                String str4 = Build.VERSION.RELEASE;
                x1VarM.c();
                y1.p((y1) x1VarM.f13548c);
                y1Var = (y1) x1VarM.a();
                zVar.f13629d = y1Var;
            }
            w1VarM.c();
            e2.q((e2) w1VarM.f13548c, y1Var);
            v1 v1Var = zVar.f13628c;
            if (v1Var == null) {
                String packageName = application.getPackageName();
                try {
                    packageInfo = application.getPackageManager().getPackageInfo(packageName, 0);
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                if (packageInfo != null) {
                    u1 u1VarM = v1.m();
                    String string = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
                    u1VarM.c();
                    v1.o((v1) u1VarM.f13548c, string);
                    u1VarM.c();
                    v1.n((v1) u1VarM.f13548c, packageName);
                    zVar.f13628c = (v1) u1VarM.a();
                }
                v1Var = zVar.f13628c;
            }
            if (v1Var != null) {
                w1VarM.c();
                e2.p((e2) w1VarM.f13548c, v1Var);
            }
            String string2 = PreferenceManager.getDefaultSharedPreferences(application).getString("UMP_eids", "");
            if (string2 != null && !string2.isEmpty()) {
                i0 i0Var = new i0(string2);
                while (i0Var.hasNext()) {
                    String str5 = (String) i0Var.next();
                    w1VarM.c();
                    e2.n((e2) w1VarM.f13548c, str5);
                }
            }
            e2 e2Var = (e2) w1VarM.a();
            r2VarM.c();
            s2.n((s2) r2VarM.f13548c, e2Var);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            r2VarM.c();
            s2.o((s2) r2VarM.f13548c, jCurrentTimeMillis2);
            queue2.add((s2) r2VarM.a());
            if (this.f13318e) {
                ((ArrayDeque) this.f13324l.get()).addAll((Collection) atomicReference.get());
            }
            this.f13317d.execute(new h(2, this));
        }
    }
}
