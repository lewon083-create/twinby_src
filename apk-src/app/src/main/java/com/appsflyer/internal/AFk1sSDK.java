package com.appsflyer.internal;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class AFk1sSDK {
    public static long[] getCurrencyIso4217Code(int i, int i10) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i10) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
        for (int i11 = 1; i11 < 4; i11++) {
            long j10 = jArr[i11 - 1];
            jArr[i11] = ((j10 ^ (j10 >> 30)) * 1812433253) + ((long) i11);
        }
        return jArr;
    }
}
