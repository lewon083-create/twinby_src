package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s81 f3889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.l f3890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zs0 f3891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bs0 f3892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w00 f3893g;

    public bt0(Context context, gx gxVar, s81 s81Var, u9.l lVar, zs0 zs0Var, bs0 bs0Var, w00 w00Var) {
        this.f3887a = context;
        this.f3888b = gxVar;
        this.f3889c = s81Var;
        this.f3890d = lVar;
        this.f3891e = zs0Var;
        this.f3892f = bs0Var;
        this.f3893g = w00Var;
    }

    public final void a(List list, ni.i iVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), iVar, null, null);
        }
    }

    public final void b(String str, ni.i iVar, as0 as0Var, g70 g70Var) {
        ed.d dVarB;
        xr0 xr0VarK = null;
        if (bs0.a() && ((Boolean) vl.f11415d.r()).booleanValue()) {
            xr0VarK = xr0.k(this.f3887a, 14);
            xr0VarK.h();
        }
        xr0 xr0Var = xr0VarK;
        if (iVar != null) {
            dVarB = new z7((u9.h) iVar.f29407c, this.f3890d, this.f3889c, this.f3891e, this.f3893g, 9).a(str);
        } else {
            dVarB = ((gx) this.f3889c).b(new je(9, this, str));
        }
        dVarB.a(new l81(0, dVarB, new cw(this, xr0Var, as0Var, g70Var, 23)), this.f3888b);
    }
}
