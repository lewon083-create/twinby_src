package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec f22948a;

    public S7() {
        Ec ec = new Ec(0);
        ec.a(T7.f23004b, 0);
        ec.a(T7.f23005c, 1);
        ec.a(T7.f23006d, 2);
        ec.a(T7.f23007e, 3);
        this.f22948a = ec;
    }

    @NotNull
    public final Ec a() {
        return this.f22948a;
    }

    public abstract boolean a(Object obj, Object obj2);
}
