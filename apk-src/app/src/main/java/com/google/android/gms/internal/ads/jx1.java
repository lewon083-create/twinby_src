package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jx1 {
    public static final /* synthetic */ int N = 0;
    public final byte[] A;
    public final int B;
    public final rm1 C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public int M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x41 f6966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6971h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f9 f6973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f6978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lv1 f6979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f6980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f6981s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f6982t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f6983u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f6984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6985w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f6986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f6987y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final float f6988z;

    static {
        new jx1(new ow1());
        String str = cq0.f4293a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public jx1(ow1 ow1Var) {
        boolean z5;
        String str;
        this.f6964a = ow1Var.f8822a;
        String strO = cq0.o(ow1Var.f8825d);
        this.f6967d = strO;
        if (ow1Var.f8824c.isEmpty() && ow1Var.f8823b != null) {
            this.f6966c = x41.q(new qy1(strO, ow1Var.f8823b));
            this.f6965b = ow1Var.f8823b;
        } else if (!ow1Var.f8824c.isEmpty() && ow1Var.f8823b == null) {
            x41 x41Var = ow1Var.f8824c;
            this.f6966c = x41Var;
            Iterator it = x41Var.iterator();
            while (true) {
                u31 u31Var = (u31) it;
                if (!u31Var.hasNext()) {
                    str = ((qy1) x41Var.get(0)).f9640b;
                    break;
                }
                qy1 qy1Var = (qy1) u31Var.next();
                if (TextUtils.equals(qy1Var.f9639a, strO)) {
                    str = qy1Var.f9640b;
                    break;
                }
            }
            this.f6965b = str;
        } else if (ow1Var.f8824c.isEmpty() && ow1Var.f8823b == null) {
            z5 = true;
            ix.k0(z5);
            this.f6966c = ow1Var.f8824c;
            this.f6965b = ow1Var.f8823b;
        } else {
            for (int i = 0; i < ow1Var.f8824c.size(); i++) {
                if (((qy1) ow1Var.f8824c.get(i)).f9640b.equals(ow1Var.f8823b)) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
            ix.k0(z5);
            this.f6966c = ow1Var.f8824c;
            this.f6965b = ow1Var.f8823b;
        }
        this.f6968e = ow1Var.f8826e;
        this.f6969f = ow1Var.f8827f;
        int i10 = ow1Var.f8828g;
        this.f6970g = i10;
        int i11 = ow1Var.f8829h;
        this.f6971h = i11;
        this.i = i11 != -1 ? i11 : i10;
        this.f6972j = ow1Var.i;
        this.f6973k = ow1Var.f8830j;
        this.f6974l = ow1Var.f8831k;
        this.f6975m = ow1Var.f8832l;
        this.f6976n = ow1Var.f8833m;
        this.f6977o = ow1Var.f8834n;
        List list = ow1Var.f8835o;
        this.f6978p = list == null ? Collections.EMPTY_LIST : list;
        lv1 lv1Var = ow1Var.f8836p;
        this.f6979q = lv1Var;
        this.f6980r = ow1Var.f8837q;
        this.f6981s = ow1Var.f8838r;
        this.f6982t = ow1Var.f8839s;
        this.f6983u = ow1Var.f8840t;
        this.f6984v = ow1Var.f8841u;
        this.f6985w = ow1Var.f8842v;
        this.f6986x = ow1Var.f8843w;
        int i12 = ow1Var.f8844x;
        this.f6987y = i12 == -1 ? 0 : i12;
        float f10 = ow1Var.f8845y;
        this.f6988z = f10 == -1.0f ? 1.0f : f10;
        this.A = ow1Var.f8846z;
        this.B = ow1Var.A;
        this.C = ow1Var.B;
        this.D = ow1Var.C;
        this.E = ow1Var.D;
        this.F = ow1Var.E;
        this.G = ow1Var.F;
        int i13 = ow1Var.G;
        this.H = i13 == -1 ? 0 : i13;
        int i14 = ow1Var.H;
        this.I = i14 != -1 ? i14 : 0;
        this.J = ow1Var.I;
        this.K = ow1Var.J;
        int i15 = ow1Var.K;
        if (i15 != 0 || lv1Var == null) {
            this.L = i15;
        } else {
            this.L = 1;
        }
    }

    public static String c(jx1 jx1Var) {
        String str;
        String string;
        int i;
        int i10;
        StringBuilder sbJ = pe.a.j("id=");
        sbJ.append(jx1Var.f6964a);
        sbJ.append(", mimeType=");
        sbJ.append(jx1Var.f6975m);
        String str2 = jx1Var.f6974l;
        if (str2 != null) {
            sbJ.append(", container=");
            sbJ.append(str2);
        }
        int i11 = jx1Var.i;
        if (i11 != -1) {
            sbJ.append(", bitrate=");
            sbJ.append(i11);
        }
        String str3 = jx1Var.f6972j;
        if (str3 != null) {
            sbJ.append(", codecs=");
            sbJ.append(str3);
        }
        lv1 lv1Var = jx1Var.f6979q;
        if (lv1Var != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < lv1Var.f7653e; i12++) {
                UUID uuid = lv1Var.f7650b[i12].f3435c;
                if (uuid.equals(gx0.f5926b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(gx0.f5927c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(gx0.f5929e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(gx0.f5928d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(gx0.f5925a)) {
                    linkedHashSet.add("universal");
                } else {
                    String string2 = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string2);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbJ.append(", drm=[");
            vv.A(sbJ, linkedHashSet.iterator(), StringUtils.COMMA);
            sbJ.append(']');
        }
        int i13 = jx1Var.f6982t;
        if (i13 != -1 && (i10 = jx1Var.f6983u) != -1) {
            om1.u(sbJ, ", res=", i13, "x", i10);
        }
        int i14 = jx1Var.f6984v;
        if (i14 != -1 && (i = jx1Var.f6985w) != -1) {
            om1.u(sbJ, ", decRes=", i14, "x", i);
        }
        float f10 = jx1Var.f6988z;
        int i15 = q61.f9357a;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbJ.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str4 = cq0.f4293a;
            sbJ.append(String.format(Locale.US, "%.3f", objArr));
        }
        rm1 rm1Var = jx1Var.C;
        if (rm1Var != null) {
            int i16 = rm1Var.f9998f;
            int i17 = rm1Var.f9997e;
            if ((i17 != -1 && i16 != -1) || rm1Var.d()) {
                sbJ.append(", color=");
                if (rm1Var.d()) {
                    String strE = rm1.e(rm1Var.f9993a);
                    String strG = rm1.g(rm1Var.f9994b);
                    String strF = rm1.f(rm1Var.f9995c);
                    String str5 = cq0.f4293a;
                    Locale locale = Locale.US;
                    str = strE + "/" + strG + "/" + strF;
                } else {
                    str = "NA/NA/NA";
                }
                if (i17 == -1 || i16 == -1) {
                    string = "NA/NA";
                } else {
                    StringBuilder sb3 = new StringBuilder(pe.a.a(i17, 1) + String.valueOf(i16).length());
                    sb3.append(i17);
                    sb3.append("/");
                    sb3.append(i16);
                    string = sb3.toString();
                }
                StringBuilder sb4 = new StringBuilder(string.length() + str.length() + 1);
                sb4.append(str);
                sb4.append("/");
                sb4.append(string);
                sbJ.append(sb4.toString());
            }
        }
        float f11 = jx1Var.f6986x;
        if (f11 != -1.0f) {
            sbJ.append(", fps=");
            sbJ.append(f11);
        }
        int i18 = jx1Var.D;
        if (i18 != -1) {
            sbJ.append(", maxSubLayers=");
            sbJ.append(i18);
        }
        int i19 = jx1Var.E;
        if (i19 != -1) {
            sbJ.append(", channels=");
            sbJ.append(i19);
        }
        int i20 = jx1Var.F;
        if (i20 != -1) {
            sbJ.append(", sample_rate=");
            sbJ.append(i20);
        }
        String str6 = jx1Var.f6967d;
        if (str6 != null) {
            sbJ.append(", language=");
            sbJ.append(str6);
        }
        x41 x41Var = jx1Var.f6966c;
        if (!x41Var.isEmpty()) {
            sbJ.append(", labels=[");
            vv.A(sbJ, ix.J(x41Var, f11.f5174d).iterator(), StringUtils.COMMA);
            sbJ.append("]");
        }
        int i21 = jx1Var.f6968e;
        if (i21 != 0) {
            sbJ.append(", selectionFlags=[");
            String str7 = cq0.f4293a;
            ArrayList arrayList = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i21 & 2) != 0) {
                arrayList.add("forced");
            }
            vv.A(sbJ, arrayList.iterator(), StringUtils.COMMA);
            sbJ.append("]");
        }
        int i22 = jx1Var.f6969f;
        if (i22 != 0) {
            sbJ.append(", roleFlags=[");
            int i23 = i22 & 32768;
            String str8 = cq0.f4293a;
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add(SentryThread.JsonKeys.MAIN);
            }
            if ((i22 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i22 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i22 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i22 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i22 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i22 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i22 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i22 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i22 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i22 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i22 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i22 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i22 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i22 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i23 != 0) {
                arrayList2.add("auxiliary");
            }
            vv.A(sbJ, arrayList2.iterator(), StringUtils.COMMA);
            sbJ.append("]");
        }
        if ((i22 & 32768) != 0) {
            sbJ.append(", auxiliaryTrackType=");
            String str9 = cq0.f4293a;
            sbJ.append(StringUtils.UNDEFINED);
        }
        return sbJ.toString();
    }

    public final ow1 a() {
        return new ow1(this);
    }

    public final boolean b(jx1 jx1Var) {
        List list = this.f6978p;
        int size = list.size();
        List list2 = jx1Var.f6978p;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || jx1.class != obj.getClass()) {
            return false;
        }
        jx1 jx1Var = (jx1) obj;
        int i10 = this.M;
        return (i10 == 0 || (i = jx1Var.M) == 0 || i10 == i) && this.f6968e == jx1Var.f6968e && this.f6969f == jx1Var.f6969f && this.f6970g == jx1Var.f6970g && this.f6971h == jx1Var.f6971h && this.f6976n == jx1Var.f6976n && this.f6980r == jx1Var.f6980r && this.f6982t == jx1Var.f6982t && this.f6983u == jx1Var.f6983u && this.f6984v == jx1Var.f6984v && this.f6985w == jx1Var.f6985w && this.f6987y == jx1Var.f6987y && this.B == jx1Var.B && this.D == jx1Var.D && this.E == jx1Var.E && this.F == jx1Var.F && this.G == jx1Var.G && this.H == jx1Var.H && this.I == jx1Var.I && this.J == jx1Var.J && this.L == jx1Var.L && Float.compare(this.f6986x, jx1Var.f6986x) == 0 && Float.compare(this.f6988z, jx1Var.f6988z) == 0 && Objects.equals(this.f6964a, jx1Var.f6964a) && Objects.equals(this.f6965b, jx1Var.f6965b) && this.f6966c.equals(jx1Var.f6966c) && Objects.equals(this.f6972j, jx1Var.f6972j) && Objects.equals(this.f6974l, jx1Var.f6974l) && Objects.equals(this.f6975m, jx1Var.f6975m) && Objects.equals(this.f6967d, jx1Var.f6967d) && Arrays.equals(this.A, jx1Var.A) && Objects.equals(this.f6973k, jx1Var.f6973k) && Objects.equals(this.C, jx1Var.C) && Objects.equals(this.f6979q, jx1Var.f6979q) && b(jx1Var);
    }

    public final int hashCode() {
        int i = this.M;
        if (i != 0) {
            return i;
        }
        String str = this.f6964a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f6965b;
        int iHashCode2 = this.f6966c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f6967d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f6968e) * 31) + this.f6969f) * VKApiCodes.CODE_CALL_LINK_OUTDATED) + this.f6970g) * 31) + this.f6971h) * 31;
        String str4 = this.f6972j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        f9 f9Var = this.f6973k;
        int iHashCode5 = iHashCode4 + (f9Var == null ? 0 : f9Var.hashCode());
        String str5 = this.f6974l;
        int iHashCode6 = ((iHashCode5 * VKApiCodes.CODE_CALL_LINK_OUTDATED) + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.f6988z) + ((((Float.floatToIntBits(this.f6986x) + ((((((((((((((iHashCode6 + (this.f6975m != null ? r1.hashCode() : 0)) * 31) + this.f6976n) * 31) + ((int) this.f6980r)) * 31) + this.f6982t) * 31) + this.f6983u) * 31) + this.f6984v) * 31) + this.f6985w) * 31)) * 31) + this.f6987y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) - 1) * 31) - 1) * 31) + this.L;
        this.M = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.C);
        String str = this.f6964a;
        int length = String.valueOf(str).length();
        String str2 = this.f6965b;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f6974l;
        int length3 = String.valueOf(str3).length();
        String str4 = this.f6975m;
        int length4 = String.valueOf(str4).length();
        String str5 = this.f6972j;
        int length5 = String.valueOf(str5).length();
        int i = this.i;
        int length6 = String.valueOf(i).length();
        String str6 = this.f6967d;
        int length7 = String.valueOf(str6).length();
        int i10 = this.f6982t;
        int length8 = String.valueOf(i10).length();
        int i11 = this.f6983u;
        int length9 = String.valueOf(i11).length();
        float f10 = this.f6986x;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i12 = this.E;
        int length12 = String.valueOf(i12).length();
        int i13 = this.F;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i13).length() + 2);
        l7.o.t(sb2, "Format(", str, ", ", str2);
        l7.o.t(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i12);
        return l7.o.l(sb2, ", ", i13, "])");
    }
}
