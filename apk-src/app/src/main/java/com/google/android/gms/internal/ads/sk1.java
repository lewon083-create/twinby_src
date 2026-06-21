package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sk1 implements p91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f10322a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    public static sk1 a(nj1 nj1Var) throws GeneralSecurityException {
        Provider providerE = c80.e();
        if (providerE == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        xo0 xo0Var = nj1Var.f8323e;
        pj1 pj1Var = nj1Var.f8322d;
        byte[] bArrB = ((sl1) xo0Var.f12221c).b();
        pj1Var.f9078f.b();
        sk1 sk1Var = new sk1();
        if (!gr.x(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrB.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerE).generatePrivate(new PKCS8EncodedKeySpec(ix.s(f10322a, bArrB)));
        return sk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.sk1 b(com.google.android.gms.internal.ads.hk1 r12) throws java.security.GeneralSecurityException {
        /*
            int r0 = com.google.android.gms.internal.ads.ge1.f5788a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2c
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = java.util.Objects.equals(r0, r2)
            r1 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L23
        L1d:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L23:
            int r0 = r0.intValue()
            r2 = 23
            if (r0 > r2) goto L2c
            goto L30
        L2c:
            java.security.Provider r1 = com.google.android.gms.internal.ads.c80.e()
        L30:
            if (r1 == 0) goto La8
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r1)
            com.google.android.gms.internal.ads.ik1 r1 = r12.f6167d
            com.google.android.gms.internal.ads.gk1 r2 = r1.f6522d
            java.security.spec.RSAPrivateCrtKeySpec r3 = new java.security.spec.RSAPrivateCrtKeySpec
            java.math.BigInteger r4 = r1.f6523e
            java.math.BigInteger r5 = r2.f5840b
            com.google.android.gms.internal.ads.in0 r6 = r12.f6168e
            java.lang.Object r6 = r6.f6553c
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            com.google.android.gms.internal.ads.in0 r7 = r12.f6169f
            java.lang.Object r7 = r7.f6553c
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            com.google.android.gms.internal.ads.in0 r8 = r12.f6170g
            java.lang.Object r8 = r8.f6553c
            java.math.BigInteger r8 = (java.math.BigInteger) r8
            com.google.android.gms.internal.ads.in0 r9 = r12.f6171h
            java.lang.Object r9 = r9.f6553c
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            com.google.android.gms.internal.ads.in0 r10 = r12.i
            java.lang.Object r10 = r10.f6553c
            java.math.BigInteger r10 = (java.math.BigInteger) r10
            com.google.android.gms.internal.ads.in0 r12 = r12.f6172j
            java.lang.Object r12 = r12.f6553c
            r11 = r12
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            java.security.PrivateKey r12 = r0.generatePrivate(r3)
            java.security.interfaces.RSAPrivateCrtKey r12 = (java.security.interfaces.RSAPrivateCrtKey) r12
            com.google.android.gms.internal.ads.sk1 r0 = new com.google.android.gms.internal.ads.sk1
            com.google.android.gms.internal.ads.ek1 r3 = r2.f5842d
            com.google.android.gms.internal.ads.ek1 r4 = r2.f5843e
            int r2 = r2.f5844f
            com.google.android.gms.internal.ads.sl1 r1 = r1.f6524f
            r1.b()
            r0.<init>()
            r1 = 2
            boolean r1 = com.google.android.gms.internal.ads.gr.x(r1)
            if (r1 == 0) goto La0
            java.math.BigInteger r1 = r12.getModulus()
            int r1 = r1.bitLength()
            com.google.android.gms.internal.ads.gr.K(r1)
            java.math.BigInteger r12 = r12.getPublicExponent()
            com.google.android.gms.internal.ads.gr.Q(r12)
            com.google.android.gms.internal.ads.al1.b(r3)
            com.google.android.gms.internal.ads.al1.c(r3, r4, r2)
            return r0
        La0:
            java.security.GeneralSecurityException r12 = new java.security.GeneralSecurityException
            java.lang.String r0 = "Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available."
            r12.<init>(r0)
            throw r12
        La8:
            java.security.NoSuchProviderException r12 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r12.<init>(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sk1.b(com.google.android.gms.internal.ads.hk1):com.google.android.gms.internal.ads.sk1");
    }
}
