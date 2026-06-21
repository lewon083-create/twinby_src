package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f8457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ev f8458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rv f8460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8461e;

    public nv(Context context, String str) {
        q9.o oVar = q9.r.f31959g.f31961b;
        fr frVar = new fr();
        oVar.getClass();
        ev evVar = (ev) new q9.b(oVar, context, str, frVar).d(context, false);
        this.f8461e = System.currentTimeMillis();
        new AtomicLong();
        this.f8459c = context.getApplicationContext();
        this.f8457a = new AtomicReference(str);
        this.f8458b = evVar;
        this.f8460d = new rv();
    }

    public static void b(Context context, String str, k9.g gVar, ea.b bVar) {
        pa.c0.j(context, "Context cannot be null.");
        pa.c0.j(str, "AdUnitId cannot be null.");
        pa.c0.e("#008 Must be called on the main UI thread.");
        al.a(context);
        if (((Boolean) zl.f13034k.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new aa.b(context, str, gVar, bVar, 4));
                return;
            }
        }
        u9.i.c("Loading on UI thread");
        new nv(context, str).d(gVar.f27259a, bVar);
    }

    public final k9.r a() {
        q9.y1 y1VarP = null;
        try {
            ev evVar = this.f8458b;
            if (evVar != null) {
                y1VarP = evVar.p();
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        return new k9.r(y1VarP);
    }

    public final void c(Activity activity, k9.p pVar) {
        rv rvVar = this.f8460d;
        rvVar.f10072c = pVar;
        if (activity == null) {
            u9.i.h("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ev evVar = this.f8458b;
            if (evVar != null) {
                evVar.X2(rvVar);
                evVar.c1(new xa.b(activity));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }

    public final void d(q9.f2 f2Var, ea.b bVar) {
        try {
            ev evVar = this.f8458b;
            if (evVar != null) {
                f2Var.f31854m = this.f8461e;
                evVar.R0(q9.f3.a(this.f8459c, f2Var), new ov(bVar, this, 0));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
