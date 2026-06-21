package zl;

import java.util.List;
import yads.bg;
import yads.df2;
import yads.fj3;
import yads.gk2;
import yads.ho0;
import yads.j5;
import yads.l4;
import yads.p82;
import yads.r82;
import yads.ve;
import yads.x02;
import yads.x22;
import yads.y02;
import yads.yw2;
import yads.yz1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f46618d;

    public /* synthetic */ n(int i, Object obj, Object obj2) {
        this.f46616b = i;
        this.f46617c = obj;
        this.f46618d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46616b) {
            case 0:
                ((fj3) this.f46617c).b((String) this.f46618d);
                break;
            case 1:
                ((fj3) this.f46617c).a((Exception) this.f46618d);
                break;
            case 2:
                ((gk2) this.f46617c).b((yw2) this.f46618d);
                break;
            case 3:
                ((ho0) this.f46617c).b((df2) this.f46618d);
                break;
            case 4:
                ((r82) this.f46617c).a((p82) this.f46618d);
                break;
            case 5:
                ve.a((ve) this.f46617c, (bg) this.f46618d);
                break;
            case 6:
                x02.a((x02) this.f46617c, (y02) this.f46618d);
                break;
            case 7:
                x02.a((x02) this.f46617c, (List) this.f46618d);
                break;
            case 8:
                x02.a((x02) this.f46617c, (x22) this.f46618d);
                break;
            case 9:
                x02.a((x02) this.f46617c, (l4) this.f46618d);
                break;
            default:
                yz1.a((yz1) this.f46617c, (j5) this.f46618d);
                break;
        }
    }
}
