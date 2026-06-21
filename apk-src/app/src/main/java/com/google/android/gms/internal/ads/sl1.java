package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10334a;

    public sl1(int i, byte[] bArr) {
        byte[] bArr2 = new byte[i];
        this.f10334a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static sl1 a(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        int length2 = bArr.length;
        if (length > length2) {
            length = length2;
        }
        return new sl1(length, bArr);
    }

    public final byte[] b() {
        byte[] bArr = this.f10334a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl1) {
            return Arrays.equals(((sl1) obj).f10334a, this.f10334a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10334a);
    }

    public final String toString() {
        byte[] bArr = this.f10334a;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b2 : bArr) {
            sb2.append("0123456789abcdef".charAt((b2 & 255) >> 4));
            sb2.append("0123456789abcdef".charAt(b2 & 15));
        }
        String string = sb2.toString();
        return t.z.g(new StringBuilder(string.length() + 7), "Bytes(", string, ")");
    }
}
