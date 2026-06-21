package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class dk1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BigInteger f4589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BigInteger f4590h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f4591a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f4592b = gk1.f5838g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ek1 f4593c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ek1 f4594d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f4595e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fk1 f4596f = fk1.f5377e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f4589g = bigIntegerValueOf;
        f4590h = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.f4591a = Integer.valueOf(i);
    }

    public final void b(int i) throws GeneralSecurityException {
        if (i < 0) {
            throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
        }
        this.f4595e = Integer.valueOf(i);
    }

    public final gk1 c() throws GeneralSecurityException {
        Integer num = this.f4591a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f4592b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f4593c == null) {
            throw new GeneralSecurityException("signature hash type is not set");
        }
        if (this.f4594d == null) {
            throw new GeneralSecurityException("mgf1 hash type is not set");
        }
        if (this.f4596f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (this.f4595e == null) {
            throw new GeneralSecurityException("salt length is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f4591a, 2048));
        }
        if (this.f4593c != this.f4594d) {
            throw new GeneralSecurityException("MGF1 hash is different from signature hash");
        }
        BigInteger bigInteger = this.f4592b;
        int iCompareTo = bigInteger.compareTo(gk1.f5838g);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f4589g).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f4590h) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new gk1(this.f4591a.intValue(), this.f4592b, this.f4596f, this.f4593c, this.f4594d, this.f4595e.intValue());
    }
}
