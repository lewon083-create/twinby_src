package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b91 extends p81 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3685d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c91 f3686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3687f;

    public b91(c91 c91Var, y71 y71Var) {
        this.f3686e = c91Var;
        this.f3687f = y71Var;
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final Object a() {
        switch (this.f3685d) {
            case 0:
                y71 y71Var = (y71) this.f3687f;
                ed.d dVarH = y71Var.h();
                if (dVarH != null) {
                    return dVarH;
                }
                throw new NullPointerException(gr.P("AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", y71Var));
            default:
                return ((Callable) this.f3687f).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final String c() {
        switch (this.f3685d) {
            case 0:
                return ((y71) this.f3687f).toString();
            default:
                return ((Callable) this.f3687f).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final boolean d() {
        switch (this.f3685d) {
        }
        return this.f3686e.isDone();
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void e(Object obj) {
        switch (this.f3685d) {
            case 0:
                this.f3686e.n((ed.d) obj);
                break;
            default:
                this.f3686e.e(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p81
    public final void f(Throwable th2) {
        switch (this.f3685d) {
            case 0:
                this.f3686e.f(th2);
                break;
            default:
                this.f3686e.f(th2);
                break;
        }
    }

    public b91(c91 c91Var, Callable callable) {
        this.f3686e = c91Var;
        callable.getClass();
        this.f3687f = callable;
    }
}
