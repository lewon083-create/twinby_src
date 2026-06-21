package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 extends i61 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final char[] f5251g;

    public f61(e61 e61Var) {
        super(e61Var, (Character) null);
        this.f5251g = new char[512];
        ix.o(e61Var.f4854b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f5251g;
            char[] cArr2 = e61Var.f4854b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final void a(StringBuilder sb2, byte[] bArr, int i) {
        ix.p0(0, i, bArr.length);
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = bArr[i10] & 255;
            char[] cArr = this.f5251g;
            sb2.append(cArr[i11]);
            sb2.append(cArr[i11 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final int b(byte[] bArr, CharSequence charSequence) throws h61 {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new h61(l7.o.j(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            e61 e61Var = this.f6402a;
            bArr[i10] = (byte) ((e61Var.a(cCharAt) << 4) | e61Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i10++;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final i61 c(e61 e61Var, Character ch2) {
        return new f61(e61Var);
    }
}
