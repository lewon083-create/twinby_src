package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0144f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f23824b = Looper.getMainLooper().getThread();

    public C0144f0(InterfaceC0170g0 interfaceC0170g0, Map map) {
        this.f23823a = map;
    }
}
