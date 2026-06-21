package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g10 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f5593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f5594c;

    public g10(d10 d10Var, ls1 ls1Var) {
        this.f5592a = 3;
        this.f5594c = ls1Var;
        this.f5593b = d10Var;
    }

    public kx0 a() {
        sd0 sd0Var = (sd0) this.f5594c.j();
        this.f5593b.a();
        return new kx0(29, sd0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f5592a) {
            case 0:
                try {
                    return wa.b.a(this.f5593b.a()).d(0, ((ApplicationInfo) this.f5594c.j()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new u9.l(this.f5593b.a(), (String) this.f5594c.j());
            case 2:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new ml0(gxVar, this.f5593b.a(), (tf0) this.f5594c.j(), 4);
            default:
                return a();
        }
    }

    public /* synthetic */ g10(d10 d10Var, ls1 ls1Var, int i) {
        this.f5592a = i;
        this.f5593b = d10Var;
        this.f5594c = ls1Var;
    }
}
