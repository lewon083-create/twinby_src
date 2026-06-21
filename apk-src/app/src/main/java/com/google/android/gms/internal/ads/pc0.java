package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pc0 implements ep {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w60 f9013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zu f9014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9016e;

    public pc0(w60 w60Var, xp0 xp0Var) {
        this.f9013b = w60Var;
        this.f9014c = xp0Var.f12247l;
        this.f9015d = xp0Var.f12243j;
        this.f9016e = xp0Var.f12245k;
    }

    @Override // com.google.android.gms.internal.ads.ep
    public final void N(zu zuVar) {
        int i;
        String str;
        zu zuVar2 = this.f9014c;
        if (zuVar2 != null) {
            zuVar = zuVar2;
        }
        if (zuVar != null) {
            str = zuVar.f13122b;
            i = zuVar.f13123c;
        } else {
            i = 1;
            str = "";
        }
        ru ruVar = new ru(str, i);
        w60 w60Var = this.f9013b;
        w60Var.getClass();
        w60Var.A1(new oq0(11, ruVar, this.f9015d, this.f9016e, false));
    }

    @Override // com.google.android.gms.internal.ads.ep
    public final void a() {
        this.f9013b.A1(v60.f11255e);
    }

    @Override // com.google.android.gms.internal.ads.ep
    public final void h() {
        this.f9013b.A1(v60.f11256f);
    }
}
