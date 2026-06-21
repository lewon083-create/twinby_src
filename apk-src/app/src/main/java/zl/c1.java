package zl;

import yads.iz;
import yads.kk1;
import yads.nn0;
import yads.pk0;
import yads.xk1;
import yads.yk1;
import yads.yr;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements nn0, xk1, yr, iz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46544b;

    public /* synthetic */ c1(int i) {
        this.f46544b = i;
    }

    @Override // yads.xk1
    public int a(Object obj) {
        kk1 kk1Var = (kk1) obj;
        switch (this.f46544b) {
            case 1:
                return yk1.a(kk1Var);
            default:
                return yk1.b(kk1Var);
        }
    }

    @Override // yads.iz
    public void accept(Object obj) {
        switch (this.f46544b) {
            case 4:
                ((pk0) obj).a(3);
                break;
            case 5:
                ((pk0) obj).b();
                break;
            case 6:
                ((pk0) obj).a();
                break;
            default:
                ((pk0) obj).c();
                break;
        }
    }
}
