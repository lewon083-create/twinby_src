package yads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v63 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r63 f43913b = new r63();

    public abstract int a();

    public abstract int a(Object obj);

    public int a(boolean z5) {
        return c() ? -1 : 0;
    }

    public abstract Object a(int i);

    public abstract s63 a(int i, s63 s63Var, boolean z5);

    public abstract u63 a(int i, u63 u63Var, long j10);

    public abstract int b();

    public int b(boolean z5) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int iB;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return false;
        }
        v63 v63Var = (v63) obj;
        if (v63Var.b() != b() || v63Var.a() != a()) {
            return false;
        }
        u63 u63Var = new u63();
        s63 s63Var = new s63();
        u63 u63Var2 = new u63();
        s63 s63Var2 = new s63();
        for (int i = 0; i < b(); i++) {
            if (!a(i, u63Var, 0L).equals(v63Var.a(i, u63Var2, 0L))) {
                return false;
            }
        }
        for (int i10 = 0; i10 < a(); i10++) {
            if (!a(i10, s63Var, true).equals(v63Var.a(i10, s63Var2, true))) {
                return false;
            }
        }
        int iA = a(true);
        if (iA != v63Var.a(true) || (iB = b(true)) != v63Var.b(true)) {
            return false;
        }
        while (iA != iB) {
            int iA2 = a(iA, 0, true);
            if (iA2 != v63Var.a(iA, 0, true)) {
                return false;
            }
            iA = iA2;
        }
        return true;
    }

    public final int hashCode() {
        u63 u63Var = new u63();
        s63 s63Var = new s63();
        int iB = b() + 217;
        for (int i = 0; i < b(); i++) {
            iB = (iB * 31) + a(i, u63Var, 0L).hashCode();
        }
        int iA = a() + (iB * 31);
        for (int i10 = 0; i10 < a(); i10++) {
            iA = (iA * 31) + a(i10, s63Var, true).hashCode();
        }
        int iA2 = a(true);
        while (iA2 != -1) {
            iA = (iA * 31) + iA2;
            iA2 = a(iA2, 0, true);
        }
        return iA;
    }

    public final int a(int i, s63 s63Var, u63 u63Var, int i10, boolean z5) {
        int i11 = a(i, s63Var, false).f42825d;
        if (a(i11, u63Var, 0L).f43593q != i) {
            return i + 1;
        }
        int iA = a(i11, i10, z5);
        if (iA == -1) {
            return -1;
        }
        return a(iA, u63Var, 0L).f43592p;
    }

    public int b(int i, int i10, boolean z5) {
        if (i10 == 0) {
            if (i == a(z5)) {
                return -1;
            }
            return i - 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == a(z5) ? b(z5) : i - 1;
        }
        throw new IllegalStateException();
    }

    public int a(int i, int i10, boolean z5) {
        if (i10 == 0) {
            if (i == b(z5)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == b(z5) ? a(z5) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final s63 a(int i, s63 s63Var) {
        return a(i, s63Var, false);
    }

    public s63 a(Object obj, s63 s63Var) {
        return a(a(obj), s63Var, true);
    }

    public final Pair a(u63 u63Var, s63 s63Var, int i, long j10) {
        Pair pairA = a(u63Var, s63Var, i, j10, 0L);
        pairA.getClass();
        return pairA;
    }

    public final Pair a(u63 u63Var, s63 s63Var, int i, long j10, long j11) {
        ni.a(i, b());
        a(i, u63Var, j11);
        if (j10 == -9223372036854775807L) {
            j10 = u63Var.f43590n;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i10 = u63Var.f43592p;
        a(i10, s63Var, false);
        while (i10 < u63Var.f43593q && s63Var.f42827f != j10) {
            int i11 = i10 + 1;
            if (a(i11, s63Var, false).f42827f > j10) {
                break;
            }
            i10 = i11;
        }
        a(i10, s63Var, true);
        long jMin = j10 - s63Var.f42827f;
        long j12 = s63Var.f42826e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(jMin, j12 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = s63Var.f42824c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public final u63 a(int i, u63 u63Var) {
        return a(i, u63Var, 0L);
    }
}
