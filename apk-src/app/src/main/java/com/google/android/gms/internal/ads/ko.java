package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ko implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7274c;

    public /* synthetic */ ko(int i, Object obj) {
        this.f7273b = i;
        this.f7274c = obj;
    }

    public static final Bundle a(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e3) {
                p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e3);
            }
        }
        return bundle;
    }

    public static final ArrayList b(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException e3) {
            p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e3);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        z9.b bVar;
        k9.u uVar;
        HashMap map2;
        Object obj2;
        k9.g gVar;
        switch (this.f7273b) {
            case 0:
                lo loVar = (lo) this.f7274c;
                if (loVar == null) {
                    return;
                }
                String str = (String) map.get("name");
                if (str == null) {
                    u9.i.g("Ad metadata with no name parameter.");
                    str = "";
                }
                String str2 = str;
                Bundle bundleV = null;
                if (map.containsKey("info")) {
                    try {
                        bundleV = com.google.android.gms.internal.measurement.b4.V(new JSONObject((String) map.get("info")));
                    } catch (JSONException e3) {
                        u9.i.f("Failed to convert ad metadata to JSON.", e3);
                    }
                }
                if (bundleV == null) {
                    u9.i.e("Failed to convert ad metadata to Bundle.");
                    return;
                } else {
                    loVar.j(bundleV, str2);
                    return;
                }
            case 1:
                String str3 = (String) map.get("name");
                if (str3 == null) {
                    u9.i.h("App event with no name parameter.");
                    return;
                } else {
                    ((mo) this.f7274c).r0(str3, (String) map.get("info"));
                    return;
                }
            case 2:
                sz szVar = (sz) obj;
                boolean zEquals = "1".equals(map.get("transparentBackground"));
                boolean zEquals2 = "1".equals(map.get("blur"));
                float f10 = 0.0f;
                try {
                    if (map.get("blurRadius") != null) {
                        f10 = Float.parseFloat((String) map.get("blurRadius"));
                    }
                    break;
                } catch (NumberFormatException e7) {
                    u9.i.f("Fail to parse float", e7);
                }
                xo xoVar = (xo) this.f7274c;
                synchronized (xoVar) {
                    xoVar.f12216a = zEquals;
                    xoVar.f12219d.set(true);
                }
                synchronized (xoVar) {
                    xoVar.f12217b = zEquals2;
                    xoVar.f12218c = f10;
                }
                szVar.o1(zEquals);
                return;
            case 3:
                if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
                    t9.c0.m("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
                    return;
                }
                try {
                    long j10 = Long.parseLong((String) map.get("id"));
                    int i = Integer.parseInt((String) map.get("event_type"));
                    p9.k.C.f31304k.getClass();
                    ((de0) this.f7274c).a(i, j10, System.currentTimeMillis());
                    return;
                } catch (NumberFormatException e10) {
                    t9.c0.n("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e10);
                    return;
                }
            case 4:
                wk wkVar = al.Da;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    k9.h hVar = k9.h.i;
                    Bundle bundle = new Bundle();
                    bundle.putString("request_origin", "inspector_ooct");
                    k9.g gVar2 = new k9.g((k9.f) new k9.f(2).r(bundle, AdMobAdapter.class));
                    String str4 = (String) map.get("adUnitId");
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                    String str5 = (String) map.get("format");
                    String str6 = TextUtils.isEmpty(str5) ? "" : str5;
                    boolean z5 = false;
                    Activity activityD = null;
                    if (((Boolean) sVar.f31970c.a(al.Fa)).booleanValue()) {
                        if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                            z5 = true;
                        }
                        if (z5) {
                            l9.a aVar = new l9.a(2);
                            if (map.containsKey("keywords")) {
                                Iterator it = b((String) map.get("keywords"), "keywords").iterator();
                                while (it.hasNext()) {
                                    ((q9.e2) aVar.f15951b).f31827a.add((String) it.next());
                                }
                            }
                            aVar.r(a(map), AdMobAdapter.class);
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> itKeys = jSONObject.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        aVar.q(next, jSONObject.getString(next));
                                    }
                                } catch (JSONException e11) {
                                    p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e11);
                                }
                            }
                            if (map.containsKey("contentUrl")) {
                                aVar.y((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                aVar.z(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q9.e2) aVar.f15951b).f31835j = (String) map.get("requestAgent");
                            }
                            if (map.containsKey("publisherProvidedId")) {
                                ((q9.e2) aVar.f15951b).i = (String) map.get("publisherProvidedId");
                            }
                            if (map.containsKey("categoryExclusions")) {
                                Iterator it2 = b((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                                while (it2.hasNext()) {
                                    ((q9.e2) aVar.f15951b).f31832f.add((String) it2.next());
                                }
                            }
                            gVar = new l9.b(aVar);
                        } else {
                            k9.f fVar = new k9.f(2);
                            if (map.containsKey("keywords")) {
                                Iterator it3 = b((String) map.get("keywords"), "keywords").iterator();
                                while (it3.hasNext()) {
                                    ((q9.e2) fVar.f15951b).f31827a.add((String) it3.next());
                                }
                            }
                            fVar.r(a(map), AdMobAdapter.class);
                            if (map.containsKey("customTargeting")) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                                    Iterator<String> itKeys2 = jSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        fVar.q(next2, jSONObject2.getString(next2));
                                    }
                                } catch (JSONException e12) {
                                    p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e12);
                                }
                            }
                            if (map.containsKey("contentUrl")) {
                                fVar.y((String) map.get("contentUrl"));
                            }
                            if (map.containsKey("neighboringContentUrlStrings")) {
                                fVar.z(b((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                            }
                            if (map.containsKey("requestAgent")) {
                                ((q9.e2) fVar.f15951b).f31835j = (String) map.get("requestAgent");
                            }
                            gVar = new k9.g(fVar);
                        }
                        gVar2 = gVar;
                        String str7 = (String) map.get("width");
                        String str8 = (String) map.get("height");
                        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str8)) {
                            hVar = k9.h.i;
                        } else {
                            try {
                                hVar = new k9.h(Integer.parseInt(str7), Integer.parseInt(str8));
                            } catch (NumberFormatException e13) {
                                p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateAdSize", e13);
                                hVar = k9.h.i;
                            }
                        }
                        if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                            p5 p5Var = new p5();
                            if (map.containsKey("startMuted")) {
                                p5Var.f8926a = ((String) map.get("startMuted")).equals("1");
                            }
                            if (map.containsKey("customControlsRequested")) {
                                p5Var.f8927b = ((String) map.get("customControlsRequested")).equals("1");
                            }
                            if (map.containsKey("clickToExpandRequested")) {
                                p5Var.f8928c = ((String) map.get("clickToExpandRequested")).equals("1");
                            }
                            uVar = new k9.u(p5Var);
                        } else {
                            uVar = null;
                        }
                        if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (uVar != null && str6.equals("NATIVE"))) {
                            z9.b bVar2 = new z9.b();
                            if (map.containsKey("disableImageLoading")) {
                                bVar2.f46211a = ((String) map.get("disableImageLoading")).equals("1");
                            }
                            if (map.containsKey("mediaAspectRatio")) {
                                String str9 = (String) map.get("mediaAspectRatio");
                                if (!TextUtils.isEmpty(str9)) {
                                    try {
                                        bVar2.f46212b = Integer.parseInt(str9);
                                    } catch (NumberFormatException e14) {
                                        p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e14);
                                    }
                                }
                            }
                            if (map.containsKey("shouldRequestMultipleImages")) {
                                bVar2.f46213c = ((String) map.get("shouldRequestMultipleImages")).equals("1");
                            }
                            if (map.containsKey("preferredAdChoicesPosition")) {
                                String str10 = (String) map.get("preferredAdChoicesPosition");
                                if (!TextUtils.isEmpty(str10)) {
                                    try {
                                        bVar2.f46214d = Integer.parseInt(str10);
                                    } catch (NumberFormatException e15) {
                                        p9.k.C.f31302h.d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e15);
                                    }
                                }
                            }
                            if (map.containsKey("customMuteThisAdRequested")) {
                                bVar2.f46216f = ((String) map.get("customMuteThisAdRequested")).equals("1");
                            }
                            if (uVar != null) {
                                bVar2.f46215e = uVar;
                            }
                            bVar = new z9.b(bVar2);
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = null;
                        uVar = null;
                    }
                    String str11 = (String) map.get("action");
                    if (TextUtils.isEmpty(str11) || TextUtils.isEmpty(str4)) {
                        return;
                    }
                    if (!str11.equals("load") || TextUtils.isEmpty(str6)) {
                        if (str11.equals("show")) {
                            pf0 pf0Var = (pf0) this.f7274c;
                            synchronized (pf0Var) {
                                try {
                                    hf0 hf0Var = pf0Var.f9044e;
                                    sz szVar2 = hf0Var.f6122e;
                                    if (szVar2 != null && !szVar2.A0()) {
                                        activityD = hf0Var.f6122e.d();
                                    }
                                    if (activityD != null && (obj2 = (map2 = pf0Var.f9041b).get(str4)) != null) {
                                        wk wkVar2 = al.Ea;
                                        q9.s sVar2 = q9.s.f31967e;
                                        if (!((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue() || (obj2 instanceof wh) || (obj2 instanceof v9.a) || (obj2 instanceof nv) || (obj2 instanceof sv)) {
                                            map2.remove(str4);
                                        }
                                        pf0Var.n4(pf0.p4(obj2));
                                        if (obj2 instanceof wh) {
                                            ((wh) obj2).c(activityD);
                                            return;
                                        }
                                        if (obj2 instanceof v9.a) {
                                            ((v9.a) obj2).e(activityD);
                                            return;
                                        }
                                        if (obj2 instanceof nv) {
                                            ((nv) obj2).c(activityD, l80.f7434r);
                                            return;
                                        }
                                        if (obj2 instanceof sv) {
                                            ((sv) obj2).c(activityD, l80.f7433q);
                                            return;
                                        }
                                        if (((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue() && ((obj2 instanceof k9.j) || (obj2 instanceof NativeAd))) {
                                            Intent intent = new Intent();
                                            Context contextO4 = pf0Var.o4();
                                            intent.setClassName(contextO4, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                            intent.putExtra("adUnit", str4);
                                            t9.g0 g0Var = p9.k.C.f31297c;
                                            t9.g0.u(contextO4, intent);
                                            return;
                                        }
                                    }
                                    return;
                                } finally {
                                }
                            }
                        }
                        return;
                    }
                    pf0 pf0Var2 = (pf0) this.f7274c;
                    synchronized (pf0Var2) {
                        try {
                            switch (str6.hashCode()) {
                                case -1999289321:
                                    if (str6.equals("NATIVE")) {
                                        k9.d dVar = new k9.d(pf0Var2.o4(), str4);
                                        dVar.b(new ut(15, pf0Var2, str4));
                                        dVar.c(new nf0(pf0Var2));
                                        if (((Boolean) q9.s.f31967e.f31970c.a(al.Fa)).booleanValue() && bVar != null) {
                                            dVar.d(bVar);
                                        }
                                        dVar.a().a(gVar2.f27259a);
                                        return;
                                    }
                                    break;
                                case -1372958932:
                                    if (str6.equals("INTERSTITIAL")) {
                                        v9.a.b(pf0Var2.o4(), str4, gVar2, new kf0(pf0Var2, str4));
                                    }
                                    break;
                                case -428325382:
                                    if (str6.equals("APP_OPEN_AD")) {
                                        wh.b(pf0Var2.o4(), str4, gVar2, new if0(pf0Var2, str4));
                                        return;
                                    }
                                    break;
                                case 543046670:
                                    if (str6.equals("REWARDED")) {
                                        nv.b(pf0Var2.o4(), str4, gVar2, new lf0(pf0Var2, str4));
                                        return;
                                    }
                                    break;
                                case 1854800829:
                                    if (str6.equals("REWARDED_INTERSTITIAL")) {
                                        sv.b(pf0Var2.o4(), str4, gVar2, new mf0(pf0Var2, str4));
                                        return;
                                    }
                                    break;
                                case 1951953708:
                                    if (str6.equals("BANNER")) {
                                        wk wkVar3 = al.Fa;
                                        q9.s sVar3 = q9.s.f31967e;
                                        k9.l cVar = (((Boolean) sVar3.f31970c.a(wkVar3)).booleanValue() && z5) ? new l9.c(pf0Var2.o4()) : new k9.j(pf0Var2.o4());
                                        cVar.setAdSize(hVar);
                                        cVar.setAdUnitId(str4);
                                        cVar.setAdListener(new jf0(pf0Var2, str4, cVar));
                                        if (((Boolean) sVar3.f31970c.a(wkVar3)).booleanValue() && z5 && uVar != null) {
                                            ((l9.c) cVar).setVideoOptions(uVar);
                                        }
                                        cVar.b(gVar2);
                                        return;
                                    }
                                    break;
                            }
                            return;
                        } finally {
                        }
                    }
                    break;
                }
                return;
            case 5:
                ep epVar = (ep) this.f7274c;
                String str12 = (String) map.get("action");
                if (!"grant".equals(str12)) {
                    if ("video_start".equals(str12)) {
                        epVar.a();
                        return;
                    } else {
                        if ("video_complete".equals(str12)) {
                            epVar.h();
                            return;
                        }
                        return;
                    }
                }
                zu zuVar = null;
                try {
                    int i10 = Integer.parseInt((String) map.get("amount"));
                    String str13 = (String) map.get("type");
                    if (!TextUtils.isEmpty(str13)) {
                        zuVar = new zu(str13, i10);
                    }
                } catch (NumberFormatException e16) {
                    u9.i.i("Unable to parse reward amount.", e16);
                }
                epVar.N(zuVar);
                return;
            case 6:
                if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
                    return;
                }
                t9.c0.m("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
                Intent intent2 = new Intent();
                intent2.setAction("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
                if (map.containsKey("title")) {
                    intent2.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
                }
                try {
                    t9.g0 g0Var2 = p9.k.C.f31297c;
                    t9.g0.u((Context) this.f7274c, intent2);
                    return;
                } catch (RuntimeException e17) {
                    u9.i.i("Failed to open Share Sheet", e17);
                    p9.k.C.f31302h.d("ShareSheetGmsgHandler.onGmsg", e17);
                    return;
                }
            case 7:
                String str14 = (String) map.get("action");
                if (str14 == null) {
                    u9.i.h("Action missing from video GMSG.");
                    return;
                }
                if (str14.equals("src")) {
                    String str15 = (String) map.get("src");
                    if (str15 == null) {
                        u9.i.h("src missing from video GMSG.");
                        return;
                    }
                    ox0 ox0Var = (ox0) this.f7274c;
                    ox0Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("mediaUrl", str15);
                    ((jx) ox0Var.f8851c).b(bundle2);
                    return;
                }
                return;
            case 8:
                if (map != null) {
                    String str16 = (String) map.get("height");
                    if (TextUtils.isEmpty(str16)) {
                        return;
                    }
                    try {
                        int i11 = Integer.parseInt(str16);
                        g00 g00Var = (g00) this.f7274c;
                        synchronized (g00Var) {
                            try {
                                if (g00Var.I != i11) {
                                    g00Var.I = i11;
                                    g00Var.requestLayout();
                                }
                            } finally {
                            }
                            break;
                        }
                        return;
                    } catch (Exception e18) {
                        u9.i.i("Exception occurred while getting webview content height", e18);
                        return;
                    }
                }
                return;
            default:
                ((db0) this.f7274c).f4541b.d(map);
                return;
        }
    }
}
