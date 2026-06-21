package v4;

import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.ads.g2;
import java.nio.ByteOrder;
import m3.p;
import q4.e;
import q4.f;
import q4.l;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f34737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e2 f34739d = new e2();

    public a(g2 g2Var, int i) {
        this.f34737b = g2Var;
        this.f34738c = i;
    }

    public final long a(l lVar) {
        e2 e2Var;
        g2 g2Var;
        int I;
        while (true) {
            long jZ = lVar.z();
            long length = lVar.getLength() - 6;
            e2Var = this.f34739d;
            g2Var = this.f34737b;
            if (jZ >= length) {
                break;
            }
            long jZ2 = lVar.z();
            p pVar = new p(17);
            int i = 0;
            boolean zD = false;
            lVar.V(pVar.f28589a, 0, 2);
            char cG = pVar.g(0, ByteOrder.BIG_ENDIAN);
            int i10 = this.f34738c;
            if (cG != i10) {
                lVar.L();
                lVar.B((int) (jZ2 - lVar.getPosition()));
            } else {
                byte[] bArr = pVar.f28589a;
                while (i < 15 && (I = lVar.I(bArr, 2 + i, 15 - i)) != -1) {
                    i += I;
                }
                pVar.L(i + 2);
                lVar.L();
                lVar.B((int) (jZ2 - lVar.getPosition()));
                zD = q4.b.d(pVar, g2Var, i10, e2Var);
            }
            if (zD) {
                break;
            }
            lVar.B(1);
        }
        if (lVar.z() < lVar.getLength() - 6) {
            return e2Var.f4793b;
        }
        lVar.B((int) (lVar.getLength() - lVar.z()));
        return g2Var.f5612j;
    }

    @Override // q4.f
    public final e f(l lVar, long j10) {
        long position = lVar.getPosition();
        long jA = a(lVar);
        long jZ = lVar.z();
        lVar.B(Math.max(6, this.f34737b.f5606c));
        long jA2 = a(lVar);
        return (jA > j10 || jA2 <= j10) ? jA2 <= j10 ? new e(-2, jA2, lVar.z()) : new e(-1, jA, position) : new e(0, -9223372036854775807L, jZ);
    }
}
