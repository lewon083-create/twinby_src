package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.vk.api.sdk.exceptions.VKApiCodes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 implements a7, n5.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2805h;

    public a8(List list, int i) {
        switch (i) {
            case 1:
                this.f2805h = new m3.p();
                if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                    byte[] bArr = (byte[]) list.get(0);
                    this.f2800c = bArr[24];
                    this.f2801d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                    this.f2802e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
                    int i10 = bArr[25] * 20;
                    this.f2804g = i10;
                    boolean z5 = (bArr[0] & 32) != 0;
                    this.f2799b = z5;
                    if (!z5) {
                        this.f2803f = 0.85f;
                    } else {
                        this.f2803f = m3.z.i(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
                    }
                } else {
                    this.f2800c = 0;
                    this.f2801d = -1;
                    this.f2802e = "sans-serif";
                    this.f2799b = false;
                    this.f2803f = 0.85f;
                    this.f2804g = -1;
                }
                break;
            default:
                this.f2805h = new tk0();
                if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                    byte[] bArr2 = (byte[]) list.get(0);
                    this.f2800c = bArr2[24];
                    this.f2801d = ((bArr2[26] & 255) << 24) | ((bArr2[27] & 255) << 16) | ((bArr2[28] & 255) << 8) | (bArr2[29] & 255);
                    this.f2802e = true == "Serif".equals(new String(bArr2, 43, bArr2.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
                    int i11 = bArr2[25] * 20;
                    this.f2804g = i11;
                    boolean z10 = (bArr2[0] & 32) != 0;
                    this.f2799b = z10;
                    if (!z10) {
                        this.f2803f = 0.85f;
                    } else {
                        this.f2803f = Math.max(0.0f, Math.min(((bArr2[11] & 255) | ((bArr2[10] & 255) << 8)) / i11, 0.95f));
                    }
                } else {
                    this.f2800c = 0;
                    this.f2801d = -1;
                    this.f2802e = "sans-serif";
                    this.f2799b = false;
                    this.f2803f = 0.85f;
                    this.f2804g = -1;
                }
                break;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            boolean z5 = (i & 1) != 0;
            boolean z10 = (i & 2) != 0;
            if (z5) {
                if (z10) {
                    l7.o.o(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    l7.o.o(1, spannableStringBuilder, i11, i12, i14);
                }
            } else if (z10) {
                l7.o.o(2, spannableStringBuilder, i11, i12, i14);
            }
            boolean z11 = (i & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z5 || z10) {
                return;
            }
            l7.o.o(0, spannableStringBuilder, i11, i12, i14);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            int i15 = i & 1;
            int i16 = i & 2;
            boolean z5 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    l7.o.o(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    l7.o.o(1, spannableStringBuilder, i11, i12, i14);
                    z5 = false;
                }
            } else if (i16 != 0) {
                l7.o.o(2, spannableStringBuilder, i11, i12, i14);
            } else {
                z5 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            } else {
                if (i15 != 0 || z5) {
                    return;
                }
                l7.o.o(0, spannableStringBuilder, i11, i12, i14);
            }
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i11, i12, i13 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.a7
    public void c(int i, int i10, a4.g gVar, byte[] bArr) {
        String strK;
        int i11;
        int i12;
        float f10;
        int i13;
        float fMax;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        tk0 tk0Var = (tk0) this.f2805h;
        tk0Var.z(i + i10, bArr);
        tk0Var.E(i);
        int i19 = 0;
        int i20 = 1;
        int i21 = 2;
        ix.o(tk0Var.B() >= 2);
        int iL = tk0Var.L();
        if (iL == 0) {
            strK = "";
        } else {
            int i22 = tk0Var.f10642b;
            Charset charsetQ = tk0Var.q();
            int i23 = tk0Var.f10642b - i22;
            if (charsetQ == null) {
                charsetQ = StandardCharsets.UTF_8;
            }
            strK = tk0Var.k(iL - i23, charsetQ);
        }
        if (strK.isEmpty()) {
            v41 v41Var = x41.f12018c;
            gVar.mo0a(new v6(-9223372036854775807L, -9223372036854775807L, r51.f9713f));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK);
        int length = spannableStringBuilder.length();
        int i24 = this.f2800c;
        d(spannableStringBuilder, i24, 0, 0, length, 16711680);
        int i25 = i24;
        int length2 = spannableStringBuilder.length();
        int i26 = this.f2801d;
        e(spannableStringBuilder, i26, -1, 0, length2, 16711680);
        int i27 = i26;
        int length3 = spannableStringBuilder.length();
        String str = this.f2802e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f12 = this.f2803f;
        while (tk0Var.B() >= 8) {
            int i28 = tk0Var.f10642b;
            int iB = tk0Var.b();
            int iB2 = tk0Var.b();
            if (iB2 == 1937013100) {
                ix.o(tk0Var.B() >= i21 ? i20 : i19);
                int iL2 = tk0Var.L();
                int i29 = i19;
                while (i29 < iL2) {
                    ix.o(tk0Var.B() >= 12 ? i20 : i19);
                    int iL3 = tk0Var.L();
                    int iL4 = tk0Var.L();
                    tk0Var.G(i21);
                    int i30 = iL2;
                    int iK = tk0Var.K();
                    tk0Var.G(i20);
                    int iB3 = tk0Var.b();
                    if (iL4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                        StringBuilder sb2 = new StringBuilder(pe.a.b(String.valueOf(iL4).length() + 44, 2, String.valueOf(length4)));
                        sb2.append("Truncating styl end (");
                        sb2.append(iL4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length4);
                        sb2.append(").");
                        rs.r("Tx3gParser", sb2.toString());
                        iL4 = spannableStringBuilder.length();
                    } else {
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                    }
                    if (iL3 >= iL4) {
                        StringBuilder sb3 = new StringBuilder(pe.a.b(String.valueOf(iL3).length() + 36, 2, String.valueOf(iL4)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iL3);
                        sb3.append(") >= end (");
                        sb3.append(iL4);
                        sb3.append(").");
                        rs.r("Tx3gParser", sb3.toString());
                        i17 = i29;
                        i16 = i30;
                        i18 = i15;
                    } else {
                        i16 = i30;
                        i17 = i29;
                        d(spannableStringBuilder, iK, i14, iL3, iL4, 0);
                        i18 = i15;
                        e(spannableStringBuilder, iB3, i18, iL3, iL4, 0);
                    }
                    iL2 = i16;
                    i27 = i18;
                    f12 = f11;
                    i25 = i14;
                    i20 = 1;
                    i21 = 2;
                    i29 = i17 + 1;
                    i19 = 0;
                }
                i11 = i25;
                i12 = i27;
                f10 = f12;
                i13 = i21;
            } else {
                i11 = i25;
                i12 = i27;
                f10 = f12;
                if (iB2 == 1952608120 && this.f2799b) {
                    i13 = 2;
                    ix.o(tk0Var.B() >= 2);
                    float fL = tk0Var.L();
                    String str2 = cq0.f4293a;
                    fMax = Math.max(0.0f, Math.min(fL / this.f2804g, 0.95f));
                    tk0Var.E(i28 + iB);
                    i21 = i13;
                    i27 = i12;
                    i19 = 0;
                    i20 = 1;
                    f12 = fMax;
                    i25 = i11;
                } else {
                    i13 = 2;
                }
            }
            fMax = f10;
            tk0Var.E(i28 + iB);
            i21 = i13;
            i27 = i12;
            i19 = 0;
            i20 = 1;
            f12 = fMax;
            i25 = i11;
        }
        gVar.mo0a(new v6(-9223372036854775807L, -9223372036854775807L, x41.q(new z40(spannableStringBuilder, null, null, null, f12, 0, 0, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n5.m
    public void p(byte[] bArr, int i, int i10, n5.l lVar, m3.g gVar) {
        String strX;
        int i11;
        int i12;
        m3.p pVar = (m3.p) this.f2805h;
        pVar.K(i + i10, bArr);
        pVar.M(i);
        int i13 = 1;
        int i14 = 0;
        int i15 = 2;
        com.google.android.gms.internal.measurement.h5.h(pVar.a() >= 2);
        int iG = pVar.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i16 = pVar.f28590b;
            Charset charsetI = pVar.I();
            int i17 = iG - (pVar.f28590b - i16);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = pVar.x(i17, charsetI);
        }
        if (strX.isEmpty()) {
            ad.h0 h0Var = ad.j0.f818c;
            gVar.accept(new n5.a(-9223372036854775807L, -9223372036854775807L, ad.b1.f768f));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        b(spannableStringBuilder, this.f2800c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f2801d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.f2802e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fI = this.f2803f;
        while (pVar.a() >= 8) {
            int i18 = pVar.f28590b;
            int iM = pVar.m();
            int iM2 = pVar.m();
            if (iM2 == 1937013100) {
                com.google.android.gms.internal.measurement.h5.h(pVar.a() >= i15 ? i13 : i14);
                int iG2 = pVar.G();
                int i19 = i14;
                while (i19 < iG2) {
                    com.google.android.gms.internal.measurement.h5.h(pVar.a() >= 12 ? i13 : i14);
                    int iG3 = pVar.G();
                    int iG4 = pVar.G();
                    pVar.N(i15);
                    int i20 = i19;
                    int iZ = pVar.z();
                    pVar.N(i13);
                    int iM3 = pVar.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbM = l7.o.m(iG4, "Truncating styl end (", ") to cueText.length() (");
                        sbM.append(spannableStringBuilder.length());
                        sbM.append(").");
                        m3.b.s("Tx3gParser", sbM.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        m3.b.s("Tx3gParser", om1.j("Ignoring styl with start (", iG3, ") >= end (", iG4, ")."));
                        i12 = i20;
                    } else {
                        i12 = i20;
                        int i21 = iG4;
                        b(spannableStringBuilder, iZ, this.f2800c, iG3, i21, 0);
                        a(spannableStringBuilder, iM3, this.f2801d, iG3, i21, 0);
                    }
                    i19 = i12 + 1;
                    i13 = 1;
                    i14 = 0;
                    i15 = 2;
                }
                i11 = i15;
            } else if (iM2 == 1952608120 && this.f2799b) {
                i11 = 2;
                com.google.android.gms.internal.measurement.h5.h(pVar.a() >= 2);
                fI = m3.z.i(pVar.G() / this.f2804g, 0.0f, 0.95f);
            } else {
                i11 = 2;
            }
            pVar.M(i18 + iM);
            i15 = i11;
            i13 = 1;
            i14 = 0;
        }
        gVar.accept(new n5.a(-9223372036854775807L, -9223372036854775807L, ad.j0.w(new l3.b(spannableStringBuilder, null, null, null, fI, 0, 0, -3.4028235E38f, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR, 0.0f, 0))));
    }

    @Override // n5.m
    public int s() {
        return 2;
    }
}
