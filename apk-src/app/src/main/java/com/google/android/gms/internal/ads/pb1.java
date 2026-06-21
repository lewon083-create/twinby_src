package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f9005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f9006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f9007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f9008d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f9005a = new nd1(oa1.class, cb1.f4150t);
        f9006b = new ld1(sl1VarA, cb1.f4147q);
        f9007c = new tc1(la1.class, cb1.f4148r);
        f9008d = new rc1(sl1VarA, cb1.f4149s);
    }

    public static ei1 a(h91 h91Var) throws GeneralSecurityException {
        if (h91.f6061g.equals(h91Var)) {
            return ei1.TINK;
        }
        if (h91.f6062h.equals(h91Var)) {
            return ei1.CRUNCHY;
        }
        if (h91.i.equals(h91Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(h91Var)));
    }

    public static h91 b(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return h91.f6061g;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return h91.i;
            }
            if (iOrdinal != 4) {
                int iH = ei1Var.h();
                throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
            }
        }
        return h91.f6062h;
    }
}
