package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o70 implements e80, ri {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eq0 f8626b;

    public /* synthetic */ o70(eq0 eq0Var) {
        this.f8626b = eq0Var;
    }

    @Override // com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void mo7a(Object obj) {
        ((q70) obj).l(this.f8626b);
    }

    @Override // com.google.android.gms.internal.ads.ri
    public void b(ok okVar) {
        ui uiVar = (ui) ((pk) okVar.f9560c).B().r();
        ik ikVar = (ik) ((pk) okVar.f9560c).B().C().r();
        String str = ((zp0) this.f8626b.f5033b.f4348d).f13056b;
        ikVar.b();
        ((jk) ikVar.f9560c).A(str);
        uiVar.b();
        ((vi) uiVar.f9560c).B((jk) ikVar.d());
        okVar.b();
        ((pk) okVar.f9560c).G((vi) uiVar.d());
    }
}
