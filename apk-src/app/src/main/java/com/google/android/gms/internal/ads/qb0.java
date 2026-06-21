package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.clientreport.DiscardedEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb0 f9416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xe f9417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.a f9418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l6.i f9419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final si f9420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f9421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wm f9422h;
    public final xb0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yc0 f9423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f9424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nc0 f9425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sd0 f9426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bt0 f9427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kh0 f9428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ph0 f9429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jq0 f9430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qd0 f9431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final de0 f9432s;

    public qb0(Context context, jb0 jb0Var, xe xeVar, u9.a aVar, l6.i iVar, si siVar, gx gxVar, iq0 iq0Var, xb0 xb0Var, yc0 yc0Var, ScheduledExecutorService scheduledExecutorService, sd0 sd0Var, bt0 bt0Var, kh0 kh0Var, nc0 nc0Var, ph0 ph0Var, jq0 jq0Var, qd0 qd0Var, de0 de0Var) {
        this.f9415a = context;
        this.f9416b = jb0Var;
        this.f9417c = xeVar;
        this.f9418d = aVar;
        this.f9419e = iVar;
        this.f9420f = siVar;
        this.f9421g = gxVar;
        this.f9422h = iq0Var.f6577j;
        this.i = xb0Var;
        this.f9423j = yc0Var;
        this.f9424k = scheduledExecutorService;
        this.f9426m = sd0Var;
        this.f9427n = bt0Var;
        this.f9428o = kh0Var;
        this.f9425l = nc0Var;
        this.f9429p = ph0Var;
        this.f9430q = jq0Var;
        this.f9431r = qd0Var;
        this.f9432s = de0Var;
    }

    public static Integer c(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final q9.m2 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(DiscardedEvent.JsonKeys.REASON);
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new q9.m2(strOptString, strOptString2);
    }

    public final ed.d a(JSONArray jSONArray, boolean z5, boolean z10, int i) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return vv.d(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        if (((Boolean) q9.s.f31967e.f31970c.a(al.I2)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, this.f9431r.f9463e, a0.u.c(i));
        }
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(b(jSONArray.optJSONObject(i10), z5, 0));
        }
        return vv.K(new a81(x41.v(arrayList), true), u5.i, this.f9421g);
    }

    public final ed.d b(JSONObject jSONObject, boolean z5, int i) {
        if (jSONObject == null) {
            return n81.f8237c;
        }
        wk wkVar = al.F4;
        q9.s sVar = q9.s.f31967e;
        yk ykVar = sVar.f31970c;
        yk ykVar2 = sVar.f31970c;
        boolean zBooleanValue = ((Boolean) ykVar.a(wkVar)).booleanValue();
        HashMap map = null;
        if (zBooleanValue && jSONObject.has((String) ykVar2.a(al.G4))) {
            map = new HashMap();
            for (String str : ((String) ykVar2.a(al.H4)).split(StringUtils.COMMA)) {
                try {
                    map.put(str, jSONObject.getString(str));
                } catch (JSONException unused) {
                }
            }
        }
        HashMap map2 = map;
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString) && map2 == null) {
            return n81.f8237c;
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.I2)).booleanValue() && i != 0) {
            a0.u.u(p9.k.C.f31304k, this.f9431r.f9463e, a0.u.c(i));
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z5 || map2 != null) {
            return vv.d(new um(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map2));
        }
        final jb0 jb0Var = this.f9416b;
        jb0Var.f6803a.getClass();
        jx jxVar = new jx();
        t9.u.f33652a.b(new t9.t(strOptString, jxVar));
        s71 s71VarK = vv.K(vv.K(jxVar, new c31() { // from class: com.google.android.gms.internal.ads.ib0
            @Override // com.google.android.gms.internal.ads.c31
            public final Object apply(Object obj) {
                jb0 jb0Var2 = jb0Var;
                jb0Var2.getClass();
                byte[] bArr = ((oa) obj).f8645b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = (int) (dOptDouble * 160.0d);
                if (!zOptBoolean) {
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                }
                wk wkVar2 = al.T6;
                q9.s sVar2 = q9.s.f31967e;
                if (((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue()) {
                    options.inJustDecodeBounds = true;
                    jb0Var2.a(bArr, options);
                    options.inJustDecodeBounds = false;
                    int i10 = options.outWidth * options.outHeight;
                    if (i10 > 0) {
                        options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i10 - 1) / ((Integer) sVar2.f31970c.a(al.U6)).intValue())) / 2);
                    }
                }
                return jb0Var2.a(bArr, options);
            }
        }, jb0Var.f6805c), new c31() { // from class: com.google.android.gms.internal.ads.nb0
            @Override // com.google.android.gms.internal.ads.c31
            public final /* synthetic */ Object apply(Object obj) {
                return new um(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.f9421g);
        return jSONObject.optBoolean("require") ? vv.J(s71VarK, new np(5, s71VarK), hx.f6285g) : vv.H(s71VarK, Exception.class, new n20(1), hx.f6285g);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r71 d(org.json.JSONObject r12, com.google.android.gms.internal.ads.xp0 r13, com.google.android.gms.internal.ads.zp0 r14, p9.a r15, com.google.android.gms.internal.ads.tv r16) {
        /*
            r11 = this;
            java.lang.String r0 = "base_url"
            java.lang.String r8 = r12.optString(r0)
            java.lang.String r0 = "html"
            java.lang.String r9 = r12.optString(r0)
            java.lang.String r0 = "width"
            r1 = 0
            int r0 = r12.optInt(r0, r1)
            java.lang.String r2 = "height"
            int r12 = r12.optInt(r2, r1)
            if (r0 != 0) goto L24
            if (r12 == 0) goto L1e
            goto L25
        L1e:
            q9.g3 r12 = q9.g3.c()
            r3 = r12
            goto L32
        L24:
            r1 = r0
        L25:
            q9.g3 r0 = new q9.g3
            k9.h r2 = new k9.h
            r2.<init>(r1, r12)
            android.content.Context r12 = r11.f9415a
            r0.<init>(r12, r2)
            r3 = r0
        L32:
            com.google.android.gms.internal.ads.xb0 r2 = r11.i
            r2.getClass()
            com.google.android.gms.internal.ads.wk r12 = com.google.android.gms.internal.ads.al.I2
            q9.s r0 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r0 = r0.f31970c
            java.lang.Object r12 = r0.a(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L56
            com.google.android.gms.internal.ads.qd0 r12 = r2.i
            android.os.Bundle r12 = r12.f9463e
            p9.k r0 = p9.k.C
            ua.a r0 = r0.f31304k
            java.lang.String r1 = "native-assets-loading-video-composition-start"
            a0.u.u(r0, r12, r1)
        L56:
            com.google.android.gms.internal.ads.n81 r12 = com.google.android.gms.internal.ads.n81.f8237c
            com.google.android.gms.internal.ads.ob0 r1 = new com.google.android.gms.internal.ads.ob0
            r10 = 1
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.concurrent.Executor r13 = r2.f12100b
            com.google.android.gms.internal.ads.r71 r12 = com.google.android.gms.internal.ads.vv.J(r12, r1, r13)
            com.google.android.gms.internal.ads.pb0 r13 = new com.google.android.gms.internal.ads.pb0
            r14 = 1
            r13.<init>(r12, r14)
            com.google.android.gms.internal.ads.gx r14 = com.google.android.gms.internal.ads.hx.f6285g
            com.google.android.gms.internal.ads.r71 r12 = com.google.android.gms.internal.ads.vv.J(r12, r13, r14)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qb0.d(org.json.JSONObject, com.google.android.gms.internal.ads.xp0, com.google.android.gms.internal.ads.zp0, p9.a, com.google.android.gms.internal.ads.tv):com.google.android.gms.internal.ads.r71");
    }
}
