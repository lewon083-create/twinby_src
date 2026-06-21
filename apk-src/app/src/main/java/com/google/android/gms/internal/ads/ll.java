package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f7558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aa.i0 f7559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.c0 f7560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wd0 f7561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f7562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kl f7563f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.firebase.messaging.y f7564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f7565h;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public JSONArray f7567k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f7568l;

    public ll(ScheduledExecutorService scheduledExecutorService, aa.i0 i0Var, aa.c0 c0Var, wd0 wd0Var) {
        this.f7558a = scheduledExecutorService;
        this.f7559b = i0Var;
        this.f7560c = c0Var;
        this.f7561d = wd0Var;
    }

    public final void a(String str) {
        try {
            com.google.firebase.messaging.y yVar = this.f7564g;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f7566j).toString());
            e(jSONObject);
            if (((Boolean) gm.f5856c.r()).booleanValue()) {
                jSONObject.put("as", this.f7560c.b());
            }
            yVar.v(jSONObject.toString());
            aa.v vVar = new aa.v(this, str);
            if (((Boolean) gm.f5858e.r()).booleanValue()) {
                this.f7559b.a(this.f7564g, vVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            v7.f.n(this.f7568l, new k9.g((k9.f) new k9.f(2).r(bundle, AdMobAdapter.class)), vVar);
        } catch (JSONException e3) {
            u9.i.f("Error creating JSON: ", e3);
        }
    }

    public final JSONObject b(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) gm.f5858e.r()).booleanValue() ? ((Long) gm.f5861h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) gm.f5856c.r()).booleanValue()) {
            jSONObject.put("as", this.f7560c.b());
        }
        return jSONObject;
    }

    public final JSONObject c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) gm.f5858e.r()).booleanValue() ? ((Long) gm.f5861h.r()).longValue() : 0L);
        e(jSONObject);
        if (((Boolean) gm.f5856c.r()).booleanValue()) {
            jSONObject.put("as", this.f7560c.b());
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (((java.lang.Boolean) q9.s.f31967e.f31970c.a(com.google.android.gms.internal.ads.al.f2974db)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.kl r0 = r7.f7563f
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            u9.i.e(r0)
            return
        La:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f7250a
            boolean r0 = r0.get()
            if (r0 == 0) goto L13
            return
        L13:
            java.lang.String r0 = r7.f7565h
            if (r0 == 0) goto L98
            com.google.firebase.messaging.y r0 = r7.f7564g
            if (r0 == 0) goto L98
            java.util.concurrent.ScheduledExecutorService r0 = r7.f7558a
            if (r0 == 0) goto L98
            long r1 = r7.i
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L28
            goto L3a
        L28:
            p9.k r1 = p9.k.C
            ua.a r1 = r1.f31304k
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.i
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L3a
            goto L4c
        L3a:
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.internal.ads.al.f2974db
            q9.s r2 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r2 = r2.f31970c
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L98
        L4c:
            com.google.firebase.messaging.y r1 = r7.f7564g
            java.lang.String r2 = r7.f7565h
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.Object r4 = r1.f14901d
            q.f r4 = (q.f) r4
            java.lang.Object r1 = r1.f14900c
            b.d r1 = (b.d) r1
            android.os.Bundle r5 = new android.os.Bundle     // Catch: android.os.RemoteException -> L80
            r5.<init>()     // Catch: android.os.RemoteException -> L80
            boolean r6 = r5.isEmpty()     // Catch: android.os.RemoteException -> L80
            if (r6 == 0) goto L70
            r5 = 0
        L70:
            if (r5 == 0) goto L7b
            r3.putAll(r5)     // Catch: android.os.RemoteException -> L80
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.D0(r4, r2, r3)     // Catch: android.os.RemoteException -> L80
            goto L80
        L7b:
            b.b r1 = (b.b) r1     // Catch: android.os.RemoteException -> L80
            r1.n0(r4, r2)     // Catch: android.os.RemoteException -> L80
        L80:
            com.google.android.gms.internal.ads.s r1 = r7.f7562e
            com.google.android.gms.internal.ads.wk r2 = com.google.android.gms.internal.ads.al.f2989eb
            q9.s r3 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r3 = r3.f31970c
            java.lang.Object r2 = r3.a(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L98:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            t9.c0.m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ll.d():void");
    }

    public final void e(JSONObject jSONObject) {
        try {
            if (this.f7567k == null) {
                this.f7567k = new JSONArray((String) q9.s.f31967e.f31970c.a(al.f3021gb));
            }
            jSONObject.put("eids", this.f7567k);
        } catch (JSONException e3) {
            u9.i.f("Error fetching the PACT active eids JSON: ", e3);
        }
    }
}
