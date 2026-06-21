package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 implements k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4014f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f4016h;

    public c4(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f4009a = i;
        this.f4010b = str;
        this.f4011c = str2;
        this.f4012d = i10;
        this.f4013e = i11;
        this.f4014f = i12;
        this.f4015g = i13;
        this.f4016h = bArr;
    }

    public static c4 b(tk0 tk0Var) {
        int iB = tk0Var.b();
        String strH = ra.h(tk0Var.k(tk0Var.b(), StandardCharsets.US_ASCII));
        String strK = tk0Var.k(tk0Var.b(), StandardCharsets.UTF_8);
        int iB2 = tk0Var.b();
        int iB3 = tk0Var.b();
        int iB4 = tk0Var.b();
        int iB5 = tk0Var.b();
        int iB6 = tk0Var.b();
        byte[] bArr = new byte[iB6];
        tk0Var.H(bArr, 0, iB6);
        return new c4(iB, strH, strK, iB2, iB3, iB4, iB5, bArr);
    }

    @Override // com.google.android.gms.internal.ads.k8
    public final void a(w6 w6Var) {
        w6Var.b(this.f4009a, this.f4016h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f4009a == c4Var.f4009a && this.f4010b.equals(c4Var.f4010b) && this.f4011c.equals(c4Var.f4011c) && this.f4012d == c4Var.f4012d && this.f4013e == c4Var.f4013e && this.f4014f == c4Var.f4014f && this.f4015g == c4Var.f4015g && Arrays.equals(this.f4016h, c4Var.f4016h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f4016h) + ((((((((((this.f4011c.hashCode() + ((this.f4010b.hashCode() + ((this.f4009a + 527) * 31)) * 31)) * 31) + this.f4012d) * 31) + this.f4013e) * 31) + this.f4014f) * 31) + this.f4015g) * 31);
    }

    public final String toString() {
        String str = this.f4010b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f4011c;
        return om1.n(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
