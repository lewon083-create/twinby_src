package ij;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final y f21362c = new y(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21363b;

    public /* synthetic */ z(long j10) {
        this.f21363b = j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = ((z) obj).f21363b;
        long j11 = this.f21363b ^ Long.MIN_VALUE;
        long j12 = j10 ^ Long.MIN_VALUE;
        if (j11 < j12) {
            return -1;
        }
        return j11 == j12 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f21363b == ((z) obj).f21363b;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21363b);
    }

    public final String toString() {
        long j10 = this.f21363b;
        if (j10 >= 0) {
            String string = Long.toString(j10, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String string2 = Long.toString(j12, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb2.append(string2);
        String string3 = Long.toString(j13, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        sb2.append(string3);
        return sb2.toString();
    }
}
