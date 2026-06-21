package n1;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f28990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f28991b;

    public static long a(e eVar, long j10) {
        n nVar = eVar.f28979d;
        ArrayList arrayList = eVar.f28985k;
        if (nVar instanceof i) {
            return j10;
        }
        int size = arrayList.size();
        long jMin = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f28979d != nVar) {
                    jMin = Math.min(jMin, a(eVar2, ((long) eVar2.f28981f) + j10));
                }
            }
        }
        e eVar3 = nVar.i;
        e eVar4 = nVar.f29007h;
        if (eVar != eVar3) {
            return jMin;
        }
        long j11 = j10 - nVar.j();
        return Math.min(Math.min(jMin, a(eVar4, j11)), j11 - ((long) eVar4.f28981f));
    }

    public static long b(e eVar, long j10) {
        n nVar = eVar.f28979d;
        ArrayList arrayList = eVar.f28985k;
        if (nVar instanceof i) {
            return j10;
        }
        int size = arrayList.size();
        long jMax = j10;
        for (int i = 0; i < size; i++) {
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f28979d != nVar) {
                    jMax = Math.max(jMax, b(eVar2, ((long) eVar2.f28981f) + j10));
                }
            }
        }
        e eVar3 = nVar.f29007h;
        e eVar4 = nVar.i;
        if (eVar != eVar3) {
            return jMax;
        }
        long j11 = nVar.j() + j10;
        return Math.max(Math.max(jMax, b(eVar4, j11)), j11 - ((long) eVar4.f28981f));
    }
}
