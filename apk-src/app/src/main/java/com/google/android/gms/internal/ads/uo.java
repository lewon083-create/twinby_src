package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final po f11011a = new po(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final po f11012b = new po(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final po f11013c = new po(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final po f11014d = new po(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final po f11015e = new po(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final po f11016f = new po(17);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final oy f11017g = new oy();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final po f11018h = new po(25);
    public static final oo i = new oo();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final so f11019j = new so();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final po f11020k = new po(18);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final po f11021l = new po(19);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final po f11022m = new po(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final po f11023n = new po(1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final po f11024o = new po(2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final po f11025p = new po(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final po f11026q = new po(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final po f11027r = new po(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final po f11028s = new po(6);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final po f11029t = new po(7);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final po f11030u = new po(8);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final po f11031v = new po(9);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final po f11032w = new po(10);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final po f11033x = new po(11);

    public static ed.d a(sz szVar, String str) {
        String strD;
        String strReplace;
        Uri uriB = Uri.parse(str);
        try {
            xe xeVarZ0 = szVar.Z0();
            jq0 jq0VarE1 = szVar.e1();
            if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3067jd)).booleanValue() || jq0VarE1 == null) {
                if (xeVarZ0 != null && xeVarZ0.a(uriB)) {
                    uriB = xeVarZ0.b(uriB, szVar.getContext(), szVar.i0(), szVar.d());
                }
            } else if (xeVarZ0 != null && xeVarZ0.a(uriB)) {
                uriB = jq0VarE1.a(uriB, szVar.getContext(), szVar.i0(), szVar.d());
            }
        } catch (ye unused) {
            u9.i.h("Unable to append parameter to URL: ".concat(str));
        }
        HashMap map = new HashMap();
        if (szVar.M() != null) {
            map = szVar.M().f12269w0;
        }
        Context context = szVar.getContext();
        fw fwVar = p9.k.C.f31318y;
        if (fwVar.a(context) && (strD = fwVar.d(context)) != null) {
            wk wkVar = al.H0;
            yk ykVar = q9.s.f31967e.f31970c;
            String str2 = (String) ykVar.a(wkVar);
            String string = uriB.toString();
            if (((Boolean) ykVar.a(al.G0)).booleanValue() && string.contains(str2)) {
                fwVar.h(context, "_ac", strD, fw.f((Map) map.get("_ac")));
                strReplace = fs1.I(context, string).replace(str2, strD);
            } else if (!TextUtils.isEmpty(uriB.getQueryParameter("fbs_aeid")) || ((Boolean) ykVar.a(al.F0)).booleanValue()) {
                strReplace = string;
            } else {
                String string2 = fs1.F(fs1.I(context, string), "fbs_aeid", strD).toString();
                fwVar.h(context, "_ac", strD, fw.f((Map) map.get("_ac")));
                strReplace = string2;
            }
        } else {
            strReplace = uriB.toString();
        }
        long jLongValue = ((Long) am.f3318e.r()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return vv.d(strReplace);
        }
        i81 i81VarS = i81.s(szVar.B0());
        u5 u5Var = u5.f10817c;
        gx gxVar = hx.f6285g;
        return vv.G(vv.K(vv.G(i81VarS, Throwable.class, u5Var, gxVar), new ro(strReplace, 0), gxVar), Throwable.class, new ro(strReplace, 1), gxVar);
    }

    public static void b(Map map, v80 v80Var) {
        if (((Boolean) q9.s.f31967e.f31970c.a(al.Wb)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && v80Var != null) {
            v80Var.J();
        }
    }
}
