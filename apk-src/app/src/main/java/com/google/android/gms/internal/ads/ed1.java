package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ed1 f4924b = new ed1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4925a = new HashMap();

    public final synchronized void a(dd1 dd1Var, Class cls) {
        try {
            HashMap map = this.f4925a;
            dd1 dd1Var2 = (dd1) map.get(cls);
            if (dd1Var2 != null && !dd1Var2.equals(dd1Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, dd1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
