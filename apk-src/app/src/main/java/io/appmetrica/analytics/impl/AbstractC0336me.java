package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0336me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24362a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24363b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24364c = 1;

    public final int a(@Nullable Boolean bool) {
        if (bool == null) {
            return this.f24362a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f24363b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f24364c;
        }
        throw new ij.j();
    }

    @Nullable
    public final Boolean a(int i) {
        if (i == this.f24363b) {
            return Boolean.FALSE;
        }
        if (i == this.f24364c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
