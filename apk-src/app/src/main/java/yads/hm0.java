package yads;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hm0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hm0 f39240c = new hm0(1, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCznqFqHos01bT613or9cQ8OWXEB0nvx8UZ//V75T+fb1IDn1/lPBwGY/OK5RfQYuqeIKoKasqfwtRo3sr8dJ+SDm29Brh3lV9r+apohla+GIAyYd5wcJugMfVH5z9SBxh19ukg+GiIvvDpmgi0M8gNVo6Nk21tkEgFxc9FfdT/HwIDAQAB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39242b;

    public hm0(int i, String str) {
        this.f39241a = str;
        this.f39242b = i;
    }

    public final String a() {
        return this.f39241a;
    }

    public final int b() {
        return this.f39242b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm0)) {
            return false;
        }
        hm0 hm0Var = (hm0) obj;
        return Intrinsics.a(this.f39241a, hm0Var.f39241a) && this.f39242b == hm0Var.f39242b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39242b) + (this.f39241a.hashCode() * 31);
    }

    public final String toString() {
        return "EncryptionParameters(publicKey=" + this.f39241a + ", version=" + this.f39242b + ")";
    }
}
