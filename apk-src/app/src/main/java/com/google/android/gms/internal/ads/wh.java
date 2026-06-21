package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zh f11808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f11809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xh f11810c = new xh("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    public wh(zh zhVar, String str) {
        new AtomicLong();
        this.f11808a = zhVar;
        this.f11809b = new AtomicReference(str);
    }

    public static void b(Context context, String str, k9.g gVar, ea.b bVar) {
        pa.c0.j(context, "Context cannot be null.");
        pa.c0.j(str, "adUnitId cannot be null.");
        pa.c0.e("#008 Must be called on the main UI thread.");
        al.a(context);
        if (((Boolean) zl.f13028d.r()).booleanValue()) {
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3216tc)).booleanValue()) {
                u9.b.f34371b.execute(new aa.b(context, str, gVar, bVar, 9));
                return;
            }
        }
        new k7(context, str, gVar.f27259a, bVar).b();
    }

    public final k9.r a() {
        q9.y1 y1VarK;
        try {
            y1VarK = this.f11808a.k();
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
            y1VarK = null;
        }
        return new k9.r(y1VarK);
    }

    public final void c(Activity activity) {
        try {
            this.f11808a.v3(new xa.b(activity), this.f11810c);
        } catch (RemoteException e3) {
            u9.i.k("#007 Could not call remote method.", e3);
        }
    }
}
