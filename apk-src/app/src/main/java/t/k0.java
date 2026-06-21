package t;

import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f33136a;

    public k0(m0 m0Var) {
        this.f33136a = m0Var;
    }

    @Override // t.n0
    public final ed.d a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33136a.f33162h.iterator();
        while (it.hasNext()) {
            arrayList.add(((n0) it.next()).a(totalCaptureResult));
        }
        k0.m mVarB = k0.j.b(arrayList);
        qg.a aVar = new qg.a(23);
        return k0.j.j(mVarB, new v7.f(25, aVar), hl.d.j());
    }

    @Override // t.n0
    public final boolean b() {
        Iterator it = this.f33136a.f33162h.iterator();
        while (it.hasNext()) {
            if (((n0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    @Override // t.n0
    public final void c() {
        Iterator it = this.f33136a.f33162h.iterator();
        while (it.hasNext()) {
            ((n0) it.next()).c();
        }
    }
}
