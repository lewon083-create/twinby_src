package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0562vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f24905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Sa f24906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ec f24907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24910g;

    public C0562vg(Context context, SafePackageManager safePackageManager, Sa sa) {
        this.f24904a = context;
        this.f24905b = safePackageManager;
        this.f24906c = sa;
        Ec ec = new Ec(0);
        ec.a(EnumC0313lg.f24303d, 1);
        ec.a(EnumC0313lg.f24302c, 2);
        this.f24907d = ec;
        this.f24908e = TimeUnit.DAYS.toSeconds(1L);
        this.f24909f = "com.android.vending";
        this.f24910g = "com.huawei.appmarket";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.appmetrica.analytics.impl.C0338mg a(java.util.List r14) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C0562vg.a(java.util.List):io.appmetrica.analytics.impl.mg");
    }

    public /* synthetic */ C0562vg(Context context) {
        this(context, new SafePackageManager(), AbstractC0622y1.a());
    }

    public static final int a(C0562vg c0562vg, C0338mg c0338mg, C0338mg c0338mg2) {
        int iSignum = Long.signum(c0338mg.f24374c - c0338mg2.f24374c);
        return iSignum == 0 ? ((Number) c0562vg.f24907d.a(c0338mg.f24375d)).intValue() - ((Number) c0562vg.f24907d.a(c0338mg2.f24375d)).intValue() : iSignum;
    }
}
