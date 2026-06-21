package ck;

import com.google.android.gms.internal.ads.om1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    public static int b(int i, int i10, int i11) {
        if (i10 <= i11) {
            return i < i10 ? i10 : i > i11 ? i11 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long c(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException(om1.m(gf.a.n("Cannot coerce value to an empty range: maximum ", " is less than minimum ", j12), j11, '.'));
    }

    public static kotlin.ranges.a d(IntRange intRange, int i) {
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        n.a(i > 0, Integer.valueOf(i));
        f fVar = kotlin.ranges.a.f27525e;
        int i10 = intRange.f27526b;
        int i11 = intRange.f27527c;
        if (intRange.f27528d <= 0) {
            i = -i;
        }
        fVar.getClass();
        return new kotlin.ranges.a(i10, i11, i);
    }

    public static IntRange e(int i, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new IntRange(i, i10 - 1, 1);
        }
        IntRange.f27523f.getClass();
        return IntRange.f27524g;
    }
}
