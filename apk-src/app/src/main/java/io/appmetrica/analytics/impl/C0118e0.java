package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0118e0 implements Bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0144f0 f23718a;

    public C0118e0(C0144f0 c0144f0) {
        this.f23718a = c0144f0;
    }

    @Override // io.appmetrica.analytics.impl.Bn
    @NotNull
    public final Thread a() {
        return this.f23718a.f23824b;
    }

    @Override // io.appmetrica.analytics.impl.Bn
    @Nullable
    public final StackTraceElement[] b() {
        C0144f0 c0144f0 = this.f23718a;
        return (StackTraceElement[]) c0144f0.f23823a.get(c0144f0.f23824b);
    }

    @Override // io.appmetrica.analytics.impl.Bn
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.f23718a.f23823a;
    }
}
