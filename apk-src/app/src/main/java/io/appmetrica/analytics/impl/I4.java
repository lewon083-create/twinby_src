package io.appmetrica.analytics.impl;

import io.sentry.protocol.SentryThread;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class I4 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22441b;

    public I4(@NotNull R4 r42) {
        this.f22440a = String.format("component_%s.db", Arrays.copyOf(new Object[]{r42.d() ? SentryThread.JsonKeys.MAIN : r42.b()}, 1));
        this.f22441b = "db_metrica_" + r42;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String a() {
        return this.f22441b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    @NotNull
    public final String b() {
        return this.f22440a;
    }
}
