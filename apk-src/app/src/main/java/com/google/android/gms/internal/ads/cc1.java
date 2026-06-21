package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc1 implements md1, uc1, sc1, od1, td1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4161c = new cc1(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4162d = new cc1(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4163e = new cc1(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4164f = new cc1(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4165g = new cc1(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4166h = new cc1(5);
    public static final /* synthetic */ cc1 i = new cc1(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4167j = new cc1(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4168k = new cc1(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4169l = new cc1(9);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4170m = new cc1(10);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4171n = new cc1(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4172o = new cc1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4173p = new cc1(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4174q = new cc1(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4175r = new cc1(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4176s = new cc1(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4177t = new cc1(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4178u = new cc1(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4179v = new cc1(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4180w = new cc1(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4181x = new cc1(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4182y = new cc1(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ cc1 f4183z = new cc1(24);
    public static final /* synthetic */ cc1 A = new cc1(25);
    public static final /* synthetic */ cc1 B = new cc1(26);
    public static final /* synthetic */ cc1 C = new cc1(27);
    public static final /* synthetic */ cc1 D = new cc1(28);
    public static final /* synthetic */ cc1 E = new cc1(29);

    public /* synthetic */ cc1(int i10) {
        this.f4184b = i10;
    }

    @Override // com.google.android.gms.internal.ads.uc1, com.google.android.gms.internal.ads.td1
    public yd1 b(gr grVar) {
        switch (this.f4184b) {
            case 1:
                jb1 jb1Var = (jb1) grVar;
                nd1 nd1Var = dc1.f4553a;
                cj1 cj1VarC = dj1.C();
                byte[] bArrB = ((sl1) jb1Var.f6807e.f12221c).b();
                zm1 zm1VarA = bn1.A(bArrB, 0, bArrB.length);
                cj1VarC.b();
                ((dj1) cj1VarC.f9560c).E(zm1VarA);
                return yd1.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((dj1) cj1VarC.d()).a(), 2, dc1.a(jb1Var.f6806d.f7478a), jb1Var.f6809g);
            case 5:
                yd1 yd1Var = ((zc1) grVar).f12968d;
                int i10 = xc1.f12130b[t.z.m(yd1Var.f12599b)];
                return yd1Var;
            case 13:
                he1 he1Var = (he1) grVar;
                nd1 nd1Var2 = ze1.f12982a;
                ff1 ff1VarD = gf1.D();
                je1 je1Var = he1Var.f6107d;
                jf1 jf1VarA = lf1.A();
                int i11 = je1Var.f6837b;
                jf1VarA.b();
                ((lf1) jf1VarA.f9560c).C(i11);
                lf1 lf1Var = (lf1) jf1VarA.d();
                ff1VarD.b();
                ((gf1) ff1VarD.f9560c).G(lf1Var);
                byte[] bArrB2 = ((sl1) he1Var.f6108e.f12221c).b();
                zm1 zm1VarA2 = bn1.A(bArrB2, 0, bArrB2.length);
                ff1VarD.b();
                ((gf1) ff1VarD.f9560c).F(zm1VarA2);
                return yd1.f("type.googleapis.com/google.crypto.tink.AesCmacKey", ((gf1) ff1VarD.d()).a(), 2, ze1.a(he1Var.f6107d.f6838c), he1Var.f6110g);
            default:
                ne1 ne1Var = (ne1) grVar;
                zd1 zd1Var = af1.f2881a;
                ch1 ch1VarD = dh1.D();
                re1 re1Var = ne1Var.f8280d;
                gh1 gh1VarB = hh1.B();
                int i12 = re1Var.f9926b;
                gh1VarB.b();
                ((hh1) gh1VarB.f9560c).E(i12);
                bh1 bh1Var = (bh1) af1.f2882b.s(re1Var.f9928d);
                gh1VarB.b();
                ((hh1) gh1VarB.f9560c).D(bh1Var);
                hh1 hh1Var = (hh1) gh1VarB.d();
                ch1VarD.b();
                ((dh1) ch1VarD.f9560c).G(hh1Var);
                byte[] bArrB3 = ((sl1) ne1Var.f8281e.f12221c).b();
                zm1 zm1VarA3 = bn1.A(bArrB3, 0, bArrB3.length);
                ch1VarD.b();
                ((dh1) ch1VarD.f9560c).H(zm1VarA3);
                return yd1.f("type.googleapis.com/google.crypto.tink.HmacKey", ((dh1) ch1VarD.d()).a(), 2, (ei1) af1.f2881a.s(ne1Var.f8280d.f9927c), ne1Var.f8283g);
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public o91 c(zd1 zd1Var) throws GeneralSecurityException {
        switch (this.f4184b) {
            case 0:
                nd1 nd1Var = dc1.f4553a;
                mh1 mh1Var = (mh1) zd1Var.f12972d;
                if (!mh1Var.z().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var.z())));
                }
                try {
                    bn1 bn1VarA = mh1Var.A();
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    if (fj1.A(bn1VarA, kn1.f7272b).z() == 0) {
                        return new lb1(dc1.b(mh1Var.B()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (co1 e3) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e3);
                }
            case 12:
                nd1 nd1Var2 = ze1.f12982a;
                mh1 mh1Var2 = (mh1) zd1Var.f12972d;
                if (!mh1Var2.z().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var2.z())));
                }
                try {
                    bn1 bn1VarA2 = mh1Var2.A();
                    kn1 kn1Var2 = kn1.f7271a;
                    int i11 = tm1.f10663a;
                    if1 if1VarB = if1.B(bn1VarA2, kn1.f7272b);
                    l91 l91Var = new l91(6);
                    l91Var.c(if1VarB.z());
                    l91Var.k(if1VarB.A().z());
                    l91Var.f7467e = ze1.b(mh1Var2.B());
                    return l91Var.s();
                } catch (co1 e7) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
                }
            default:
                zd1 zd1Var2 = af1.f2881a;
                mh1 mh1Var3 = (mh1) zd1Var.f12972d;
                if (!mh1Var3.z().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var3.z())));
                }
                try {
                    bn1 bn1VarA3 = mh1Var3.A();
                    kn1 kn1Var3 = kn1.f7271a;
                    int i12 = tm1.f10663a;
                    fh1 fh1VarC = fh1.C(bn1VarA3, kn1.f7272b);
                    if (fh1VarC.B() != 0) {
                        int iB = fh1VarC.B();
                        throw new GeneralSecurityException(l7.o.j(iB, "Parsing HmacParameters failed: unknown Version ", new StringBuilder(String.valueOf(iB).length() + 47)));
                    }
                    na1 na1Var = new na1(2);
                    na1Var.a(fh1VarC.A());
                    na1Var.e(fh1VarC.z().A());
                    na1Var.f8261e = (pe1) af1.f2882b.u(fh1VarC.z().z());
                    na1Var.f8262f = (qe1) af1.f2881a.u(mh1Var3.B());
                    return na1Var.k();
                } catch (co1 e10) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.sc1
    public gr d(yd1 yd1Var) throws GeneralSecurityException {
        boolean z5 = false;
        switch (this.f4184b) {
            case 2:
                nd1 nd1Var = dc1.f4553a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var = (bn1) yd1Var.f12602e;
                    kn1 kn1Var = kn1.f7271a;
                    int i10 = tm1.f10663a;
                    dj1 dj1VarB = dj1.B(bn1Var, kn1.f7272b);
                    if (dj1VarB.z() == 0) {
                        return jb1.i0(dc1.b((ei1) yd1Var.f12603f), xo0.d(dj1VarB.A().D()), (Integer) yd1Var.f12604g);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (co1 unused) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            case 14:
                nd1 nd1Var2 = ze1.f12982a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var2 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var2 = kn1.f7271a;
                    int i11 = tm1.f10663a;
                    gf1 gf1VarC = gf1.C(bn1Var2, kn1.f7272b);
                    if (gf1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    l91 l91Var = new l91(6);
                    l91Var.c(gf1VarC.A().n());
                    l91Var.k(gf1VarC.B().z());
                    l91Var.f7467e = ze1.b((ei1) yd1Var.f12603f);
                    je1 je1VarS = l91Var.s();
                    l91 l91Var2 = new l91(5, z5);
                    l91Var2.f7465c = je1VarS;
                    l91Var2.f7466d = xo0.d(gf1VarC.A().D());
                    l91Var2.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var2.r();
                } catch (co1 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            default:
                zd1 zd1Var = af1.f2881a;
                if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    bn1 bn1Var3 = (bn1) yd1Var.f12602e;
                    kn1 kn1Var3 = kn1.f7271a;
                    int i12 = tm1.f10663a;
                    dh1 dh1VarC = dh1.C(bn1Var3, kn1.f7272b);
                    if (dh1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    na1 na1Var = new na1(2);
                    na1Var.a(dh1VarC.B().n());
                    na1Var.e(dh1VarC.A().A());
                    na1Var.f8261e = (pe1) af1.f2882b.u(dh1VarC.A().z());
                    na1Var.f8262f = (qe1) af1.f2881a.u((ei1) yd1Var.f12603f);
                    re1 re1VarK = na1Var.k();
                    l91 l91Var3 = new l91(7, z5);
                    l91Var3.f7465c = re1VarK;
                    l91Var3.f7466d = xo0.d(dh1VarC.B().D());
                    l91Var3.f7467e = (Integer) yd1Var.f12604g;
                    return l91Var3.t();
                } catch (co1 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 f(o91 o91Var) {
        switch (this.f4184b) {
            case 3:
                nd1 nd1Var = dc1.f4553a;
                lh1 lh1VarD = mh1.D();
                lh1VarD.g("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                lh1VarD.h(fj1.B().a());
                lh1VarD.i(dc1.a(((lb1) o91Var).f7478a));
                return zd1.q((mh1) lh1VarD.d());
            case 15:
                je1 je1Var = (je1) o91Var;
                nd1 nd1Var2 = ze1.f12982a;
                lh1 lh1VarD2 = mh1.D();
                lh1VarD2.g("type.googleapis.com/google.crypto.tink.AesCmacKey");
                hf1 hf1VarC = if1.C();
                jf1 jf1VarA = lf1.A();
                int i10 = je1Var.f6837b;
                jf1VarA.b();
                ((lf1) jf1VarA.f9560c).C(i10);
                lf1 lf1Var = (lf1) jf1VarA.d();
                hf1VarC.b();
                ((if1) hf1VarC.f9560c).E(lf1Var);
                int i11 = je1Var.f6836a;
                hf1VarC.b();
                ((if1) hf1VarC.f9560c).D(i11);
                lh1VarD2.h(((if1) hf1VarC.d()).a());
                lh1VarD2.i(ze1.a(je1Var.f6838c));
                return zd1.q((mh1) lh1VarD2.d());
            default:
                re1 re1Var = (re1) o91Var;
                zd1 zd1Var = af1.f2881a;
                lh1 lh1VarD3 = mh1.D();
                lh1VarD3.g("type.googleapis.com/google.crypto.tink.HmacKey");
                eh1 eh1VarD = fh1.D();
                gh1 gh1VarB = hh1.B();
                int i12 = re1Var.f9926b;
                gh1VarB.b();
                ((hh1) gh1VarB.f9560c).E(i12);
                bh1 bh1Var = (bh1) af1.f2882b.s(re1Var.f9928d);
                gh1VarB.b();
                ((hh1) gh1VarB.f9560c).D(bh1Var);
                hh1 hh1Var = (hh1) gh1VarB.d();
                eh1VarD.b();
                ((fh1) eh1VarD.f9560c).F(hh1Var);
                int i13 = re1Var.f9925a;
                eh1VarD.b();
                ((fh1) eh1VarD.f9560c).G(i13);
                lh1VarD3.h(((fh1) eh1VarD.d()).a());
                lh1VarD3.i((ei1) af1.f2881a.s(re1Var.f9927c));
                return zd1.q((mh1) lh1VarD3.d());
        }
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object b(gr grVar) throws GeneralSecurityException {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        KeyFactory keyFactory3;
        q91 q91VarB;
        int i10 = this.f4184b;
        ei1 ei1Var = ei1.LEGACY;
        switch (i10) {
            case 6:
                he1 he1Var = (he1) grVar;
                sd1 sd1Var = ie1.f6476a;
                if (he1Var.f6107d.f6836a == 32) {
                    if (gr.x(1)) {
                        Provider providerE = c80.e();
                        if (providerE != null) {
                            try {
                                return ke1.a(he1Var, providerE);
                            } catch (GeneralSecurityException unused) {
                            }
                        }
                        return new ke1();
                    }
                    throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 7:
                he1 he1Var2 = (he1) grVar;
                sd1 sd1Var2 = ie1.f6476a;
                if (he1Var2.f6107d.f6836a == 32) {
                    return new nl1(he1Var2);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 8:
                ke1 ke1Var = new ke1();
                if (gr.x(2)) {
                    return ke1Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 9:
                return new nl1((ne1) grVar);
            case 10:
                yd1 yd1Var = ((zc1) grVar).f12968d;
                int[] iArr = xc1.f12130b;
                int i11 = yd1Var.f12599b;
                Integer num = (Integer) yd1Var.f12604g;
                int i12 = iArr[t.z.m(i11)];
                int iOrdinal = ((ei1) yd1Var.f12603f).ordinal();
                if (iOrdinal == 1) {
                    kd1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    kd1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    kd1.f7203a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    kd1.a(num.intValue()).b();
                }
                return new ve1();
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                ik1 ik1Var = (ik1) grVar;
                zd1 zd1Var = rl1.f9961a;
                try {
                    return al1.d(ik1Var);
                } catch (NoSuchProviderException unused2) {
                    KeyFactory keyFactory4 = (KeyFactory) il1.f6539g.f6540a.b("RSA");
                    BigInteger bigInteger = ik1Var.f6523e;
                    gk1 gk1Var = ik1Var.f6522d;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory4.generatePublic(new RSAPublicKeySpec(bigInteger, gk1Var.f5840b));
                    zd1 zd1Var2 = rl1.f9961a;
                    return new pl1(rSAPublicKey, (ll1) zd1Var2.s(gk1Var.f5842d), (ll1) zd1Var2.s(gk1Var.f5843e), gk1Var.f5844f, ik1Var.f6524f.b(), gk1Var.f5841c.equals(fk1.f5376d) ? rl1.f9963c : rl1.f9962b);
                }
            case 20:
                ij1 ij1Var = (ij1) grVar;
                Provider providerE2 = c80.e();
                ll1 ll1Var = (ll1) qk1.i.s(ij1Var.f6516d.f6859d.f6163c);
                zd1 zd1Var3 = qk1.f9537j;
                jj1 jj1Var = ij1Var.f6516d;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) ij1Var.f6517e.f6553c, gr.D((el1) qk1.f9538k.s(jj1Var.f6859d.f6162b)));
                if (providerE2 != null) {
                    keyFactory = KeyFactory.getInstance("EC", providerE2);
                } else {
                    keyFactory = (KeyFactory) il1.f6539g.f6540a.b("EC");
                }
                jj1Var.f6861f.b();
                sk1 sk1Var = new sk1();
                if (gr.x(2)) {
                    gr.F(ll1Var);
                    ll1Var.toString().concat("withECDSA");
                    return sk1Var;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 21:
                jj1 jj1Var2 = (jj1) grVar;
                byte[] bArr = qk1.f9535g;
                Provider providerE3 = c80.e();
                zd1 zd1Var4 = qk1.f9538k;
                hj1 hj1Var = jj1Var2.f6859d;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(jj1Var2.f6860e, gr.D((el1) zd1Var4.s(hj1Var.f6162b)));
                if (providerE3 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", providerE3);
                } else {
                    keyFactory2 = (KeyFactory) il1.f6539g.f6540a.b("EC");
                }
                return new qk1((ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec), (ll1) qk1.i.s(hj1Var.f6163c), (fl1) qk1.f9537j.s(hj1Var.f6161a), jj1Var2.f6861f.b(), hj1Var.f6164d.equals(ja1.f6799m) ? qk1.f9536h : qk1.f9535g, providerE3);
            case 22:
                nj1 nj1Var = (nj1) grVar;
                if (gr.x(1)) {
                    try {
                        return sk1.a(nj1Var);
                    } catch (GeneralSecurityException unused3) {
                        xo0 xo0Var = nj1Var.f8323e;
                        pj1 pj1Var = nj1Var.f8322d;
                        byte[] bArrB = ((sl1) xo0Var.f12221c).b();
                        pj1Var.f9078f.b();
                        sk1 sk1Var2 = new sk1();
                        if (gr.x(1)) {
                            if (bArrB.length == 32) {
                                pn1.j(pn1.q(bArrB));
                                return sk1Var2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 23:
                pj1 pj1Var2 = (pj1) grVar;
                if (gr.x(1)) {
                    try {
                        return tk1.b(pj1Var2);
                    } catch (GeneralSecurityException unused4) {
                        return new uk1(pj1Var2.f9077e.b(), pj1Var2.f9078f.b(), pj1Var2.f9076d.f7900a.equals(lj1.f7548d) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 24:
                yd1 yd1Var2 = ((zc1) grVar).f12968d;
                int i13 = xc1.f12130b[t.z.m(yd1Var2.f12599b)];
                uk1.b(yd1Var2);
                ((ei1) yd1Var2.f12603f).equals(ei1Var);
                return new sk1();
            case 25:
                yd1 yd1Var3 = ((zc1) grVar).f12968d;
                int i14 = xc1.f12130b[t.z.m(yd1Var3.f12599b)];
                return new uk1((q91) qc1.f9455d.b(q91.class, (String) yd1Var3.f12600c).a((bn1) yd1Var3.f12602e), uk1.b(yd1Var3), ((ei1) yd1Var3.f12603f).equals(ei1Var) ? new byte[]{0} : new byte[0]);
            case 26:
                ak1 ak1Var = (ak1) grVar;
                int i15 = ge1.f5788a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider providerE4 = c80.e();
                if (providerE4 != null) {
                    keyFactory3 = KeyFactory.getInstance("RSA", providerE4);
                } else {
                    keyFactory3 = (KeyFactory) il1.f6539g.f6540a.b("RSA");
                }
                bk1 bk1Var = ak1Var.f2909d;
                BigInteger bigInteger2 = bk1Var.f3805e;
                yj1 yj1Var = bk1Var.f3804d;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory3.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, yj1Var.f12637b, (BigInteger) ak1Var.f2910e.f6553c, (BigInteger) ak1Var.f2911f.f6553c, (BigInteger) ak1Var.f2912g.f6553c, (BigInteger) ak1Var.f2913h.f6553c, (BigInteger) ak1Var.i.f6553c, (BigInteger) ak1Var.f2914j.f6553c));
                if (providerE4 != null) {
                    q91VarB = xk1.c(bk1Var, providerE4);
                } else {
                    q91VarB = ol1.b(bk1Var);
                }
                wk1 wk1Var = new wk1(rSAPrivateCrtKey, yj1Var.f12639d, bk1Var.f3806f.b(), yj1Var.f12638c.equals(xj1.f12172d) ? wk1.f11829h : wk1.f11828g, q91VarB, providerE4);
                String str = wk1Var.f11831b;
                Provider provider = wk1Var.f11835f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) il1.f6536d.f6540a.b(str);
                signature.initSign(wk1Var.f11830a);
                byte[] bArr2 = wk1.i;
                signature.update(bArr2);
                byte[] bArr3 = wk1Var.f11833d;
                if (bArr3.length > 0) {
                    signature.update(bArr3);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr4 = wk1Var.f11832c;
                if (bArr4.length > 0) {
                    bArrSign = ix.s(bArr4, bArrSign);
                }
                try {
                    wk1Var.f11834e.a(bArrSign, bArr2);
                    return wk1Var;
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException("RSA signature computation error", e3);
                }
            case 27:
                return ol1.b((bk1) grVar);
            case 28:
                hk1 hk1Var = (hk1) grVar;
                try {
                    return sk1.b(hk1Var);
                } catch (NoSuchProviderException unused5) {
                    KeyFactory keyFactory5 = (KeyFactory) il1.f6539g.f6540a.b("RSA");
                    ik1 ik1Var2 = hk1Var.f6167d;
                    ik1 ik1Var3 = hk1Var.f6167d;
                    BigInteger bigInteger3 = ik1Var2.f6523e;
                    gk1 gk1Var2 = ik1Var3.f6522d;
                    gk1 gk1Var3 = ik1Var3.f6522d;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory5.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger3, gk1Var2.f5840b, (BigInteger) hk1Var.f6168e.f6553c, (BigInteger) hk1Var.f6169f.f6553c, (BigInteger) hk1Var.f6170g.f6553c, (BigInteger) hk1Var.f6171h.f6553c, (BigInteger) hk1Var.i.f6553c, (BigInteger) hk1Var.f6172j.f6553c));
                    zd1 zd1Var5 = rl1.f9961a;
                    ll1 ll1Var2 = (ll1) zd1Var5.s(gk1Var3.f5842d);
                    ll1 ll1Var3 = (ll1) zd1Var5.s(gk1Var3.f5843e);
                    ik1Var3.f6524f.b();
                    sk1 sk1Var3 = new sk1();
                    if (!gc1.a()) {
                        gr.F(ll1Var2);
                        if (ll1Var2.equals(ll1Var3)) {
                            gr.K(rSAPrivateCrtKey2.getModulus().bitLength());
                            gr.Q(rSAPrivateCrtKey2.getPublicExponent());
                            return sk1Var3;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
        }
    }
}
