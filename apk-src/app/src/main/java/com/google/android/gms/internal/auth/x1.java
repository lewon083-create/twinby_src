package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f13307a;

    static {
        if (w1.f13300e && w1.f13299d) {
            int i = d0.f13189a;
        }
        f13307a = new y();
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i, int i10) {
        int i11 = i10 - i;
        byte b2 = bArr[i - 1];
        if (i11 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i11 == 1) {
            byte b10 = bArr[i];
            if (b2 > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b2;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i];
        byte b12 = bArr[i + 1];
        if (b2 > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b2);
    }
}
