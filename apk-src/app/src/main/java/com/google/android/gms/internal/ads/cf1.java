package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends o91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4198a;

    public cf1(int i) {
        this.f4198a = i;
    }

    public static cf1 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new cf1(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.o91
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cf1) && ((cf1) obj).f4198a == this.f4198a;
    }

    public final int hashCode() {
        return Objects.hash(cf1.class, Integer.valueOf(this.f4198a));
    }

    public final String toString() {
        int i = this.f4198a;
        return l7.o.l(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
