package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m.h3 f14113a;

    static {
        m.h3 h3Var;
        Uri uri = a4.f13649a;
        synchronized (b4.class) {
            try {
                if (b4.f13669c == null) {
                    m.h3 h3Var2 = new m.h3();
                    synchronized (b4.class) {
                        if (b4.f13669c != null) {
                            throw new IllegalStateException("init() already called");
                        }
                        b4.f13669c = h3Var2;
                    }
                }
                h3Var = b4.f13669c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f14113a = h3Var;
    }
}
