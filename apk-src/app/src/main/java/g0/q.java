package g0;

import fh.of;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19721a = new ArrayList();

    public q(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (!(pVar instanceof r)) {
                this.f19721a.add(pVar);
            }
        }
    }

    @Override // g0.p
    public final void a(int i) {
        Iterator it = this.f19721a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a(i);
        }
    }

    @Override // g0.p
    public final void b(int i, v vVar) {
        Iterator it = this.f19721a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).b(i, vVar);
        }
    }

    @Override // g0.p
    public final void c(int i, of ofVar) {
        Iterator it = this.f19721a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).c(i, ofVar);
        }
    }

    @Override // g0.p
    public final void d(int i) {
        Iterator it = this.f19721a.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d(i);
        }
    }
}
