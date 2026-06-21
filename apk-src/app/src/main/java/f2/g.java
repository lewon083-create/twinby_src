package f2;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16573a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f16574b = new char[24];

    public static void a(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str.concat(" must not be NaN"));
        }
        if (Float.isInfinite(f10)) {
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
    }

    public static void d(long j10, String str) {
        if (j10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j10 <= Long.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    public static void e(String str, int i, int i10, int i11) {
        if (i < i10) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too low)");
        }
        if (i <= i11) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i10 + ", " + i11 + "] (too high)");
    }

    public static void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void h(String str, boolean z5) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }

    public static void i(long j10, StringBuilder sb2) {
        synchronized (f16573a) {
            sb2.append(f16574b, 0, j(j10));
        }
    }

    public static int j(long j10) {
        char c8;
        int i;
        int i10;
        int i11;
        if (f16574b.length < 0) {
            f16574b = new char[0];
        }
        char[] cArr = f16574b;
        if (j10 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j10 > 0) {
            c8 = '+';
        } else {
            j10 = -j10;
            c8 = '-';
        }
        int i12 = (int) (j10 % 1000);
        int iFloor = (int) Math.floor(j10 / 1000);
        if (iFloor > 86400) {
            i = iFloor / 86400;
            iFloor -= 86400 * i;
        } else {
            i = 0;
        }
        if (iFloor > 3600) {
            i10 = iFloor / 3600;
            iFloor -= i10 * 3600;
        } else {
            i10 = 0;
        }
        if (iFloor > 60) {
            int i13 = iFloor / 60;
            iFloor -= i13 * 60;
            i11 = i13;
        } else {
            i11 = 0;
        }
        cArr[0] = c8;
        int iK = k(cArr, i, 'd', 1, false, 0);
        int iK2 = k(cArr, i10, 'h', iK, iK != 1, 0);
        int iK3 = k(cArr, i11, 'm', iK2, iK2 != 1, 0);
        int iK4 = k(cArr, i12, 'm', k(cArr, iFloor, 's', iK3, iK3 != 1, 0), true, 0);
        cArr[iK4] = 's';
        return iK4 + 1;
    }

    public static int k(char[] cArr, int i, char c8, int i10, boolean z5, int i11) {
        int i12;
        if (!z5 && i <= 0) {
            return i10;
        }
        if ((!z5 || i11 < 3) && i <= 99) {
            i12 = i10;
        } else {
            int i13 = i / 100;
            cArr[i10] = (char) (i13 + 48);
            i12 = i10 + 1;
            i -= i13 * 100;
        }
        if ((z5 && i11 >= 2) || i > 9 || i10 != i12) {
            int i14 = i / 10;
            cArr[i12] = (char) (i14 + 48);
            i12++;
            i -= i14 * 10;
        }
        cArr[i12] = (char) (i + 48);
        cArr[i12 + 1] = c8;
        return i12 + 2;
    }
}
