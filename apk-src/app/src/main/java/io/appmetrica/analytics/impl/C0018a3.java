package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0018a3 extends N2 {
    public C0018a3(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    public final int b() {
        return this.f22708a;
    }

    @Override // io.appmetrica.analytics.impl.Kn
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f22708a;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f22710c.warning("\"%s\" %s exceeded limit of %d bytes", this.f22709b, bArr, Integer.valueOf(this.f22708a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    public final String a() {
        return this.f22709b;
    }
}
