package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f10779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f10780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f10781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10782f;

    public u1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f10778b = iArr;
        this.f10779c = jArr;
        this.f10780d = jArr2;
        this.f10781e = jArr3;
        int length = iArr.length;
        this.f10777a = length;
        if (length <= 0) {
            this.f10782f = 0L;
        } else {
            int i = length - 1;
            this.f10782f = jArr2[i] + jArr3[i];
        }
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final n2 b(long j10) {
        long[] jArr = this.f10781e;
        int iQ = cq0.q(jArr, j10, true);
        long j11 = jArr[iQ];
        long[] jArr2 = this.f10779c;
        p2 p2Var = new p2(j11, jArr2[iQ]);
        if (j11 >= j10 || iQ == this.f10777a - 1) {
            return new n2(p2Var, p2Var);
        }
        int i = iQ + 1;
        return new n2(p2Var, new p2(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final long h() {
        return this.f10782f;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean j() {
        return true;
    }

    public final String toString() {
        String string = Arrays.toString(this.f10778b);
        String string2 = Arrays.toString(this.f10779c);
        String string3 = Arrays.toString(this.f10781e);
        String string4 = Arrays.toString(this.f10780d);
        int i = this.f10777a;
        int length = String.valueOf(i).length();
        int length2 = String.valueOf(string).length();
        int length3 = String.valueOf(string2).length();
        StringBuilder sb2 = new StringBuilder(length + 26 + length2 + 10 + length3 + 9 + String.valueOf(string3).length() + 14 + String.valueOf(string4).length() + 1);
        sb2.append("ChunkIndex(length=");
        sb2.append(i);
        sb2.append(", sizes=");
        sb2.append(string);
        l7.o.t(sb2, ", offsets=", string2, ", timeUs=", string3);
        return t.z.g(sb2, ", durationsUs=", string4, ")");
    }
}
