package aa;

import android.content.Context;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.d10;
import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.j10;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.ads.wk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d10 f571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f572c;

    public /* synthetic */ d0(d10 d10Var, qs1 qs1Var, int i) {
        this.f570a = i;
        this.f571b = d10Var;
        this.f572c = qs1Var;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        int i = this.f570a;
        qs1 qs1Var = this.f572c;
        d10 d10Var = this.f571b;
        switch (i) {
            case 0:
                Context contextA = d10Var.a();
                wk wkVar = al.f2915a;
                return new c0(contextA, q9.s.f31967e.f31968a.w(), ((j10) qs1Var).a());
            case 1:
                return new ka.k((Context) d10Var.j(), (u9.a) ((j10) qs1Var).j());
            default:
                Context contextA2 = d10Var.a();
                wd0 wd0Var = (wd0) ((ls1) qs1Var).j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                return new i0(contextA2, wd0Var, gxVar);
        }
    }
}
