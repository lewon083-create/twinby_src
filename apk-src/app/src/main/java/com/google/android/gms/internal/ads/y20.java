package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y20 implements i60 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp0 f12466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dx f12467c;

    public y20(xp0 xp0Var, dx dxVar) {
        this.f12466b = xp0Var;
        this.f12467c = dxVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void H() {
        if (this.f12466b.f12259r0) {
            dx dxVar = this.f12467c;
            synchronized (dxVar.f4700b) {
                cx cxVar = dxVar.f4703e;
                synchronized (cxVar.f4357f) {
                    cxVar.f4362l++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final void F(ru ruVar, String str, String str2) {
    }
}
