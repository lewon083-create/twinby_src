package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class F3 extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ye f22316a;

    public F3(@NotNull Ye ye2) {
        super(ye2.e(), "[ClientApiTrackingStatusToggle]");
        this.f22316a = ye2;
    }

    public final void a(boolean z5) {
        updateState(z5);
        this.f22316a.f(z5);
    }
}
