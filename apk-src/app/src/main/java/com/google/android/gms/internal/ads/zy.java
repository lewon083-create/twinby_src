package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends xy {
    @Override // com.google.android.gms.internal.ads.xy
    public final boolean b(String str) {
        String strD = u9.d.d(str, "MD5");
        sz szVar = (sz) this.f12373d.get();
        if (szVar != null && strD != null) {
            szVar.V0(strD, this);
        }
        u9.i.h("VideoStreamNoopCache is doing nothing.");
        l(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.xy
    public final void k() {
    }
}
