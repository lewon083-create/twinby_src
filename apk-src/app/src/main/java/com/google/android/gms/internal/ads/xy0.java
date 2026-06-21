package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xy0 implements qy0, oy0, dz0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final xp1 f12374u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f12375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fy0 f12376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f12377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ey0 f12378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f12380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12381h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f12382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f12383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f12385m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f12386n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f12387o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f12388p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yc f12389q = zc.z();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12390r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12391s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f12392t = new HashMap();

    static {
        wp1 wp1VarZ = xp1.z();
        wp1VarZ.b();
        ((xp1) wp1VarZ.f9560c).A(17);
        f12374u = (xp1) wp1VarZ.d();
    }

    public xy0(Context context, fy0 fy0Var, ExecutorService executorService, ey0 ey0Var, Random random, String str, long j10, long j11, double d10, String str2, long j12) {
        this.f12375b = context;
        this.f12376c = fy0Var;
        this.f12377d = executorService;
        this.f12378e = ey0Var;
        this.f12380g = str;
        this.f12381h = j10;
        this.i = j11;
        this.f12382j = d10;
        this.f12383k = str2;
        this.f12384l = j12;
        this.f12379f = random.nextDouble() < d10;
    }

    public final void a(String str, Throwable th2, int i, long j10) {
        long jLongValue;
        if (this.f12379f) {
            synchronized (this.f12387o) {
                try {
                    ArrayList arrayList = this.f12390r;
                    synchronized (this.f12388p) {
                        try {
                            HashMap map = this.f12392t;
                            Integer numValueOf = Integer.valueOf(i);
                            Long l10 = (Long) map.get(numValueOf);
                            if (l10 == null) {
                                l10 = 0L;
                            }
                            jLongValue = 1 + l10.longValue();
                            map.put(numValueOf, Long.valueOf(jLongValue));
                        } finally {
                        }
                    }
                    arrayList.add(new vy0(i, j10, th2, str, jLongValue));
                    if (!this.f12391s) {
                        this.f12391s = true;
                        this.f12376c.a(new wy0(this, 1), this.i);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void b(zc zcVar) {
        try {
            ty0 ty0VarZ = uy0.z();
            xp1 xp1Var = f12374u;
            ty0VarZ.b();
            ((uy0) ty0VarZ.f9560c).B(xp1Var);
            ry0 ry0VarZ = sy0.z();
            ry0VarZ.b();
            ((sy0) ry0VarZ.f9560c).A(zcVar);
            sy0 sy0Var = (sy0) ry0VarZ.d();
            ty0VarZ.b();
            ((uy0) ty0VarZ.f9560c).A(sy0Var);
            uy0 uy0Var = (uy0) ty0VarZ.d();
            ey0 ey0Var = this.f12378e;
            String str = this.f12380g;
            byte[] bArrB = uy0Var.b();
            ey0Var.getClass();
            i0.o.w(new yv0(ey0Var, str, true, "application/x-protobuf", bArrB));
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.oy0
    public final ed.d h() {
        c91 c91Var = new c91(Executors.callable(new wy0(this, 0), null));
        this.f12377d.execute(c91Var);
        return c91Var;
    }
}
