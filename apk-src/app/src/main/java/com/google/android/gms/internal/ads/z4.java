package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f12860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f12861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12863d;

    public z4(SparseArray sparseArray, long j10, int i, long j11, long j12) {
        int i10;
        this.f12861b = sparseArray;
        this.f12862c = j10;
        this.f12863d = i;
        List list = (List) sparseArray.get(i);
        u1 u1Var = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                y4 y4Var = (y4) list.get(i12);
                jArrCopyOf3[i12] = y4Var.f12488b;
                jArrCopyOf[i12] = y4Var.f12489c;
            }
            while (true) {
                i10 = size - 1;
                if (i11 >= i10) {
                    break;
                }
                int i13 = i11 + 1;
                iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
                jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
                i11 = i13;
            }
            int i14 = i10;
            while (i14 > 0 && jArrCopyOf3[i14] >= j10) {
                i14--;
            }
            iArrCopyOf[i14] = (int) ((j11 + j12) - jArrCopyOf[i14]);
            jArrCopyOf2[i14] = j10 - jArrCopyOf3[i14];
            if (i14 < i10) {
                rs.r("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i15 = i14 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
            }
            u1Var = new u1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.f12860a = u1Var;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        u1 u1Var = this.f12860a;
        if (u1Var != null) {
            return u1Var.b(j10);
        }
        p2 p2Var = p2.f8886c;
        return new n2(p2Var, p2Var);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f12862c;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        List list = (List) this.f12861b.get(this.f12863d);
        return (list == null || list.isEmpty()) ? false : true;
    }
}
