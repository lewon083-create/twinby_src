package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f8268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f8269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f8270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f8271d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f8268a = new nd1(ka1.class, cb1.f4146p);
        f8269b = new ld1(sl1VarA, cb1.f4143m);
        f8270c = new tc1(ha1.class, cb1.f4144n);
        f8271d = new rc1(sl1VarA, cb1.f4145o);
    }

    public static ei1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f6790c.equals(ja1Var)) {
            return ei1.TINK;
        }
        if (ja1.f6791d.equals(ja1Var)) {
            return ei1.CRUNCHY;
        }
        if (ja1.f6792e.equals(ja1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ja1Var)));
    }

    public static ja1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f6790c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ja1.f6792e;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return ja1.f6791d;
    }
}
