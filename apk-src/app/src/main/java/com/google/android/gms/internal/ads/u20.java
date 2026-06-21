package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u20 implements t60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10794c;

    public /* synthetic */ u20(int i, Object obj) {
        this.f10793b = i;
        this.f10794c = obj;
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void a(Context context) {
        switch (this.f10793b) {
            case 0:
                try {
                    try {
                        ((pq0) this.f10794c).f9154a.f();
                        return;
                    } catch (Throwable th2) {
                        throw new kq0(th2);
                    }
                } catch (kq0 e3) {
                    u9.i.i("Cannot invoke onDestroy for the mediation adapter.", e3);
                    return;
                }
            default:
                sz szVar = (sz) this.f10794c;
                if (szVar != null) {
                    szVar.destroy();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void j(Context context) {
        switch (this.f10793b) {
            case 0:
                try {
                    try {
                        ((pq0) this.f10794c).f9154a.e();
                        return;
                    } catch (Throwable th2) {
                        throw new kq0(th2);
                    }
                } catch (kq0 e3) {
                    u9.i.i("Cannot invoke onPause for the mediation adapter.", e3);
                    return;
                }
            default:
                sz szVar = (sz) this.f10794c;
                if (szVar != null) {
                    szVar.onPause();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.t60
    public final void r(Context context) {
        kq0 kq0Var;
        switch (this.f10793b) {
            case 0:
                try {
                    try {
                        kr krVar = ((pq0) this.f10794c).f9154a;
                        krVar.p();
                        if (context != null) {
                            try {
                                krVar.m0(new xa.b(context));
                                return;
                            } finally {
                            }
                        }
                        return;
                    } finally {
                    }
                } catch (kq0 e3) {
                    u9.i.i("Cannot invoke onResume for the mediation adapter.", e3);
                    return;
                }
            default:
                sz szVar = (sz) this.f10794c;
                if (szVar != null) {
                    szVar.onResume();
                    return;
                }
                return;
        }
    }
}
