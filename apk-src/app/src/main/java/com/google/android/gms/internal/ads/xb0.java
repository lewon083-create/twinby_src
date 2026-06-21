package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iq0 f12099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f12100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0 f12101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nc0 f12102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sd0 f12104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bt0 f12105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kh0 f12106h;
    public final qd0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final de0 f12107j;

    public xb0(iq0 iq0Var, Executor executor, yc0 yc0Var, Context context, sd0 sd0Var, bt0 bt0Var, kh0 kh0Var, nc0 nc0Var, qd0 qd0Var, de0 de0Var) {
        this.f12099a = iq0Var;
        this.f12100b = executor;
        this.f12101c = yc0Var;
        this.f12103e = context;
        this.f12104f = sd0Var;
        this.f12105g = bt0Var;
        this.f12106h = kh0Var;
        this.f12102d = nc0Var;
        this.i = qd0Var;
        this.f12107j = de0Var;
    }

    public static final void b(sz szVar) {
        szVar.u0("/videoClicked", uo.f11014d);
        k00 k00VarQ0 = szVar.q0();
        synchronized (k00VarQ0.f7059e) {
            k00VarQ0.f7072s = true;
        }
        szVar.u0("/getNativeAdViewSignals", uo.f11023n);
        szVar.u0("/getNativeClickMeta", uo.f11024o);
    }

    public final void a(sz szVar, p9.a aVar, wv wvVar) {
        de0 de0Var;
        b(szVar);
        szVar.u0("/video", uo.f11017g);
        szVar.u0("/videoMeta", uo.f11018h);
        szVar.u0("/precache", new po(26));
        szVar.u0("/delayPageLoaded", uo.f11020k);
        szVar.u0("/instrument", uo.i);
        szVar.u0("/log", uo.f11013c);
        szVar.u0("/click", new so(0, null, null));
        if (this.f12099a.f6570b != null) {
            k00 k00VarQ0 = szVar.q0();
            synchronized (k00VarQ0.f7059e) {
                k00VarQ0.f7074u = true;
            }
            szVar.u0("/open", new bp(true != ((Boolean) q9.s.f31967e.f31970c.a(al.Te)).booleanValue() ? null : aVar, null, null, null, null, null));
        } else {
            k00 k00VarQ02 = szVar.q0();
            synchronized (k00VarQ02.f7059e) {
                k00VarQ02.f7074u = false;
            }
        }
        if (p9.k.C.f31318y.a(szVar.getContext())) {
            HashMap map = new HashMap();
            if (szVar.M() != null) {
                map = szVar.M().f12269w0;
            }
            szVar.u0("/logScionEvent", new so(1, szVar.getContext(), map));
        }
        wk wkVar = al.Te;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            szVar.q0().f7077x = aVar;
            szVar.q0().f7079z = wvVar;
        }
        if (!((Boolean) sVar.f31970c.a(al.G8)).booleanValue() || (de0Var = this.f12107j) == null) {
            return;
        }
        szVar.u0("/onDeviceStorageEvent", new ko(3, de0Var));
    }
}
