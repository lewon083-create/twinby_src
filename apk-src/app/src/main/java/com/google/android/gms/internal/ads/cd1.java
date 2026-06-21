package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cd1 f4188b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4189a = new HashMap();

    static {
        ba1 ba1Var = ba1.f3701k;
        cd1 cd1Var = new cd1();
        try {
            cd1Var.a(ba1Var, ad1.class);
            f4188b = cd1Var;
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException("unexpected error.", e3);
        }
    }

    public final synchronized void a(pc1 pc1Var, Class cls) {
        try {
            HashMap map = this.f4189a;
            pc1 pc1Var2 = (pc1) map.get(cls);
            if (pc1Var2 != null && !pc1Var2.equals(pc1Var)) {
                String string = cls.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 60);
                sb2.append("Different key creator for parameters class ");
                sb2.append(string);
                sb2.append(" already inserted");
                throw new GeneralSecurityException(sb2.toString());
            }
            map.put(cls, pc1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final gr b(o91 o91Var, Integer num) {
        gr grVarA;
        synchronized (this) {
            pc1 pc1Var = (pc1) this.f4189a.get(o91Var.getClass());
            if (pc1Var == null) {
                String string = o91Var.toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 86);
                sb2.append("Cannot create a new key for parameters ");
                sb2.append(string);
                sb2.append(": no key creator for this class was registered.");
                throw new GeneralSecurityException(sb2.toString());
            }
            grVarA = pc1Var.a(o91Var, num);
        }
        return grVarA;
    }
}
