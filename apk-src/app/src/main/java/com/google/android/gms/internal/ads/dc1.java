package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f4553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f4554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f4555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f4556d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f4553a = new nd1(lb1.class, cc1.f4164f);
        f4554b = new ld1(sl1VarA, cc1.f4161c);
        f4555c = new tc1(jb1.class, cc1.f4162d);
        f4556d = new rc1(sl1VarA, cc1.f4163e);
    }

    public static ei1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f6795h.equals(ja1Var)) {
            return ei1.TINK;
        }
        if (ja1.i.equals(ja1Var)) {
            return ei1.CRUNCHY;
        }
        if (ja1.f6796j.equals(ja1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ja1Var.f6802b));
    }

    public static ja1 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f6795h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return ja1.f6796j;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return ja1.i;
    }
}
