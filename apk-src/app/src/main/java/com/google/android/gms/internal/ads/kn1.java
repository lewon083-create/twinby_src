package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile kn1 f7271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kn1 f7272b;

    static {
        kn1 kn1Var = new kn1();
        Map map = Collections.EMPTY_MAP;
        f7272b = kn1Var;
    }

    public static kn1 a() {
        kn1 kn1Var = f7271a;
        if (kn1Var != null) {
            return kn1Var;
        }
        synchronized (kn1.class) {
            try {
                kn1 kn1Var2 = f7271a;
                if (kn1Var2 != null) {
                    return kn1Var2;
                }
                int i = tm1.f10663a;
                kn1 kn1VarM = pn1.m();
                f7271a = kn1VarM;
                return kn1VarM;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
