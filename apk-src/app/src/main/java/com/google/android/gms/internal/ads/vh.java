package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vh extends bi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ea.b f11379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11380c;

    public vh(ea.b bVar, String str) {
        this.f11379b = bVar;
        this.f11380c = str;
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void d0(q9.x1 x1Var) {
        ea.b bVar = this.f11379b;
        if (bVar != null) {
            bVar.d(x1Var.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void q2(zh zhVar) {
        ea.b bVar = this.f11379b;
        if (bVar != null) {
            bVar.i(new wh(zhVar, this.f11380c));
        }
    }

    @Override // com.google.android.gms.internal.ads.di
    public final void E(int i) {
    }
}
