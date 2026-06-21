package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class U4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f23059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23060b = "[ComponentMigrationToV113]";

    public U4(Y4 y42) {
        this.f23059a = y42;
    }

    @NotNull
    public final Y4 a() {
        return this.f23059a;
    }

    @NotNull
    public final String b() {
        return this.f23060b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }
}
