package c5;

import com.google.android.gms.internal.ads.w6;
import j3.a0;
import j3.c0;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import m3.p;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f2221h;

    public a(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f2214a = i;
        this.f2215b = str;
        this.f2216c = str2;
        this.f2217d = i10;
        this.f2218e = i11;
        this.f2219f = i12;
        this.f2220g = i13;
        this.f2221h = bArr;
    }

    public static a d(p pVar) {
        int iM = pVar.m();
        String strN = c0.n(pVar.x(pVar.m(), StandardCharsets.US_ASCII));
        String strX = pVar.x(pVar.m(), StandardCharsets.UTF_8);
        int iM2 = pVar.m();
        int iM3 = pVar.m();
        int iM4 = pVar.m();
        int iM5 = pVar.m();
        int iM6 = pVar.m();
        byte[] bArr = new byte[iM6];
        pVar.k(bArr, 0, iM6);
        return new a(iM, strN, strX, iM2, iM3, iM4, iM5, bArr);
    }

    @Override // j3.a0
    public final void b(w6 w6Var) {
        w6Var.a(this.f2214a, this.f2221h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2214a == aVar.f2214a && this.f2215b.equals(aVar.f2215b) && this.f2216c.equals(aVar.f2216c) && this.f2217d == aVar.f2217d && this.f2218e == aVar.f2218e && this.f2219f == aVar.f2219f && this.f2220g == aVar.f2220g && Arrays.equals(this.f2221h, aVar.f2221h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2221h) + ((((((((gf.a.e(gf.a.e((527 + this.f2214a) * 31, 31, this.f2215b), 31, this.f2216c) + this.f2217d) * 31) + this.f2218e) * 31) + this.f2219f) * 31) + this.f2220g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f2215b + ", description=" + this.f2216c;
    }
}
