package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd0 f10244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f10245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10246c;

    public sd0(wd0 wd0Var, gx gxVar) {
        this.f10244a = wd0Var;
        wd0Var.getClass();
        this.f10246c = new HashMap(wd0Var.f11747a);
        this.f10245b = gxVar;
    }

    public final zd1 a() {
        zd1 zd1Var = new zd1(this);
        ((ConcurrentHashMap) zd1Var.f12971c).putAll(this.f10246c);
        return zd1Var;
    }

    public final void b() {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Pc)).booleanValue()) {
            zd1 zd1VarA = a();
            zd1VarA.v("action", "pecr");
            zd1VarA.w();
        }
    }
}
