package bd;

import com.google.android.gms.internal.measurement.h5;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends e {
    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new a(str, charArray), (Character) '=');
        h5.h(charArray.length == 64);
    }

    @Override // bd.e
    public final int a(byte[] bArr, CharSequence charSequence) throws d {
        CharSequence charSequenceD = d(charSequence);
        int length = charSequenceD.length();
        a aVar = this.f2067a;
        if (!aVar.f2064h[length % aVar.f2061e]) {
            throw new d("Invalid input length " + charSequenceD.length());
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceD.length()) {
            int i11 = i + 2;
            int iA = (aVar.a(charSequenceD.charAt(i + 1)) << 12) | (aVar.a(charSequenceD.charAt(i)) << 18);
            int i12 = i10 + 1;
            bArr[i10] = (byte) (iA >>> 16);
            if (i11 < charSequenceD.length()) {
                int i13 = i + 3;
                int iA2 = iA | (aVar.a(charSequenceD.charAt(i11)) << 6);
                int i14 = i10 + 2;
                bArr[i12] = (byte) ((iA2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i13 < charSequenceD.length()) {
                    i += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iA2 | aVar.a(charSequenceD.charAt(i13))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i10 = i14;
                    i = i13;
                }
            } else {
                i10 = i12;
                i = i11;
            }
        }
        return i10;
    }

    @Override // bd.e
    public final void c(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        h5.p(0, i, bArr.length);
        for (int i11 = i; i11 >= 3; i11 -= 3) {
            int i12 = i10 + 2;
            int i13 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
            i10 += 3;
            int i14 = i13 | (bArr[i12] & 255);
            a aVar = this.f2067a;
            char[] cArr = aVar.f2058b;
            char[] cArr2 = aVar.f2058b;
            sb2.append(cArr[i14 >>> 18]);
            sb2.append(cArr2[(i14 >>> 12) & 63]);
            sb2.append(cArr2[(i14 >>> 6) & 63]);
            sb2.append(cArr2[i14 & 63]);
        }
        if (i10 < i) {
            b(sb2, bArr, i10, i - i10);
        }
    }
}
