package yads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class pg2 {
    public static String a(int i, int i10, String str) {
        if (i < 0) {
            return o43.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return o43.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(og2.a("negative size: ", i10));
    }

    public static void b(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(a(i, i10, "index"));
        }
    }

    public static void a(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(int i, int i10) {
        String strA;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strA = o43.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i10 >= 0) {
                strA = o43.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            } else {
                throw new IllegalArgumentException(og2.a("negative size: ", i10));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void a(int i, int i10, int i11) {
        String strA;
        if (i < 0 || i10 < i || i10 > i11) {
            if (i < 0 || i > i11) {
                strA = a(i, i11, "start index");
            } else if (i10 >= 0 && i10 <= i11) {
                strA = o43.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                strA = a(i10, i11, "end index");
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }
}
