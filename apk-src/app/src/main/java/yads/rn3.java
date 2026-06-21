package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class rn3 {
    public static boolean a(ld0 ld0Var) {
        lb2 lb2Var = new lb2(8);
        int i = qn3.a(ld0Var, lb2Var).f42353a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ld0Var.b(lb2Var.f40463a, 0, 4, false);
        lb2Var.e(0);
        int iB = lb2Var.b();
        if (iB == 1463899717) {
            return true;
        }
        kh1.b("WavHeaderReader", "Unsupported form type: " + iB);
        return false;
    }

    public static qn3 a(int i, ld0 ld0Var, lb2 lb2Var) {
        qn3 qn3VarA = qn3.a(ld0Var, lb2Var);
        while (qn3VarA.f42353a != i) {
            kh1.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + qn3VarA.f42353a);
            long j10 = qn3VarA.f42354b + 8;
            if (j10 <= 2147483647L) {
                ld0Var.a((int) j10);
                qn3VarA = qn3.a(ld0Var, lb2Var);
            } else {
                throw qb2.b("Chunk is too large (~2GB+) to skip; id: " + qn3VarA.f42353a);
            }
        }
        return qn3VarA;
    }
}
