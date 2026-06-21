package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0494sn implements TempCacheStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TempCacheStorage f24747a;

    public C0494sn(@NotNull Context context, @NotNull Rm rm, @NotNull TempCacheStorage tempCacheStorage) {
        this.f24747a = tempCacheStorage;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        return this.f24747a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j10, @NotNull byte[] bArr) {
        return this.f24747a.put(str, j10, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j10) {
        this.f24747a.remove(j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j10) {
        this.f24747a.removeOlderThan(str, j10);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    public final Collection<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        return this.f24747a.get(str, i);
    }
}
