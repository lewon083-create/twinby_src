package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class aa0 implements fh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fa0 f2821c;

    public aa0(fa0 fa0Var, String str) {
        this.f2820b = str;
        this.f2821c = fa0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.eb0, com.google.android.gms.internal.ads.ug] */
    @Override // com.google.android.gms.internal.ads.fh
    public final void I(eh ehVar) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3012g2)).booleanValue()) {
            if (ehVar.f4951j) {
                fa0 fa0Var = this.f2821c;
                if (fa0Var.f5290w != null) {
                    fa0Var.H.put(this.f2820b, Boolean.TRUE);
                    ?? r02 = fa0Var.f5290w;
                    if (r02 == 0) {
                        return;
                    }
                    fa0Var.t(r02.e2(), r02.d(), r02.n(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (ehVar.f4951j) {
                    fa0 fa0Var2 = this.f2821c;
                    if (fa0Var2.f5290w != null) {
                        fa0Var2.H.put(this.f2820b, Boolean.TRUE);
                        ?? r03 = fa0Var2.f5290w;
                        if (r03 == 0) {
                        } else {
                            fa0Var2.t(r03.e2(), fa0Var2.f5290w.d(), fa0Var2.f5290w.n(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
