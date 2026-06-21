package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jc0 implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.i f6810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f6811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd0 f6812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kh0 f6813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f6814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xe f6815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u9.a f6816h;
    public final bt0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ph0 f6817j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jq0 f6818k;

    public jc0(Context context, Executor executor, xe xeVar, u9.a aVar, l6.i iVar, kh0 kh0Var, bt0 bt0Var, sd0 sd0Var, ph0 ph0Var, jq0 jq0Var) {
        this.f6811c = context;
        this.f6814f = executor;
        this.f6815g = xeVar;
        this.f6816h = aVar;
        this.f6810b = iVar;
        this.f6813e = kh0Var;
        this.i = bt0Var;
        this.f6812d = sd0Var;
        this.f6817j = ph0Var;
        this.f6818k = jq0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        kc0 kc0Var = new kc0(this);
        synchronized (kc0Var) {
            String str = (String) q9.s.f31967e.f31970c.a(al.f3238v4);
            xe xeVar = kc0Var.f7189f;
            l6.i iVar = kc0Var.f7185b;
            ph0 ph0Var = kc0Var.f7193k;
            s71 s71VarK = vv.K(vv.E(new zz(kc0Var.f7186c, xeVar, kc0Var.f7190g, iVar, ph0Var, kc0Var.f7194l, kc0Var.f7187d, str), hx.f6284f), new ju(1, kc0Var), kc0Var.f7188e);
            kc0Var.f7195m = s71VarK;
            ix.m(s71VarK, "NativeJavascriptExecutor.initializeEngine");
        }
        return kc0Var;
    }
}
