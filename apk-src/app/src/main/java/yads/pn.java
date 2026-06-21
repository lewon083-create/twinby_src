package yads;

import android.content.Context;
import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class pn extends y73 {
    public final d4 C;
    public final String D;
    public final w02 E;
    public final hy2 F;
    public final dy2 G;
    public final b5 H;
    public final o9 I;
    public final Context J;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pn(Context context, d4 d4Var, ct1 ct1Var, String str, String str2, w02 w02Var, wo2 wo2Var, oo ooVar, hp2 hp2Var, hy2 hy2Var, int i) {
        hy2 hy2VarA;
        if ((i & 512) != 0) {
            hy2.f39374a.getClass();
            hy2VarA = gy2.a(context);
        } else {
            hy2VarA = hy2Var;
        }
        this(context, d4Var, ct1Var, str, str2, w02Var, wo2Var, ooVar, hp2Var, hy2VarA, new dy2(hy2VarA), new b5(), new o9());
    }

    @Override // yads.y73, yads.po, yads.ro2
    public final lm3 a(lm3 lm3Var) {
        int i = h4.f39016d;
        return super.a((lm3) g4.a(lm3Var.f40609b));
    }

    @Override // yads.ro2
    public final byte[] b() {
        if (1 != e()) {
            return null;
        }
        try {
            String str = this.D;
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // yads.y73, yads.ro2
    public Map d() {
        jj.i builder = new jj.i();
        String strA = ((iy2) this.F).a();
        if (strA != null) {
        }
        builder.put(v11.F.a(), this.H.b(this.J));
        builder.put(v11.G.a(), this.H.a(this.J));
        builder.putAll(this.C.c().a());
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    @Override // yads.ro2
    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f42659c == 0) {
            sb2.append(this.D);
        }
        List list = this.C.f37614b.f42414a.f40246b;
        if (sb2.length() > 0 && !list.isEmpty()) {
            sb2.append("&");
        }
        sb2.append(CollectionsKt.I(list, "&", null, null, on.f41653b, 30));
        return Uri.parse(this.f42660d).buildUpon().encodedQuery(sb2.toString()).build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [ij.l] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // yads.y73
    public final xp2 a(h82 h82Var, int i) {
        ?? S;
        Map map;
        Integer numValueOf;
        Integer numValueOf2;
        Locale locale;
        Object objA;
        Integer numValueOf3;
        String strA;
        String str;
        rv rvVar;
        if (b(h82Var, i)) {
            Map mapD = h82Var.f39071c;
            if (mapD == null) {
                mapD = kotlin.collections.j0.d();
            }
            Map map2 = mapD;
            String strC = u01.c(map2, v11.R);
            if (strC != null) {
                wx2 wx2Var = xx2.f44838a;
                Context context = this.f41968s;
                wx2Var.getClass();
                ((vg1) ((yx2) wx2.a(context)).f45187b).a("ServerSideClientIP", strC);
            }
            if (204 != i) {
                String strC2 = u01.c(map2, v11.f43826e);
                if (strC2 == null) {
                    strC2 = "";
                }
                e00.f37941c.getClass();
                e00 e00VarA = d00.a(strC2);
                d4 d4Var = this.C;
                if (e00VarA == d4Var.f37613a) {
                    l82 l82Var = new l82(d4Var, new aq2(this.E.f44246a), new kq1(), new tq2(), new tz(), new h11(), new zg1(), new bf(), new w9());
                    this.G.a(map2);
                    int i10 = h82Var.f39069a;
                    zp2 zp2Var = new zp2(h82Var.f39070b);
                    Map mapD2 = h82Var.f39071c;
                    if (mapD2 == null) {
                        mapD2 = kotlin.collections.j0.d();
                    }
                    yp2 yp2Var = new yp2(i10, zp2Var, mapD2);
                    int iD = u01.d(map2, v11.f43824c);
                    int iD2 = u01.d(map2, v11.f43825d);
                    String strC3 = u01.c(map2, v11.I);
                    String strC4 = u01.c(map2, v11.J);
                    String strC5 = u01.c(map2, v11.f43827f);
                    String strC6 = u01.c(map2, v11.L);
                    if (strC6 != null) {
                        try {
                            ij.k kVar = ij.m.f21341c;
                            JSONObject jSONObject = new JSONObject(strC6);
                            ek.a aVarA = ek.q.a(jSONObject.keys());
                            S = new LinkedHashMap();
                            for (Object obj : aVarA) {
                                S.put(obj, jSONObject.get((String) obj));
                            }
                        } catch (Throwable th2) {
                            ij.k kVar2 = ij.m.f21341c;
                            S = com.google.android.gms.internal.measurement.h5.s(th2);
                        }
                        ij.k kVar3 = ij.m.f21341c;
                        boolean z5 = S instanceof ij.l;
                        ?? r14 = S;
                        if (z5) {
                            r14 = 0;
                        }
                        Map mapD3 = (Map) r14;
                        if (mapD3 == null) {
                            mapD3 = kotlin.collections.j0.d();
                        }
                        map = mapD3;
                    } else {
                        map = null;
                    }
                    d03 d03Var = l82Var.f40447a.f37616d.f37951a;
                    c03 c03VarB = d03Var != null ? d03Var.b() : null;
                    String strC7 = u01.c(map2, v11.f43828g);
                    int i11 = tb.f43257b;
                    if (strC7 != null) {
                        try {
                            numValueOf = Integer.valueOf(strC7);
                        } catch (NumberFormatException unused) {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    Long lValueOf = numValueOf != null ? Long.valueOf(((long) numValueOf.intValue()) * l82.i) : null;
                    String strC8 = u01.c(map2, v11.f43842v);
                    int i12 = tb.f43257b;
                    if (strC8 != null) {
                        try {
                            numValueOf2 = Integer.valueOf(strC8);
                        } catch (NumberFormatException unused2) {
                            numValueOf2 = null;
                        }
                    } else {
                        numValueOf2 = null;
                    }
                    Long lValueOf2 = numValueOf2 != null ? Long.valueOf(((long) numValueOf2.intValue()) * l82.i) : null;
                    l82Var.f40453g.getClass();
                    String strC9 = u01.c(map2, v11.f43832l);
                    Locale[] availableLocales = Locale.getAvailableLocales();
                    int length = availableLocales.length;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= length) {
                            locale = null;
                            break;
                        }
                        if (Intrinsics.a(availableLocales[i13].getLanguage(), strC9)) {
                            locale = new Locale(strC9);
                            break;
                        }
                        i13++;
                    }
                    String strC10 = u01.c(map2, v11.A);
                    boolean z10 = strC10 == null ? false : Boolean.parseBoolean(strC10);
                    String strC11 = u01.c(map2, v11.H);
                    boolean z11 = strC11 == null ? false : Boolean.parseBoolean(strC11);
                    boolean zB = u01.b(map2, v11.f43835o);
                    if (zB) {
                        objA = null;
                    } else {
                        aq2 aq2Var = l82Var.f40448b;
                        aq2Var.f36834b.getClass();
                        int i14 = yp2Var.f45141a;
                        byte[] bArr = yp2Var.f45142b.f45510a;
                        Map map3 = yp2Var.f45143c;
                        objA = aq2Var.f36833a.a(new h82(i14, bArr, map3, h82.a(map3), true));
                    }
                    jq1 jq1VarB = zB ? l82Var.f40449c.a(yp2Var) : null;
                    String str2 = l82Var.f40447a.f37615c.f39118a;
                    ArrayList arrayListE = u01.e(map2, v11.f43833m);
                    l82Var.f40454h.getClass();
                    c cVarA = w9.a(map2);
                    String strC12 = u01.c(map2, v11.f43831k);
                    int iD3 = u01.d(map2, v11.f43838r);
                    int iD4 = u01.d(map2, v11.f43839s);
                    int iD5 = u01.d(map2, v11.f43840t);
                    int iD6 = u01.d(map2, v11.f43845y);
                    String strC13 = u01.c(map2, v11.f43837q);
                    boolean zB2 = u01.b(map2, v11.i);
                    String strC14 = u01.c(map2, v11.O);
                    String strC15 = u01.c(map2, v11.P);
                    String strC16 = u01.c(map2, v11.Q);
                    String strC17 = u01.c(map2, v11.f43846z);
                    l82Var.f40451e.getClass();
                    sz szVar = (sz) tz.f43493a.get(u01.c(map2, v11.f43836p));
                    tq2 tq2Var = l82Var.f40450d;
                    tq2Var.getClass();
                    Map map4 = yp2Var.f45143c;
                    String strC18 = u01.c(map4, v11.f43841u);
                    int i15 = tb.f43257b;
                    if (strC18 != null) {
                        try {
                            numValueOf3 = Integer.valueOf(strC18);
                        } catch (NumberFormatException unused3) {
                            numValueOf3 = null;
                        }
                    } else {
                        numValueOf3 = null;
                    }
                    String strC19 = u01.c(map4, v11.f43843w);
                    if (strC19 != null) {
                        tq2Var.f43417a.getClass();
                        strA = hn.a(strC19);
                    } else {
                        strA = null;
                    }
                    if (numValueOf3 == null || strA == null || strA.length() <= 0) {
                        str = strC3;
                        rvVar = null;
                    } else {
                        str = strC3;
                        rvVar = new rv(numValueOf3.intValue(), strA);
                    }
                    String str3 = (String) CollectionsKt.firstOrNull(u01.e(map4, v11.f43844x));
                    sq2 sq2Var = new sq2(u01.b(map4, v11.C), rvVar, (str3 == null || str3.length() <= 0) ? null : new by2(str3));
                    l82Var.f40452f.getClass();
                    String strC20 = u01.c(map2, v11.f43829h);
                    j5 j5Var = (strC20 == null || strC20.length() <= 0) ? null : new j5(strC20);
                    String strC21 = u01.c(map2, v11.K);
                    boolean zB3 = u01.b(map2, v11.M);
                    String strC22 = u01.c(map2, v11.E);
                    xt0 xt0Var = strC22 != null ? new xt0(strC22) : null;
                    String strC23 = u01.c(map2, v11.f43830j);
                    boolean z12 = strC23 == null ? true : Boolean.parseBoolean(strC23);
                    String strC24 = u01.c(map2, v11.S);
                    boolean z13 = strC24 == null ? false : Boolean.parseBoolean(strC24);
                    String strC25 = u01.c(map2, v11.T);
                    boolean z14 = strC25 == null ? true : Boolean.parseBoolean(strC25);
                    String strC26 = u01.c(map2, v11.U);
                    boolean z15 = strC26 == null ? true : Boolean.parseBoolean(strC26);
                    String strC27 = u01.c(map2, v11.V);
                    boolean z16 = strC27 == null ? true : Boolean.parseBoolean(strC27);
                    String strC28 = u01.c(map2, v11.W);
                    boolean z17 = strC28 != null ? Boolean.parseBoolean(strC28) : true;
                    String strC29 = u01.c(map2, v11.X);
                    boolean z18 = strC29 == null ? false : Boolean.parseBoolean(strC29);
                    String strC30 = u01.c(map2, v11.Y);
                    boolean z19 = strC30 == null ? false : Boolean.parseBoolean(strC30);
                    String strC31 = u01.c(map2, v11.Z);
                    String strC32 = u01.c(map2, v11.f43822a0);
                    return new xp2(new v9(e00VarA, str, strC5, strC4, str2, iD, iD2, arrayListE, cVarA, lValueOf, strC12, locale, j5Var, strC21, strC17, szVar, c03VarB, strC13, strC14, jq1VarB, sq2Var, lValueOf2, objA, map, strC15, strC16, zB2, zB, z10, z11, iD3, iD4, iD5, iD6, zB3, xt0Var, z12, z13, z14, z15, z16, z17, z18, z19, strC31, strC32 == null ? false : Boolean.parseBoolean(strC32), 4096, 0), w11.a(h82Var));
                }
                return new xp2(new h4(m4.f40778k, h82Var));
            }
        }
        int i16 = h4.f39016d;
        return new xp2(g4.a(h82Var));
    }

    public boolean b(h82 h82Var, int i) {
        byte[] bArr;
        if (200 == i && (bArr = h82Var.f39070b) != null) {
            if (!(bArr.length == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context) {
        int iIntValue;
        Integer num;
        Integer num2;
        pt2 pt2VarA = fw2.a().a(context);
        if (pt2VarA != null && (num2 = pt2VarA.f42054t0) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = this.C.f37626o;
        }
        this.I.f41493a.getClass();
        pt2 pt2VarA2 = fw2.a().a(context);
        this.f42670o = new qe0(1.0f, iIntValue, (pt2VarA2 == null || (num = pt2VarA2.J) == null) ? 0 : num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Context context, d4 d4Var, ct1 ct1Var, String str, String str2, w02 w02Var, wo2 wo2Var, oo ooVar, hp2 hp2Var, hy2 hy2Var, dy2 dy2Var, b5 b5Var, o9 o9Var) {
        super(context, d4Var, 1, str, ooVar, d4Var, hp2Var, wo2Var, ct1Var, 1536);
        d4Var.c().getClass();
        this.C = d4Var;
        this.D = str2;
        this.E = w02Var;
        this.F = hy2Var;
        this.G = dy2Var;
        this.H = b5Var;
        this.I = o9Var;
        this.J = context.getApplicationContext();
        b(context);
    }
}
