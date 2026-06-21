package yads;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class to implements pp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k73 f43383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f43385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0[] f43386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f43387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43388f;

    public to(k73 k73Var, int[] iArr) {
        int i = 0;
        ni.b(iArr.length > 0);
        this.f43383a = (k73) ni.a(k73Var);
        int length = iArr.length;
        this.f43384b = length;
        this.f43386d = new nx0[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f43386d[i10] = k73Var.a(iArr[i10]);
        }
        Arrays.sort(this.f43386d, new zl.v(3));
        this.f43385c = new int[this.f43384b];
        while (true) {
            int i11 = this.f43384b;
            if (i >= i11) {
                this.f43387e = new long[i11];
                return;
            } else {
                this.f43385c[i] = k73Var.a(this.f43386d[i]);
                i++;
            }
        }
    }

    @Override // yads.pp0
    public void a() {
    }

    @Override // yads.pp0
    public final int b(int i) {
        return this.f43385c[i];
    }

    @Override // yads.pp0
    public final nx0 c() {
        return this.f43386d[e()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            to toVar = (to) obj;
            if (this.f43383a == toVar.f43383a && Arrays.equals(this.f43385c, toVar.f43385c)) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.pp0
    public final int f() {
        return this.f43385c.length;
    }

    public final int hashCode() {
        if (this.f43388f == 0) {
            this.f43388f = Arrays.hashCode(this.f43385c) + (System.identityHashCode(this.f43383a) * 31);
        }
        return this.f43388f;
    }

    @Override // yads.pp0
    public void a(float f10) {
    }

    @Override // yads.pp0
    public final k73 b() {
        return this.f43383a;
    }

    @Override // yads.pp0
    public final int c(int i) {
        for (int i10 = 0; i10 < this.f43384b; i10++) {
            if (this.f43385c[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    @Override // yads.pp0
    public final boolean a(int i, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zB = b(i, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f43384b && !zB) {
            zB = (i10 == i || b(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zB) {
            return false;
        }
        long[] jArr = this.f43387e;
        long j11 = jArr[i];
        int i11 = lb3.f40466a;
        long j12 = jElapsedRealtime + j10;
        if (((j10 ^ j12) & (jElapsedRealtime ^ j12)) < 0) {
            j12 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j11, j12);
        return true;
    }

    @Override // yads.pp0
    public final boolean b(int i, long j10) {
        return this.f43387e[i] > j10;
    }

    @Override // yads.pp0
    public int a(long j10, List list) {
        return list.size();
    }

    @Override // yads.pp0
    public final nx0 a(int i) {
        return this.f43386d[i];
    }

    @Override // yads.pp0
    public final int a(nx0 nx0Var) {
        for (int i = 0; i < this.f43384b; i++) {
            if (this.f43386d[i] == nx0Var) {
                return i;
            }
        }
        return -1;
    }

    public static /* synthetic */ int a(nx0 nx0Var, nx0 nx0Var2) {
        return nx0Var2.i - nx0Var.i;
    }

    @Override // yads.pp0
    public void disable() {
    }
}
