package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p71 extends d91 implements ed.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f8948e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q81 f8949f = new q81(0, h71.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f8950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ix f8951h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f8952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e71 f8953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile o71 f8954d;

    static {
        boolean z5;
        ix j71Var;
        Throwable th2;
        Throwable th3;
        try {
            z5 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z5 = false;
        }
        f8950g = z5;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th4 = null;
        if (property == null || property.contains("Android")) {
            try {
                j71Var = new n71();
            } catch (Error | Exception e3) {
                try {
                    j71Var = new i71();
                } catch (Error | Exception e7) {
                    th4 = e7;
                    j71Var = new j71();
                }
                th2 = th4;
                th3 = e3;
            }
        } else {
            try {
                j71Var = new i71();
            } catch (NoClassDefFoundError unused2) {
                j71Var = new j71();
            }
        }
        th2 = null;
        th3 = null;
        f8951h = j71Var;
        if (th2 != null) {
            q81 q81Var = f8949f;
            Logger loggerA = q81Var.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th3);
            q81Var.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th2);
        }
    }

    public final void d(o71 o71Var) {
        o71Var.f8628a = null;
        while (true) {
            o71 o71Var2 = this.f8954d;
            if (o71Var2 != o71.f8627c) {
                o71 o71Var3 = null;
                while (o71Var2 != null) {
                    o71 o71Var4 = o71Var2.f8629b;
                    if (o71Var2.f8628a != null) {
                        o71Var3 = o71Var2;
                    } else if (o71Var3 != null) {
                        o71Var3.f8629b = o71Var4;
                        if (o71Var3.f8628a == null) {
                            break;
                        }
                    } else if (!f8951h.P(this, o71Var2, o71Var4)) {
                        break;
                    }
                    o71Var2 = o71Var4;
                }
                return;
            }
            return;
        }
    }
}
