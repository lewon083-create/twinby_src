package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 implements q91 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f3306g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f3307h = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f3308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PSSParameterSpec f3310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f3312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f3313f;

    public al1(RSAPublicKey rSAPublicKey, ek1 ek1Var, ek1 ek1Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!ek1Var.equals(ek1Var2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        gr.K(rSAPublicKey.getModulus().bitLength());
        gr.Q(rSAPublicKey.getPublicExponent());
        this.f3308a = rSAPublicKey;
        this.f3309b = b(ek1Var);
        this.f3310c = c(ek1Var, ek1Var2, i);
        this.f3311d = bArr;
        this.f3312e = bArr2;
        this.f3313f = provider;
    }

    public static String b(ek1 ek1Var) {
        if (ek1Var == ek1.f4988b) {
            return "SHA256withRSA/PSS";
        }
        if (ek1Var == ek1.f4989c) {
            return "SHA384withRSA/PSS";
        }
        if (ek1Var == ek1.f4990d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(ek1Var)));
    }

    public static PSSParameterSpec c(ek1 ek1Var, ek1 ek1Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        ek1 ek1Var3 = ek1.f4990d;
        ek1 ek1Var4 = ek1.f4989c;
        ek1 ek1Var5 = ek1.f4988b;
        if (ek1Var == ek1Var5) {
            str = "SHA-256";
        } else if (ek1Var == ek1Var4) {
            str = "SHA-384";
        } else {
            if (ek1Var != ek1Var3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(ek1Var)));
            }
            str = "SHA-512";
        }
        if (ek1Var2 == ek1Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (ek1Var2 == ek1Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (ek1Var2 != ek1Var3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(ek1Var2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.al1 d(com.google.android.gms.internal.ads.ik1 r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException {
        /*
            int r0 = com.google.android.gms.internal.ads.ge1.f5788a
            java.lang.String r0 = "java.vendor"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "The Android Project"
            boolean r1 = java.util.Objects.equals(r1, r2)
            if (r1 == 0) goto L2d
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
            if (r0 > r2) goto L2d
        L2b:
            r9 = r1
            goto L32
        L2d:
            java.security.Provider r1 = com.google.android.gms.internal.ads.c80.e()
            goto L2b
        L32:
            if (r9 == 0) goto L6f
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0, r9)
            java.security.spec.RSAPublicKeySpec r1 = new java.security.spec.RSAPublicKeySpec
            java.math.BigInteger r2 = r10.f6523e
            com.google.android.gms.internal.ads.gk1 r3 = r10.f6522d
            java.math.BigInteger r4 = r3.f5840b
            r1.<init>(r2, r4)
            java.security.PublicKey r0 = r0.generatePublic(r1)
            java.security.interfaces.RSAPublicKey r0 = (java.security.interfaces.RSAPublicKey) r0
            com.google.android.gms.internal.ads.al1 r2 = new com.google.android.gms.internal.ads.al1
            com.google.android.gms.internal.ads.ek1 r4 = r3.f5842d
            com.google.android.gms.internal.ads.ek1 r5 = r3.f5843e
            int r6 = r3.f5844f
            com.google.android.gms.internal.ads.sl1 r10 = r10.f6524f
            byte[] r7 = r10.b()
            com.google.android.gms.internal.ads.fk1 r10 = r3.f5841c
            com.google.android.gms.internal.ads.fk1 r1 = com.google.android.gms.internal.ads.fk1.f5376d
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L68
            byte[] r10 = com.google.android.gms.internal.ads.al1.f3307h
        L65:
            r8 = r10
            r3 = r0
            goto L6b
        L68:
            byte[] r10 = com.google.android.gms.internal.ads.al1.f3306g
            goto L65
        L6b:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        L6f:
            java.security.NoSuchProviderException r10 = new java.security.NoSuchProviderException
            java.lang.String r0 = "RSA SSA PSS using Conscrypt is not supported."
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.al1.d(com.google.android.gms.internal.ads.ik1):com.google.android.gms.internal.ads.al1");
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f3311d;
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f3309b, this.f3313f);
        signature.initVerify(this.f3308a);
        signature.setParameter(this.f3310c);
        signature.update(bArr2);
        byte[] bArr4 = this.f3312e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
