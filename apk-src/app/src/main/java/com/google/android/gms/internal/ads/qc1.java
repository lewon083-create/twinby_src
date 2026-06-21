package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qc1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f9454c = Logger.getLogger(qc1.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final qc1 f9455d = new qc1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f9456a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f9457b = new ConcurrentHashMap();

    public final synchronized void a(wc1 wc1Var, boolean z5) {
        c(wc1Var, 1, z5);
    }

    public final wc1 b(Class cls, String str) throws GeneralSecurityException {
        wc1 wc1VarD = d(str);
        if (wc1VarD.f11745b.equals(cls)) {
            return wc1VarD;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(wc1VarD.getClass());
        String string = wc1VarD.f11745b.toString();
        StringBuilder sb2 = new StringBuilder(pe.a.b(name.length() + 53, 23, strValueOf) + string.length());
        l7.o.t(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(a0.u.o(sb2, ", which only supports: ", string));
    }

    public final synchronized void c(wc1 wc1Var, int i, boolean z5) {
        if (!gr.x(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(wc1Var, z5);
    }

    public final synchronized wc1 d(String str) {
        ConcurrentHashMap concurrentHashMap;
        concurrentHashMap = this.f9456a;
        if (!concurrentHashMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (wc1) concurrentHashMap.get(str);
    }

    public final synchronized void e(wc1 wc1Var, boolean z5) {
        try {
            String str = wc1Var.f11744a;
            if (z5) {
                ConcurrentHashMap concurrentHashMap = this.f9457b;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
            }
            ConcurrentHashMap concurrentHashMap2 = this.f9456a;
            wc1 wc1Var2 = (wc1) concurrentHashMap2.get(str);
            if (wc1Var2 != null && !wc1Var2.getClass().equals(wc1Var.getClass())) {
                f9454c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + wc1Var2.getClass().getName() + ", cannot be re-registered with " + wc1Var.getClass().getName());
            }
            concurrentHashMap2.putIfAbsent(str, wc1Var);
            this.f9457b.put(str, Boolean.valueOf(z5));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
