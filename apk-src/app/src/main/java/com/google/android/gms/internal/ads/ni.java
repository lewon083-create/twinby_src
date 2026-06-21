package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ni extends jx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8312c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8313d;

    public ni(com.google.android.gms.internal.measurement.i4 i4Var) {
        this.f8313d = i4Var;
    }

    @Override // com.google.android.gms.internal.ads.jx, java.util.concurrent.Future
    public boolean cancel(boolean z5) {
        switch (this.f8312c) {
            case 0:
                ((com.google.android.gms.internal.measurement.i4) this.f8313d).t();
                return this.f6961b.cancel(z5);
            default:
                return super.cancel(z5);
        }
    }

    public void e() {
        b(this.f8313d);
    }

    public ni(Object obj) {
        this.f8313d = obj;
    }
}
