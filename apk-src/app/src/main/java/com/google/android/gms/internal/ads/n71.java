package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n71 extends ix {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f8228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f8229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f8230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f8231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f8232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f8233g;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(q71.f9363a);
        }
        try {
            f8230d = unsafe.objectFieldOffset(p71.class.getDeclaredField("d"));
            f8229c = unsafe.objectFieldOffset(p71.class.getDeclaredField("c"));
            f8231e = unsafe.objectFieldOffset(p71.class.getDeclaredField("b"));
            f8232f = unsafe.objectFieldOffset(o71.class.getDeclaredField("a"));
            f8233g = unsafe.objectFieldOffset(o71.class.getDeclaredField("b"));
            f8228b = unsafe;
        } catch (NoSuchFieldException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean P(p71 p71Var, o71 o71Var, o71 o71Var2) {
        return l71.a(f8228b, p71Var, f8230d, o71Var, o71Var2);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean V(h71 h71Var, e71 e71Var, e71 e71Var2) {
        return k71.a(f8228b, h71Var, f8229c, e71Var, e71Var2);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final o71 X(h71 h71Var) {
        o71 o71Var;
        o71 o71Var2 = o71.f8627c;
        do {
            o71Var = h71Var.f8954d;
            if (o71Var2 == o71Var) {
                break;
            }
        } while (!P(h71Var, o71Var, o71Var2));
        return o71Var;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final e71 d0(h71 h71Var) {
        e71 e71Var;
        e71 e71Var2 = e71.f4867d;
        do {
            e71Var = h71Var.f8953c;
            if (e71Var2 == e71Var) {
                break;
            }
        } while (!V(h71Var, e71Var, e71Var2));
        return e71Var;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean h0(p71 p71Var, Object obj, Object obj2) {
        return m71.a(f8228b, p71Var, f8231e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void l(o71 o71Var, Thread thread) {
        f8228b.putObject(o71Var, f8232f, thread);
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void y(o71 o71Var, o71 o71Var2) {
        f8228b.putObject(o71Var, f8233g, o71Var2);
    }
}
