package wl;

import com.google.android.gms.internal.ads.oc;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char[] f35325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringReader f35326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f35332h = new String[512];

    public a(StringReader stringReader, int i) {
        k3.f.r(stringReader.markSupported());
        this.f35326b = stringReader;
        this.f35325a = new char[i > 32768 ? 32768 : i];
        b();
    }

    public static String c(char[] cArr, String[] strArr, int i, int i10) {
        if (i10 > 12) {
            return new String(cArr, i, i10);
        }
        if (i10 < 1) {
            return "";
        }
        int i11 = 0;
        int i12 = i;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            i14 = (i14 * 31) + cArr[i12];
            i13++;
            i12++;
        }
        int length = i14 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i10);
            strArr[length] = str2;
            return str2;
        }
        if (i10 == str.length()) {
            int i15 = i;
            int i16 = i10;
            while (true) {
                int i17 = i16 - 1;
                if (i16 == 0) {
                    return str;
                }
                int i18 = i15 + 1;
                int i19 = i11 + 1;
                if (cArr[i15] != str.charAt(i11)) {
                    break;
                }
                i15 = i18;
                i16 = i17;
                i11 = i19;
            }
        }
        String str3 = new String(cArr, i, i10);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f35329e++;
    }

    public final void b() {
        StringReader stringReader = this.f35326b;
        int i = this.f35329e;
        if (i < this.f35328d) {
            return;
        }
        try {
            stringReader.skip(i);
            stringReader.mark(32768);
            int i10 = stringReader.read(this.f35325a);
            stringReader.reset();
            if (i10 != -1) {
                this.f35327c = i10;
                this.f35330f += this.f35329e;
                this.f35329e = 0;
                this.f35331g = 0;
                if (i10 > 24576) {
                    i10 = 24576;
                }
                this.f35328d = i10;
            }
        } catch (IOException e3) {
            throw new oc(e3);
        }
    }

    public final char d() {
        b();
        int i = this.f35329e;
        char c8 = i >= this.f35327c ? (char) 65535 : this.f35325a[i];
        this.f35329e = i + 1;
        return c8;
    }

    public final String e() {
        char[] cArr;
        char c8;
        b();
        int i = this.f35329e;
        while (true) {
            int i10 = this.f35329e;
            int i11 = this.f35327c;
            cArr = this.f35325a;
            if (i10 >= i11 || (((c8 = cArr[i10]) < 'A' || c8 > 'Z') && ((c8 < 'a' || c8 > 'z') && !Character.isLetter(c8)))) {
                break;
            }
            this.f35329e++;
        }
        return c(cArr, this.f35332h, i, this.f35329e - i);
    }

    public final String f(char c8) {
        char[] cArr;
        int i;
        b();
        int i10 = this.f35329e;
        while (true) {
            int i11 = this.f35327c;
            cArr = this.f35325a;
            if (i10 >= i11) {
                i = -1;
                break;
            }
            if (c8 == cArr[i10]) {
                i = i10 - this.f35329e;
                break;
            }
            i10++;
        }
        String[] strArr = this.f35332h;
        if (i != -1) {
            String strC = c(cArr, strArr, this.f35329e, i);
            this.f35329e += i;
            return strC;
        }
        b();
        int i12 = this.f35329e;
        String strC2 = c(cArr, strArr, i12, this.f35327c - i12);
        this.f35329e = this.f35327c;
        return strC2;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i = this.f35329e;
        int i10 = this.f35327c;
        loop0: while (true) {
            int i11 = this.f35329e;
            cArr2 = this.f35325a;
            if (i11 >= i10) {
                break;
            }
            for (char c8 : cArr) {
                if (cArr2[this.f35329e] == c8) {
                    break loop0;
                }
            }
            this.f35329e++;
        }
        int i12 = this.f35329e;
        return i12 > i ? c(cArr2, this.f35332h, i, i12 - i) : "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i = this.f35329e;
        int i10 = this.f35327c;
        while (true) {
            int i11 = this.f35329e;
            cArr2 = this.f35325a;
            if (i11 >= i10 || Arrays.binarySearch(cArr, cArr2[i11]) >= 0) {
                break;
            }
            this.f35329e++;
        }
        int i12 = this.f35329e;
        return i12 > i ? c(cArr2, this.f35332h, i, i12 - i) : "";
    }

    public final char i() {
        b();
        int i = this.f35329e;
        if (i >= this.f35327c) {
            return (char) 65535;
        }
        return this.f35325a[i];
    }

    public final boolean j() {
        b();
        return this.f35329e >= this.f35327c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f35327c - this.f35329e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.f35325a[this.f35329e + i]) {
                }
            }
            this.f35329e = str.length() + this.f35329e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f35327c - this.f35329e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.f35325a[this.f35329e + i])) {
                }
            }
            this.f35329e = str.length() + this.f35329e;
            return true;
        }
        return false;
    }

    public final boolean m(char c8) {
        return !j() && this.f35325a[this.f35329e] == c8;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c8 = this.f35325a[this.f35329e];
            for (char c9 : cArr) {
                if (c9 == c8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c8 = this.f35325a[this.f35329e];
        if (c8 < 'A' || c8 > 'Z') {
            return (c8 >= 'a' && c8 <= 'z') || Character.isLetter(c8);
        }
        return true;
    }

    public final int p(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i = this.f35329e;
        while (i < this.f35327c) {
            char[] cArr = this.f35325a;
            if (cCharAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.f35327c) {
                        break;
                    }
                } while (cCharAt != cArr[i]);
            }
            int i10 = i + 1;
            int length = (str.length() + i10) - 1;
            int i11 = this.f35327c;
            if (i < i11 && length <= i11) {
                int i12 = i10;
                for (int i13 = 1; i12 < length && str.charAt(i13) == cArr[i12]; i13++) {
                    i12++;
                }
                if (i12 == length) {
                    return i - this.f35329e;
                }
            }
            i = i10;
        }
        return -1;
    }

    public final void q() {
        this.f35329e--;
    }

    public final String toString() {
        int i = this.f35329e;
        return new String(this.f35325a, i, this.f35327c - i);
    }
}
