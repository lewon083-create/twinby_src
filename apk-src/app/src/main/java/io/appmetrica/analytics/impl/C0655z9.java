package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0655z9 implements ExecutorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0267jk f25112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f25113b;

    public C0655z9() {
        C0267jk c0267jkW = C0382oa.k().w();
        this.f25112a = c0267jkW;
        this.f25113b = c0267jkW.b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f25112a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final InterruptionSafeThread getInterruptionThread(@NotNull String str, @NotNull String str2, @NotNull Runnable runnable) {
        StringBuilder sbK = pe.a.k(str + '-' + str2, "-");
        sbK.append(ThreadFactoryC0659zd.f25117a.incrementAndGet());
        return new InterruptionSafeThread(runnable, sbK.toString());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getModuleExecutor() {
        return this.f25113b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getReportRunnableExecutor() {
        return this.f25112a.d();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final IHandlerExecutor getSupportIOExecutor() {
        C0267jk c0267jk = this.f25112a;
        if (c0267jk.f24183f == null) {
            synchronized (c0267jk) {
                try {
                    if (c0267jk.f24183f == null) {
                        c0267jk.f24178a.getClass();
                        HandlerThreadC0104db handlerThreadC0104dbA = A9.a("IAA-SIO");
                        c0267jk.f24183f = new A9(handlerThreadC0104dbA, handlerThreadC0104dbA.getLooper(), new Handler(handlerThreadC0104dbA.getLooper()));
                    }
                } finally {
                }
            }
        }
        return c0267jk.f24183f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    @NotNull
    public final Executor getUiExecutor() {
        C0267jk c0267jk = this.f25112a;
        if (c0267jk.f24185h == null) {
            synchronized (c0267jk) {
                try {
                    if (c0267jk.f24185h == null) {
                        c0267jk.f24178a.getClass();
                        c0267jk.f24185h = new ExecutorC0216hk(new Handler(Looper.getMainLooper()));
                    }
                } finally {
                }
            }
        }
        return c0267jk.f24185h;
    }
}
