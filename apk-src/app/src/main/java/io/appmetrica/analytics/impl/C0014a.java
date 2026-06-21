package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0014a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23392a;

    public C0014a(Context context) {
        this.f23392a = context;
    }

    public final byte[] a() {
        try {
            return AbstractC0163fj.a(new StringBuilder(this.f23392a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public final byte[] b() {
        try {
            return AbstractC0163fj.a(this.f23392a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
