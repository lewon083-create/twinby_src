package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ az1 f12394c;

    public /* synthetic */ xy1(az1 az1Var, int i) {
        this.f12393b = i;
        this.f12394c = az1Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12393b) {
            case 0:
                az1 az1Var = this.f12394c;
                if (!az1Var.O) {
                    fy1 fy1Var = az1Var.f3510q;
                    fy1Var.getClass();
                    fy1Var.d(az1Var);
                }
                break;
            case 1:
                this.f12394c.I = true;
                break;
            default:
                this.f12394c.t();
                break;
        }
    }
}
