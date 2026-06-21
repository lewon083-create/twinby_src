package a0;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends g0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f236b;

    public /* synthetic */ v1(int i, Object obj) {
        this.f235a = i;
        this.f236b = obj;
    }

    @Override // g0.p
    public void b(int i, g0.v vVar) {
        switch (this.f235a) {
            case 0:
                w1 w1Var = (w1) this.f236b;
                synchronized (w1Var.f250b) {
                    try {
                        if (w1Var.f254f) {
                            return;
                        }
                        w1Var.f257j.put(vVar.getTimestamp(), new l0.c(vVar));
                        w1Var.g();
                        return;
                    } finally {
                    }
                }
            case 1:
            default:
                return;
            case 2:
                u0.g gVar = (u0.g) ((WeakReference) this.f236b).get();
                if (gVar != null) {
                    Iterator it = gVar.f34010b.iterator();
                    while (it.hasNext()) {
                        g0.h2 h2Var = ((q2) it.next()).f215o;
                        Iterator it2 = h2Var.f19589g.f19749e.iterator();
                        while (it2.hasNext()) {
                            ((g0.p) it2.next()).b(i, new ob.l(vVar, h2Var.f19589g.f19751g, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // g0.p
    public void d(int i) {
        switch (this.f235a) {
            case 1:
                hl.d.s().execute(new d1(18, this));
                break;
        }
    }

    public v1(u0.g gVar) {
        this.f235a = 2;
        this.f236b = new WeakReference(gVar);
    }
}
