package yads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ew0 f45390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f45391b;

    public ze(ew0 ew0Var, SparseArray sparseArray) {
        this.f45390a = ew0Var;
        SparseArray sparseArray2 = new SparseArray(ew0Var.a());
        for (int i = 0; i < ew0Var.a(); i++) {
            int iA = ew0Var.a(i);
            sparseArray2.append(iA, (ye) ni.a((ye) sparseArray.get(iA)));
        }
        this.f45391b = sparseArray2;
    }

    public final boolean a(int i) {
        return this.f45390a.f38269a.get(i);
    }
}
