package bd;

import a0.u;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f2058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f2063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f2064h;
    public final boolean i;

    public a(String str, char[] cArr, byte[] bArr, boolean z5) {
        str.getClass();
        this.f2057a = str;
        cArr.getClass();
        this.f2058b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iL = a0.e.l(length);
            this.f2060d = iL;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iL);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.f2061e = i;
            this.f2062f = iL >> iNumberOfTrailingZeros;
            this.f2059c = cArr.length - 1;
            this.f2063g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i10 = 0; i10 < this.f2062f; i10++) {
                int i11 = this.f2060d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[a0.e.f(i10 * 8, i11)] = true;
            }
            this.f2064h = zArr;
            this.i = z5;
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
        }
    }

    public final int a(char c8) throws d {
        if (c8 > 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c8));
        }
        byte b2 = this.f2063g[c8];
        if (b2 != -1) {
            return b2;
        }
        if (c8 <= ' ' || c8 == 127) {
            throw new d("Unrecognized character: 0x" + Integer.toHexString(c8));
        }
        throw new d("Unrecognized character: " + c8);
    }

    public final a b() {
        if (this.i) {
            return this;
        }
        byte[] bArr = this.f2063g;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        int i = 65;
        while (true) {
            if (i > 90) {
                return new a(u.o(new StringBuilder(), this.f2057a, ".ignoreCase()"), this.f2058b, bArrCopyOf, true);
            }
            int i10 = i | 32;
            byte b2 = bArr[i];
            byte b10 = bArr[i10];
            if (b2 == -1) {
                bArrCopyOf[i] = b10;
            } else {
                boolean z5 = b10 == -1;
                char c8 = (char) i;
                char c9 = (char) i10;
                if (!z5) {
                    throw new IllegalStateException(hl.d.q("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c8), Character.valueOf(c9)));
                }
                bArrCopyOf[i10] = b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.i == aVar.i && Arrays.equals(this.f2058b, aVar.f2058b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2058b) + (this.i ? 1231 : 1237);
    }

    public final String toString() {
        return this.f2057a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c8 = cArr[i];
            if (c8 < 128) {
                if (bArr[c8] == -1) {
                    bArr[c8] = (byte) i;
                } else {
                    throw new IllegalArgumentException(hl.d.q("Duplicate character: %s", Character.valueOf(c8)));
                }
            } else {
                throw new IllegalArgumentException(hl.d.q("Non-ASCII character: %s", Character.valueOf(c8)));
            }
        }
        this(str, cArr, bArr, false);
    }
}
