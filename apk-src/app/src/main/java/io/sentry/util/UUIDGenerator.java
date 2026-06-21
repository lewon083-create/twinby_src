package io.sentry.util;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class UUIDGenerator {
    public static long randomHalfLengthUUID() {
        byte[] bArr = new byte[8];
        SentryRandom.current().nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        long j10 = 0;
        for (int i = 0; i < 8; i++) {
            j10 = (j10 << 8) | ((long) (bArr[i] & 255));
        }
        return j10;
    }

    public static UUID randomUUID() {
        byte[] bArr = new byte[16];
        SentryRandom.current().nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b10 = (byte) (bArr[8] & 63);
        bArr[8] = b10;
        bArr[8] = (byte) (b10 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i = 0; i < 8; i++) {
            j11 = (j11 << 8) | ((long) (bArr[i] & 255));
        }
        for (int i10 = 8; i10 < 16; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return new UUID(j11, j10);
    }
}
