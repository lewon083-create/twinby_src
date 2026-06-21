package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public static j1 a(Object obj) {
        z zVar = (z) obj;
        j1 j1Var = zVar.unknownFields;
        if (j1Var != j1.f1426f) {
            return j1Var;
        }
        j1 j1Var2 = new j1(0, new int[8], new Object[8], true);
        zVar.unknownFields = j1Var2;
        return j1Var2;
    }

    public static boolean b(int i, l lVar, Object obj) throws e0 {
        k kVar = (k) lVar.f1438e;
        int i10 = lVar.f1435b;
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            lVar.C(0);
            ((j1) obj).c(i11 << 3, Long.valueOf(kVar.n()));
            return true;
        }
        if (i12 == 1) {
            lVar.C(1);
            ((j1) obj).c((i11 << 3) | 1, Long.valueOf(kVar.k()));
            return true;
        }
        if (i12 == 2) {
            ((j1) obj).c((i11 << 3) | 2, lVar.k());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw e0.b();
            }
            lVar.C(5);
            ((j1) obj).c(5 | (i11 << 3), Integer.valueOf(kVar.j()));
            return true;
        }
        j1 j1Var = new j1(0, new int[8], new Object[8], true);
        int i13 = i11 << 3;
        int i14 = i13 | 4;
        int i15 = i + 1;
        if (i15 >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (lVar.b() != Integer.MAX_VALUE && b(i15, lVar, j1Var)) {
        }
        if (i14 != lVar.f1435b) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
        if (j1Var.f1431e) {
            j1Var.f1431e = false;
        }
        ((j1) obj).c(i13 | 3, j1Var);
        return true;
    }
}
