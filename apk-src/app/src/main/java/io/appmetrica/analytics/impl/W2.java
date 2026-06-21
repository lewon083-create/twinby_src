package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2 f23193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f23194b;

    public W2() {
        this(new V2(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            V2 v22 = this.f23193a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            v22.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f23194b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public W2(V2 v22, GZIPCompressor gZIPCompressor) {
        this.f23193a = v22;
        this.f23194b = gZIPCompressor;
    }
}
