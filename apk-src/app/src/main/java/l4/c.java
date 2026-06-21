package l4;

import android.os.SystemClock;
import com.google.android.gms.internal.measurement.h5;
import j3.p0;
import java.util.Arrays;
import java.util.List;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f27825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f27827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j3.o[] f27828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f27829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27830f;

    public c(p0 p0Var, int[] iArr) {
        int i = 0;
        h5.r(iArr.length > 0);
        p0Var.getClass();
        this.f27825a = p0Var;
        int length = iArr.length;
        this.f27826b = length;
        this.f27828d = new j3.o[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f27828d[i10] = p0Var.f26354d[iArr[i10]];
        }
        Arrays.sort(this.f27828d, new d2.a(4));
        this.f27827c = new int[this.f27826b];
        while (true) {
            int i11 = this.f27826b;
            if (i >= i11) {
                this.f27829e = new long[i11];
                return;
            } else {
                this.f27827c[i] = p0Var.a(this.f27828d[i]);
                i++;
            }
        }
    }

    @Override // l4.r
    public final boolean a(int i, long j10) {
        return this.f27829e[i] > j10;
    }

    @Override // l4.r
    public final p0 b() {
        return this.f27825a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f27825a.equals(cVar.f27825a) && Arrays.equals(this.f27827c, cVar.f27827c)) {
                return true;
            }
        }
        return false;
    }

    @Override // l4.r
    public final j3.o f(int i) {
        return this.f27828d[i];
    }

    @Override // l4.r
    public final int h(int i) {
        return this.f27827c[i];
    }

    public final int hashCode() {
        if (this.f27830f == 0) {
            this.f27830f = Arrays.hashCode(this.f27827c) + (System.identityHashCode(this.f27825a) * 31);
        }
        return this.f27830f;
    }

    @Override // l4.r
    public int i(long j10, List list) {
        return list.size();
    }

    @Override // l4.r
    public final int j() {
        return this.f27827c[c()];
    }

    @Override // l4.r
    public final int k(j3.o oVar) {
        for (int i = 0; i < this.f27826b; i++) {
            if (this.f27828d[i] == oVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // l4.r
    public final j3.o l() {
        return this.f27828d[c()];
    }

    @Override // l4.r
    public final int length() {
        return this.f27827c.length;
    }

    @Override // l4.r
    public final boolean n(int i, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i10 = 0;
        while (i10 < this.f27826b && !zA) {
            zA = (i10 == i || a(i10, jElapsedRealtime)) ? false : true;
            i10++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f27829e;
        jArr[i] = Math.max(jArr[i], z.a(jElapsedRealtime, j10));
        return true;
    }

    @Override // l4.r
    public final int t(int i) {
        for (int i10 = 0; i10 < this.f27826b; i10++) {
            if (this.f27827c[i10] == i) {
                return i10;
            }
        }
        return -1;
    }

    @Override // l4.r
    public void disable() {
    }

    @Override // l4.r
    public void g() {
    }

    @Override // l4.r
    public final void e(boolean z5) {
    }

    @Override // l4.r
    public void o(float f10) {
    }
}
