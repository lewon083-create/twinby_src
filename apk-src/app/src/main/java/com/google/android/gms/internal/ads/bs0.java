package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.AbstractCollection;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bs0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f3863k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object f3864l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f3865m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Boolean f3866n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f3868c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fd0 f3872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractCollection f3873h;
    public final w00 i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es0 f3869d = hs0.A();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f3870e = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3874j = false;

    public bs0(Context context, u9.a aVar, fd0 fd0Var, fp fpVar, w00 w00Var) {
        this.f3867b = context;
        this.f3868c = aVar;
        this.f3872g = fd0Var;
        this.i = w00Var;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.V9)).booleanValue()) {
            this.f3873h = t9.g0.I();
        } else {
            v41 v41Var = x41.f12018c;
            this.f3873h = r51.f9713f;
        }
    }

    public static boolean a() {
        boolean zBooleanValue;
        synchronized (f3863k) {
            try {
                if (f3866n == null) {
                    if (((Boolean) vl.f11413b.r()).booleanValue()) {
                        f3866n = Boolean.valueOf(Math.random() < ((Double) vl.f11412a.r()).doubleValue());
                    } else {
                        f3866n = Boolean.FALSE;
                    }
                }
                zBooleanValue = f3866n.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final void b(zr0 zr0Var) {
        hx.f6279a.a(new th0(10, this, zr0Var));
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrB;
        if (a()) {
            Object obj = f3864l;
            synchronized (obj) {
                try {
                    if (((hs0) this.f3869d.f9560c).z() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            es0 es0Var = this.f3869d;
                            bArrB = ((hs0) es0Var.d()).b();
                            es0Var.b();
                            ((hs0) es0Var.f9560c).C();
                        }
                        yg0 yg0Var = new yg0((String) q9.s.f31967e.f31970c.a(al.P9), "application/x-protobuf", bArrB, new HashMap(), 60000);
                        Context context = this.f3867b;
                        String str = this.f3868c.f34365b;
                        Binder.getCallingUid();
                        new oq0(17, context, str, null, false).p(yg0Var);
                    } catch (Exception e3) {
                        if ((e3 instanceof uf0) && ((uf0) e3).f10939b == 3) {
                            return;
                        }
                        p9.k.C.f31302h.e("CuiMonitor.sendCuiPing", e3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
