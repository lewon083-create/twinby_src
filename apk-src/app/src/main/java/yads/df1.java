package yads;

import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class df1 implements ur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet f37749b = new TreeSet(new d2.a(20));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37750c;

    public df1(long j10) {
        this.f37748a = j10;
    }

    public static int a(zr zrVar, zr zrVar2) {
        long j10 = zrVar.f45522g;
        long j11 = zrVar2.f45522g;
        if (j10 - j11 != 0) {
            return j10 < j11 ? -1 : 1;
        }
        if (!zrVar.f45517b.equals(zrVar2.f45517b)) {
            return zrVar.f45517b.compareTo(zrVar2.f45517b);
        }
        long j12 = zrVar.f45518c - zrVar2.f45518c;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final void a(nr nrVar, long j10) {
        while (this.f37750c + j10 > this.f37748a && !this.f37749b.isEmpty()) {
            zr zrVar = (zr) this.f37749b.first();
            yy2 yy2Var = (yy2) nrVar;
            synchronized (yy2Var) {
                yy2Var.b(zrVar);
            }
        }
    }
}
