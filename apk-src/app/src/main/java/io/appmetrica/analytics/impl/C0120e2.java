package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0120e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0208hc f23722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f23723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23725d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f23726e = new a0.d1(27, this);

    public C0120e2(C0208hc c0208hc, IHandlerExecutor iHandlerExecutor, long j10) {
        this.f23722a = c0208hc;
        this.f23723b = iHandlerExecutor;
        this.f23724c = j10;
    }

    public static final void a(C0120e2 c0120e2) {
        C0234ic c0234ic = c0120e2.f23722a.f23984a;
        C0564vi c0564vi = c0234ic.f22486h;
        c0564vi.f24913c.a(c0234ic.f22480b.f22438a);
    }
}
