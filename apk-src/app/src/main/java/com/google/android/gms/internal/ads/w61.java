package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f11680a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < 10; i++) {
            bArr[i + 48] = (byte) i;
        }
        for (int i10 = 0; i10 < 26; i10++) {
            byte b2 = (byte) (i10 + 10);
            bArr[i10 + 65] = b2;
            bArr[i10 + 97] = b2;
        }
        f11680a = bArr;
    }
}
