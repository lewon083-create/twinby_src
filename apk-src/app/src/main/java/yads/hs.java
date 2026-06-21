package yads;

import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f39299c = new TreeSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f39300d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc0 f39301e;

    public hs(int i, String str, jc0 jc0Var) {
        this.f39297a = i;
        this.f39298b = str;
        this.f39301e = jc0Var;
    }

    public final long a(long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException();
        }
        if (j11 < 0) {
            throw new IllegalArgumentException();
        }
        bz2 bz2VarB = b(j10, j11);
        if (!bz2VarB.f45520e) {
            long j12 = bz2VarB.f45519d;
            return -Math.min(j12 != -1 ? j12 : Long.MAX_VALUE, j11);
        }
        long j13 = j10 + j11;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long jMax = bz2VarB.f45518c + bz2VarB.f45519d;
        if (jMax < j14) {
            for (bz2 bz2Var : this.f39299c.tailSet(bz2VarB, false)) {
                long j15 = bz2Var.f45518c;
                if (j15 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j15 + bz2Var.f45519d);
                if (jMax >= j14) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final bz2 b(long j10, long j11) {
        long j12;
        long jMin = j11;
        bz2 bz2Var = new bz2(this.f39298b, j10, -1L, -9223372036854775807L, null);
        bz2 bz2Var2 = (bz2) this.f39299c.floor(bz2Var);
        if (bz2Var2 != null && bz2Var2.f45518c + bz2Var2.f45519d > j10) {
            return bz2Var2;
        }
        bz2 bz2Var3 = (bz2) this.f39299c.ceiling(bz2Var);
        if (bz2Var3 != null) {
            long j13 = bz2Var3.f45518c - j10;
            if (jMin == -1) {
                j12 = j13;
            } else {
                jMin = Math.min(j13, jMin);
                j12 = jMin;
            }
        } else {
            j12 = jMin;
        }
        return new bz2(this.f39298b, j10, j12, -9223372036854775807L, null);
    }

    public final boolean c(long j10, long j11) {
        for (int i = 0; i < this.f39300d.size(); i++) {
            gs gsVar = (gs) this.f39300d.get(i);
            long j12 = gsVar.f38861b;
            if (j12 == -1) {
                if (j10 >= gsVar.f38860a) {
                    return true;
                }
            } else if (j11 == -1) {
                continue;
            } else {
                long j13 = gsVar.f38860a;
                if (j13 <= j10 && j10 + j11 <= j13 + j12) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hs.class == obj.getClass()) {
            hs hsVar = (hs) obj;
            if (this.f39297a == hsVar.f39297a && this.f39298b.equals(hsVar.f39298b) && this.f39299c.equals(hsVar.f39299c) && this.f39301e.equals(hsVar.f39301e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f39301e.hashCode() + k4.a(this.f39298b, this.f39297a * 31, 31);
    }
}
