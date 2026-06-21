package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d81 extends p81 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f4495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e81 f4496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Callable f4497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e81 f4498g;

    public d81(e81 e81Var, Callable callable, Executor executor) {
        this.f4498g = e81Var;
        this.f4496e = e81Var;
        executor.getClass();
        this.f4495d = executor;
        this.f4497f = callable;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final Object a() {
        return this.f4497f.call();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final String c() {
        return this.f4497f.toString();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final boolean d() {
        return this.f4496e.isDone();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void e(Object obj) {
        this.f4496e.f4874q = null;
        this.f4498g.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void f(Throwable th2) {
        e81 e81Var = this.f4496e;
        e81Var.f4874q = null;
        if (th2 instanceof ExecutionException) {
            e81Var.f(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            e81Var.cancel(false);
        } else {
            e81Var.f(th2);
        }
    }
}
