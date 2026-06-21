package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0191gl implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f23942a;

    public C0191gl(@NonNull C0646z0 c0646z0) {
        this.f23942a = c0646z0;
    }

    @Override // io.appmetrica.analytics.impl.ro
    public final po a(Void r32) {
        this.f23942a.getClass();
        return C0646z0.a() ? new po(this, true, "") : new po(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    public final po a() {
        return a((Void) null);
    }
}
