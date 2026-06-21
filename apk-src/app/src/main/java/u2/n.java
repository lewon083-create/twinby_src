package u2;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f34056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f34057b;

    public n(int i) {
        this.f34056a = new SparseArray(i);
    }

    public final void a(k kVar, int i, int i10) {
        int iA = kVar.a(i);
        SparseArray sparseArray = this.f34056a;
        n nVar = sparseArray == null ? null : (n) sparseArray.get(iA);
        if (nVar == null) {
            nVar = new n(1);
            sparseArray.put(kVar.a(i), nVar);
        }
        if (i10 > i) {
            nVar.a(kVar, i + 1, i10);
        } else {
            nVar.f34057b = kVar;
        }
    }
}
