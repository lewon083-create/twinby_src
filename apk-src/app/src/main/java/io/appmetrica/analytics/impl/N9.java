package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class N9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Um f22728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X2 f22729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f22730d;

    public N9(Context context, Um um, X2 x22, SafePackageManager safePackageManager) {
        this.f22727a = context;
        this.f22728b = um;
        this.f22729c = x22;
        this.f22730d = safePackageManager;
    }

    public N9(Context context) {
        this(context, new Um(context, "io.appmetrica.analytics.build_id"), new X2(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }
}
