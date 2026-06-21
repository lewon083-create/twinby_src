package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Parcel;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLogEvent;
import io.sentry.protocol.FeatureFlags;
import io.sentry.protocol.Response;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class np implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8410b;

    public /* synthetic */ np(int i, Object obj) {
        this.f8409a = i;
        this.f8410b = obj;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) throws uf0, JSONException {
        int length;
        dr1 dr1Var;
        s71 s71VarK;
        yq0 yq0Var;
        to0 to0Var;
        switch (this.f8409a) {
            case 0:
                kp kpVar = (kp) obj;
                jx jxVar = new jx();
                mp mpVar = new mp(this, jxVar);
                ip ipVar = (ip) this.f8410b;
                Parcel parcelD0 = kpVar.D0();
                vg.c(parcelD0, ipVar);
                vg.e(parcelD0, mpVar);
                kpVar.X1(parcelD0, 2);
                return jxVar;
            case 1:
                tv tvVar = (tv) this.f8410b;
                Map map = (Map) obj;
                tvVar.getClass();
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = tvVar.f10729h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            dr1Var = (dr1) tvVar.f10723b.get(str);
                                        }
                                    } finally {
                                    }
                                    break;
                                }
                                if (dr1Var == null) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb2.append("Cannot find the corresponding resource object for ");
                                    sb2.append(str);
                                    vv.l(sb2.toString());
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                        dr1Var.b();
                                        ((er1) dr1Var.f9560c).F(string);
                                    }
                                    tvVar.f10727f = (length > 0) | tvVar.f10727f;
                                }
                            }
                        }
                    } catch (JSONException e3) {
                        if (((Boolean) jm.f6882a.r()).booleanValue()) {
                            u9.i.d("Failed to get SafeBrowsing metadata", e3);
                        }
                        return vv.y(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (tvVar.f10727f) {
                    synchronized (tvVar.f10729h) {
                        gq1 gq1Var = tvVar.f10722a;
                        gq1Var.b();
                        ((lr1) gq1Var.f9560c).N(10);
                        break;
                    }
                }
                boolean z5 = tvVar.f10727f;
                if (!(z5 && tvVar.f10728g.f11111h) && (!(tvVar.f10731k && tvVar.f10728g.f11110g) && (z5 || !tvVar.f10728g.f11108e))) {
                    return n81.f8237c;
                }
                synchronized (tvVar.f10729h) {
                    try {
                        for (dr1 dr1Var2 : tvVar.f10723b.values()) {
                            gq1 gq1Var2 = tvVar.f10722a;
                            er1 er1Var = (er1) dr1Var2.d();
                            gq1Var2.b();
                            ((lr1) gq1Var2.f9560c).G(er1Var);
                        }
                        gq1 gq1Var3 = tvVar.f10722a;
                        ArrayList arrayList = tvVar.f10724c;
                        gq1Var3.b();
                        ((lr1) gq1Var3.f9560c).L(arrayList);
                        ArrayList arrayList2 = tvVar.f10725d;
                        gq1Var3.b();
                        ((lr1) gq1Var3.f9560c).M(arrayList2);
                        if (((Boolean) jm.f6882a.r()).booleanValue()) {
                            String strZ = ((lr1) gq1Var3.f9560c).z();
                            String strB = ((lr1) gq1Var3.f9560c).B();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strZ).length() + 38 + String.valueOf(strB).length() + 15);
                            sb3.append("Sending SB report\n  url: ");
                            sb3.append(strZ);
                            sb3.append("\n  clickUrl: ");
                            sb3.append(strB);
                            sb3.append("\n  resources: \n");
                            StringBuilder sb4 = new StringBuilder(sb3.toString());
                            for (er1 er1Var2 : Collections.unmodifiableList(((lr1) gq1Var3.f9560c).A())) {
                                sb4.append("    [");
                                sb4.append(er1Var2.A());
                                sb4.append("] ");
                                sb4.append(er1Var2.z());
                            }
                            vv.l(sb4.toString());
                        }
                        t9.s sVarA = new t9.u(tvVar.f10726e).a(1, tvVar.f10728g.f11106c, null, ((lr1) gq1Var3.d()).b());
                        if (((Boolean) jm.f6882a.r()).booleanValue()) {
                            sVarA.f6961b.a(ke.f7204c, hx.f6279a);
                        }
                        s71VarK = vv.K(sVarA, u5.f10818d, hx.f6285g);
                    } finally {
                    }
                    break;
                }
                return s71VarK;
            case 2:
                String str2 = (String) q9.s.f31967e.f31970c.a(al.f3243vb);
                Uri.Builder builder = (Uri.Builder) this.f8410b;
                builder.appendQueryParameter(str2, "12");
                return vv.d(builder.toString());
            case 3:
                ((z7) this.f8410b).k((Throwable) obj);
                return n81.f8237c;
            case 4:
                return ((mg0) this.f8410b).c((ku) obj);
            case 5:
                return obj != null ? (s71) this.f8410b : vv.y(new rj0(1, "Retrieve required value in native ad response failed."));
            case 6:
                pg0 pg0Var = (pg0) obj;
                return vv.d(new eq0(new pp0(1, ((bg0) this.f8410b).f3779c), cw.f(new InputStreamReader(pg0Var.f9047a), pg0Var.f9048b.f7308n)));
            case 7:
                cg0 cg0Var = (cg0) this.f8410b;
                return vv.d(new eq0(new pp0(1, cg0Var.f4204d), cw.f(new StringReader(((JSONObject) obj).toString()), cg0Var.f4214o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.f8410b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put(SentryLogEvent.JsonKeys.BODY, str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put(SentryBaseEvent.JsonKeys.REQUEST, jSONObject2);
                    jSONObject.put(Response.TYPE, jSONObject3);
                    jSONObject.put(FeatureFlags.TYPE, new JSONObject());
                    return vv.d(jSONObject);
                } catch (JSONException e7) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e7.getCause())));
                }
            case 9:
                hl0 hl0Var = (hl0) this.f8410b;
                Throwable th2 = (Throwable) obj;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.K2)).booleanValue()) {
                    pn0 pn0Var = (pn0) hl0Var.f6176c;
                    bx bxVar = p9.k.C.f31302h;
                    int iJ = pn0Var.j();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(iJ).length() + 22);
                    sb5.append("OptionalSignalTimeout:");
                    sb5.append(iJ);
                    bxVar.d(sb5.toString(), th2);
                }
                return n81.f8237c;
            case 10:
                Throwable th3 = (Throwable) obj;
                String str5 = "";
                ((gx) ((xn0) this.f8410b).f12211c).a(new h30(21, th3));
                return vv.d(th3 instanceof SecurityException ? new xl0(str5, 2, 1) : th3 instanceof IllegalStateException ? new xl0(str5, 3, 1) : th3 instanceof IllegalArgumentException ? new xl0(str5, 4, 1) : th3 instanceof TimeoutException ? new xl0(str5, 5, 1) : new xl0(str5, 0, 1));
            case 11:
                return vv.d(new kl0((String) ((tl0) this.f8410b).f10658c, 4));
            case 12:
                hi hiVar = (hi) this.f8410b;
                er0 er0Var = (er0) obj;
                if (er0Var == null || (yq0Var = er0Var.f5057a) == null || (to0Var = er0Var.f5058b) == null) {
                    throw new uf0(1, "Empty prefetch");
                }
                rj rjVarZ = wj.z();
                pj pjVarA = qj.A();
                pjVarA.b();
                ((qj) pjVarA.f9560c).B();
                tj tjVarA = tj.A();
                pjVarA.b();
                ((qj) pjVarA.f9560c).C(tjVarA);
                rjVarZ.b();
                ((wj) rjVarZ.f9560c).A((qj) pjVarA.d());
                yq0Var.f12687a.h().f3623f.D((wj) rjVarZ.d());
                return hiVar.o(yq0Var, to0Var.f10674b);
            case 13:
                du0 du0Var = (du0) this.f8410b;
                Exception exc = (Exception) obj;
                synchronized (du0Var) {
                    du0Var.f4675b = true;
                    throw exc;
                }
            case 14:
                return vv.d(((jr0) this.f8410b).a(obj));
            case 15:
                cz0 cz0Var = (cz0) obj;
                if (cz0Var != null) {
                    return vv.d(cz0Var);
                }
                fz0 fz0Var = (fz0) this.f8410b;
                fz0Var.f5526e.b(51);
                return vv.J(i81.s(vv.B(new ez0(fz0Var, 2), fz0Var.f5525d)), n20.f8164n, f81.f5272b);
            case 16:
                return ((e11) this.f8410b).f4788b.i();
            case 17:
                g11 g11Var = (g11) this.f8410b;
                if (!g11Var.f5595a.a((bz0) obj)) {
                    g11Var.f5599e.b(20103);
                    throw new oc(1);
                }
                v11 v11Var = g11Var.f5596b;
                my0 my0Var = v11Var.f11206b;
                my0Var.getClass();
                c91 c91VarB = vv.B(new do0(4, my0Var), my0Var.f8039b);
                v11Var.f11208d.e(20304, c91VarB);
                return vv.K(c91VarB, new ju(12, g11Var), f81.f5272b);
            default:
                return ((m11) ((j11) this.f8410b).f6681f).j();
        }
    }

    public /* synthetic */ np(du0 du0Var, in0 in0Var) {
        this.f8409a = 13;
        this.f8410b = du0Var;
    }

    public np(fz0 fz0Var) {
        this.f8409a = 15;
        Objects.requireNonNull(fz0Var);
        this.f8410b = fz0Var;
    }

    public np(ma.k kVar, ip ipVar) {
        this.f8409a = 0;
        this.f8410b = ipVar;
    }
}
