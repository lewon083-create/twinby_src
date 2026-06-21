package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f00 implements ri {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5160c;

    public /* synthetic */ f00(boolean z5, int i) {
        this.f5159b = z5;
        this.f5160c = i;
    }

    @Override // com.google.android.gms.internal.ads.ri
    public void b(ok okVar) {
        int i = g00.f5560d0;
        dk dkVarA = ek.A();
        boolean z5 = ((ek) dkVarA.f9560c).z();
        boolean z10 = this.f5159b;
        if (z5 != z10) {
            dkVarA.b();
            ((ek) dkVarA.f9560c).B(z10);
        }
        dkVarA.b();
        ((ek) dkVarA.f9560c).C(this.f5160c);
        ek ekVar = (ek) dkVarA.d();
        okVar.b();
        ((pk) okVar.f9560c).I(ekVar);
    }

    public /* synthetic */ f00(boolean z5, ad.m0 m0Var) {
        this.f5159b = z5;
        this.f5160c = m0Var.f839c;
    }
}
