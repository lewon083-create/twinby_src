package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class C0295kn implements InterfaceC0292kk, InterfaceC0580w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fa f24252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Jl f24253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f24254c = new AtomicBoolean(false);

    public C0295kn(@NotNull Fa fa, @NotNull Jl jl2) {
        this.f24252a = fa;
        this.f24253b = jl2;
        Objects.toString(fa.b());
    }

    public void a() {
    }

    public final void b() {
        if (this.f24254c.get()) {
            return;
        }
        g();
    }

    public final void c() {
        if (this.f24254c.get()) {
            return;
        }
        f();
        a();
    }

    @NotNull
    public final Fa d() {
        return this.f24252a;
    }

    public final boolean e() {
        return this.f24254c.get();
    }

    public void f() {
        this.f24253b.a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onCreate() {
        this.f24254c.compareAndSet(true, false);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0292kk
    public final void onDestroy() {
        if (this.f24254c.compareAndSet(false, true)) {
            a();
        }
    }

    public final void a(@NotNull NetworkTask networkTask) {
        C0382oa.I.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public void g() {
    }
}
