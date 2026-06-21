package com.google.android.gms.internal.play_billing;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Unsafe f14232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f14233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f14234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f14235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f14236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f14237h;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new k1());
            }
            try {
                f14234e = unsafe.objectFieldOffset(n1.class.getDeclaredField("d"));
                f14233d = unsafe.objectFieldOffset(n1.class.getDeclaredField("c"));
                f14235f = unsafe.objectFieldOffset(n1.class.getDeclaredField("b"));
                f14236g = unsafe.objectFieldOffset(m1.class.getDeclaredField("a"));
                f14237h = unsafe.objectFieldOffset(m1.class.getDeclaredField("b"));
                f14232c = unsafe;
            } catch (NoSuchFieldException e3) {
                throw new RuntimeException(e3);
            }
        } catch (PrivilegedActionException e7) {
            throw new RuntimeException("Could not initialize intrinsics", e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(n1 n1Var, f1 f1Var, f1 f1Var2) {
        return q1.a(f14232c, n1Var, f14233d, f1Var, f1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(n1 n1Var, Object obj, Object obj2) {
        return q1.a(f14232c, n1Var, f14235f, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(n1 n1Var, m1 m1Var, m1 m1Var2) {
        return q1.a(f14232c, n1Var, f14234e, m1Var, m1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final f1 e(n1 n1Var) {
        f1 f1Var;
        f1 f1Var2 = f1.f14178d;
        do {
            f1Var = n1Var.f14253c;
            if (f1Var2 == f1Var) {
                break;
            }
        } while (!A(n1Var, f1Var, f1Var2));
        return f1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final m1 p(n1 n1Var) {
        m1 m1Var;
        m1 m1Var2 = m1.f14241c;
        do {
            m1Var = n1Var.f14254d;
            if (m1Var2 == m1Var) {
                break;
            }
        } while (!G(n1Var, m1Var, m1Var2));
        return m1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(m1 m1Var, m1 m1Var2) {
        f14232c.putObject(m1Var, f14237h, m1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(m1 m1Var, Thread thread) {
        f14232c.putObject(m1Var, f14236g, thread);
    }
}
