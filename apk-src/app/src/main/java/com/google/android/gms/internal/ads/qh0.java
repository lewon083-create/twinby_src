package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qh0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ut0 f9502c;

    public /* synthetic */ qh0(ut0 ut0Var, int i) {
        this.f9501b = i;
        this.f9502c = ut0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9501b) {
            case 0:
                this.f9502c.a();
                break;
            default:
                if (((Boolean) q9.s.f31967e.f31970c.a(al.f2922a6)).booleanValue() && nz.A.f12499c) {
                    this.f9502c.c();
                    break;
                }
                break;
        }
    }
}
