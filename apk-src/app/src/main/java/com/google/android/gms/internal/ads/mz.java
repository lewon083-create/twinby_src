package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mz implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oz f8046c;

    public /* synthetic */ mz(oz ozVar, int i) {
        this.f8045b = i;
        this.f8046c = ozVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8045b) {
            case 0:
                oz ozVar = this.f8046c;
                vx vxVar = ozVar.f8860f;
                if (vxVar != null) {
                    if (!ozVar.f8861g) {
                        vxVar.k();
                        ozVar.f8861g = true;
                    }
                    ozVar.f8860f.f();
                }
                break;
            case 1:
                vx vxVar2 = this.f8046c.f8860f;
                if (vxVar2 != null) {
                    vxVar2.g();
                }
                break;
            default:
                vx vxVar3 = this.f8046c.f8860f;
                if (vxVar3 != null) {
                    vxVar3.e();
                }
                break;
        }
    }
}
