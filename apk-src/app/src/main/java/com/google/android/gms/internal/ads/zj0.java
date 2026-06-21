package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 implements g0.b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static zj0 f13007g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13012f;

    public zj0(Context context) {
        Executor executorF = c80.f();
        this.f13010d = executorF;
        this.f13011e = new CopyOnWriteArrayList();
        this.f13012f = new Object();
        this.f13009c = 0;
        executorF.execute(new th0(2, this, context));
    }

    public static synchronized zj0 a(Context context) {
        try {
            if (f13007g == null) {
                f13007g = new zj0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f13007g;
    }

    public int b() {
        int i;
        synchronized (this.f13012f) {
            i = this.f13009c;
        }
        return i;
    }

    public void c(int i) {
        CopyOnWriteArrayList<oi0> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13011e;
        for (oi0 oi0Var : copyOnWriteArrayList) {
            if (oi0Var.f8695a.get() == null) {
                copyOnWriteArrayList.remove(oi0Var);
            }
        }
        synchronized (this.f13012f) {
            try {
                if (this.f13008b && this.f13009c == i) {
                    return;
                }
                this.f13008b = true;
                this.f13009c = i;
                for (oi0 oi0Var2 : (CopyOnWriteArrayList) this.f13011e) {
                    oi0Var2.getClass();
                    oi0Var2.f8696b.execute(new h30(18, oi0Var2));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.b1
    public boolean k(int i) {
        return this.f13008b && u(i) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    @Override // g0.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g0.c1 u(int r20) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zj0.u(int):g0.c1");
    }

    public zj0(String str, g0.a2 a2Var) {
        boolean z5;
        int i;
        this.f13011e = new HashMap();
        this.f13010d = str;
        try {
            i = Integer.parseInt(str);
            z5 = true;
        } catch (NumberFormatException unused) {
            com.google.android.gms.internal.auth.g.O("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z5 = false;
            i = -1;
        }
        this.f13008b = z5;
        this.f13009c = i;
        this.f13012f = a2Var;
    }
}
