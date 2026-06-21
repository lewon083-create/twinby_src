package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qo implements k81, o00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz f9561b;

    public /* synthetic */ qo(sz szVar) {
        this.f9561b = szVar;
    }

    @Override // com.google.android.gms.internal.ads.o00
    public /* synthetic */ void b(int i, String str, String str2, boolean z5) {
        sz szVar = this.f9561b;
        szVar.n1();
        szVar.q0().E();
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ void mo6i(Object obj) {
        String str = (String) obj;
        sz szVar = this.f9561b;
        new t9.x(szVar.getContext(), szVar.v().f34365b, str, szVar.M() != null ? szVar.M().f12271x0 : null).B();
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        p9.k.C.f31302h.d("DefaultGmsgHandlers.attributionReportingManager", th2);
    }
}
