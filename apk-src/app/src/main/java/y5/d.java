package y5;

import com.google.android.gms.internal.ads.o;
import j3.d0;
import m3.p;
import q4.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f36478a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f36479b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(l lVar) {
        p pVar = new p(8);
        int i = o.b(lVar, pVar).f8527a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        lVar.V(pVar.f28589a, 0, 4);
        pVar.M(0);
        int iM = pVar.m();
        if (iM == 1463899717) {
            return true;
        }
        m3.b.e("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static o b(int i, l lVar, p pVar) throws d0 {
        o oVarB = o.b(lVar, pVar);
        while (true) {
            int i10 = oVarB.f8527a;
            if (i10 == i) {
                return oVarB;
            }
            gf.a.p(i10, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j10 = oVarB.f8528b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw d0.c("Chunk is too large (~2GB+) to skip; id: " + i10);
            }
            lVar.M((int) j11);
            oVarB = o.b(lVar, pVar);
        }
    }
}
