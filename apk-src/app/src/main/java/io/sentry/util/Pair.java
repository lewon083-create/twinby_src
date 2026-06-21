package io.sentry.util;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Pair<A, B> {

    @Nullable
    private final A first;

    @Nullable
    private final B second;

    public Pair(@Nullable A a10, @Nullable B b2) {
        this.first = a10;
        this.second = b2;
    }

    @Nullable
    public A getFirst() {
        return this.first;
    }

    @Nullable
    public B getSecond() {
        return this.second;
    }
}
