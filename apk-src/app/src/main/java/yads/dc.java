package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class dc implements op0 {
    public dc(int i) {
        this((Object) null);
    }

    public final pp0[] a(np0[] np0VarArr, im imVar) {
        pp0 ecVar;
        um2 um2VarA = ec.a(np0VarArr);
        pp0[] pp0VarArr = new pp0[np0VarArr.length];
        for (int i = 0; i < np0VarArr.length; i++) {
            np0 np0Var = np0VarArr[i];
            if (np0Var != null) {
                int[] iArr = np0Var.f41338b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        ecVar = new rv0(iArr[0], np0Var.f41339c, np0Var.f41337a);
                    } else {
                        long j10 = 25000;
                        ecVar = new ec(np0Var.f41337a, iArr, np0Var.f41339c, imVar, 10000, j10, j10, 1279, 719, 0.7f, 0.75f, (r51) um2VarA.get(i), xv.f44814a);
                    }
                    pp0VarArr[i] = ecVar;
                }
            }
        }
        return pp0VarArr;
    }

    public dc(Object obj) {
    }
}
