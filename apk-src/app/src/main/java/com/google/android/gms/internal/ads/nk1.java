package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.spec.ECPoint;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk1 implements md1, uc1, sc1, od1, kl1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8329c = new nk1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8330d = new nk1(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8331e = new nk1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8332f = new nk1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8333g = new nk1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8334h = new nk1(5);
    public static final /* synthetic */ nk1 i = new nk1(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8335j = new nk1(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8336k = new nk1(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8337l = new nk1(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8338m = new nk1(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8339n = new nk1(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8340o = new nk1(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8341p = new nk1(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8342q = new nk1(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8343r = new nk1(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8344s = new nk1(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8345t = new nk1(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8346u = new nk1(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8347v = new nk1(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8348w = new nk1(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8349x = new nk1(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8350y = new nk1(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ nk1 f8351z = new nk1(23);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8352b;

    public /* synthetic */ nk1(int i10) {
        this.f8352b = i10;
    }

    @Override // com.google.android.gms.internal.ads.uc1, com.google.android.gms.internal.ads.td1
    public yd1 b(gr grVar) throws GeneralSecurityException {
        switch (this.f8352b) {
            case 1:
                jj1 jj1Var = (jj1) grVar;
                return yd1.f("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", pk1.f(jj1Var).a(), 4, pk1.a(jj1Var.f6859d.f6164d), jj1Var.f6862g);
            case 3:
                ij1 ij1Var = (ij1) grVar;
                nd1 nd1Var = pk1.f9086a;
                int iD = pk1.d(ij1Var.f6516d.f6859d.f6162b);
                sg1 sg1VarD = tg1.D();
                jj1 jj1Var2 = ij1Var.f6516d;
                vg1 vg1VarF = pk1.f(jj1Var2);
                sg1VarD.b();
                ((tg1) sg1VarD.f9560c).F(vg1VarF);
                byte[] bArrC = fs1.C((BigInteger) ij1Var.f6517e.f6553c, iD);
                zm1 zm1Var = bn1.f3837c;
                zm1 zm1VarA = bn1.A(bArrC, 0, bArrC.length);
                sg1VarD.b();
                ((tg1) sg1VarD.f9560c).G(zm1VarA);
                return yd1.f("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((tg1) sg1VarD.d()).a(), 3, pk1.a(jj1Var2.f6859d.f6164d), jj1Var2.f6862g);
            case 7:
                pj1 pj1Var = (pj1) grVar;
                return yd1.f("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", rk1.a(pj1Var).a(), 4, (ei1) rk1.f9956g.s(pj1Var.f9076d.f7900a), pj1Var.f9079g);
            case 9:
                nj1 nj1Var = (nj1) grVar;
                nd1 nd1Var2 = rk1.f9950a;
                xg1 xg1VarD = yg1.D();
                ah1 ah1VarA = rk1.a(nj1Var.f8322d);
                xg1VarD.b();
                ((yg1) xg1VarD.f9560c).G(ah1VarA);
                byte[] bArrB = ((sl1) nj1Var.f8323e.f12221c).b();
                zm1 zm1VarA2 = bn1.A(bArrB, 0, bArrB.length);
                xg1VarD.b();
                ((yg1) xg1VarD.f9560c).F(zm1VarA2);
                zm1 zm1VarA3 = ((yg1) xg1VarD.d()).a();
                zd1 zd1Var = rk1.f9956g;
                pj1 pj1Var2 = nj1Var.f8322d;
                return yd1.f("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", zm1VarA3, 3, (ei1) zd1Var.s(pj1Var2.f9076d.f7900a), pj1Var2.f9079g);
            case 13:
                bk1 bk1Var = (bk1) grVar;
                return yd1.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", vk1.a(bk1Var).a(), 4, (ei1) vk1.f11410g.s(bk1Var.f3804d.f12638c), bk1Var.f3807g);
            case 15:
                ak1 ak1Var = (ak1) grVar;
                nd1 nd1Var3 = vk1.f11404a;
                ki1 ki1VarI = li1.I();
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).K();
                ni1 ni1VarA = vk1.a(ak1Var.f2909d);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).L(ni1VarA);
                byte[] bArrO = fs1.o((BigInteger) ak1Var.f2910e.f6553c);
                zm1 zm1Var2 = bn1.f3837c;
                zm1 zm1VarA4 = bn1.A(bArrO, 0, bArrO.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).M(zm1VarA4);
                byte[] bArrO2 = fs1.o((BigInteger) ak1Var.f2911f.f6553c);
                zm1 zm1VarA5 = bn1.A(bArrO2, 0, bArrO2.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).N(zm1VarA5);
                byte[] bArrO3 = fs1.o((BigInteger) ak1Var.f2912g.f6553c);
                zm1 zm1VarA6 = bn1.A(bArrO3, 0, bArrO3.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).O(zm1VarA6);
                byte[] bArrO4 = fs1.o((BigInteger) ak1Var.f2913h.f6553c);
                zm1 zm1VarA7 = bn1.A(bArrO4, 0, bArrO4.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).P(zm1VarA7);
                byte[] bArrO5 = fs1.o((BigInteger) ak1Var.i.f6553c);
                zm1 zm1VarA8 = bn1.A(bArrO5, 0, bArrO5.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).Q(zm1VarA8);
                byte[] bArrO6 = fs1.o((BigInteger) ak1Var.f2914j.f6553c);
                zm1 zm1VarA9 = bn1.A(bArrO6, 0, bArrO6.length);
                ki1VarI.b();
                ((li1) ki1VarI.f9560c).R(zm1VarA9);
                zm1 zm1VarA10 = ((li1) ki1VarI.d()).a();
                zd1 zd1Var2 = vk1.f11410g;
                bk1 bk1Var2 = ak1Var.f2909d;
                return yd1.f("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", zm1VarA10, 3, (ei1) zd1Var2.s(bk1Var2.f3804d.f12638c), bk1Var2.f3807g);
            case 19:
                ik1 ik1Var = (ik1) grVar;
                return yd1.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", zk1.b(ik1Var).a(), 4, (ei1) zk1.f13023g.s(ik1Var.f6522d.f5841c), ik1Var.f6525g);
            default:
                hk1 hk1Var = (hk1) grVar;
                nd1 nd1Var4 = zk1.f13017a;
                si1 si1VarI = ti1.I();
                si1VarI.b();
                ((ti1) si1VarI.f9560c).K();
                vi1 vi1VarB = zk1.b(hk1Var.f6167d);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).L(vi1VarB);
                byte[] bArrO7 = fs1.o((BigInteger) hk1Var.f6168e.f6553c);
                zm1 zm1Var3 = bn1.f3837c;
                zm1 zm1VarA11 = bn1.A(bArrO7, 0, bArrO7.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).M(zm1VarA11);
                byte[] bArrO8 = fs1.o((BigInteger) hk1Var.f6169f.f6553c);
                zm1 zm1VarA12 = bn1.A(bArrO8, 0, bArrO8.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).N(zm1VarA12);
                byte[] bArrO9 = fs1.o((BigInteger) hk1Var.f6170g.f6553c);
                zm1 zm1VarA13 = bn1.A(bArrO9, 0, bArrO9.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).O(zm1VarA13);
                byte[] bArrO10 = fs1.o((BigInteger) hk1Var.f6171h.f6553c);
                zm1 zm1VarA14 = bn1.A(bArrO10, 0, bArrO10.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).P(zm1VarA14);
                byte[] bArrO11 = fs1.o((BigInteger) hk1Var.i.f6553c);
                zm1 zm1VarA15 = bn1.A(bArrO11, 0, bArrO11.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).Q(zm1VarA15);
                byte[] bArrO12 = fs1.o((BigInteger) hk1Var.f6172j.f6553c);
                zm1 zm1VarA16 = bn1.A(bArrO12, 0, bArrO12.length);
                si1VarI.b();
                ((ti1) si1VarI.f9560c).R(zm1VarA16);
                zm1 zm1VarA17 = ((ti1) si1VarI.d()).a();
                zd1 zd1Var3 = zk1.f13023g;
                ik1 ik1Var2 = hk1Var.f6167d;
                return yd1.f("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", zm1VarA17, 3, (ei1) zd1Var3.s(ik1Var2.f6522d.f5841c), ik1Var2.f6525g);
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public o91 c(zd1 zd1Var) throws GeneralSecurityException {
        switch (this.f8352b) {
            case 0:
                nd1 nd1Var = pk1.f9086a;
                mh1 mh1Var = (mh1) zd1Var.f12972d;
                if (!mh1Var.z().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var.z())));
                }
                try {
                    bn1 bn1VarA = mh1Var.A();
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    pg1 pg1VarA = pg1.A(bn1VarA, kn1.f7272b);
                    na1 na1Var = new na1(3);
                    na1Var.f8261e = pk1.b(pg1VarA.z().z());
                    na1Var.f8259c = pk1.h(pg1VarA.z().E());
                    na1Var.f8260d = pk1.g(pg1VarA.z().D());
                    na1Var.f8262f = pk1.c(mh1Var.B());
                    return na1Var.l();
                } catch (co1 e3) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e3);
                }
            case 6:
                nd1 nd1Var2 = rk1.f9950a;
                mh1 mh1Var2 = (mh1) zd1Var.f12972d;
                if (!mh1Var2.z().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var2.z())));
                }
                try {
                    bn1 bn1VarA2 = mh1Var2.A();
                    kn1 kn1Var2 = kn1.f7271a;
                    int i11 = tm1.f10663a;
                    if (wg1.A(bn1VarA2, kn1.f7272b).z() == 0) {
                        return new mj1((lj1) rk1.f9956g.u(mh1Var2.B()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (co1 e7) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e7);
                }
            case 12:
                nd1 nd1Var3 = vk1.f11404a;
                mh1 mh1Var3 = (mh1) zd1Var.f12972d;
                if (!mh1Var3.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var3.z())));
                }
                try {
                    bn1 bn1VarA3 = mh1Var3.A();
                    kn1 kn1Var3 = kn1.f7271a;
                    int i12 = tm1.f10663a;
                    hi1 hi1VarC = hi1.C(bn1VarA3, kn1.f7272b);
                    BigInteger bigInteger = yj1.f12635e;
                    vj1 vj1Var = new vj1();
                    vj1Var.f11398c = (wj1) vk1.f11411h.u(hi1VarC.z().z());
                    vj1Var.f11397b = new BigInteger(1, hi1VarC.B().D());
                    vj1Var.a(hi1VarC.A());
                    vj1Var.f11399d = (xj1) vk1.f11410g.u(mh1Var3.B());
                    return vj1Var.b();
                } catch (co1 e10) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
                }
            default:
                nd1 nd1Var4 = zk1.f13017a;
                mh1 mh1Var4 = (mh1) zd1Var.f12972d;
                if (!mh1Var4.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var4.z())));
                }
                try {
                    bn1 bn1VarA4 = mh1Var4.A();
                    kn1 kn1Var4 = kn1.f7271a;
                    int i13 = tm1.f10663a;
                    pi1 pi1VarC = pi1.C(bn1VarA4, kn1.f7272b);
                    BigInteger bigInteger2 = gk1.f5838g;
                    dk1 dk1Var = new dk1();
                    zd1 zd1Var2 = zk1.f13024h;
                    dk1Var.f4593c = (ek1) zd1Var2.u(pi1VarC.z().z());
                    dk1Var.f4594d = (ek1) zd1Var2.u(pi1VarC.z().A());
                    dk1Var.f4592b = new BigInteger(1, pi1VarC.B().D());
                    dk1Var.a(pi1VarC.A());
                    dk1Var.b(pi1VarC.z().B());
                    dk1Var.f4596f = (fk1) zk1.f13023g.u(mh1Var4.B());
                    return dk1Var.c();
                } catch (co1 e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc1
    public gr d(yd1 yd1Var) throws GeneralSecurityException {
        int i10 = 8;
        int i11 = 9;
        int i12 = 10;
        boolean z5 = false;
        switch (this.f8352b) {
            case 2:
                nd1 nd1Var = pk1.f9086a;
                String str = (String) yd1Var.f12600c;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    bn1 bn1Var = (bn1) yd1Var.f12602e;
                    kn1 kn1Var = kn1.f7271a;
                    int i13 = tm1.f10663a;
                    vg1 vg1VarD = vg1.D(bn1Var, kn1.f7272b);
                    if (vg1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    na1 na1Var = new na1(3);
                    na1Var.f8261e = pk1.b(vg1VarD.A().z());
                    na1Var.f8259c = pk1.h(vg1VarD.A().E());
                    na1Var.f8260d = pk1.g(vg1VarD.A().D());
                    na1Var.f8262f = pk1.c((ei1) yd1Var.f12603f);
                    hj1 hj1VarL = na1Var.l();
                    l91 l91Var = new l91(i10, z5);
                    l91Var.f7465c = hj1VarL;
                    l91Var.f7466d = new ECPoint(new BigInteger(1, vg1VarD.B().D()), new BigInteger(1, vg1VarD.C().D()));
                    l91Var.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var.u();
                } catch (co1 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            case 4:
                nd1 nd1Var2 = pk1.f9086a;
                String str2 = (String) yd1Var.f12600c;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    bn1 bn1Var2 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var2 = kn1.f7271a;
                    int i14 = tm1.f10663a;
                    tg1 tg1VarC = tg1.C(bn1Var2, kn1.f7272b);
                    if (tg1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    vg1 vg1VarA = tg1VarC.A();
                    if (vg1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    na1 na1Var2 = new na1(3);
                    na1Var2.f8261e = pk1.b(vg1VarA.A().z());
                    na1Var2.f8259c = pk1.h(vg1VarA.A().E());
                    na1Var2.f8260d = pk1.g(vg1VarA.A().D());
                    na1Var2.f8262f = pk1.c((ei1) yd1Var.f12603f);
                    hj1 hj1VarL2 = na1Var2.l();
                    l91 l91Var2 = new l91(i10, z5);
                    l91Var2.f7465c = hj1VarL2;
                    l91Var2.f7466d = new ECPoint(new BigInteger(1, vg1VarA.B().D()), new BigInteger(1, vg1VarA.C().D()));
                    l91Var2.f7467e = (Integer) yd1Var.f12604g;
                    jj1 jj1VarU = l91Var2.u();
                    ut utVar = new ut(25);
                    utVar.f11061c = jj1VarU;
                    utVar.f11062d = new in0(12, new BigInteger(1, tg1VarC.B().D()));
                    return utVar.t();
                } catch (co1 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
            case 8:
                nd1 nd1Var3 = rk1.f9950a;
                String str3 = (String) yd1Var.f12600c;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    bn1 bn1Var3 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var3 = kn1.f7271a;
                    int i15 = tm1.f10663a;
                    ah1 ah1VarB = ah1.B(bn1Var3, kn1.f7272b);
                    if (ah1VarB.z() == 0) {
                        return pj1.i0((lj1) rk1.f9956g.u((ei1) yd1Var.f12603f), sl1.a(ah1VarB.A().D()), (Integer) yd1Var.f12604g);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (co1 unused3) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 10:
                nd1 nd1Var4 = rk1.f9950a;
                String str4 = (String) yd1Var.f12600c;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    bn1 bn1Var4 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var4 = kn1.f7271a;
                    int i16 = tm1.f10663a;
                    yg1 yg1VarC = yg1.C(bn1Var4, kn1.f7272b);
                    if (yg1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ah1 ah1VarB2 = yg1VarC.B();
                    if (ah1VarB2.z() == 0) {
                        return nj1.i0(pj1.i0((lj1) rk1.f9956g.u((ei1) yd1Var.f12603f), sl1.a(ah1VarB2.A().D()), (Integer) yd1Var.f12604g), xo0.d(yg1VarC.A().D()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (co1 unused4) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 14:
                nd1 nd1Var5 = vk1.f11404a;
                String str5 = (String) yd1Var.f12600c;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    bn1 bn1Var5 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var5 = kn1.f7271a;
                    int i17 = tm1.f10663a;
                    ni1 ni1VarD = ni1.D(bn1Var5, kn1.f7272b);
                    if (ni1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, ni1VarD.B().D());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = yj1.f12635e;
                    vj1 vj1Var = new vj1();
                    vj1Var.f11398c = (wj1) vk1.f11411h.u(ni1VarD.A().z());
                    vj1Var.f11397b = new BigInteger(1, ni1VarD.C().D());
                    vj1Var.a(iBitLength);
                    vj1Var.f11399d = (xj1) vk1.f11410g.u((ei1) yd1Var.f12603f);
                    yj1 yj1VarB = vj1Var.b();
                    l91 l91Var3 = new l91(i11, z5);
                    l91Var3.f7465c = yj1VarB;
                    l91Var3.f7466d = bigInteger;
                    l91Var3.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var3.v();
                } catch (co1 | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 16:
                nd1 nd1Var6 = vk1.f11404a;
                String str6 = (String) yd1Var.f12600c;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    bn1 bn1Var6 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var6 = kn1.f7271a;
                    int i18 = tm1.f10663a;
                    li1 li1VarH = li1.H(bn1Var6, kn1.f7272b);
                    if (li1VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ni1 ni1VarA = li1VarH.A();
                    if (ni1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, ni1VarA.B().D());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, ni1VarA.C().D());
                    BigInteger bigInteger5 = yj1.f12635e;
                    vj1 vj1Var2 = new vj1();
                    vj1Var2.f11398c = (wj1) vk1.f11411h.u(ni1VarA.A().z());
                    vj1Var2.f11397b = bigInteger4;
                    vj1Var2.a(iBitLength2);
                    vj1Var2.f11399d = (xj1) vk1.f11410g.u((ei1) yd1Var.f12603f);
                    yj1 yj1VarB2 = vj1Var2.b();
                    l91 l91Var4 = new l91(i11, z5);
                    l91Var4.f7465c = yj1VarB2;
                    l91Var4.f7466d = bigInteger3;
                    l91Var4.f7467e = (Integer) yd1Var.f12604g;
                    bk1 bk1VarV = l91Var4.v();
                    k7 k7Var = new k7(z5);
                    k7Var.f7130b = bk1VarV;
                    in0 in0VarB = vk1.b(li1VarH.C());
                    in0 in0VarB2 = vk1.b(li1VarH.D());
                    k7Var.f7132d = in0VarB;
                    k7Var.f7133e = in0VarB2;
                    k7Var.f7131c = vk1.b(li1VarH.B());
                    in0 in0VarB3 = vk1.b(li1VarH.E());
                    in0 in0VarB4 = vk1.b(li1VarH.F());
                    k7Var.f7134f = in0VarB3;
                    k7Var.f7135g = in0VarB4;
                    k7Var.f7136h = vk1.b(li1VarH.G());
                    return k7Var.h();
                } catch (co1 | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case 20:
                nd1 nd1Var7 = zk1.f13017a;
                String str7 = (String) yd1Var.f12600c;
                if (!str7.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str7)));
                }
                try {
                    bn1 bn1Var7 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var7 = kn1.f7271a;
                    int i19 = tm1.f10663a;
                    vi1 vi1VarD = vi1.D(bn1Var7, kn1.f7272b);
                    if (vi1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, vi1VarD.B().D());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = gk1.f5838g;
                    dk1 dk1Var = new dk1();
                    zd1 zd1Var = zk1.f13024h;
                    dk1Var.f4593c = (ek1) zd1Var.u(vi1VarD.A().z());
                    dk1Var.f4594d = (ek1) zd1Var.u(vi1VarD.A().A());
                    dk1Var.f4592b = new BigInteger(1, vi1VarD.C().D());
                    dk1Var.a(iBitLength3);
                    dk1Var.b(vi1VarD.A().B());
                    dk1Var.f4596f = (fk1) zk1.f13023g.u((ei1) yd1Var.f12603f);
                    gk1 gk1VarC = dk1Var.c();
                    l91 l91Var5 = new l91(i12, z5);
                    l91Var5.f7465c = gk1VarC;
                    l91Var5.f7466d = bigInteger6;
                    l91Var5.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var5.w();
                } catch (co1 | IllegalArgumentException unused7) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                nd1 nd1Var8 = zk1.f13017a;
                String str8 = (String) yd1Var.f12600c;
                if (!str8.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str8)));
                }
                try {
                    bn1 bn1Var8 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var8 = kn1.f7271a;
                    int i20 = tm1.f10663a;
                    ti1 ti1VarH = ti1.H(bn1Var8, kn1.f7272b);
                    if (ti1VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    vi1 vi1VarA = ti1VarH.A();
                    if (vi1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger8 = new BigInteger(1, vi1VarA.B().D());
                    int iBitLength4 = bigInteger8.bitLength();
                    BigInteger bigInteger9 = new BigInteger(1, vi1VarA.C().D());
                    BigInteger bigInteger10 = gk1.f5838g;
                    dk1 dk1Var2 = new dk1();
                    zd1 zd1Var2 = zk1.f13024h;
                    dk1Var2.f4593c = (ek1) zd1Var2.u(vi1VarA.A().z());
                    dk1Var2.f4594d = (ek1) zd1Var2.u(vi1VarA.A().A());
                    dk1Var2.f4592b = bigInteger9;
                    dk1Var2.a(iBitLength4);
                    dk1Var2.b(vi1VarA.A().B());
                    dk1Var2.f4596f = (fk1) zk1.f13023g.u((ei1) yd1Var.f12603f);
                    gk1 gk1VarC2 = dk1Var2.c();
                    l91 l91Var6 = new l91(i12, z5);
                    l91Var6.f7465c = gk1VarC2;
                    l91Var6.f7466d = bigInteger8;
                    l91Var6.f7467e = (Integer) yd1Var.f12604g;
                    ik1 ik1VarW = l91Var6.w();
                    k7 k7Var2 = new k7(z5);
                    k7Var2.f7130b = ik1VarW;
                    in0 in0VarC = zk1.c(ti1VarH.C());
                    in0 in0VarC2 = zk1.c(ti1VarH.D());
                    k7Var2.f7132d = in0VarC;
                    k7Var2.f7133e = in0VarC2;
                    k7Var2.f7131c = zk1.c(ti1VarH.B());
                    in0 in0VarC3 = zk1.c(ti1VarH.E());
                    in0 in0VarC4 = zk1.c(ti1VarH.F());
                    k7Var2.f7134f = in0VarC3;
                    k7Var2.f7135g = in0VarC4;
                    k7Var2.f7136h = zk1.c(ti1VarH.G());
                    return k7Var2.i();
                } catch (co1 | IllegalArgumentException unused8) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.kl1
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        switch (this.f8352b) {
            case 24:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 25:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 26:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 27:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 28:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 f(o91 o91Var) {
        switch (this.f8352b) {
            case 5:
                hj1 hj1Var = (hj1) o91Var;
                nd1 nd1Var = pk1.f9086a;
                lh1 lh1VarD = mh1.D();
                lh1VarD.g("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                og1 og1VarB = pg1.B();
                rg1 rg1VarE = pk1.e(hj1Var);
                og1VarB.b();
                ((pg1) og1VarB.f9560c).C(rg1VarE);
                lh1VarD.h(((pg1) og1VarB.d()).a());
                lh1VarD.i(pk1.a(hj1Var.f6164d));
                return zd1.q((mh1) lh1VarD.d());
            case 11:
                nd1 nd1Var2 = rk1.f9950a;
                lh1 lh1VarD2 = mh1.D();
                lh1VarD2.g("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                lh1VarD2.h(wg1.B().a());
                lh1VarD2.i((ei1) rk1.f9956g.s(((mj1) o91Var).f7900a));
                return zd1.q((mh1) lh1VarD2.d());
            case 17:
                yj1 yj1Var = (yj1) o91Var;
                nd1 nd1Var3 = vk1.f11404a;
                lh1 lh1VarD3 = mh1.D();
                lh1VarD3.g("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                gi1 gi1VarD = hi1.D();
                ii1 ii1VarA = ji1.A();
                bh1 bh1Var = (bh1) vk1.f11411h.s(yj1Var.f12639d);
                ii1VarA.b();
                ((ji1) ii1VarA.f9560c).C(bh1Var);
                ji1 ji1Var = (ji1) ii1VarA.d();
                gi1VarD.b();
                ((hi1) gi1VarD.f9560c).E(ji1Var);
                int i10 = yj1Var.f12636a;
                gi1VarD.b();
                ((hi1) gi1VarD.f9560c).F(i10);
                byte[] bArrO = fs1.o(yj1Var.f12637b);
                zm1 zm1Var = bn1.f3837c;
                zm1 zm1VarA = bn1.A(bArrO, 0, bArrO.length);
                gi1VarD.b();
                ((hi1) gi1VarD.f9560c).G(zm1VarA);
                lh1VarD3.h(((hi1) gi1VarD.d()).a());
                lh1VarD3.i((ei1) vk1.f11410g.s(yj1Var.f12638c));
                return zd1.q((mh1) lh1VarD3.d());
            default:
                gk1 gk1Var = (gk1) o91Var;
                nd1 nd1Var4 = zk1.f13017a;
                lh1 lh1VarD4 = mh1.D();
                lh1VarD4.g("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                oi1 oi1VarD = pi1.D();
                ri1 ri1VarA = zk1.a(gk1Var);
                oi1VarD.b();
                ((pi1) oi1VarD.f9560c).E(ri1VarA);
                int i11 = gk1Var.f5839a;
                oi1VarD.b();
                ((pi1) oi1VarD.f9560c).F(i11);
                byte[] bArrO2 = fs1.o(gk1Var.f5840b);
                zm1 zm1Var2 = bn1.f3837c;
                zm1 zm1VarA2 = bn1.A(bArrO2, 0, bArrO2.length);
                oi1VarD.b();
                ((pi1) oi1VarD.f9560c).G(zm1VarA2);
                lh1VarD4.h(((pi1) oi1VarD.d()).a());
                lh1VarD4.i((ei1) zk1.f13023g.s(gk1Var.f5841c));
                return zd1.q((mh1) lh1VarD4.d());
        }
    }
}
