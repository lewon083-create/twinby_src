package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 extends i61 {
    public g61(e61 e61Var, Character ch2) {
        super(e61Var, ch2);
        ix.o(e61Var.f4854b.length == 64);
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final void a(StringBuilder sb2, byte[] bArr, int i) {
        int i10 = 0;
        ix.p0(0, i, bArr.length);
        for (int i11 = i; i11 >= 3; i11 -= 3) {
            int i12 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
            char[] cArr = this.f6402a.f4854b;
            sb2.append(cArr[i12 >>> 18]);
            sb2.append(cArr[(i12 >>> 12) & 63]);
            sb2.append(cArr[(i12 >>> 6) & 63]);
            sb2.append(cArr[i12 & 63]);
            i10 += 3;
        }
        if (i10 < i) {
            d(sb2, bArr, i10, i - i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final int b(byte[] bArr, CharSequence charSequence) throws h61 {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        e61 e61Var = this.f6402a;
        if (!e61Var.f4860h[length % e61Var.f4857e]) {
            int length2 = charSequenceE.length();
            throw new h61(l7.o.j(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceE.length()) {
            int i11 = i10 + 1;
            int iA = (e61Var.a(charSequenceE.charAt(i + 1)) << 12) | (e61Var.a(charSequenceE.charAt(i)) << 18);
            bArr[i10] = (byte) (iA >>> 16);
            int i12 = i + 2;
            if (i12 < charSequenceE.length()) {
                int i13 = i + 3;
                int iA2 = iA | (e61Var.a(charSequenceE.charAt(i12)) << 6);
                int i14 = i10 + 2;
                bArr[i11] = (byte) ((iA2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                if (i13 < charSequenceE.length()) {
                    i += 4;
                    i10 += 3;
                    bArr[i14] = (byte) ((iA2 | e61Var.a(charSequenceE.charAt(i13))) & KotlinVersion.MAX_COMPONENT_VALUE);
                } else {
                    i10 = i14;
                    i = i13;
                }
            } else {
                i = i12;
                i10 = i11;
            }
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.i61
    public final i61 c(e61 e61Var, Character ch2) {
        return new g61(e61Var, ch2);
    }

    public g61(String str, String str2) {
        this(new e61(str, str2.toCharArray()), (Character) '=');
    }
}
