package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ac1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f2842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f2844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f2845d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f2842a = new nd1(ib1.class, cb1.F);
        f2843b = new ld1(sl1VarA, cb1.C);
        f2844c = new tc1(gb1.class, cb1.D);
        f2845d = new rc1(sl1VarA, cb1.E);
    }

    public static ei1 a(fa1 fa1Var) throws GeneralSecurityException {
        if (fa1Var.equals(fa1.i)) {
            return ei1.TINK;
        }
        if (fa1Var.equals(fa1.f5300j)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(fa1Var.f5304b));
    }

    public static fa1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return fa1.i;
        }
        if (iOrdinal == 3) {
            return fa1.f5300j;
        }
        int iH = ei1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
    }
}
