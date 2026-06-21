package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f0 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g0 f25475a;

    public f0(g0 g0Var) {
        this.f25475a = g0Var;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int i = e0.f25474a[activityEvent.ordinal()];
        try {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.f25475a.f25479d = true;
                return;
            }
            C0683n c0683n = this.f25475a.f25480e;
            if (c0683n == null || !c0683n.f25502a) {
                return;
            }
            this.f25475a.f25479d = false;
            g0 g0Var = this.f25475a;
            g0Var.f25478c.postDelayed(g0Var.f25481f, 0L);
        } catch (Throwable unused) {
        }
    }
}
