package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f6726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f6728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f6729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f6731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f6733h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6734j;

    public j6(g6 g6Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z5, long j10, int i10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        ix.o(length == length2);
        ix.o(jArr.length == length2);
        int length3 = iArr2.length;
        ix.o(length3 == length2);
        this.f6726a = g6Var;
        this.f6728c = jArr;
        this.f6729d = iArr;
        this.f6730e = i;
        this.f6731f = jArr2;
        this.f6732g = iArr2;
        this.f6733h = iArr3;
        this.f6734j = z5;
        this.i = j10;
        this.f6727b = i10;
        if (length3 > 0) {
            int i11 = length3 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j10) {
        boolean z5 = this.f6734j;
        int i = 0;
        long[] jArr = this.f6731f;
        if (z5) {
            return cq0.q(jArr, j10, false);
        }
        int[] iArr = this.f6733h;
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
            while (i10 > 0) {
                int i11 = i10 - 1;
                if (jArr[iArr[i11]] != j11) {
                    break;
                }
                i10 = i11;
            }
        }
        return iArr[i10];
    }

    public final int b(long j10) {
        boolean z5 = this.f6734j;
        long[] jArr = this.f6731f;
        if (z5) {
            String str = cq0.f4293a;
            int iBinarySearch = Arrays.binarySearch(jArr, j10);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                int i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j10) {
                    break;
                }
                iBinarySearch = i;
            }
            return iBinarySearch;
        }
        int[] iArr = this.f6733h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int iC = l7.o.c(length, i10, 2, i10);
            if (jArr[iArr[iC]] >= j10) {
                length = iC - 1;
                i11 = iC;
            } else {
                i10 = iC + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i12 = i11 + 1;
                if (jArr[iArr[i12]] != j11) {
                    break;
                }
                i11 = i12;
            }
        }
        return iArr[i11];
    }
}
