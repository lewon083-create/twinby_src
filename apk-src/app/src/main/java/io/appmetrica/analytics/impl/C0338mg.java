package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0338mg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC0313lg f24375d;

    public C0338mg(byte[] bArr) {
        C0363ng c0363ngA = C0363ng.a(bArr);
        this.f24372a = c0363ngA.f24443a;
        this.f24373b = c0363ngA.f24445c;
        this.f24374c = c0363ngA.f24444b;
        this.f24375d = a(c0363ngA.f24446d);
    }

    public final byte[] a() {
        C0363ng c0363ng = new C0363ng();
        c0363ng.f24443a = this.f24372a;
        c0363ng.f24445c = this.f24373b;
        c0363ng.f24444b = this.f24374c;
        int iOrdinal = this.f24375d.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 0;
            }
        }
        c0363ng.f24446d = i;
        return MessageNano.toByteArray(c0363ng);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0338mg.class == obj.getClass()) {
            C0338mg c0338mg = (C0338mg) obj;
            if (this.f24373b == c0338mg.f24373b && this.f24374c == c0338mg.f24374c && this.f24372a.equals(c0338mg.f24372a) && this.f24375d == c0338mg.f24375d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f24372a.hashCode() * 31;
        long j10 = this.f24373b;
        int i = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f24374c;
        return this.f24375d.hashCode() + ((i + ((int) (j11 ^ (j11 >>> 32)))) * 31);
    }

    public final String toString() {
        return "ReferrerInfo{installReferrer='" + this.f24372a + "', referrerClickTimestampSeconds=" + this.f24373b + ", installBeginTimestampSeconds=" + this.f24374c + ", source=" + this.f24375d + '}';
    }

    public C0338mg(String str, long j10, long j11, EnumC0313lg enumC0313lg) {
        this.f24372a = str;
        this.f24373b = j10;
        this.f24374c = j11;
        this.f24375d = enumC0313lg;
    }

    public static EnumC0313lg a(int i) {
        if (i == 1) {
            return EnumC0313lg.f24302c;
        }
        if (i != 2) {
            return EnumC0313lg.f24301b;
        }
        return EnumC0313lg.f24303d;
    }
}
