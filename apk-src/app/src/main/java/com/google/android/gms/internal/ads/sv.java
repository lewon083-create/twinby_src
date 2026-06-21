package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ev f10402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rv f10404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10405e = System.currentTimeMillis();

    public sv(Context context, String str) {
        new AtomicLong();
        this.f10401a = str;
        this.f10403c = context.getApplicationContext();
        q9.o oVar = q9.r.f31959g.f31961b;
        fr frVar = new fr();
        oVar.getClass();
        this.f10402b = (ev) new q9.b(oVar, context, str, frVar).d(context, false);
        this.f10404d = new rv();
    }

    public static void b(Context context, String str, k9.g gVar, ea.b bVar) {
        pa.c0.j(context, "Context cannot be null.");
        pa.c0.j(str, "AdUnitId cannot be null.");
        pa.c0.e("#008 Must be called on the main UI thread.");
        al.a(context);
        if (((Boolean) zl.f13034k.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new aa.b(context, str, gVar, bVar, 6));
                return;
            }
        }
        new sv(context, str).d(gVar.f27259a, bVar);
    }

    public final k9.r a() {
        q9.y1 y1VarP = null;
        try {
            ev evVar = this.f10402b;
            if (evVar != null) {
                y1VarP = evVar.p();
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
        return new k9.r(y1VarP);
    }

    public final void c(Activity activity, k9.p pVar) {
        rv rvVar = this.f10404d;
        rvVar.f10072c = pVar;
        try {
            ev evVar = this.f10402b;
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
            ev evVar = this.f10402b;
            if (evVar != null) {
                f2Var.f31854m = this.f10405e;
                evVar.n1(q9.f3.a(this.f10403c, f2Var), new ov(bVar, this, 1));
            }
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
