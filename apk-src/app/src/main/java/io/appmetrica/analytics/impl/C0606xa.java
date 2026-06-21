package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0606xa implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ye f25019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Td f25020b;

    public C0606xa(@NotNull Ye ye2, @NotNull Td td2) {
        this.f25019a = ye2;
        this.f25020b = td2;
    }

    @NotNull
    public final Td a() {
        return this.f25020b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f25019a.a(this.f25020b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f25019a.a(this.f25020b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j10) {
        this.f25019a.b(this.f25020b, j10).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i) {
        this.f25019a.b(this.f25020b, i).b();
    }
}
