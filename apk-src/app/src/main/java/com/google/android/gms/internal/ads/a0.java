package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ut f2668c;

    public /* synthetic */ a0(ut utVar, int i) {
        this.f2667b = i;
        this.f2668c = utVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f2667b) {
            case 0:
                ((b0) this.f2668c.f11062d).f3537h.j();
                break;
            case 1:
                ((b0) this.f2668c.f11062d).f3537h.l();
                break;
            default:
                ((b0) this.f2668c.f11062d).f3537h.getClass();
                break;
        }
    }

    public /* synthetic */ a0(ut utVar, bs bsVar) {
        this.f2667b = 2;
        this.f2668c = utVar;
    }
}
