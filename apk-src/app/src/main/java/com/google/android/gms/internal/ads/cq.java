package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cq extends v9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q9.f3 f4289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q9.l0 f4290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f4291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4292e;

    public cq(Context context, String str) {
        fr frVar = new fr();
        this.f4292e = System.currentTimeMillis();
        new AtomicLong();
        this.f4288a = context;
        this.f4291d = new AtomicReference(str);
        this.f4289b = q9.f3.f31855a;
        q9.o oVar = q9.r.f31959g.f31961b;
        q9.g3 g3Var = new q9.g3();
        oVar.getClass();
        this.f4290c = (q9.l0) new q9.j(oVar, context, g3Var, str, frVar).d(context, false);
    }

    @Override // v9.a
    public final k9.r a() {
        q9.y1 y1VarB = null;
        try {
            q9.l0 l0Var = this.f4290c;
            if (l0Var != null) {
                y1VarB = l0Var.B();
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        return new k9.r(y1VarB);
    }

    @Override // v9.a
    public final void c(k9.v vVar) {
        try {
            q9.l0 l0Var = this.f4290c;
            if (l0Var != null) {
                l0Var.o3(new q9.t(vVar));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // v9.a
    public final void d(boolean z5) {
        try {
            q9.l0 l0Var = this.f4290c;
            if (l0Var != null) {
                l0Var.f1(z5);
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    @Override // v9.a
    public final void e(Activity activity) {
        if (activity == null) {
            u9.i.h("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            q9.l0 l0Var = this.f4290c;
            if (l0Var != null) {
                l0Var.C0(new xa.b(activity));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public final void f(q9.f2 f2Var, k9.v vVar) {
        try {
            q9.l0 l0Var = this.f4290c;
            if (l0Var != null) {
                f2Var.f31854m = this.f4292e;
                q9.f3 f3Var = this.f4289b;
                Context context = this.f4288a;
                f3Var.getClass();
                l0Var.R3(q9.f3.a(context, f2Var), new q9.c3(vVar, this));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
            vVar.d(new k9.m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }
}
