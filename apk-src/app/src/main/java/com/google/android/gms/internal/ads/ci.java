package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ci {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jg f4215a = new jg();

    static {
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract nh b(int i, nh nhVar, long j10);

    public abstract int c();

    public abstract bh d(int i, bh bhVar, boolean z5);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int iJ;
        if (this != obj) {
            if (obj instanceof ci) {
                ci ciVar = (ci) obj;
                if (ciVar.a() == a() && ciVar.c() == c()) {
                    nh nhVar = new nh();
                    bh bhVar = new bh();
                    nh nhVar2 = new nh();
                    bh bhVar2 = new bh();
                    int i = 0;
                    while (true) {
                        if (i >= a()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 >= c()) {
                                    int iK = k(true);
                                    if (iK == ciVar.k(true) && (iJ = j(true)) == ciVar.j(true)) {
                                        while (iK != iJ) {
                                            int iH = h(iK, 0, true);
                                            if (iH == ciVar.h(iK, 0, true)) {
                                                iK = iH;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i10, bhVar, true).equals(ciVar.d(i10, bhVar2, true))) {
                                        break;
                                    }
                                    i10++;
                                }
                            }
                        } else {
                            if (!b(i, nhVar, 0L).equals(ciVar.b(i, nhVar2, 0L))) {
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

    public abstract Object f(int i);

    public final boolean g() {
        return a() == 0;
    }

    public int h(int i, int i10, boolean z5) {
        if (i10 == 0) {
            if (i == j(z5)) {
                return -1;
            }
            return i + 1;
        }
        if (i10 == 1) {
            return i;
        }
        if (i10 == 2) {
            return i == j(z5) ? k(z5) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        int i;
        nh nhVar = new nh();
        bh bhVar = new bh();
        int iA = a() + 217;
        int i10 = 0;
        while (true) {
            i = iA * 31;
            if (i10 >= a()) {
                break;
            }
            iA = i + b(i10, nhVar, 0L).hashCode();
            i10++;
        }
        int iC = c() + i;
        for (int i11 = 0; i11 < c(); i11++) {
            iC = (iC * 31) + d(i11, bhVar, true).hashCode();
        }
        int iK = k(true);
        while (iK != -1) {
            iC = (iC * 31) + iK;
            iK = h(iK, 0, true);
        }
        return iC;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z5) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z5) {
        return g() ? -1 : 0;
    }

    public final int l(int i, bh bhVar, nh nhVar, int i10, boolean z5) {
        int i11 = d(i, bhVar, false).f3786c;
        if (b(i11, nhVar, 0L).f8308l != i) {
            return i + 1;
        }
        int iH = h(i11, i10, z5);
        if (iH == -1) {
            return -1;
        }
        return b(iH, nhVar, 0L).f8307k;
    }

    public final Pair m(nh nhVar, bh bhVar, int i, long j10) {
        Pair pairN = n(nhVar, bhVar, i, j10, 0L);
        pairN.getClass();
        return pairN;
    }

    public final Pair n(nh nhVar, bh bhVar, int i, long j10, long j11) {
        ix.n0(i, a());
        b(i, nhVar, j11);
        if (j10 == -9223372036854775807L) {
            nhVar.getClass();
            j10 = 0;
        }
        int i10 = nhVar.f8307k;
        d(i10, bhVar, false);
        while (i10 < nhVar.f8308l) {
            bhVar.getClass();
            if (j10 == 0) {
                break;
            }
            int i11 = i10 + 1;
            d(i11, bhVar, false).getClass();
            if (j10 < 0) {
                break;
            }
            i10 = i11;
        }
        d(i10, bhVar, true);
        bhVar.getClass();
        long j12 = bhVar.f3787d;
        if (j12 != -9223372036854775807L) {
            j10 = Math.min(j10, j12 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = bhVar.f3785b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public bh o(Object obj, bh bhVar) {
        return d(e(obj), bhVar, true);
    }
}
