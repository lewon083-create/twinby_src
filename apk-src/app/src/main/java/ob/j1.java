package ob;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.l0 f30208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f30209d;

    public /* synthetic */ j1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.l0 l0Var, int i) {
        this.f30207b = i;
        this.f30208c = l0Var;
        this.f30209d = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30207b) {
            case 0:
                d3 d3VarN = this.f30209d.f14422b.n();
                com.google.android.gms.internal.measurement.l0 l0Var = this.f30208c;
                d3VarN.C();
                d3VarN.D();
                d3VarN.Q(new aa.y(23, d3VarN, d3VarN.S(false), l0Var, false));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f30209d;
                e4 e4Var = appMeasurementDynamiteService.f14422b.f30267j;
                l1.h(e4Var);
                l1 l1Var = appMeasurementDynamiteService.f14422b;
                e4Var.n0(this.f30208c, l1Var.f30283z != null && l1Var.f30283z.booleanValue());
                break;
        }
    }
}
