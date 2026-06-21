package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class On implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f22815a;

    public On() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.so
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C0264jh c0264jh) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(o82.f22776b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((H8) this.f22815a.f22444a.a(o82.f22788o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public On(I8 i82) {
        this.f22815a = i82;
    }

    @NonNull
    public final I8 a() {
        return this.f22815a;
    }
}
