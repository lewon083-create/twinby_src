package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0360nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0646z0 f24429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0157fd f24430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0534ud f24431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f24432d;

    public C0360nd() {
        C0646z0 c0646z0D = C0071c4.l().d();
        this.f24429a = c0646z0D;
        this.f24430b = new C0157fd(c0646z0D);
        this.f24431c = new C0534ud();
        this.f24432d = C0071c4.l().g().a();
    }

    public static final Ja a(C0360nd c0360nd) {
        c0360nd.f24429a.getClass();
        C0621y0 c0621y0 = C0621y0.f25055e;
        Intrinsics.b(c0621y0);
        C0284kc c0284kcI = c0621y0.f().i();
        Intrinsics.b(c0284kcI);
        return c0284kcI.f24229a;
    }
}
