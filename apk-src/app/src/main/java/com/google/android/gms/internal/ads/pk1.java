package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f9086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f9087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f9088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f9089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tc1 f9090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rc1 f9091f;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        sl1 sl1VarA2 = ge1.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f9086a = new nd1(hj1.class, nk1.f8334h);
        f9087b = new ld1(sl1VarA, nk1.f8329c);
        f9088c = new tc1(jj1.class, nk1.f8330d);
        f9089d = new rc1(sl1VarA2, nk1.f8331e);
        f9090e = new tc1(ij1.class, nk1.f8332f);
        f9091f = new rc1(sl1VarA, nk1.f8333g);
    }

    public static ei1 a(ja1 ja1Var) throws GeneralSecurityException {
        if (ja1.f6797k.equals(ja1Var)) {
            return ei1.TINK;
        }
        if (ja1.f6798l.equals(ja1Var)) {
            return ei1.CRUNCHY;
        }
        if (ja1.f6800n.equals(ja1Var)) {
            return ei1.RAW;
        }
        if (ja1.f6799m.equals(ja1Var)) {
            return ei1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(ja1Var.f6802b));
    }

    public static ea1 b(bh1 bh1Var) throws GeneralSecurityException {
        int iOrdinal = bh1Var.ordinal();
        if (iOrdinal == 2) {
            return ea1.f4905o;
        }
        if (iOrdinal == 3) {
            return ea1.f4904n;
        }
        if (iOrdinal == 4) {
            return ea1.f4906p;
        }
        int iH = bh1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iH).length() + 26)));
    }

    public static ja1 c(ei1 ei1Var) throws GeneralSecurityException {
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            return ja1.f6797k;
        }
        if (iOrdinal == 2) {
            return ja1.f6799m;
        }
        if (iOrdinal == 3) {
            return ja1.f6800n;
        }
        if (iOrdinal == 4) {
            return ja1.f6798l;
        }
        int iH = ei1Var.h();
        throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
    }

    public static int d(gj1 gj1Var) {
        if (gj1.f5829c.equals(gj1Var)) {
            return 33;
        }
        if (gj1.f5830d.equals(gj1Var)) {
            return 49;
        }
        if (gj1.f5831e.equals(gj1Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(gj1Var.f5832a));
    }

    public static rg1 e(hj1 hj1Var) {
        bh1 bh1Var;
        int i;
        qg1 qg1VarA = rg1.A();
        ea1 ea1Var = hj1Var.f6163c;
        if (ea1.f4904n.equals(ea1Var)) {
            bh1Var = bh1.SHA256;
        } else if (ea1.f4905o.equals(ea1Var)) {
            bh1Var = bh1.SHA384;
        } else {
            if (!ea1.f4906p.equals(ea1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(ea1Var.f4908c));
            }
            bh1Var = bh1.SHA512;
        }
        qg1VarA.b();
        ((rg1) qg1VarA.f9560c).C(bh1Var);
        gj1 gj1Var = hj1Var.f6162b;
        int i10 = 4;
        if (gj1.f5829c.equals(gj1Var)) {
            i = 4;
        } else if (gj1.f5830d.equals(gj1Var)) {
            i = 5;
        } else {
            if (!gj1.f5831e.equals(gj1Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(gj1Var.f5832a));
            }
            i = 6;
        }
        qg1VarA.b();
        ((rg1) qg1VarA.f9560c).F(i);
        fa1 fa1Var = hj1Var.f6161a;
        if (fa1.f5301k.equals(fa1Var)) {
            i10 = 3;
        } else if (!fa1.f5302l.equals(fa1Var)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(fa1Var.f5304b));
        }
        qg1VarA.b();
        ((rg1) qg1VarA.f9560c).G(i10);
        return (rg1) qg1VarA.d();
    }

    public static vg1 f(jj1 jj1Var) {
        int iD = d(jj1Var.f6859d.f6162b);
        ECPoint eCPoint = jj1Var.f6860e;
        ug1 ug1VarE = vg1.E();
        rg1 rg1VarE = e(jj1Var.f6859d);
        ug1VarE.b();
        ((vg1) ug1VarE.f9560c).H(rg1VarE);
        byte[] bArrC = fs1.C(eCPoint.getAffineX(), iD);
        zm1 zm1Var = bn1.f3837c;
        zm1 zm1VarA = bn1.A(bArrC, 0, bArrC.length);
        ug1VarE.b();
        ((vg1) ug1VarE.f9560c).I(zm1VarA);
        byte[] bArrC2 = fs1.C(eCPoint.getAffineY(), iD);
        zm1 zm1VarA2 = bn1.A(bArrC2, 0, bArrC2.length);
        ug1VarE.b();
        ((vg1) ug1VarE.f9560c).J(zm1VarA2);
        return (vg1) ug1VarE.d();
    }

    public static gj1 g(int i) throws GeneralSecurityException {
        int i10 = i - 2;
        if (i10 == 2) {
            return gj1.f5829c;
        }
        if (i10 == 3) {
            return gj1.f5830d;
        }
        if (i10 == 4) {
            return gj1.f5831e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(l7.o.j(i10, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i10).length() + 35)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static fa1 h(int i) throws GeneralSecurityException {
        int i10 = i - 2;
        if (i10 == 1) {
            return fa1.f5301k;
        }
        if (i10 == 2) {
            return fa1.f5302l;
        }
        if (i != 1) {
            throw new GeneralSecurityException(l7.o.j(i10, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i10).length() + 40)));
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
