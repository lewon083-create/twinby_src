package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 extends ug {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rp0 f11042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f11043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fq0 f11044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qc0 f11045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11046f;

    public up0(rp0 rp0Var, np0 np0Var, fq0 fq0Var) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        this.f11046f = false;
        this.f11042b = rp0Var;
        this.f11043c = np0Var;
        this.f11044d = fq0Var;
    }

    public final synchronized void H3(xa.a aVar) {
        pa.c0.e("pause must be called on the main UI thread.");
        if (this.f11045e != null) {
            Context context = aVar == null ? null : (Context) xa.b.X1(aVar);
            u60 u60Var = this.f11045e.f9698c;
            u60Var.getClass();
            u60Var.A1(new ku0(context, 2));
        }
    }

    public final synchronized void V(xa.a aVar) {
        pa.c0.e("resume must be called on the main UI thread.");
        if (this.f11045e != null) {
            Context context = aVar == null ? null : (Context) xa.b.X1(aVar);
            u60 u60Var = this.f11045e.f9698c;
            u60Var.getClass();
            u60Var.A1(new uk(context, false));
        }
    }

    public final synchronized void b4(xa.a aVar) {
        try {
            pa.c0.e("showAd must be called on the main UI thread.");
            if (this.f11045e != null) {
                Activity activity = null;
                if (aVar != null) {
                    Object objX1 = xa.b.X1(aVar);
                    if (objX1 instanceof Activity) {
                        activity = (Activity) objX1;
                    }
                }
                this.f11045e.c(activity, this.f11046f);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x022f A[Catch: all -> 0x0223, TryCatch #4 {, blocks: (B:146:0x0204, B:150:0x021c, B:156:0x0226, B:157:0x022f, B:159:0x0235, B:163:0x0249), top: B:177:0x0204, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0247 A[DONT_GENERATE] */
    @Override // com.google.android.gms.internal.ads.ug
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k4(int r7, android.os.Parcel r8, android.os.Parcel r9) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.up0.k4(int, android.os.Parcel, android.os.Parcel):boolean");
    }

    public final synchronized void l4(xa.a aVar) {
        pa.c0.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f11043c.f8412c.set(null);
        if (this.f11045e != null) {
            if (aVar != null) {
                context = (Context) xa.b.X1(aVar);
            }
            u60 u60Var = this.f11045e.f9698c;
            u60Var.getClass();
            u60Var.A1(new zk(context, 2));
        }
    }

    public final synchronized boolean m4() {
        qc0 qc0Var = this.f11045e;
        if (qc0Var != null) {
            if (!qc0Var.f9448r.f2776c.get()) {
                return true;
            }
        }
        return false;
    }
}
