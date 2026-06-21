package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Zc implements ModuleSelfReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pj f23382a = AbstractC0622y1.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23383b = 4;

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable Throwable th2) {
        Pj pj2 = this.f23382a;
        pj2.getClass();
        pj2.a(new C0391oj(str, th2));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str) {
        Pj pj2 = this.f23382a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f23383b).withName(str).build();
        pj2.getClass();
        pj2.a(new Ej(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportError(@NotNull String str, @Nullable String str2) {
        this.f23382a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable Map<String, ? extends Object> map) {
        Pj pj2 = this.f23382a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f23383b).withName(str).withAttributes(map).build();
        pj2.getClass();
        pj2.a(new Ej(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(@NotNull String str, @Nullable String str2) {
        Pj pj2 = this.f23382a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(this.f23383b).withName(str).withValue(str2).build();
        pj2.getClass();
        pj2.a(new Ej(moduleEventBuild));
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter
    public final void reportEvent(int i, @NotNull String str, @Nullable String str2) {
        Pj pj2 = this.f23382a;
        ModuleEvent moduleEventBuild = ModuleEvent.newBuilder(i).withName(str).withValue(str2).build();
        pj2.getClass();
        pj2.a(new Ej(moduleEventBuild));
    }
}
