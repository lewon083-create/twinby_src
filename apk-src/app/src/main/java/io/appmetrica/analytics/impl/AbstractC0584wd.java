package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0584wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static C0630y9 f24976a;

    public static final synchronized C0630y9 a(Context context) {
        C0630y9 c0630y9;
        c0630y9 = f24976a;
        if (c0630y9 == null) {
            c0630y9 = new C0630y9(context, "uuid.dat");
            f24976a = c0630y9;
        }
        return c0630y9;
    }
}
