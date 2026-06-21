package m1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f28534a = new boolean[3];

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(m1.e r40, k1.c r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.j.a(m1.e, k1.c, java.util.ArrayList, int):void");
    }

    public static void b(e eVar, k1.c cVar, d dVar) {
        dVar.f28476o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f28478p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f28477p = -1;
        int[] iArr2 = eVar.f28478p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.f28448g;
            int iQ = eVar.q() - cVar5.f28448g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, iQ);
            dVar.f28476o = 2;
            dVar.Y = i;
            int i10 = iQ - i;
            dVar.U = i10;
            int i11 = dVar.f28453b0;
            if (i10 < i11) {
                dVar.U = i11;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i12 = cVar4.f28448g;
        int iK = eVar.k() - cVar3.f28448g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i12);
        cVar.d(cVar3.i, iK);
        if (dVar.f28451a0 > 0 || dVar.f28463g0 == 8) {
            k1.e eVarK = cVar.k(cVar2);
            cVar2.i = eVarK;
            cVar.d(eVarK, dVar.f28451a0 + i12);
        }
        dVar.f28477p = 2;
        dVar.Z = i12;
        int i13 = iK - i12;
        dVar.V = i13;
        int i14 = dVar.f28455c0;
        if (i13 < i14) {
            dVar.V = i14;
        }
    }

    public static final boolean c(int i, int i10) {
        return (i & i10) == i10;
    }
}
