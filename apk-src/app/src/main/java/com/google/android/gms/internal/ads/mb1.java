package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f7842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f7843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f7844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f7845d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f7842a = new nd1(ga1.class, cb1.f4142l);
        f7843b = new ld1(sl1VarA, cb1.i);
        f7844c = new tc1(aa1.class, cb1.f4140j);
        f7845d = new rc1(sl1VarA, cb1.f4141k);
    }

    public static ei1 a(fa1 fa1Var) throws GeneralSecurityException {
        if (fa1.f5294c.equals(fa1Var)) {
            return ei1.TINK;
        }
        if (fa1.f5295d.equals(fa1Var)) {
            return ei1.CRUNCHY;
        }
        if (fa1.f5296e.equals(fa1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fa1Var)));
    }

    public static fa1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return fa1.f5294c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return fa1.f5296e;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return fa1.f5295d;
    }

    public static ea1 c(bh1 bh1Var) throws GeneralSecurityException {
        int iOrdinal = bh1Var.ordinal();
        if (iOrdinal == 1) {
            return ea1.f4895d;
        }
        if (iOrdinal == 2) {
            return ea1.f4898g;
        }
        if (iOrdinal == 3) {
            return ea1.f4897f;
        }
        if (iOrdinal == 4) {
            return ea1.f4899h;
        }
        if (iOrdinal == 5) {
            return ea1.f4896e;
        }
        int iH = bh1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iH).length() + 26)));
    }

    public static hh1 d(ga1 ga1Var) throws GeneralSecurityException {
        bh1 bh1Var;
        gh1 gh1VarB = hh1.B();
        int i = ga1Var.f5748d;
        gh1VarB.b();
        ((hh1) gh1VarB.f9560c).E(i);
        ea1 ea1Var = ga1Var.f5750f;
        if (ea1.f4895d.equals(ea1Var)) {
            bh1Var = bh1.SHA1;
        } else if (ea1.f4896e.equals(ea1Var)) {
            bh1Var = bh1.SHA224;
        } else if (ea1.f4897f.equals(ea1Var)) {
            bh1Var = bh1.SHA256;
        } else if (ea1.f4898g.equals(ea1Var)) {
            bh1Var = bh1.SHA384;
        } else {
            if (!ea1.f4899h.equals(ea1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(ea1Var)));
            }
            bh1Var = bh1.SHA512;
        }
        gh1VarB.b();
        ((hh1) gh1VarB.f9560c).D(bh1Var);
        return (hh1) gh1VarB.d();
    }
}
