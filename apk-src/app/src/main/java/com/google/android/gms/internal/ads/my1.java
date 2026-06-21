package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class my1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f8044d;

    public /* synthetic */ my1(int i, Object obj, Object obj2) {
        this.f8042b = i;
        this.f8043c = obj;
        this.f8044d = obj2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8042b) {
            case 0:
                ((mb0) this.f8043c).mo0a(this.f8044d);
                break;
            default:
                az1 az1Var = (az1) this.f8043c;
                o2 o2Var = (o2) this.f8044d;
                az1Var.A = az1Var.f3511r == null ? o2Var : new f2(-9223372036854775807L, 0L);
                az1Var.B = o2Var.h();
                boolean z5 = false;
                if (!az1Var.I && o2Var.h() == -9223372036854775807L) {
                    z5 = true;
                }
                az1Var.C = z5;
                az1Var.D = true == z5 ? 7 : 1;
                if (!az1Var.f3516w) {
                    az1Var.t();
                } else {
                    az1Var.f3501g.s(az1Var.B, o2Var, z5);
                }
                break;
        }
    }
}
