package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f9811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f9812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f9813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f9814d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f9811a = new nd1(ra1.class, cb1.f4154x);
        f9812b = new ld1(sl1VarA, cb1.f4151u);
        f9813c = new tc1(pa1.class, cb1.f4152v);
        f9814d = new rc1(sl1VarA, cb1.f4153w);
    }

    public static ei1 a(ea1 ea1Var) throws GeneralSecurityException {
        if (ea1.i.equals(ea1Var)) {
            return ei1.TINK;
        }
        if (ea1.f4900j.equals(ea1Var)) {
            return ei1.CRUNCHY;
        }
        if (ea1.f4901k.equals(ea1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ea1Var)));
    }

    public static ea1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return ea1.i;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ea1.f4901k;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return ea1.f4900j;
    }
}
