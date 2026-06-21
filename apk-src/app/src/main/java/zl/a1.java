package zl;

import yads.l00;
import yads.u61;
import yads.uj;
import yads.vg;
import yads.wg;
import yads.wt1;
import yads.yc2;
import yads.z92;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46529c;

    public /* synthetic */ a1(int i, Object obj) {
        this.f46528b = i;
        this.f46529c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46528b) {
            case 0:
                u61.a((u61) this.f46529c);
                break;
            case 1:
                ((uj) this.f46529c).b();
                break;
            case 2:
                wg.a((vg) this.f46529c);
                break;
            case 3:
                wt1.a((l00) this.f46529c);
                break;
            case 4:
                wt1.a((wt1) this.f46529c);
                break;
            case 5:
                yc2.a((yc2) this.f46529c);
                break;
            default:
                z92.a((z92) this.f46529c);
                break;
        }
    }
}
