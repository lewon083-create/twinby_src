package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0072c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4 f23557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0616xk f23558c = C0382oa.k().B();

    public C0072c5(Context context, R4 r42) {
        this.f23556a = context;
        this.f23557b = r42;
    }

    public final Ve a() {
        return new Ve(this.f23558c.b(this.f23556a, this.f23557b));
    }
}
