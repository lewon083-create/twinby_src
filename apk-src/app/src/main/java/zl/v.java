package zl;

import java.util.Comparator;
import yads.hj0;
import yads.jt;
import yads.kj0;
import yads.nx0;
import yads.oo3;
import yads.po3;
import yads.to;
import yads.uo;
import yads.vo;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46644b;

    public /* synthetic */ v(int i) {
        this.f46644b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f46644b) {
            case 0:
                return Integer.compare(((jt) obj2).f39974b, ((jt) obj).f39974b);
            case 1:
                return kj0.a((hj0) obj, (hj0) obj2);
            case 2:
                return Integer.compare(((po3) obj).f41975a.f42360b, ((po3) obj2).f41975a.f42360b);
            case 3:
                return to.a((nx0) obj, (nx0) obj2);
            case 4:
                return vo.a((uo) obj, (uo) obj2);
            default:
                return Long.compare(((oo3) obj).f41675b, ((oo3) obj2).f41675b);
        }
    }
}
