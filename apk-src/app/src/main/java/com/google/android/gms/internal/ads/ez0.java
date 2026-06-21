package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz0 f5151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5152c;

    public /* synthetic */ ez0(fz0 fz0Var, int i) {
        this.f5151b = fz0Var;
        this.f5152c = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.f5152c - 1;
        fz0 fz0Var = this.f5151b;
        if (i == 1) {
            return (cz0) fz0Var.f5522a.j();
        }
        if (i == 2) {
            return (cz0) fz0Var.f5523b.j();
        }
        if (i == 3) {
            return (cz0) fz0Var.f5524c.j();
        }
        fz0Var.getClass();
        throw new IllegalArgumentException();
    }
}
