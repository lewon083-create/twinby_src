package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Rg implements InterfaceC0124e6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0045b4 f22916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f22917c = C0382oa.k().w().d();

    public Rg(@NotNull Context context, @NotNull C0045b4 c0045b4) {
        this.f22915a = context;
        this.f22916b = c0045b4;
    }

    public final void a(@NotNull Q5 q5, @Nullable Bundle bundle) {
        if (q5.m()) {
            return;
        }
        this.f22917c.execute(new RunnableC0289kh(this.f22915a, q5, bundle, this.f22916b));
    }

    public final void a(@NotNull Q3 q32, @NotNull Q5 q5, @NotNull C0426q4 c0426q4) {
        this.f22916b.a(q32, c0426q4).a(q5, c0426q4);
        this.f22916b.a(q32.f22856b, q32.f22857c, q32.f22858d);
    }
}
