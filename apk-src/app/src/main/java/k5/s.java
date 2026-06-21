package k5;

import com.google.android.gms.internal.measurement.h5;
import m3.z;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f27010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f27012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f27013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f27015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f27016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f27017h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f27018j;

    public s(q qVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z5, long j10, int i10) {
        h5.h(iArr.length == jArr2.length);
        h5.h(jArr.length == jArr2.length);
        h5.h(iArr2.length == jArr2.length);
        this.f27010a = qVar;
        this.f27012c = jArr;
        this.f27013d = iArr;
        this.f27014e = i;
        this.f27015f = jArr2;
        this.f27016g = iArr2;
        this.f27017h = iArr3;
        this.f27018j = z5;
        this.i = j10;
        this.f27011b = i10;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        boolean z5 = this.f27018j;
        int i = 0;
        long[] jArr = this.f27015f;
        if (z5) {
            return z.f(jArr, j10, false);
        }
        int[] iArr = this.f27017h;
        int length = iArr.length - 1;
        int i10 = -1;
        while (i <= length) {
            int iC = l7.o.c(length, i, 2, i);
            if (jArr[iArr[iC]] <= j10) {
                i = iC + 1;
                i10 = iC;
            } else {
                length = iC - 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 > 0 && jArr[iArr[i10 - 1]] == j11) {
                i10--;
            }
        }
        return iArr[i10];
    }

    public final int b(long j10) {
        boolean z5 = this.f27018j;
        long[] jArr = this.f27015f;
        if (z5) {
            return z.b(jArr, j10, true);
        }
        int[] iArr = this.f27017h;
        int length = iArr.length - 1;
        int i = 0;
        int i10 = -1;
        while (i <= length) {
            int iC = l7.o.c(length, i, 2, i);
            if (jArr[iArr[iC]] >= j10) {
                length = iC - 1;
                i10 = iC;
            } else {
                i = iC + 1;
            }
        }
        if (i10 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i10]];
        if (j11 == j10) {
            while (i10 < iArr.length - 1) {
                int i11 = i10 + 1;
                if (jArr[iArr[i11]] != j11) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }
}
