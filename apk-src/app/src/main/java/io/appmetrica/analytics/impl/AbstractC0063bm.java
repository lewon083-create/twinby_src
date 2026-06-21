package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0063bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f23522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f23523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final D3 f23524c;

    static {
        String[] elements = {"appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f23522a = kotlin.collections.p.w(elements);
        f23523b = new SystemTimeProvider();
        f23524c = new D3();
    }

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(io.appmetrica.analytics.impl.C0140em r5, java.util.Collection r6, java.util.Map r7, kotlin.jvm.functions.Function0 r8) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.AbstractC0063bm.a(io.appmetrica.analytics.impl.em, java.util.Collection, java.util.Map, kotlin.jvm.functions.Function0):boolean");
    }
}
