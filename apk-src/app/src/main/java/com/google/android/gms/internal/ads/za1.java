package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class za1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f12935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f12936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f12937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f12938d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f12935a = new nd1(ya1.class, mp0.f7987z);
        f12936b = new ld1(sl1VarA, mp0.f7984w);
        f12937c = new tc1(xa1.class, mp0.f7985x);
        f12938d = new rc1(sl1VarA, mp0.f7986y);
    }

    public static ei1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f6793f.equals(ja1Var)) {
            return ei1.TINK;
        }
        if (ja1.f6794g.equals(ja1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ja1Var.f6802b));
    }

    public static ja1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f6793f;
        }
        if (iOrdinal == 3) {
            return ja1.f6794g;
        }
        int iH = ei1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
    }
}
