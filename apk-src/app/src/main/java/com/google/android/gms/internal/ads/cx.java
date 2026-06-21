package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cx {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4359h;
    public final t9.e0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4352a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4353b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4354c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4355d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4356e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f4357f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f4358g = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4360j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4361k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4362l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4363m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final HashMap f4364n = new HashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f4365o = new HashMap();

    public cx(String str, t9.e0 e0Var) {
        this.f4359h = str;
        this.i = e0Var;
    }

    public final void a(q9.d3 d3Var, long j10) {
        long j11;
        long j12;
        Bundle bundle;
        int i;
        synchronized (this.f4357f) {
            try {
                t9.e0 e0Var = this.i;
                e0Var.i();
                synchronized (e0Var.f33564a) {
                    j11 = e0Var.f33577o;
                }
                p9.k.C.f31304k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f4353b == -1) {
                    if (jCurrentTimeMillis - j11 > ((Long) q9.s.f31967e.f31970c.a(al.f3190s1)).longValue()) {
                        this.f4355d = -1;
                    } else {
                        e0Var.i();
                        synchronized (e0Var.f33564a) {
                            i = e0Var.f33579q;
                        }
                        this.f4355d = i;
                    }
                    this.f4353b = j10;
                    this.f4352a = j10;
                } else {
                    this.f4352a = j10;
                }
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f3120n4)).booleanValue() || (bundle = d3Var.f31803d) == null || bundle.getInt("gw", 2) != 1) {
                    this.f4354c++;
                    int i10 = this.f4355d + 1;
                    this.f4355d = i10;
                    if (i10 == 0) {
                        this.f4356e = 0L;
                        e0Var.o(jCurrentTimeMillis);
                    } else {
                        e0Var.i();
                        synchronized (e0Var.f33564a) {
                            j12 = e0Var.f33578p;
                        }
                        this.f4356e = jCurrentTimeMillis - j12;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (((Boolean) im.f6541a.r()).booleanValue()) {
            synchronized (this.f4357f) {
                this.f4354c--;
                this.f4355d--;
            }
        }
    }
}
