package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ig implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qf f6481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jd f6484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Method f6485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6487h;

    public ig(qf qfVar, String str, String str2, jd jdVar, int i, int i10) {
        this.f6481b = qfVar;
        this.f6482c = str;
        this.f6483d = str2;
        this.f6484e = jdVar;
        this.f6486g = i;
        this.f6487h = i10;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            qf qfVar = this.f6481b;
            Method methodD = qfVar.d(this.f6482c, this.f6483d);
            this.f6485f = methodD;
            if (methodD == null) {
                return null;
            }
            a();
            ue ueVar = qfVar.f9484k;
            if (ueVar == null || (i = this.f6486g) == Integer.MIN_VALUE) {
                return null;
            }
            ueVar.a(this.f6487h, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
