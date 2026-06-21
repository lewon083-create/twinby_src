package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zj implements ServiceComponentModuleReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f23389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0491sk f23390b;

    public Zj(@NotNull Y4 y42, @NotNull C0491sk c0491sk) {
        this.f23389a = y42;
        this.f23390b = c0491sk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(@NotNull ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f23390b.getClass();
        this.f23389a.a(C0491sk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ Zj(Y4 y42, C0491sk c0491sk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(y42, (i & 2) != 0 ? new C0491sk() : c0491sk);
    }
}
