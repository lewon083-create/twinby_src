package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xk1 implements q91 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f12186f = new byte[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f12187g = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPublicKey f12188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f12190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f12191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider f12192e;

    public xk1(RSAPublicKey rSAPublicKey, wj1 wj1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        gr.K(rSAPublicKey.getModulus().bitLength());
        gr.Q(rSAPublicKey.getPublicExponent());
        this.f12188a = rSAPublicKey;
        this.f12189b = b(wj1Var);
        this.f12190c = bArr;
        this.f12191d = bArr2;
        this.f12192e = provider;
    }

    public static String b(wj1 wj1Var) throws GeneralSecurityException {
        if (wj1Var == wj1.f11818b) {
            return "SHA256withRSA";
        }
        if (wj1Var == wj1.f11819c) {
            return "SHA384withRSA";
        }
        if (wj1Var == wj1.f11820d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    public static xk1 c(bk1 bk1Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = bk1Var.f3805e;
        yj1 yj1Var = bk1Var.f3804d;
        return new xk1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, yj1Var.f12637b)), yj1Var.f12639d, bk1Var.f3806f.b(), yj1Var.f12638c.equals(xj1.f12172d) ? f12187g : f12186f, provider);
    }

    @Override // com.google.android.gms.internal.ads.q91
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f12190c;
        if (!ge1.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f12189b, this.f12192e);
        signature.initVerify(this.f12188a);
        signature.update(bArr2);
        byte[] bArr4 = this.f12191d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
