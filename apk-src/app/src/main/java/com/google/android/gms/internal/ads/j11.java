package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6676a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f6678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j21 f6679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f6680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6683h;

    public j11(Context context, js1 js1Var, m11 m11Var, j21 j21Var, ExecutorService executorService, b11 b11Var, dv0 dv0Var) {
        this.f6677b = context;
        this.f6680e = js1Var;
        this.f6681f = m11Var;
        this.f6679d = j21Var;
        this.f6678c = executorService;
        this.f6682g = b11Var;
        this.f6683h = dv0Var;
    }

    public static zy0 a(int i) {
        yy0 yy0VarC = zy0.C();
        yy0VarC.b();
        ((zy0) yy0VarC.f9560c).H(i);
        return (zy0) yy0VarC.d();
    }

    public static zy0 b(int i) {
        yy0 yy0VarC = zy0.C();
        yy0VarC.b();
        ((zy0) yy0VarC.f9560c).H(i);
        return (zy0) yy0VarC.d();
    }

    public j11(Context context, ExecutorService executorService, ux0 ux0Var, ey0 ey0Var, j21 j21Var, l11 l11Var) {
        this.f6677b = context;
        this.f6678c = executorService;
        this.f6680e = ey0Var;
        this.f6679d = j21Var;
        this.f6683h = l11Var;
        this.f6681f = ux0Var.F();
        this.f6682g = ux0Var.L().B();
    }
}
