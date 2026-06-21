package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Ln implements InterfaceC0070c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final InterfaceC0070c3 f22636b;

    public Ln(Object obj, @NonNull InterfaceC0070c3 interfaceC0070c3) {
        this.f22635a = obj;
        this.f22636b = interfaceC0070c3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0070c3
    public final int getBytesTruncated() {
        return this.f22636b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.f22635a + ", metaInfo=" + this.f22636b + '}';
    }
}
