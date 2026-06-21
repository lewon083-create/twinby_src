package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ba1 implements pc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3693b = new ba1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3694c = new ba1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3695d = new ba1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3696e = new ba1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3697f = new ba1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3698g = new ba1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3699h = new ba1(6);
    public static final /* synthetic */ ba1 i = new ba1(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3700j = new ba1(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3701k = new ba1(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3702l = new ba1(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3703m = new ba1(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3704n = new ba1(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3705o = new ba1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3706p = new ba1(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ ba1 f3707q = new ba1(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3708a;

    public /* synthetic */ ba1(int i10) {
        this.f3708a = i10;
    }

    @Override // com.google.android.gms.internal.ads.pc1
    public final gr a(o91 o91Var, Integer num) throws GeneralSecurityException {
        int i10 = 9;
        int i11 = 1;
        boolean z5 = false;
        switch (this.f3708a) {
            case 0:
                ga1 ga1Var = (ga1) o91Var;
                sd1 sd1Var = da1.f4534a;
                int i12 = ga1Var.f5745a;
                if (i12 != 16 && i12 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                cw cwVar = new cw(28);
                cwVar.f4347c = ga1Var;
                cwVar.f4350f = num;
                cwVar.f4348d = xo0.e(i12);
                cwVar.f4349e = xo0.e(ga1Var.f5746b);
                return cwVar.x();
            case 1:
                ka1 ka1Var = (ka1) o91Var;
                sd1 sd1Var2 = ia1.f6446a;
                int i13 = ka1Var.f7166a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                l91 l91Var = new l91(i11, z5);
                l91Var.f7465c = ka1Var;
                l91Var.f7467e = num;
                l91Var.f7466d = xo0.e(i13);
                return l91Var.o();
            case 2:
                oa1 oa1Var = (oa1) o91Var;
                sd1 sd1Var3 = ma1.f7828a;
                int i14 = oa1Var.f8652a;
                if (i14 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                l91 l91Var2 = new l91(2, z5);
                l91Var2.f7465c = oa1Var;
                l91Var2.f7467e = num;
                l91Var2.f7466d = xo0.e(i14);
                return l91Var2.p();
            case 3:
                ra1 ra1Var = (ra1) o91Var;
                sd1 sd1Var4 = qa1.f9389a;
                l91 l91Var3 = new l91(3, z5);
                l91Var3.f7465c = ra1Var;
                l91Var3.f7467e = num;
                l91Var3.f7466d = xo0.e(ra1Var.f9784a);
                return l91Var3.q();
            case 4:
                sd1 sd1Var5 = ta1.f10573a;
                return sa1.i0(((ua1) o91Var).f10901a, xo0.e(32), num);
            case 5:
                sd1 sd1Var6 = va1.f11322a;
                return xa1.i0((ya1) o91Var, num);
            case 6:
                wc1 wc1Var = wa1.f11714a;
                return ab1.i0((bb1) o91Var, num);
            case 7:
                return gb1.i0((ib1) o91Var, xo0.e(32), num);
            case 8:
                sd1 sd1Var7 = kb1.f7180a;
                return jb1.i0(((lb1) o91Var).f7478a, xo0.e(32), num);
            case 9:
                cd1 cd1Var = cd1.f4188b;
                mh1 mh1Var = (mh1) ((ad1) o91Var).f2872a.f12972d;
                qc1 qc1Var = qc1.f9455d;
                wc1 wc1VarD = qc1Var.d(mh1Var.z());
                if (!((Boolean) qc1Var.f9457b.get(mh1Var.z())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                bn1 bn1VarA = mh1Var.A();
                wc1VarD.getClass();
                lh1 lh1VarD = mh1.D();
                lh1VarD.g(wc1VarD.f11744a);
                lh1VarD.h(bn1VarA);
                lh1VarD.i(ei1.RAW);
                mh1 mh1Var2 = (mh1) lh1VarD.d();
                zd1 zd1Var = new zd1(0, mh1Var2, ge1.b(mh1Var2.z()));
                jd1 jd1Var = jd1.f6829b;
                yd1 yd1Var = (yd1) jd1Var.f(cd1.f4188b.b(jd1Var.g(zd1Var), null));
                jh1 jh1VarC = kh1.C();
                String str = (String) yd1Var.f12600c;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).E(str);
                bn1 bn1Var = (bn1) yd1Var.f12602e;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).F(bn1Var);
                int i15 = yd1Var.f12599b;
                jh1VarC.b();
                ((kh1) jh1VarC.f9560c).G(i15);
                kh1 kh1Var = (kh1) jh1VarC.d();
                return new zc1(yd1.f(kh1Var.z(), kh1Var.A(), kh1Var.B(), mh1Var.B(), num));
            case 10:
                je1 je1Var = (je1) o91Var;
                sd1 sd1Var8 = ie1.f6476a;
                int i16 = je1Var.f6836a;
                if (i16 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                l91 l91Var4 = new l91(5, z5);
                l91Var4.f7465c = je1Var;
                l91Var4.f7466d = xo0.e(i16);
                l91Var4.f7467e = num;
                return l91Var4.r();
            case 11:
                re1 re1Var = (re1) o91Var;
                sd1 sd1Var9 = oe1.f8676a;
                l91 l91Var5 = new l91(7, z5);
                l91Var5.f7465c = re1Var;
                l91Var5.f7466d = xo0.e(re1Var.f9925a);
                l91Var5.f7467e = num;
                return l91Var5.t();
            case 12:
                hj1 hj1Var = (hj1) o91Var;
                sd1 sd1Var10 = kj1.f7242a;
                ECParameterSpec eCParameterSpec = hj1Var.f6162b.f5833b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) il1.f6538f.f6540a.b("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                l91 l91Var6 = new l91(8, z5);
                l91Var6.f7465c = hj1Var;
                l91Var6.f7467e = num;
                l91Var6.f7466d = eCPublicKey.getW();
                jj1 jj1VarU = l91Var6.u();
                ut utVar = new ut(25);
                utVar.f11061c = jj1VarU;
                utVar.f11062d = new in0(12, eCPrivateKey.getS());
                return utVar.t();
            case 13:
                mj1 mj1Var = (mj1) o91Var;
                sd1 sd1Var11 = oj1.f8706a;
                byte[] bArrA = ae1.a(32);
                if (bArrA.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return nj1.i0(pj1.i0(mj1Var.f7900a, sl1.a(Arrays.copyOf(pn1.j(pn1.q(bArrA)), 32)), num), new xo0(9, sl1.a(Arrays.copyOf(bArrA, bArrA.length))));
            case 14:
                yj1 yj1Var = (yj1) o91Var;
                sd1 sd1Var12 = ck1.f4237a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) il1.f6538f.f6540a.b("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(yj1Var.f12636a, new BigInteger(1, yj1Var.f12637b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                l91 l91Var7 = new l91(i10, z5);
                l91Var7.f7465c = yj1Var;
                l91Var7.f7466d = rSAPublicKey.getModulus();
                l91Var7.f7467e = num;
                bk1 bk1VarV = l91Var7.v();
                k7 k7Var = new k7(false);
                k7Var.f7130b = bk1VarV;
                in0 in0Var = new in0(12, rSAPrivateCrtKey.getPrimeP());
                in0 in0Var2 = new in0(12, rSAPrivateCrtKey.getPrimeQ());
                k7Var.f7132d = in0Var;
                k7Var.f7133e = in0Var2;
                k7Var.f7131c = new in0(12, rSAPrivateCrtKey.getPrivateExponent());
                in0 in0Var3 = new in0(12, rSAPrivateCrtKey.getPrimeExponentP());
                in0 in0Var4 = new in0(12, rSAPrivateCrtKey.getPrimeExponentQ());
                k7Var.f7134f = in0Var3;
                k7Var.f7135g = in0Var4;
                k7Var.f7136h = new in0(12, rSAPrivateCrtKey.getCrtCoefficient());
                return k7Var.h();
            default:
                gk1 gk1Var = (gk1) o91Var;
                sd1 sd1Var13 = jk1.f6865a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) il1.f6538f.f6540a.b("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(gk1Var.f5839a, new BigInteger(1, gk1Var.f5840b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                l91 l91Var8 = new l91(10, z5);
                l91Var8.f7465c = gk1Var;
                l91Var8.f7466d = rSAPublicKey2.getModulus();
                l91Var8.f7467e = num;
                ik1 ik1VarW = l91Var8.w();
                k7 k7Var2 = new k7(false);
                k7Var2.f7130b = ik1VarW;
                in0 in0Var5 = new in0(12, rSAPrivateCrtKey2.getPrimeP());
                in0 in0Var6 = new in0(12, rSAPrivateCrtKey2.getPrimeQ());
                k7Var2.f7132d = in0Var5;
                k7Var2.f7133e = in0Var6;
                k7Var2.f7131c = new in0(12, rSAPrivateCrtKey2.getPrivateExponent());
                in0 in0Var7 = new in0(12, rSAPrivateCrtKey2.getPrimeExponentP());
                in0 in0Var8 = new in0(12, rSAPrivateCrtKey2.getPrimeExponentQ());
                k7Var2.f7134f = in0Var7;
                k7Var2.f7135g = in0Var8;
                k7Var2.f7136h = new in0(12, rSAPrivateCrtKey2.getCrtCoefficient());
                return k7Var2.i();
        }
    }
}
