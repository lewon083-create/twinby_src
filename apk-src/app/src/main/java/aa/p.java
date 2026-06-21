package aa;

import com.google.android.gms.internal.ads.gr;
import com.google.android.gms.internal.ads.gx;
import com.google.android.gms.internal.ads.hx;
import com.google.android.gms.internal.ads.ls1;
import com.google.android.gms.internal.ads.ms1;
import com.google.android.gms.internal.ads.qs1;
import com.google.android.gms.internal.ads.s80;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ls1 f681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ls1 f682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f683d;

    public p(ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, int i) {
        this.f680a = i;
        switch (i) {
            case 1:
                this.f683d = ls1Var;
                this.f681b = ls1Var2;
                this.f682c = ls1Var3;
                break;
            default:
                this.f681b = ls1Var;
                this.f682c = ls1Var2;
                this.f683d = ls1Var3;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f680a) {
            case 0:
                Object obj = (o0) this.f681b.j();
                u uVar = (u) this.f682c.j();
                gx gxVar = hx.f6279a;
                gr.G(gxVar);
                if (((Integer) ((ls1) this.f683d).j()).intValue() == 2) {
                    obj = uVar;
                }
                return new s80(obj, gxVar);
            default:
                return new u((o) this.f683d.j(), ((Integer) this.f681b.j()).intValue(), (String) this.f682c.j());
        }
    }
}
