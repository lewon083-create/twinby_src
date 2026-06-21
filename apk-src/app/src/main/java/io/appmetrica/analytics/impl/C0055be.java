package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.be, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0055be implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23501a;

    public C0055be(@NonNull String str) {
        this.f23501a = str;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Object obj) {
        return obj == null ? new po(this, false, a0.u.o(new StringBuilder(), this.f23501a, " is null.")) : new po(this, true, "");
    }

    @NonNull
    public final String a() {
        return this.f23501a;
    }
}
