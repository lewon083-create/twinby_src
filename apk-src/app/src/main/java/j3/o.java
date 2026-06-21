package j3;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.measurement.h5;
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
public final class o {
    public final float A;
    public final byte[] B;
    public final int C;
    public final g D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ad.j0 f26325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f26330h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f26332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b0 f26333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f26334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f26335n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f26336o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f26337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f26338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f26339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f26340s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f26341t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f26342u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f26343v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f26344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f26345x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f26346y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f26347z;

    static {
        new n().a();
        m3.z.G(0);
        m3.z.G(1);
        m3.z.G(2);
        m3.z.G(3);
        m3.z.G(4);
        gf.a.o(5, 6, 7, 8, 9);
        gf.a.o(10, 11, 12, 13, 14);
        gf.a.o(15, 16, 17, 18, 19);
        gf.a.o(20, 21, 22, 23, 24);
        gf.a.o(25, 26, 27, 28, 29);
        gf.a.o(30, 31, 32, 33, 34);
        m3.z.G(35);
        m3.z.G(36);
    }

    public o(n nVar) {
        boolean z5;
        String str;
        this.f26323a = nVar.f26281a;
        String strN = m3.z.N(nVar.f26284d);
        this.f26326d = strN;
        if (nVar.f26283c.isEmpty() && nVar.f26282b != null) {
            this.f26325c = ad.j0.w(new p(strN, nVar.f26282b));
            this.f26324b = nVar.f26282b;
        } else if (!nVar.f26283c.isEmpty() && nVar.f26282b == null) {
            ad.j0 j0Var = nVar.f26283c;
            this.f26325c = j0Var;
            Iterator it = j0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((p) j0Var.get(0)).f26350b;
                    break;
                }
                p pVar = (p) it.next();
                if (TextUtils.equals(pVar.f26349a, strN)) {
                    str = pVar.f26350b;
                    break;
                }
            }
            this.f26324b = str;
        } else if (nVar.f26283c.isEmpty() && nVar.f26282b == null) {
            z5 = true;
            h5.r(z5);
            this.f26325c = nVar.f26283c;
            this.f26324b = nVar.f26282b;
        } else {
            for (int i = 0; i < nVar.f26283c.size(); i++) {
                if (((p) nVar.f26283c.get(i)).f26350b.equals(nVar.f26282b)) {
                    z5 = true;
                    break;
                }
            }
            z5 = false;
            h5.r(z5);
            this.f26325c = nVar.f26283c;
            this.f26324b = nVar.f26282b;
        }
        this.f26327e = nVar.f26285e;
        h5.q("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", nVar.f26287g == 0 || (nVar.f26286f & 32768) != 0);
        this.f26328f = nVar.f26286f;
        this.f26329g = nVar.f26287g;
        int i10 = nVar.f26288h;
        this.f26330h = i10;
        int i11 = nVar.i;
        this.i = i11;
        this.f26331j = i11 != -1 ? i11 : i10;
        this.f26332k = nVar.f26289j;
        this.f26333l = nVar.f26290k;
        this.f26334m = nVar.f26291l;
        this.f26335n = nVar.f26292m;
        this.f26336o = nVar.f26293n;
        this.f26337p = nVar.f26294o;
        List list = nVar.f26295p;
        this.f26338q = list == null ? Collections.EMPTY_LIST : list;
        l lVar = nVar.f26296q;
        this.f26339r = lVar;
        this.f26340s = nVar.f26297r;
        this.f26341t = nVar.f26298s;
        this.f26342u = nVar.f26299t;
        this.f26343v = nVar.f26300u;
        this.f26344w = nVar.f26301v;
        this.f26345x = nVar.f26302w;
        this.f26346y = nVar.f26303x;
        int i12 = nVar.f26304y;
        this.f26347z = i12 == -1 ? 0 : i12;
        float f10 = nVar.f26305z;
        this.A = f10 == -1.0f ? 1.0f : f10;
        this.B = nVar.A;
        this.C = nVar.B;
        this.D = nVar.C;
        this.E = nVar.D;
        this.F = nVar.E;
        this.G = nVar.F;
        this.H = nVar.G;
        int i13 = nVar.H;
        this.I = i13 == -1 ? 0 : i13;
        int i14 = nVar.I;
        this.J = i14 != -1 ? i14 : 0;
        this.K = nVar.J;
        this.L = nVar.K;
        this.M = nVar.L;
        this.N = nVar.M;
        int i15 = nVar.N;
        if (i15 != 0 || lVar == null) {
            this.O = i15;
        } else {
            this.O = 1;
        }
    }

    public static String c(o oVar) {
        int i;
        String str;
        String str2;
        String str3;
        int i10;
        if (oVar == null) {
            return "null";
        }
        int i11 = oVar.f26327e;
        ad.j0 j0Var = oVar.f26325c;
        String str4 = oVar.f26326d;
        int i12 = oVar.G;
        int i13 = oVar.F;
        int i14 = oVar.E;
        float f10 = oVar.f26346y;
        g gVar = oVar.D;
        float f11 = oVar.A;
        int i15 = oVar.f26345x;
        int i16 = oVar.f26344w;
        int i17 = oVar.f26343v;
        int i18 = oVar.f26342u;
        l lVar = oVar.f26339r;
        String str5 = oVar.f26332k;
        int i19 = oVar.f26331j;
        String str6 = oVar.f26334m;
        int i20 = oVar.f26328f;
        d8.k kVar = new d8.k(String.valueOf(','));
        StringBuilder sbJ = pe.a.j("id=");
        sbJ.append(oVar.f26323a);
        sbJ.append(", mimeType=");
        sbJ.append(oVar.f26335n);
        if (str6 != null) {
            sbJ.append(", container=");
            sbJ.append(str6);
        }
        if (i19 != -1) {
            sbJ.append(", bitrate=");
            sbJ.append(i19);
        }
        if (str5 != null) {
            sbJ.append(", codecs=");
            sbJ.append(str5);
        }
        if (lVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i21 = 0;
            while (i21 < lVar.f26272e) {
                UUID uuid = lVar.f26269b[i21].f26262c;
                if (uuid.equals(f.f26232b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(f.f26233c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(f.f26235e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(f.f26234d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(f.f26231a)) {
                    linkedHashSet.add("universal");
                } else {
                    i10 = i21;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i21 = i10 + 1;
                }
                i10 = i21;
                i21 = i10 + 1;
            }
            sbJ.append(", drm=[");
            kVar.c(sbJ, linkedHashSet.iterator());
            sbJ.append(']');
        }
        if (i18 != -1 && i17 != -1) {
            om1.u(sbJ, ", res=", i18, "x", i17);
        }
        if (i16 != -1 && i15 != -1) {
            om1.u(sbJ, ", decRes=", i16, "x", i15);
        }
        double d10 = f11;
        int i22 = cd.c.f2266a;
        if (Math.copySign(d10 - 1.0d, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbJ.append(", par=");
            Object[] objArr = {Float.valueOf(f11)};
            String str7 = m3.z.f28608a;
            sbJ.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (gVar != null) {
            int i23 = gVar.f26246f;
            int i24 = gVar.f26245e;
            if ((i24 != -1 && i23 != -1) || gVar.d()) {
                sbJ.append(", color=");
                if (gVar.d()) {
                    String strB = g.b(gVar.f26241a);
                    String strA = g.a(gVar.f26242b);
                    String strC = g.c(gVar.f26243c);
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i24 == -1 || i23 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i24 + "/" + i23;
                }
                sbJ.append(str2 + "/" + str3);
            }
        }
        if (f10 != -1.0f) {
            sbJ.append(", fps=");
            sbJ.append(f10);
        }
        if (i14 != -1) {
            sbJ.append(", maxSubLayers=");
            sbJ.append(i14);
        }
        if (i13 != -1) {
            sbJ.append(", channels=");
            sbJ.append(i13);
        }
        if (i12 != -1) {
            sbJ.append(", sample_rate=");
            sbJ.append(i12);
        }
        if (str4 != null) {
            sbJ.append(", language=");
            sbJ.append(str4);
        }
        if (!j0Var.isEmpty()) {
            sbJ.append(", labels=[");
            kVar.c(sbJ, ad.q.u(j0Var, new ig.a(24)).iterator());
            sbJ.append("]");
        }
        if (i11 != 0) {
            sbJ.append(", selectionFlags=[");
            String str8 = m3.z.f28608a;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            kVar.c(sbJ, arrayList.iterator());
            sbJ.append("]");
        }
        if (i20 != 0) {
            sbJ.append(", roleFlags=[");
            String str9 = m3.z.f28608a;
            ArrayList arrayList2 = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList2.add(SentryThread.JsonKeys.MAIN);
            }
            if ((i20 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i20 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i20 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i20 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i20 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i20 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i20;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            kVar.c(sbJ, arrayList2.iterator());
            sbJ.append("]");
        } else {
            i = i20;
        }
        if ((i & 32768) != 0) {
            sbJ.append(", auxiliaryTrackType=");
            int i25 = oVar.f26329g;
            String str10 = m3.z.f28608a;
            if (i25 == 0) {
                str = StringUtils.UNDEFINED;
            } else if (i25 == 1) {
                str = "original";
            } else if (i25 == 2) {
                str = "depth-linear";
            } else if (i25 == 3) {
                str = "depth-inverse";
            } else {
                if (i25 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbJ.append(str);
        }
        return sbJ.toString();
    }

    public final n a() {
        n nVar = new n();
        nVar.f26281a = this.f26323a;
        nVar.f26282b = this.f26324b;
        nVar.f26283c = this.f26325c;
        nVar.f26284d = this.f26326d;
        nVar.f26285e = this.f26327e;
        nVar.f26286f = this.f26328f;
        nVar.f26288h = this.f26330h;
        nVar.i = this.i;
        nVar.f26289j = this.f26332k;
        nVar.f26290k = this.f26333l;
        nVar.f26291l = this.f26334m;
        nVar.f26292m = this.f26335n;
        nVar.f26293n = this.f26336o;
        nVar.f26294o = this.f26337p;
        nVar.f26295p = this.f26338q;
        nVar.f26296q = this.f26339r;
        nVar.f26297r = this.f26340s;
        nVar.f26298s = this.f26341t;
        nVar.f26299t = this.f26342u;
        nVar.f26300u = this.f26343v;
        nVar.f26301v = this.f26344w;
        nVar.f26302w = this.f26345x;
        nVar.f26303x = this.f26346y;
        nVar.f26304y = this.f26347z;
        nVar.f26305z = this.A;
        nVar.A = this.B;
        nVar.B = this.C;
        nVar.C = this.D;
        nVar.D = this.E;
        nVar.E = this.F;
        nVar.F = this.G;
        nVar.G = this.H;
        nVar.H = this.I;
        nVar.I = this.J;
        nVar.J = this.K;
        nVar.K = this.L;
        nVar.L = this.M;
        nVar.M = this.N;
        nVar.N = this.O;
        return nVar;
    }

    public final boolean b(o oVar) {
        List list = this.f26338q;
        if (list.size() != oVar.f26338q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) oVar.f26338q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final o d(o oVar) {
        String str;
        String str2;
        int i;
        int i10;
        if (this == oVar) {
            return this;
        }
        int iH = c0.h(this.f26335n);
        String str3 = oVar.f26323a;
        b0 b0VarB = oVar.f26333l;
        ad.j0 j0Var = oVar.f26325c;
        int i11 = oVar.M;
        int i12 = oVar.N;
        String str4 = oVar.f26324b;
        if (str4 == null) {
            str4 = this.f26324b;
        }
        if (j0Var.isEmpty()) {
            j0Var = this.f26325c;
        }
        if ((iH != 3 && iH != 1) || (str = oVar.f26326d) == null) {
            str = this.f26326d;
        }
        int i13 = this.f26330h;
        if (i13 == -1) {
            i13 = oVar.f26330h;
        }
        int i14 = this.i;
        if (i14 == -1) {
            i14 = oVar.i;
        }
        String str5 = this.f26332k;
        if (str5 == null) {
            String strV = m3.z.v(iH, oVar.f26332k);
            if (m3.z.W(strV).length == 1) {
                str5 = strV;
            }
        }
        b0 b0Var = this.f26333l;
        if (b0Var != null) {
            b0VarB = b0Var.b(b0VarB);
        }
        float f10 = this.f26346y;
        if (f10 == -1.0f && iH == 2) {
            f10 = oVar.f26346y;
        }
        int i15 = this.f26327e | oVar.f26327e;
        int i16 = this.f26328f | oVar.f26328f;
        l lVar = oVar.f26339r;
        ArrayList arrayList = new ArrayList();
        ad.j0 j0Var2 = j0Var;
        if (lVar != null) {
            String str6 = lVar.f26271d;
            k[] kVarArr = lVar.f26269b;
            int length = kVarArr.length;
            int i17 = 0;
            while (i17 < length) {
                int i18 = i17;
                k kVar = kVarArr[i18];
                int i19 = length;
                if (kVar.f26265f != null) {
                    arrayList.add(kVar);
                }
                i17 = i18 + 1;
                length = i19;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        l lVar2 = this.f26339r;
        if (lVar2 != null) {
            if (str2 == null) {
                str2 = lVar2.f26271d;
            }
            int size = arrayList.size();
            k[] kVarArr2 = lVar2.f26269b;
            String str7 = str2;
            int length2 = kVarArr2.length;
            int i20 = 0;
            while (i20 < length2) {
                int i21 = i20;
                k kVar2 = kVarArr2[i21];
                int i22 = length2;
                if (kVar2.f26265f != null) {
                    UUID uuid = kVar2.f26262c;
                    i10 = i12;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= size) {
                            i = size;
                            arrayList.add(kVar2);
                            break;
                        }
                        i = size;
                        if (((k) arrayList.get(i23)).f26262c.equals(uuid)) {
                            break;
                        }
                        i23++;
                        size = i;
                    }
                } else {
                    i = size;
                    i10 = i12;
                }
                i20 = i21 + 1;
                length2 = i22;
                i12 = i10;
                size = i;
            }
            str2 = str7;
        }
        int i24 = i12;
        l lVar3 = arrayList.isEmpty() ? null : new l(str2, arrayList);
        n nVarA = a();
        nVarA.f26281a = str3;
        nVarA.f26282b = str4;
        nVarA.f26283c = ad.j0.r(j0Var2);
        nVarA.f26284d = str;
        nVarA.f26285e = i15;
        nVarA.f26286f = i16;
        nVarA.f26288h = i13;
        nVarA.i = i14;
        nVarA.f26289j = str5;
        nVarA.f26290k = b0VarB;
        nVarA.f26296q = lVar3;
        nVarA.f26303x = f10;
        nVarA.L = i11;
        nVarA.M = i24;
        return new o(nVarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        int i10 = this.P;
        return (i10 == 0 || (i = oVar.P) == 0 || i10 == i) && this.f26327e == oVar.f26327e && this.f26328f == oVar.f26328f && this.f26329g == oVar.f26329g && this.f26330h == oVar.f26330h && this.i == oVar.i && this.f26336o == oVar.f26336o && this.f26340s == oVar.f26340s && this.f26342u == oVar.f26342u && this.f26343v == oVar.f26343v && this.f26344w == oVar.f26344w && this.f26345x == oVar.f26345x && this.f26347z == oVar.f26347z && this.C == oVar.C && this.E == oVar.E && this.F == oVar.F && this.G == oVar.G && this.H == oVar.H && this.I == oVar.I && this.J == oVar.J && this.K == oVar.K && this.M == oVar.M && this.N == oVar.N && this.O == oVar.O && Float.compare(this.f26346y, oVar.f26346y) == 0 && Float.compare(this.A, oVar.A) == 0 && Objects.equals(this.f26323a, oVar.f26323a) && Objects.equals(this.f26324b, oVar.f26324b) && this.f26325c.equals(oVar.f26325c) && Objects.equals(this.f26332k, oVar.f26332k) && Objects.equals(this.f26334m, oVar.f26334m) && Objects.equals(this.f26335n, oVar.f26335n) && Objects.equals(this.f26326d, oVar.f26326d) && Arrays.equals(this.B, oVar.B) && Objects.equals(this.f26333l, oVar.f26333l) && Objects.equals(this.D, oVar.D) && Objects.equals(this.f26339r, oVar.f26339r) && b(oVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.f26323a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f26324b;
            int iHashCode2 = (this.f26325c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f26326d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f26327e) * 31) + this.f26328f) * 31) + this.f26329g) * 31) + this.f26330h) * 31) + this.i) * 31;
            String str4 = this.f26332k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            b0 b0Var = this.f26333l;
            int iHashCode5 = (iHashCode4 + (b0Var == null ? 0 : b0Var.hashCode())) * VKApiCodes.CODE_CALL_LINK_OUTDATED;
            String str5 = this.f26334m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f26335n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f26346y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f26336o) * 31) + ((int) this.f26340s)) * 31) + this.f26342u) * 31) + this.f26343v) * 31) + this.f26344w) * 31) + this.f26345x) * 31)) * 31) + this.f26347z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f26323a);
        sb2.append(", ");
        sb2.append(this.f26324b);
        sb2.append(", ");
        sb2.append(this.f26334m);
        sb2.append(", ");
        sb2.append(this.f26335n);
        sb2.append(", ");
        sb2.append(this.f26332k);
        sb2.append(", ");
        sb2.append(this.f26331j);
        sb2.append(", ");
        sb2.append(this.f26326d);
        sb2.append(", [");
        sb2.append(this.f26342u);
        sb2.append(", ");
        sb2.append(this.f26343v);
        sb2.append(", ");
        sb2.append(this.f26346y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return t.z.d(this.G, "])", sb2);
    }
}
