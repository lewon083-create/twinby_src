package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class D8 implements so {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f22245a;

    public D8() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.so
    @NonNull
    public final byte[] a(@NonNull O8 o82, @NonNull C0264jh c0264jh) {
        String str = o82.f22776b;
        return ((H8) this.f22245a.f22444a.a(o82.f22788o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public D8(I8 i82) {
        this.f22245a = i82;
    }
}
