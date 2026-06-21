package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ze1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f12982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f12983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f12984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f12985d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f12982a = new nd1(je1.class, cc1.f4174q);
        f12983b = new ld1(sl1VarA, cc1.f4171n);
        f12984c = new tc1(he1.class, cc1.f4172o);
        f12985d = new rc1(sl1VarA, cc1.f4173p);
    }

    public static ei1 a(h91 h91Var) throws GeneralSecurityException {
        if (h91.f6069p.equals(h91Var)) {
            return ei1.TINK;
        }
        if (h91.f6070q.equals(h91Var)) {
            return ei1.CRUNCHY;
        }
        if (h91.f6072s.equals(h91Var)) {
            return ei1.RAW;
        }
        if (h91.f6071r.equals(h91Var)) {
            return ei1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(h91Var)));
    }

    public static h91 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return h91.f6069p;
        }
        if (iOrdinal == 2) {
            return h91.f6071r;
        }
        if (iOrdinal == 3) {
            return h91.f6072s;
        }
        if (iOrdinal == 4) {
            return h91.f6070q;
        }
        int iH = ei1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
    }
}
