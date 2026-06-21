package m1;

import java.util.ArrayList;
import n1.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d[] f28532q0 = new d[4];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f28533r0 = 0;

    public final void R(int i, ArrayList arrayList, m mVar) {
        for (int i10 = 0; i10 < this.f28533r0; i10++) {
            d dVar = this.f28532q0[i10];
            ArrayList arrayList2 = mVar.f28995a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i11 = 0; i11 < this.f28533r0; i11++) {
            n1.g.b(this.f28532q0[i11], i, arrayList, mVar);
        }
    }

    public void S() {
    }
}
