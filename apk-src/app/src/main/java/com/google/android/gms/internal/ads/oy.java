package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A2;
import io.sentry.protocol.FeatureFlags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class oy implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8855b;

    public static int a(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                u9.d dVar = q9.r.f31959g.f31960a;
                i = u9.d.b(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder(str.length() + 34 + str2.length());
                sb2.append("Could not parse ");
                sb2.append(str);
                sb2.append(" in a video GMSG: ");
                sb2.append(str2);
                u9.i.h(sb2.toString());
            }
        }
        if (t9.c0.o()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + length + 30 + String.valueOf(str2).length() + 6 + 1);
            l7.o.t(sb3, "Parse pixels for ", str, ", got string ", str2);
            sb3.append(", int ");
            sb3.append(i);
            sb3.append(".");
            t9.c0.m(sb3.toString());
        }
        return i;
    }

    public static void b(vx vxVar, Map map) {
        sx sxVar = vxVar.f11511h;
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                int i = Integer.parseInt(str);
                if (sxVar != null) {
                    sxVar.B(i);
                }
            } catch (NumberFormatException unused) {
                u9.i.h("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            int i10 = Integer.parseInt(str2);
            if (sxVar != null) {
                sxVar.C(i10);
            }
        }
        if (str3 != null) {
            int i11 = Integer.parseInt(str3);
            if (sxVar != null) {
                sxVar.a(i11);
            }
        }
        if (str4 != null) {
            int i12 = Integer.parseInt(str4);
            if (sxVar != null) {
                sxVar.b(i12);
            }
        }
        if (str5 != null) {
            int i13 = Integer.parseInt(str5);
            if (sxVar == null) {
                return;
            }
            sxVar.c(i13);
        }
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        boolean z5;
        int i10;
        vx vxVar;
        sx sxVar;
        sz szVar = (sz) obj;
        String str = (String) map.get("action");
        if (str == null) {
            u9.i.h("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZ = (szVar.f1() == null || (vxVar = (vx) szVar.f1().f12905g) == null || (sxVar = vxVar.f11511h) == null) ? null : sxVar.z();
        if (numValueOf2 != null && numZ != null && !numValueOf2.equals(numZ) && !str.equals("load")) {
            Locale locale = Locale.US;
            u9.i.g("Event intended for player " + numValueOf2 + ", but sent to player " + numZ + " - event ignored");
            return;
        }
        Integer num = numValueOf2;
        if (u9.i.l(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb2.append("Video GMSG: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(string);
            u9.i.c(sb2.toString());
        }
        if (str.equals(A2.f22054g)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                u9.i.h("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                szVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                u9.i.h("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                u9.i.h("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                szVar.R(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                u9.i.h("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                u9.i.h("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put("event", "decoderProps");
                map2.put("error", "missingMimeTypes");
                szVar.c("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            for (String str5 : str4.split(StringUtils.COMMA)) {
                map3.put(str5, t9.b0.a(str5.trim()));
            }
            HashMap map4 = new HashMap();
            map4.put("event", "decoderProps");
            map4.put("mimeTypes", map3);
            szVar.c("onVideoEvent", map4);
            return;
        }
        z7 z7VarF1 = szVar.f1();
        if (z7VarF1 == null) {
            u9.i.h("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = szVar.getContext();
            int iA = a(context, map, "x", 0);
            int iA2 = a(context, map, "y", 0);
            int iA3 = a(context, map, "w", -1);
            wk wkVar = al.B4;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                iMin = iA3 == -1 ? szVar.t() : Math.min(iA3, szVar.t());
            } else {
                if (t9.c0.o()) {
                    int iT = szVar.t();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iA).length() + pe.a.b(String.valueOf(iA3).length() + 72, 4, String.valueOf(iT)) + 1);
                    sb3.append("Calculate width with original width ");
                    sb3.append(iA3);
                    sb3.append(", videoHost.getVideoBoundingWidth() ");
                    sb3.append(iT);
                    sb3.append(", x ");
                    sb3.append(iA);
                    sb3.append(".");
                    t9.c0.m(sb3.toString());
                }
                iMin = Math.min(iA3, szVar.t() - iA);
            }
            int iA4 = a(context, map, "h", -1);
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                iMin2 = iA4 == -1 ? szVar.G() : Math.min(iA4, szVar.G());
            } else {
                if (t9.c0.o()) {
                    int iG = szVar.G();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iA2).length() + pe.a.b(String.valueOf(iA4).length() + 75, 4, String.valueOf(iG)) + 1);
                    sb4.append("Calculate height with original height ");
                    sb4.append(iA4);
                    sb4.append(", videoHost.getVideoBoundingHeight() ");
                    sb4.append(iG);
                    sb4.append(", y ");
                    sb4.append(iA2);
                    sb4.append(".");
                    t9.c0.m(sb4.toString());
                }
                iMin2 = Math.min(iA4, szVar.G() - iA2);
            }
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z10 = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || ((vx) z7VarF1.f12905g) != null) {
                pa.c0.e("The underlay may only be modified from the UI thread.");
                vx vxVar2 = (vx) z7VarF1.f12905g;
                if (vxVar2 != null) {
                    vxVar2.l(iA, iA2, iMin, iMin2);
                    return;
                }
                return;
            }
            cy cyVar = new cy((String) map.get(FeatureFlags.TYPE));
            if (((vx) z7VarF1.f12905g) == null) {
                d00 d00Var = (d00) z7VarF1.f12902d;
                g00 g00Var = d00Var.f4408b;
                c80.g((el) g00Var.M.f11062d, g00Var.K, "vpr2");
                vx vxVar3 = new vx((Context) z7VarF1.f12901c, d00Var, i, z10, (el) d00Var.f4408b.M.f11062d, cyVar, (sd0) z7VarF1.f12904f);
                z7VarF1.f12905g = vxVar3;
                ((d00) z7VarF1.f12903e).addView(vxVar3, 0, new ViewGroup.LayoutParams(-1, -1));
                ((vx) z7VarF1.f12905g).l(iA, iA2, iMin, iMin2);
                d00Var.f4408b.f5576o.f7066m = false;
            }
            vx vxVar4 = (vx) z7VarF1.f12905g;
            if (vxVar4 != null) {
                b(vxVar4, map);
                return;
            }
            return;
        }
        i00 i00VarM = szVar.m();
        if (i00VarM != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    u9.i.h("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    float f10 = Float.parseFloat(str6);
                    synchronized (i00VarM.f6319c) {
                        i00VarM.f6326k = f10;
                    }
                    return;
                } catch (NumberFormatException unused4) {
                    u9.i.h("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                synchronized (i00VarM.f6319c) {
                    z5 = i00VarM.i;
                    i10 = i00VarM.f6322f;
                    i00VarM.f6322f = 3;
                }
                hx.f6284f.execute(new h00(i00VarM, i10, 3, z5, z5));
                return;
            }
        }
        vx vxVar5 = (vx) z7VarF1.f12905g;
        if (vxVar5 == null) {
            HashMap map5 = new HashMap();
            map5.put("event", "no_video_view");
            szVar.c("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = szVar.getContext();
            int iA5 = a(context2, map, "x", 0);
            float fA = a(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iA5, fA, 0);
            sx sxVar2 = vxVar5.f11511h;
            if (sxVar2 != null) {
                sxVar2.dispatchTouchEvent(motionEventObtain);
            }
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                u9.i.h("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                int i11 = (int) (Float.parseFloat(str7) * 1000.0f);
                sx sxVar3 = vxVar5.f11511h;
                if (sxVar3 == null) {
                    return;
                }
                sxVar3.l(i11);
                return;
            } catch (NumberFormatException unused5) {
                u9.i.h("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            vxVar5.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            vxVar5.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            sx sxVar4 = vxVar5.f11511h;
            if (sxVar4 == null) {
                return;
            }
            if (TextUtils.isEmpty(vxVar5.f11517o)) {
                vxVar5.c("no_src", new String[0]);
                return;
            } else {
                sxVar4.A(vxVar5.f11517o, vxVar5.f11518p, num);
                return;
            }
        }
        if (str.equals("loadControl")) {
            b(vxVar5, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                sx sxVar5 = vxVar5.f11511h;
                if (sxVar5 == null) {
                    return;
                }
                fy fyVar = sxVar5.f10425c;
                fyVar.f5504e = true;
                fyVar.a();
                sxVar5.o();
                return;
            }
            sx sxVar6 = vxVar5.f11511h;
            if (sxVar6 == null) {
                return;
            }
            fy fyVar2 = sxVar6.f10425c;
            fyVar2.f5504e = false;
            fyVar2.a();
            sxVar6.o();
            return;
        }
        if (str.equals("pause")) {
            sx sxVar7 = vxVar5.f11511h;
            if (sxVar7 == null) {
                return;
            }
            sxVar7.i();
            return;
        }
        if (str.equals("play")) {
            sx sxVar8 = vxVar5.f11511h;
            if (sxVar8 == null) {
                return;
            }
            sxVar8.h();
            return;
        }
        if (str.equals("show")) {
            vxVar5.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3281y2)).booleanValue() && TextUtils.isEmpty(str8)) {
                u9.i.h("Src parameter missing from src video GMSG.");
                return;
            }
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    u9.i.h("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        String string2 = jSONArray.getString(i12);
                        if (!((Boolean) q9.s.f31967e.f31970c.a(al.f3281y2)).booleanValue() || !TextUtils.isEmpty(string2)) {
                            arrayList.add(string2);
                        }
                    }
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.f3281y2)).booleanValue() && arrayList.isEmpty()) {
                        StringBuilder sb5 = new StringBuilder(str9.length() + 41);
                        sb5.append("All demuxed URLs are empty for playback: ");
                        sb5.append(str9);
                        u9.i.h(sb5.toString());
                        return;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                } catch (JSONException unused7) {
                    u9.i.h("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                szVar.R0(numValueOf.intValue());
            }
            vxVar5.f11517o = str8;
            vxVar5.f11518p = strArr;
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = szVar.getContext();
            int iA6 = a(context3, map, "dx", 0);
            int iA7 = a(context3, map, "dy", 0);
            float f11 = iA6;
            float f12 = iA7;
            sx sxVar9 = vxVar5.f11511h;
            if (sxVar9 != null) {
                sxVar9.m(f11, f12);
            }
            if (this.f8855b) {
                return;
            }
            szVar.e();
            this.f8855b = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals("watermark")) {
                vxVar5.a();
                return;
            } else {
                u9.i.h("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            u9.i.h("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            float f13 = Float.parseFloat(str10);
            sx sxVar10 = vxVar5.f11511h;
            if (sxVar10 == null) {
                return;
            }
            fy fyVar3 = sxVar10.f10425c;
            fyVar3.f5505f = f13;
            fyVar3.a();
            sxVar10.o();
        } catch (NumberFormatException unused8) {
            u9.i.h("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
