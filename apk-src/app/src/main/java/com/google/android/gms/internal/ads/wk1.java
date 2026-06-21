package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 implements p91 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f11828g = new byte[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f11829h = {0};
    public static final byte[] i = {1, 2, 3};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RSAPrivateCrtKey f11830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q91 f11834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider f11835f;

    public wk1(RSAPrivateCrtKey rSAPrivateCrtKey, wj1 wj1Var, byte[] bArr, byte[] bArr2, q91 q91Var, Provider provider) throws GeneralSecurityException {
        if (!gr.x(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (wj1Var != wj1.f11818b && wj1Var != wj1.f11819c && wj1Var != wj1.f11820d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(wj1Var)));
        }
        gr.K(rSAPrivateCrtKey.getModulus().bitLength());
        gr.Q(rSAPrivateCrtKey.getPublicExponent());
        this.f11830a = rSAPrivateCrtKey;
        this.f11831b = xk1.b(wj1Var);
        this.f11832c = bArr;
        this.f11833d = bArr2;
        this.f11834e = q91Var;
        this.f11835f = provider;
    }
}
