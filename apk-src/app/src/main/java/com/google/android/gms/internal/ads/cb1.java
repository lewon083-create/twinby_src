package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cb1 implements md1, uc1, sc1, od1, td1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4134c = new cb1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4135d = new cb1(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4136e = new cb1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4137f = new cb1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4138g = new cb1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4139h = new cb1(5);
    public static final /* synthetic */ cb1 i = new cb1(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4140j = new cb1(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4141k = new cb1(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4142l = new cb1(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4143m = new cb1(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4144n = new cb1(11);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4145o = new cb1(12);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4146p = new cb1(13);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4147q = new cb1(14);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4148r = new cb1(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4149s = new cb1(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4150t = new cb1(17);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4151u = new cb1(18);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4152v = new cb1(19);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4153w = new cb1(20);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4154x = new cb1(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4155y = new cb1(22);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ cb1 f4156z = new cb1(23);
    public static final /* synthetic */ cb1 A = new cb1(24);
    public static final /* synthetic */ cb1 B = new cb1(25);
    public static final /* synthetic */ cb1 C = new cb1(26);
    public static final /* synthetic */ cb1 D = new cb1(27);
    public static final /* synthetic */ cb1 E = new cb1(28);
    public static final /* synthetic */ cb1 F = new cb1(29);

    public /* synthetic */ cb1(int i10) {
        this.f4157b = i10;
    }

    @Override // com.google.android.gms.internal.ads.uc1, com.google.android.gms.internal.ads.td1
    public yd1 b(gr grVar) throws GeneralSecurityException {
        switch (this.f4157b) {
            case 1:
                ab1 ab1Var = (ab1) grVar;
                nd1 nd1Var = eb1.f4911a;
                ai1 ai1VarC = bi1.C();
                di1 di1VarB = eb1.b(ab1Var.f2834d);
                ai1VarC.b();
                ((bi1) ai1VarC.f9560c).E(di1VarB);
                return yd1.f("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((bi1) ai1VarC.d()).a(), 5, eb1.a(ab1Var.f2834d.f3715a), ab1Var.f2836f);
            case 7:
                aa1 aa1Var = (aa1) grVar;
                nd1 nd1Var2 = mb1.f7842a;
                mf1 mf1VarD = nf1.D();
                qf1 qf1VarC = rf1.C();
                uf1 uf1VarA = vf1.A();
                int i10 = aa1Var.f2822d.f5747c;
                uf1VarA.b();
                ((vf1) uf1VarA.f9560c).C(i10);
                vf1 vf1Var = (vf1) uf1VarA.d();
                qf1VarC.b();
                ((rf1) qf1VarC.f9560c).E(vf1Var);
                byte[] bArrB = ((sl1) aa1Var.f2823e.f12221c).b();
                zm1 zm1VarA = bn1.A(bArrB, 0, bArrB.length);
                qf1VarC.b();
                ((rf1) qf1VarC.f9560c).F(zm1VarA);
                rf1 rf1Var = (rf1) qf1VarC.d();
                mf1VarD.b();
                ((nf1) mf1VarD.f9560c).F(rf1Var);
                ch1 ch1VarD = dh1.D();
                ga1 ga1Var = aa1Var.f2822d;
                hh1 hh1VarD = mb1.d(ga1Var);
                ch1VarD.b();
                ((dh1) ch1VarD.f9560c).G(hh1VarD);
                byte[] bArrB2 = ((sl1) aa1Var.f2824f.f12221c).b();
                zm1 zm1VarA2 = bn1.A(bArrB2, 0, bArrB2.length);
                ch1VarD.b();
                ((dh1) ch1VarD.f9560c).H(zm1VarA2);
                dh1 dh1Var = (dh1) ch1VarD.d();
                mf1VarD.b();
                ((nf1) mf1VarD.f9560c).G(dh1Var);
                return yd1.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((nf1) mf1VarD.d()).a(), 2, mb1.a(ga1Var.f5749e), aa1Var.f2826h);
            case 11:
                ha1 ha1Var = (ha1) grVar;
                nd1 nd1Var3 = nb1.f8268a;
                wf1 wf1VarD = xf1.D();
                ka1 ka1Var = ha1Var.f6083d;
                ag1 ag1VarA = bg1.A();
                int i11 = ka1Var.f7167b;
                ag1VarA.b();
                ((bg1) ag1VarA.f9560c).C(i11);
                bg1 bg1Var = (bg1) ag1VarA.d();
                wf1VarD.b();
                ((xf1) wf1VarD.f9560c).F(bg1Var);
                byte[] bArrB3 = ((sl1) ha1Var.f6084e.f12221c).b();
                zm1 zm1VarA3 = bn1.A(bArrB3, 0, bArrB3.length);
                wf1VarD.b();
                ((xf1) wf1VarD.f9560c).G(zm1VarA3);
                return yd1.f("type.googleapis.com/google.crypto.tink.AesEaxKey", ((xf1) wf1VarD.d()).a(), 2, nb1.a(ha1Var.f6083d.f7168c), ha1Var.f6086g);
            case 15:
                la1 la1Var = (la1) grVar;
                nd1 nd1Var4 = pb1.f9005a;
                cg1 cg1VarC = dg1.C();
                byte[] bArrB4 = ((sl1) la1Var.f7470e.f12221c).b();
                zm1 zm1VarA4 = bn1.A(bArrB4, 0, bArrB4.length);
                cg1VarC.b();
                ((dg1) cg1VarC.f9560c).E(zm1VarA4);
                return yd1.f("type.googleapis.com/google.crypto.tink.AesGcmKey", ((dg1) cg1VarC.d()).a(), 2, pb1.a(la1Var.f7469d.f8653b), la1Var.f7472g);
            case 19:
                pa1 pa1Var = (pa1) grVar;
                nd1 nd1Var5 = rb1.f9811a;
                gg1 gg1VarC = hg1.C();
                byte[] bArrB5 = ((sl1) pa1Var.f9000e.f12221c).b();
                zm1 zm1VarA5 = bn1.A(bArrB5, 0, bArrB5.length);
                gg1VarC.b();
                ((hg1) gg1VarC.f9560c).E(zm1VarA5);
                return yd1.f("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((hg1) gg1VarC.d()).a(), 2, rb1.a(pa1Var.f8999d.f9785b), pa1Var.f9002g);
            case 23:
                sa1 sa1Var = (sa1) grVar;
                nd1 nd1Var6 = ub1.f10904a;
                kg1 kg1VarC = mg1.C();
                byte[] bArrB6 = ((sl1) sa1Var.f10229e.f12221c).b();
                zm1 zm1VarA6 = bn1.A(bArrB6, 0, bArrB6.length);
                kg1VarC.b();
                ((mg1) kg1VarC.f9560c).E(zm1VarA6);
                return yd1.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((mg1) kg1VarC.d()).a(), 2, ub1.a(sa1Var.f10228d.f10901a), sa1Var.f10231g);
            default:
                gb1 gb1Var = (gb1) grVar;
                nd1 nd1Var7 = ac1.f2842a;
                wi1 wi1VarD = xi1.D();
                byte[] bArrB7 = ((sl1) gb1Var.f5766e.f12221c).b();
                zm1 zm1VarA7 = bn1.A(bArrB7, 0, bArrB7.length);
                wi1VarD.b();
                ((xi1) wi1VarD.f9560c).F(zm1VarA7);
                aj1 aj1VarA = bj1.A();
                ib1 ib1Var = gb1Var.f5765d;
                int i12 = ib1Var.f6453b;
                aj1VarA.b();
                ((bj1) aj1VarA.f9560c).C(i12);
                bj1 bj1Var = (bj1) aj1VarA.d();
                wi1VarD.b();
                ((xi1) wi1VarD.f9560c).E(bj1Var);
                return yd1.f("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((xi1) wi1VarD.d()).a(), 2, ac1.a(ib1Var.f6452a), gb1Var.f5768g);
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public o91 c(zd1 zd1Var) throws GeneralSecurityException {
        switch (this.f4157b) {
            case 0:
                nd1 nd1Var = eb1.f4911a;
                mh1 mh1Var = (mh1) zd1Var.f12972d;
                if (!mh1Var.z().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var.z())));
                }
                try {
                    bn1 bn1VarA = mh1Var.A();
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    return eb1.c(di1.B(bn1VarA, kn1.f7272b), mh1Var.B());
                } catch (co1 e3) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e3);
                }
            case 6:
                nd1 nd1Var2 = mb1.f7842a;
                mh1 mh1Var2 = (mh1) zd1Var.f12972d;
                if (!mh1Var2.z().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var2.z())));
                }
                try {
                    bn1 bn1VarA2 = mh1Var2.A();
                    kn1 kn1Var2 = kn1.f7271a;
                    int i11 = tm1.f10663a;
                    pf1 pf1VarB = pf1.B(bn1VarA2, kn1.f7272b);
                    if (pf1VarB.A().B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hi hiVar = new hi(6);
                    hiVar.b(pf1VarB.z().A());
                    hiVar.f(pf1VarB.A().A());
                    hiVar.k(pf1VarB.z().z().z());
                    hiVar.m(pf1VarB.A().z().A());
                    hiVar.f6145f = mb1.c(pf1VarB.A().z().z());
                    hiVar.f6146g = mb1.b(mh1Var2.B());
                    return hiVar.n();
                } catch (co1 e7) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
                }
            case 10:
                nd1 nd1Var3 = nb1.f8268a;
                mh1 mh1Var3 = (mh1) zd1Var.f12972d;
                if (!mh1Var3.z().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var3.z())));
                }
                try {
                    bn1 bn1VarA3 = mh1Var3.A();
                    kn1 kn1Var3 = kn1.f7271a;
                    int i12 = tm1.f10663a;
                    zf1 zf1VarB = zf1.B(bn1VarA3, kn1.f7272b);
                    cw cwVar = new cw(29);
                    cwVar.g(zf1VarB.A());
                    cwVar.p(zf1VarB.z().z());
                    cwVar.s();
                    cwVar.f4350f = nb1.b(mh1Var3.B());
                    return cwVar.y();
                } catch (co1 e10) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
                }
            case 14:
                nd1 nd1Var4 = pb1.f9005a;
                mh1 mh1Var4 = (mh1) zd1Var.f12972d;
                if (!mh1Var4.z().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var4.z())));
                }
                try {
                    bn1 bn1VarA4 = mh1Var4.A();
                    kn1 kn1Var4 = kn1.f7271a;
                    int i13 = tm1.f10663a;
                    fg1 fg1VarB = fg1.B(bn1VarA4, kn1.f7272b);
                    if (fg1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    na1 na1Var = new na1(0);
                    na1Var.a(fg1VarB.z());
                    na1Var.d();
                    na1Var.g();
                    na1Var.f8262f = pb1.b(mh1Var4.B());
                    return na1Var.j();
                } catch (co1 e11) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e11);
                }
            case 18:
                nd1 nd1Var5 = rb1.f9811a;
                mh1 mh1Var5 = (mh1) zd1Var.f12972d;
                if (!mh1Var5.z().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var5.z())));
                }
                try {
                    bn1 bn1VarA5 = mh1Var5.A();
                    kn1 kn1Var5 = kn1.f7271a;
                    int i14 = tm1.f10663a;
                    jg1 jg1VarB = jg1.B(bn1VarA5, kn1.f7272b);
                    if (jg1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iZ = jg1VarB.z();
                    if (iZ == 16 || iZ == 32) {
                        return new ra1(iZ, rb1.b(mh1Var5.B()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iZ)));
                } catch (co1 e12) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e12);
                }
            case 22:
                nd1 nd1Var6 = ub1.f10904a;
                mh1 mh1Var6 = (mh1) zd1Var.f12972d;
                if (!mh1Var6.z().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var6.z())));
                }
                try {
                    bn1 bn1VarA6 = mh1Var6.A();
                    kn1 kn1Var6 = kn1.f7271a;
                    int i15 = tm1.f10663a;
                    ng1.z(bn1VarA6, kn1.f7272b);
                    return new ua1(ub1.b(mh1Var6.B()));
                } catch (co1 e13) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e13);
                }
            default:
                nd1 nd1Var7 = ac1.f2842a;
                mh1 mh1Var7 = (mh1) zd1Var.f12972d;
                if (!mh1Var7.z().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var7.z())));
                }
                try {
                    bn1 bn1VarA7 = mh1Var7.A();
                    kn1 kn1Var7 = kn1.f7271a;
                    int i16 = tm1.f10663a;
                    zi1 zi1VarB = zi1.B(bn1VarA7, kn1.f7272b);
                    if (zi1VarB.z() == 0) {
                        return ib1.b(ac1.b(mh1Var7.B()), zi1VarB.A().z());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (co1 e14) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e14);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc1
    public gr d(yd1 yd1Var) throws GeneralSecurityException {
        boolean z5 = false;
        switch (this.f4157b) {
            case 2:
                nd1 nd1Var = eb1.f4911a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var = (bn1) yd1Var.f12602e;
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    bi1 bi1VarB = bi1.B(bn1Var, kn1.f7272b);
                    if (bi1VarB.z() == 0) {
                        return ab1.i0(eb1.c(bi1VarB.A(), (ei1) yd1Var.f12603f), (Integer) yd1Var.f12604g);
                    }
                    String strValueOf = String.valueOf(bi1VarB);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 58);
                    sb2.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    sb2.append(strValueOf);
                    throw new GeneralSecurityException(sb2.toString());
                } catch (co1 e3) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e3);
                }
            case 8:
                nd1 nd1Var2 = mb1.f7842a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var2 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var2 = kn1.f7271a;
                    int i11 = tm1.f10663a;
                    nf1 nf1VarC = nf1.C(bn1Var2, kn1.f7272b);
                    if (nf1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (nf1VarC.A().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (nf1VarC.B().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    hi hiVar = new hi(6);
                    hiVar.b(nf1VarC.A().B().n());
                    hiVar.f(nf1VarC.B().B().n());
                    hiVar.k(nf1VarC.A().A().z());
                    hiVar.m(nf1VarC.B().A().A());
                    hiVar.f6145f = mb1.c(nf1VarC.B().A().z());
                    hiVar.f6146g = mb1.b((ei1) yd1Var.f12603f);
                    ga1 ga1VarN = hiVar.n();
                    cw cwVar = new cw(28);
                    cwVar.f4347c = ga1VarN;
                    cwVar.f4348d = xo0.d(nf1VarC.A().B().D());
                    cwVar.f4349e = xo0.d(nf1VarC.B().B().D());
                    cwVar.f4350f = (Integer) yd1Var.f12604g;
                    return cwVar.x();
                } catch (co1 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 12:
                nd1 nd1Var3 = nb1.f8268a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var3 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var3 = kn1.f7271a;
                    int i12 = tm1.f10663a;
                    xf1 xf1VarC = xf1.C(bn1Var3, kn1.f7272b);
                    if (xf1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    cw cwVar2 = new cw(29);
                    cwVar2.g(xf1VarC.B().n());
                    cwVar2.p(xf1VarC.A().z());
                    cwVar2.s();
                    cwVar2.f4350f = nb1.b((ei1) yd1Var.f12603f);
                    ka1 ka1VarY = cwVar2.y();
                    l91 l91Var = new l91(1, z5);
                    l91Var.f7465c = ka1VarY;
                    l91Var.f7466d = xo0.d(xf1VarC.B().D());
                    l91Var.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var.o();
                } catch (co1 unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case 16:
                nd1 nd1Var4 = pb1.f9005a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var4 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var4 = kn1.f7271a;
                    int i13 = tm1.f10663a;
                    dg1 dg1VarB = dg1.B(bn1Var4, kn1.f7272b);
                    if (dg1VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    na1 na1Var = new na1(0);
                    na1Var.a(dg1VarB.A().n());
                    na1Var.d();
                    na1Var.g();
                    na1Var.f8262f = pb1.b((ei1) yd1Var.f12603f);
                    oa1 oa1VarJ = na1Var.j();
                    l91 l91Var2 = new l91(2, z5);
                    l91Var2.f7465c = oa1VarJ;
                    l91Var2.f7466d = xo0.d(dg1VarB.A().D());
                    l91Var2.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var2.p();
                } catch (co1 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 20:
                nd1 nd1Var5 = rb1.f9811a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var5 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var5 = kn1.f7271a;
                    int i14 = tm1.f10663a;
                    hg1 hg1VarB = hg1.B(bn1Var5, kn1.f7272b);
                    if (hg1VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iN = hg1VarB.A().n();
                    if (iN != 16 && iN != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iN)));
                    }
                    ra1 ra1Var = new ra1(iN, rb1.b((ei1) yd1Var.f12603f));
                    l91 l91Var3 = new l91(3, z5);
                    l91Var3.f7465c = ra1Var;
                    l91Var3.f7466d = xo0.d(hg1VarB.A().D());
                    l91Var3.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var3.q();
                } catch (co1 unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 24:
                nd1 nd1Var6 = ub1.f10904a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var6 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var6 = kn1.f7271a;
                    int i15 = tm1.f10663a;
                    mg1 mg1VarB = mg1.B(bn1Var6, kn1.f7272b);
                    if (mg1VarB.z() == 0) {
                        return sa1.i0(ub1.b((ei1) yd1Var.f12603f), xo0.d(mg1VarB.A().D()), (Integer) yd1Var.f12604g);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (co1 unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                nd1 nd1Var7 = ac1.f2842a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var7 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var7 = kn1.f7271a;
                    int i16 = tm1.f10663a;
                    xi1 xi1VarC = xi1.C(bn1Var7, kn1.f7272b);
                    if (xi1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (xi1VarC.B().n() == 32) {
                        return gb1.i0(ib1.b(ac1.b((ei1) yd1Var.f12603f), xi1VarC.A().z()), xo0.d(xi1VarC.B().D()), (Integer) yd1Var.f12604g);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (co1 unused6) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 f(o91 o91Var) throws GeneralSecurityException {
        switch (this.f4157b) {
            case 3:
                bb1 bb1Var = (bb1) o91Var;
                nd1 nd1Var = eb1.f4911a;
                lh1 lh1VarD = mh1.D();
                lh1VarD.g("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                lh1VarD.h(eb1.b(bb1Var).a());
                lh1VarD.i(eb1.a(bb1Var.f3715a));
                return zd1.q((mh1) lh1VarD.d());
            case 9:
                ga1 ga1Var = (ga1) o91Var;
                nd1 nd1Var2 = mb1.f7842a;
                lh1 lh1VarD2 = mh1.D();
                lh1VarD2.g("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                of1 of1VarC = pf1.C();
                sf1 sf1VarB = tf1.B();
                uf1 uf1VarA = vf1.A();
                int i10 = ga1Var.f5747c;
                uf1VarA.b();
                ((vf1) uf1VarA.f9560c).C(i10);
                vf1 vf1Var = (vf1) uf1VarA.d();
                sf1VarB.b();
                ((tf1) sf1VarB.f9560c).D(vf1Var);
                int i11 = ga1Var.f5745a;
                sf1VarB.b();
                ((tf1) sf1VarB.f9560c).E(i11);
                tf1 tf1Var = (tf1) sf1VarB.d();
                of1VarC.b();
                ((pf1) of1VarC.f9560c).D(tf1Var);
                eh1 eh1VarD = fh1.D();
                hh1 hh1VarD = mb1.d(ga1Var);
                eh1VarD.b();
                ((fh1) eh1VarD.f9560c).F(hh1VarD);
                int i12 = ga1Var.f5746b;
                eh1VarD.b();
                ((fh1) eh1VarD.f9560c).G(i12);
                fh1 fh1Var = (fh1) eh1VarD.d();
                of1VarC.b();
                ((pf1) of1VarC.f9560c).E(fh1Var);
                lh1VarD2.h(((pf1) of1VarC.d()).a());
                lh1VarD2.i(mb1.a(ga1Var.f5749e));
                return zd1.q((mh1) lh1VarD2.d());
            case 13:
                ka1 ka1Var = (ka1) o91Var;
                nd1 nd1Var3 = nb1.f8268a;
                lh1 lh1VarD3 = mh1.D();
                lh1VarD3.g("type.googleapis.com/google.crypto.tink.AesEaxKey");
                yf1 yf1VarC = zf1.C();
                ag1 ag1VarA = bg1.A();
                int i13 = ka1Var.f7167b;
                ag1VarA.b();
                ((bg1) ag1VarA.f9560c).C(i13);
                bg1 bg1Var = (bg1) ag1VarA.d();
                yf1VarC.b();
                ((zf1) yf1VarC.f9560c).D(bg1Var);
                int i14 = ka1Var.f7166a;
                yf1VarC.b();
                ((zf1) yf1VarC.f9560c).E(i14);
                lh1VarD3.h(((zf1) yf1VarC.d()).a());
                lh1VarD3.i(nb1.a(ka1Var.f7168c));
                return zd1.q((mh1) lh1VarD3.d());
            case 17:
                oa1 oa1Var = (oa1) o91Var;
                nd1 nd1Var4 = pb1.f9005a;
                lh1 lh1VarD4 = mh1.D();
                lh1VarD4.g("type.googleapis.com/google.crypto.tink.AesGcmKey");
                eg1 eg1VarC = fg1.C();
                int i15 = oa1Var.f8652a;
                eg1VarC.b();
                ((fg1) eg1VarC.f9560c).D(i15);
                lh1VarD4.h(((fg1) eg1VarC.d()).a());
                lh1VarD4.i(pb1.a(oa1Var.f8653b));
                return zd1.q((mh1) lh1VarD4.d());
            case 21:
                ra1 ra1Var = (ra1) o91Var;
                nd1 nd1Var5 = rb1.f9811a;
                lh1 lh1VarD5 = mh1.D();
                lh1VarD5.g("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                ig1 ig1VarC = jg1.C();
                int i16 = ra1Var.f9784a;
                ig1VarC.b();
                ((jg1) ig1VarC.f9560c).D(i16);
                lh1VarD5.h(((jg1) ig1VarC.d()).a());
                lh1VarD5.i(rb1.a(ra1Var.f9785b));
                return zd1.q((mh1) lh1VarD5.d());
            case 25:
                nd1 nd1Var6 = ub1.f10904a;
                lh1 lh1VarD6 = mh1.D();
                lh1VarD6.g("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                lh1VarD6.h(ng1.A().a());
                lh1VarD6.i(ub1.a(((ua1) o91Var).f10901a));
                return zd1.q((mh1) lh1VarD6.d());
            default:
                ib1 ib1Var = (ib1) o91Var;
                nd1 nd1Var7 = ac1.f2842a;
                lh1 lh1VarD7 = mh1.D();
                lh1VarD7.g("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                yi1 yi1VarC = zi1.C();
                aj1 aj1VarA = bj1.A();
                int i17 = ib1Var.f6453b;
                aj1VarA.b();
                ((bj1) aj1VarA.f9560c).C(i17);
                bj1 bj1Var = (bj1) aj1VarA.d();
                yi1VarC.b();
                ((zi1) yi1VarC.f9560c).D(bj1Var);
                lh1VarD7.h(((zi1) yi1VarC.d()).a());
                lh1VarD7.i(ac1.a(ib1Var.f6452a));
                return zd1.q((mh1) lh1VarD7.d());
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object b(gr grVar) {
        switch (this.f4157b) {
            case 4:
                gb1 gb1Var = (gb1) grVar;
                gb1Var.getClass();
                return new zb1(((sl1) gb1Var.f5766e.f12221c).b(), gb1Var.f5767f, gb1Var.f5765d.f6453b);
            default:
                jb1 jb1Var = (jb1) grVar;
                sd1 sd1Var = kb1.f7180a;
                try {
                    sb1.b();
                    return new bc1(((sl1) jb1Var.f6807e.f12221c).b(), jb1Var.f6808f.b(), sb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new yb1(3, ((sl1) jb1Var.f6807e.f12221c).b(), jb1Var.f6808f.b());
                }
        }
    }
}
