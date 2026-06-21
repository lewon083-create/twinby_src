package bd;

import com.google.android.gms.internal.measurement.h5;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f2066e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Character f2068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f2069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile e f2070d;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f2066e = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(bd.a r3, java.lang.Character r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f2067a = r3
            if (r4 == 0) goto L17
            char r0 = r4.charValue()
            byte[] r3 = r3.f2063g
            int r1 = r3.length
            if (r0 >= r1) goto L17
            r3 = r3[r0]
            r0 = -1
            if (r3 == r0) goto L17
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            java.lang.String r0 = "Padding character %s was already in alphabet"
            com.google.android.gms.internal.measurement.h5.j(r3, r0, r4)
            r2.f2068b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.e.<init>(bd.a, java.lang.Character):void");
    }

    public int a(byte[] bArr, CharSequence charSequence) {
        CharSequence charSequenceD = d(charSequence);
        int length = charSequenceD.length();
        a aVar = this.f2067a;
        boolean[] zArr = aVar.f2064h;
        int i = aVar.f2060d;
        int i10 = aVar.f2061e;
        if (!zArr[length % i10]) {
            throw new d("Invalid input length " + charSequenceD.length());
        }
        int i11 = 0;
        for (int i12 = 0; i12 < charSequenceD.length(); i12 += i10) {
            long jA = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                jA <<= i;
                if (i12 + i14 < charSequenceD.length()) {
                    jA |= (long) aVar.a(charSequenceD.charAt(i13 + i12));
                    i13++;
                }
            }
            int i15 = aVar.f2062f;
            int i16 = (i15 * 8) - (i13 * i);
            int i17 = (i15 - 1) * 8;
            while (i17 >= i16) {
                bArr[i11] = (byte) ((jA >>> i17) & 255);
                i17 -= 8;
                i11++;
            }
        }
        return i11;
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i, int i10) {
        h5.p(i, i + i10, bArr.length);
        a aVar = this.f2067a;
        int i11 = aVar.f2062f;
        int i12 = aVar.f2060d;
        int i13 = 0;
        h5.h(i10 <= i11);
        long j10 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            j10 = (j10 | ((long) (bArr[i + i14] & 255))) << 8;
        }
        int i15 = ((i10 + 1) * 8) - i12;
        while (i13 < i10 * 8) {
            sb2.append(aVar.f2058b[((int) (j10 >>> (i15 - i13))) & aVar.f2059c]);
            i13 += i12;
        }
        Character ch2 = this.f2068b;
        if (ch2 != null) {
            while (i13 < aVar.f2062f * 8) {
                sb2.append(ch2.charValue());
                i13 += i12;
            }
        }
    }

    public void c(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        h5.p(0, i, bArr.length);
        while (i10 < i) {
            a aVar = this.f2067a;
            b(sb2, bArr, i10, Math.min(aVar.f2062f, i - i10));
            i10 += aVar.f2062f;
        }
    }

    public final CharSequence d(CharSequence charSequence) {
        charSequence.getClass();
        Character ch2 = this.f2068b;
        if (ch2 == null) {
            return charSequence;
        }
        char cCharValue = ch2.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f2067a.equals(eVar.f2067a) && Objects.equals(this.f2068b, eVar.f2068b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2067a.hashCode() ^ Objects.hashCode(this.f2068b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f2067a;
        sb2.append(aVar);
        if (8 % aVar.f2060d != 0) {
            Character ch2 = this.f2068b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public e(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }
}
