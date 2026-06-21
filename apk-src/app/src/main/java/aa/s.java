package aa;

import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.wd0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f700b;

    public /* synthetic */ s(qs1 qs1Var, int i) {
        this.f699a = i;
        this.f700b = qs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f699a) {
            case 0:
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new r(gxVar, ((aw) this.f700b).a());
            default:
                return new n0((wd0) ((ls1) this.f700b).j());
        }
    }
}
