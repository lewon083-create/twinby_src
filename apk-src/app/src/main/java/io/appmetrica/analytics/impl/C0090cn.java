package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0090cn implements Kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Kn f23640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23641b;

    public C0090cn(@NonNull Kn kn, Object obj) {
        this.f23640a = kn;
        this.f23641b = obj;
    }

    @Override // io.appmetrica.analytics.impl.Kn
    public final Object a(Object obj) {
        return obj != this.f23640a.a(obj) ? this.f23641b : obj;
    }
}
