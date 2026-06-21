package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p73 f39633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39640h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39641j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f39642k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f39643l;

    public iu(int i, int i10, long j10, int i11, p73 p73Var) {
        boolean z5 = true;
        if (i10 != 1 && i10 != 2) {
            z5 = false;
        }
        ni.a(z5);
        this.f39636d = j10;
        this.f39637e = i11;
        this.f39633a = p73Var;
        this.f39634b = a(i, i10 == 2 ? 1667497984 : 1651965952);
        this.f39635c = i10 == 2 ? a(i, 1650720768) : -1;
        this.f39642k = new long[512];
        this.f39643l = new int[512];
    }

    public final void a(long j10) {
        if (this.f39641j == this.f39643l.length) {
            long[] jArr = this.f39642k;
            this.f39642k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f39643l;
            this.f39643l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f39642k;
        int i = this.f39641j;
        jArr2[i] = j10;
        this.f39643l[i] = this.i;
        this.f39641j = i + 1;
    }

    public final ww2 b(long j10) {
        long j11 = 1;
        int i = (int) (j10 / ((this.f39636d * j11) / ((long) this.f39637e)));
        int iA = lb3.a(this.f39643l, i, true, true);
        int[] iArr = this.f39643l;
        int i10 = iArr[iA];
        if (i10 == i) {
            ax2 ax2Var = new ax2(((this.f39636d * j11) / ((long) this.f39637e)) * ((long) i10), this.f39642k[iA]);
            return new ww2(ax2Var, ax2Var);
        }
        long j12 = i10;
        long j13 = (this.f39636d * j11) / ((long) this.f39637e);
        long[] jArr = this.f39642k;
        ax2 ax2Var2 = new ax2(j12 * j13, jArr[iA]);
        int i11 = iA + 1;
        return i11 < jArr.length ? new ww2(ax2Var2, new ax2(j13 * ((long) iArr[i11]), jArr[i11])) : new ww2(ax2Var2, ax2Var2);
    }

    public final void a() {
        this.f39642k = Arrays.copyOf(this.f39642k, this.f39641j);
        this.f39643l = Arrays.copyOf(this.f39643l, this.f39641j);
    }

    public static int a(int i, int i10) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i10;
    }
}
