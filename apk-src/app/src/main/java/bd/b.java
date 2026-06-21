package bd;

import com.google.android.gms.internal.measurement.h5;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f2065f;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f2065f = new char[512];
        char[] cArr = aVar.f2058b;
        h5.h(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr2 = this.f2065f;
            cArr2[i] = cArr[i >>> 4];
            cArr2[i | 256] = cArr[i & 15];
        }
    }

    @Override // bd.e
    public final int a(byte[] bArr, CharSequence charSequence) throws d {
        if (charSequence.length() % 2 == 1) {
            throw new d("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            a aVar = this.f2067a;
            bArr[i10] = (byte) ((aVar.a(cCharAt) << 4) | aVar.a(charSequence.charAt(i + 1)));
            i += 2;
            i10++;
        }
        return i10;
    }

    @Override // bd.e
    public final void c(StringBuilder sb2, byte[] bArr, int i) {
        h5.p(0, i, bArr.length);
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f2065f;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }
}
