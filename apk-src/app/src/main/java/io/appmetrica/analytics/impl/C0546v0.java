package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0546v0 implements Ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f24861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f24862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0148f4 f24863c;

    public C0546v0() {
        IHandlerExecutor iHandlerExecutorA = C0071c4.l().g().a();
        this.f24862b = iHandlerExecutorA;
        this.f24861a = iHandlerExecutorA.getHandler();
        this.f24863c = new C0148f4();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(AppMetricaConfig appMetricaConfig, @NonNull Ua ua2) {
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final Handler b() {
        return this.f24861a;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final T1 c() {
        return new T1();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C0308lb d() {
        return new C0308lb();
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f24862b;
    }

    @Override // io.appmetrica.analytics.impl.Ca
    @NonNull
    public final C0148f4 a() {
        return this.f24863c;
    }
}
