package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.protocol.FeatureFlag;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so implements vo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10354d;

    public /* synthetic */ so(int i, Object obj, Object obj2) {
        this.f10352b = i;
        this.f10353c = obj;
        this.f10354d = obj2;
    }

    public void a(String str, dp dpVar) {
        synchronized (this.f10353c) {
            ((HashMap) this.f10354d).put(str, dpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.vo
    public final void o(Object obj, Map map) {
        dp dpVar;
        String str;
        switch (this.f10352b) {
            case 0:
                sz szVar = (sz) obj;
                uo.b(map, (v80) this.f10353c);
                String str2 = (String) map.get("u");
                if (str2 == null) {
                    u9.i.h("URL missing from click GMSG.");
                    return;
                }
                w20 w20Var = (w20) this.f10354d;
                i81 i81VarS = i81.s(uo.a(szVar, str2));
                to toVar = new to(w20Var, str2, 0);
                gx gxVar = hx.f6279a;
                r71 r71VarJ = vv.J(i81VarS, toVar, gxVar);
                r71VarJ.a(new l81(0, r71VarJ, new qo(szVar)), gxVar);
                return;
            case 1:
                Map map2 = (Map) this.f10354d;
                p9.k kVar = p9.k.C;
                fw fwVar = kVar.f31318y;
                fw fwVar2 = kVar.f31318y;
                Context context = (Context) this.f10353c;
                if (fwVar.a(context)) {
                    String str3 = (String) map.get("eventName");
                    String str4 = (String) map.get("eventId");
                    int iHashCode = str3.hashCode();
                    if (iHashCode != 94399) {
                        if (iHashCode != 94401) {
                            if (iHashCode == 94407 && str3.equals("_ai")) {
                                Map map3 = (Map) map2.get("_ai");
                                fwVar2.getClass();
                                fwVar2.h(context, "_ai", str4, fw.f(map3));
                                return;
                            }
                        } else if (str3.equals("_ac")) {
                            Map map4 = (Map) map2.get("_ac");
                            fwVar2.getClass();
                            fwVar2.h(context, "_ac", str4, fw.f(map4));
                            return;
                        }
                    } else if (str3.equals("_aa")) {
                        fwVar2.h(context, "_aa", str4, null);
                        return;
                    }
                    u9.i.e("logScionEvent gmsg contained unsupported eventName");
                    return;
                }
                return;
            case 2:
                String str5 = (String) map.get("id");
                String str6 = (String) map.get("fail");
                String str7 = (String) map.get("fail_reason");
                String str8 = (String) map.get("fail_stack");
                String str9 = (String) map.get(FeatureFlag.JsonKeys.RESULT);
                if (true == TextUtils.isEmpty(str8)) {
                    str7 = "Unknown Fail Reason.";
                }
                String strConcat = TextUtils.isEmpty(str8) ? "" : "\n".concat(String.valueOf(str8));
                synchronized (this.f10353c) {
                    try {
                        dpVar = (dp) ((HashMap) this.f10354d).remove(str5);
                    } catch (JSONException e3) {
                        dpVar.w(e3.getMessage());
                    } finally {
                    }
                    if (dpVar == null) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 50);
                        sb2.append("Received result for unexpected method invocation: ");
                        sb2.append(str5);
                        u9.i.h(sb2.toString());
                        return;
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + strConcat.length());
                        sb3.append(str7);
                        sb3.append(strConcat);
                        dpVar.w(sb3.toString());
                        return;
                    }
                    if (str9 == null) {
                        dpVar.x(null);
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str9);
                    if (t9.c0.o()) {
                        String string = jSONObject.toString(2);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 13);
                        sb4.append("Result GMSG: ");
                        sb4.append(string);
                        t9.c0.m(sb4.toString());
                    }
                    dpVar.x(jSONObject);
                    return;
                }
            case 3:
                t90 t90Var = (t90) ((WeakReference) this.f10353c).get();
                if (t90Var == null) {
                    return;
                }
                t90Var.f10546h.a();
                wk wkVar = al.f3023ge;
                q9.s sVar = q9.s.f31967e;
                if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    View view = (View) ((WeakReference) this.f10354d).get();
                    xp0 xp0Var = t90Var.f10548k;
                    ua0 ua0Var = t90Var.F;
                    ua0Var.getClass();
                    if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || view == null) {
                        return;
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (parent == null) {
                            str = CommonUrlParts.Values.FALSE_INTEGER;
                        } else if (parent.getClass().getName().startsWith("androidx.compose.ui")) {
                            str = "1";
                        } else {
                            parent = parent.getParent();
                        }
                    }
                    zd1 zd1VarA = ua0Var.f10900a.a();
                    zd1VarA.v("action", "hcp");
                    zd1VarA.v("hcp", str);
                    zd1VarA.t(xp0Var);
                    zd1VarA.w();
                    return;
                }
                return;
            case 4:
                wa0 wa0Var = (wa0) this.f10353c;
                try {
                    wa0Var.f11712g = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    u9.i.e("Failed to call parse unconfirmedClickTimestamp.");
                }
                co coVar = (co) this.f10354d;
                wa0Var.f11711f = (String) map.get("id");
                String str10 = (String) map.get("asset_id");
                if (coVar == null) {
                    u9.i.c("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    Parcel parcelD0 = coVar.D0();
                    parcelD0.writeString(str10);
                    coVar.L1(parcelD0, 1);
                    return;
                } catch (RemoteException e7) {
                    u9.i.k("#007 Could not call remote method.", e7);
                    return;
                }
                break;
            case 5:
                xc0 xc0Var = (xc0) this.f10353c;
                sz szVar2 = (sz) this.f10354d;
                n30 n30Var = xc0Var.i;
                synchronized (n30Var) {
                    n30Var.f8168d.add(szVar2);
                    i30 i30Var = n30Var.f8166b;
                    szVar2.u0("/updateActiveView", i30Var.f6355e);
                    szVar2.u0("/untrackActiveViewUnit", i30Var.f6356f);
                }
                return;
            default:
                sz szVar3 = (sz) obj;
                String str11 = (String) map.get("u");
                if (str11 == null) {
                    u9.i.h("URL missing from httpTrack GMSG.");
                    return;
                }
                xp0 xp0VarM = szVar3.M();
                if (xp0VarM != null && !xp0VarM.f12242i0) {
                    ((bt0) this.f10353c).b(str11, xp0VarM.f12271x0, null, null);
                    return;
                }
                zp0 zp0VarI0 = szVar3.I0();
                if (zp0VarI0 == null) {
                    p9.k.C.f31302h.d("BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                kh0 kh0Var = (kh0) this.f10354d;
                p9.k.C.f31304k.getClass();
                cb cbVar = new cb(System.currentTimeMillis(), zp0VarI0.f13056b, str11, 2);
                kh0Var.getClass();
                kh0Var.a(new n90(13, kh0Var, cbVar));
                return;
        }
    }

    public so() {
        this.f10352b = 2;
        this.f10353c = new Object();
        this.f10354d = new HashMap();
    }

    public so(t90 t90Var, View view) {
        this.f10352b = 3;
        this.f10353c = new WeakReference(t90Var);
        if (((Boolean) q9.s.f31967e.f31970c.a(al.f3023ge)).booleanValue()) {
            this.f10354d = new WeakReference(view);
        } else {
            this.f10354d = new WeakReference(null);
        }
    }
}
