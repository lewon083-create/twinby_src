package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h21 implements a21, oy0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f6004h = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f6006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6007d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6008e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6009f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6010g = false;

    public h21(Context context, ExecutorService executorService, String[] strArr) {
        this.f6005b = context;
        this.f6006c = executorService;
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void a(HashMap map) {
        d();
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void b(HashMap map) {
        long j10;
        long j11;
        d();
        synchronized (this) {
            try {
                j10 = this.f6010g ? this.f6008e - this.f6007d : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j10));
        synchronized (this) {
            j11 = this.f6009f;
            this.f6009f = -1L;
        }
        map.put("vf", Long.valueOf(j11));
    }

    @Override // com.google.android.gms.internal.ads.a21
    public final void c(HashMap map, Context context, View view) {
        d();
    }

    public final void d() {
        synchronized (this) {
            try {
                if (this.f6010g) {
                    this.f6008e = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final ed.d h() {
        if (Build.VERSION.SDK_INT < 30) {
            return n81.f8237c;
        }
        c91 c91Var = new c91(Executors.callable(new kr0(10, this), null));
        this.f6006c.execute(c91Var);
        return c91Var;
    }
}
