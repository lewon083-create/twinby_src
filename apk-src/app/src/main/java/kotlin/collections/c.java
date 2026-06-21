package kotlin.collections;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public c(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i, int i10, int i11) {
        if (i < 0 || i10 > i11) {
            StringBuilder sbI = t.z.i("startIndex: ", i, ", endIndex: ", i10, ", size: ");
            sbI.append(i11);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i > i10) {
            throw new IllegalArgumentException(a0.u.j(i, i10, "startIndex: ", " > endIndex: "));
        }
    }

    public static void b(int i, int i10) {
        if (i < 0 || i >= i10) {
            throw new IndexOutOfBoundsException(a0.u.j(i, i10, "index: ", ", size: "));
        }
    }

    public static void c(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(a0.u.j(i, i10, "index: ", ", size: "));
        }
    }

    public static void d(int i, int i10, int i11) {
        if (i < 0 || i10 > i11) {
            StringBuilder sbI = t.z.i("fromIndex: ", i, ", toIndex: ", i10, ", size: ");
            sbI.append(i11);
            throw new IndexOutOfBoundsException(sbI.toString());
        }
        if (i > i10) {
            throw new IllegalArgumentException(a0.u.j(i, i10, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int e(int i, int i10) {
        int i11 = i + (i >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        return i11 - 2147483639 > 0 ? i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i11;
    }
}
