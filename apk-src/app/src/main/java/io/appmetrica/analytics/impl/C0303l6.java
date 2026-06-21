package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0303l6 implements Ga {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f24273a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ga
    public final void a(@Nullable Throwable th2, @NotNull V v5) {
        Iterator it = this.f24273a.iterator();
        while (it.hasNext()) {
            ((Ga) it.next()).a(th2, v5);
        }
    }

    public final void a(@NotNull Ga... gaArr) {
        kotlin.collections.x.n(this.f24273a, gaArr);
    }

    public final void a(@NotNull List<? extends Ga> list) {
        this.f24273a.addAll(list);
    }

    public final void a() {
        this.f24273a.clear();
    }
}
