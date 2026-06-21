package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vj1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BigInteger f11394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BigInteger f11395f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f11396a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BigInteger f11397b = yj1.f12635e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wj1 f11398c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xj1 f11399d = xj1.f12173e;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        f11394e = bigIntegerValueOf;
        f11395f = bigIntegerValueOf.pow(256);
    }

    public final void a(int i) {
        this.f11396a = Integer.valueOf(i);
    }

    public final yj1 b() throws GeneralSecurityException {
        Integer num = this.f11396a;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.f11397b == null) {
            throw new GeneralSecurityException("publicExponent is not set");
        }
        if (this.f11398c == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f11399d == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 2048) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f11396a));
        }
        BigInteger bigInteger = this.f11397b;
        int iCompareTo = bigInteger.compareTo(yj1.f12635e);
        if (iCompareTo != 0) {
            if (iCompareTo < 0) {
                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
            }
            if (bigInteger.mod(f11394e).equals(BigInteger.ZERO)) {
                throw new InvalidAlgorithmParameterException("Invalid public exponent");
            }
            if (bigInteger.compareTo(f11395f) > 0) {
                throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
            }
        }
        return new yj1(this.f11396a.intValue(), this.f11397b, this.f11399d, this.f11398c);
    }
}
