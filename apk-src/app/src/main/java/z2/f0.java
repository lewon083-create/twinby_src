package z2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f45832b;

    public f0(h0 h0Var, int i) {
        this.f45832b = h0Var;
        this.f45831a = i;
    }

    @Override // z2.e0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        h0 h0Var = this.f45832b;
        t tVar = h0Var.f45865y;
        int i = this.f45831a;
        if (tVar == null || i >= 0 || !tVar.k().S(-1, 0)) {
            return h0Var.T(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
