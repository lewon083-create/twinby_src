package j3;

import android.util.Pair;
import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f26348a = new l0();

    static {
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
    }

    public int a(boolean z5) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z5) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, m0 m0Var, n0 n0Var, int i10, boolean z5) {
        int i11 = f(i, m0Var, false).f26276c;
        if (m(i11, n0Var, 0L).f26321o != i) {
            return i + 1;
        }
        int iE = e(i11, i10, z5);
        if (iE == -1) {
            return -1;
        }
        return m(iE, n0Var, 0L).f26320n;
    }

    public int e(int i, int i10, boolean z5) {
        if (i10 == 0) {
            if (i == c(z5)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == c(z5) ? a(z5) : i + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        int iC;
        if (this != obj) {
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (o0Var.o() == o() && o0Var.h() == h()) {
                    n0 n0Var = new n0();
                    m0 m0Var = new m0();
                    n0 n0Var2 = new n0();
                    m0 m0Var2 = new m0();
                    int i = 0;
                    while (true) {
                        if (i >= o()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= h()) {
                                    int iA = a(true);
                                    if (iA == o0Var.a(true) && (iC = c(true)) == o0Var.c(true)) {
                                        while (iA != iC) {
                                            int iE = e(iA, 0, true);
                                            if (iE == o0Var.e(iA, 0, true)) {
                                                iA = iE;
                                            }
                                        }
                                    }
                                } else {
                                    if (!f(i10, m0Var, true).equals(o0Var.f(i10, m0Var2, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!m(i, n0Var, 0L).equals(o0Var.m(i, n0Var2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract m0 f(int i, m0 m0Var, boolean z5);

    public m0 g(Object obj, m0 m0Var) {
        return f(b(obj), m0Var, true);
    }

    public abstract int h();

    public int hashCode() {
        n0 n0Var = new n0();
        m0 m0Var = new m0();
        int iO = o() + 217;
        for (int i = 0; i < o(); i++) {
            iO = (iO * 31) + m(i, n0Var, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i10 = 0; i10 < h(); i10++) {
            iH = (iH * 31) + f(i10, m0Var, true).hashCode();
        }
        int iA = a(true);
        while (iA != -1) {
            iH = (iH * 31) + iA;
            iA = e(iA, 0, true);
        }
        return iH;
    }

    public final Pair i(n0 n0Var, m0 m0Var, int i, long j10) {
        Pair pairJ = j(n0Var, m0Var, i, j10, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(n0 n0Var, m0 m0Var, int i, long j10, long j11) {
        h5.l(i, o());
        m(i, n0Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = n0Var.f26318l;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = n0Var.f26320n;
        f(i10, m0Var, false);
        while (i10 < n0Var.f26321o && m0Var.f26278e != j10) {
            int i11 = i10 + 1;
            if (f(i11, m0Var, false).f26278e > j10) {
                break;
            }
            i10 = i11;
        }
        f(i10, m0Var, true);
        long jMin = j10 - m0Var.f26278e;
        long j12 = m0Var.f26277d;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = m0Var.f26275b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i, int i10) {
        if (i10 == 0) {
            if (i == a(false)) {
                return -1;
            }
            return i - 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == a(false) ? c(false) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i);

    public abstract n0 m(int i, n0 n0Var, long j10);

    public final void n(int i, n0 n0Var) {
        m(i, n0Var, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
