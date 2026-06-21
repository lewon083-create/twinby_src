package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0673d implements T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f25468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f25469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C0679j f25470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ij.g f25471d = ij.h.b(new C0670a(this));

    public C0673d(@NotNull ClientContext clientContext, @NotNull U u4) {
        this.f25468a = clientContext;
        this.f25469b = u4;
    }

    public static final Activity.ScreenCaptureCallback d(C0673d c0673d) {
        return h6.e.e(c0673d.f25471d.getValue());
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a(@Nullable C0682m c0682m) {
        this.f25470c = c0682m != null ? c0682m.f25499a : null;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }

    @Override // io.appmetrica.analytics.screenshot.impl.T
    public final void a() {
        if (AndroidUtils.isApiAchieved(34)) {
            this.f25468a.getActivityLifecycleRegistry().registerListener(new C0672c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
        }
    }
}
