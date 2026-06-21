package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class th extends ip1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MessageDigest f10602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10604f;

    public th(int i) {
        super(2);
        int i10 = i >> 3;
        this.f10603e = (i & 7) > 0 ? i10 + 1 : i10;
        this.f10604f = i;
    }

    public final byte[] F1(String str) {
        synchronized (this.f6568b) {
            try {
                MessageDigest messageDigestQ = Q();
                this.f10602d = messageDigestQ;
                if (messageDigestQ == null) {
                    return new byte[0];
                }
                messageDigestQ.reset();
                this.f10602d.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.f10602d.digest();
                int length = bArrDigest.length;
                int i = this.f10603e;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i10 = this.f10604f & 7;
                if (i10 > 0) {
                    long j10 = 0;
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 > 0) {
                            j10 <<= 8;
                        }
                        j10 += (long) (bArr[i11] & 255);
                    }
                    long j11 = j10 >>> (8 - i10);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
