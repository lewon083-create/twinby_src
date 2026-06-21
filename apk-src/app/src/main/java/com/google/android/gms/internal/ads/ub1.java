package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ub1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f10904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f10905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f10906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f10907d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f10904a = new nd1(ua1.class, cb1.B);
        f10905b = new ld1(sl1VarA, cb1.f4155y);
        f10906c = new tc1(sa1.class, cb1.f4156z);
        f10907d = new rc1(sl1VarA, cb1.A);
    }

    public static ei1 a(fa1 fa1Var) throws GeneralSecurityException {
        if (fa1.f5297f.equals(fa1Var)) {
            return ei1.TINK;
        }
        if (fa1.f5298g.equals(fa1Var)) {
            return ei1.CRUNCHY;
        }
        if (fa1.f5299h.equals(fa1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(fa1Var.f5304b));
    }

    public static fa1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return fa1.f5297f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return fa1.f5299h;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return fa1.f5298g;
    }
}
