package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sj0 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rr0 f10301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k60 f10302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final at0 f10303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bt0 f10304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f10305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f10306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t40 f10307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final oj0 f10308h;
    public final ei0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f10309j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final as0 f10310k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.c f10311l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qd0 f10312m;

    public sj0(Context context, rr0 rr0Var, oj0 oj0Var, k60 k60Var, at0 at0Var, bt0 bt0Var, t40 t40Var, gx gxVar, ScheduledExecutorService scheduledExecutorService, ei0 ei0Var, as0 as0Var, com.google.android.gms.internal.consent_sdk.c cVar, qd0 qd0Var) {
        this.f10309j = context;
        this.f10301a = rr0Var;
        this.f10308h = oj0Var;
        this.f10302b = k60Var;
        this.f10303c = at0Var;
        this.f10304d = bt0Var;
        this.f10307g = t40Var;
        this.f10305e = gxVar;
        this.f10306f = scheduledExecutorService;
        this.i = ei0Var;
        this.f10310k = as0Var;
        this.f10311l = cVar;
        this.f10312m = qd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(com.google.android.gms.internal.ads.eq0 r6) {
        /*
            com.google.android.gms.internal.ads.wk r0 = com.google.android.gms.internal.ads.al.f3180r6
            q9.s r1 = q9.s.f31967e
            com.google.android.gms.internal.ads.yk r2 = r1.f31970c
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            com.google.android.gms.internal.ads.cw r6 = r6.f5033b
            java.lang.Object r6 = r6.f4348d
            com.google.android.gms.internal.ads.zp0 r6 = (com.google.android.gms.internal.ads.zp0) r6
            int r3 = r6.f13060f
            if (r3 == 0) goto L5b
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3c
            if (r3 >= r5) goto L3c
            com.google.android.gms.internal.ads.wk r3 = com.google.android.gms.internal.ads.al.f3165q6
            com.google.android.gms.internal.ads.yk r1 = r1.f31970c
            java.lang.Object r1 = r1.a(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L5b
            goto L5c
        L3c:
            if (r3 < r5) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L45
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = l7.o.j(r3, r0, r1)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            com.google.android.gms.internal.ads.fa1 r6 = r6.f13063j
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.f5304b
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sj0.b(com.google.android.gms.internal.ads.eq0):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        ed.d dVarR;
        int i;
        Bundle bundle;
        sj0 sj0Var = this;
        eq0 eq0Var = (eq0) obj;
        wk wkVar = al.B2;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && (bundle = (Bundle) eq0Var.f5033b.f4350f) != null) {
            sj0Var.f10312m.f9463e.putAll(bundle);
        }
        if (((Boolean) sVar.f31970c.a(al.C2)).booleanValue()) {
            a0.u.u(p9.k.C.f31304k, sj0Var.f10312m.f9463e, "rendering-start");
        }
        String strB = b(eq0Var);
        ei0 ei0Var = sj0Var.i;
        cw cwVar = eq0Var.f5033b;
        zp0 zp0Var = (zp0) cwVar.f4348d;
        ei0Var.f4965d = zp0Var;
        if (((Boolean) sVar.f31970c.a(al.f3213t9)).booleanValue() && (i = zp0Var.f13060f) != 0 && (i < 200 || i >= 300)) {
            return vv.y(new rj0(3, strB));
        }
        String str = zp0Var.f13070q;
        if (!((Boolean) sVar.f31970c.a(al.f3106m4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (xp0 xp0Var : (List) cwVar.f4347c) {
                ei0Var.b(xp0Var, ei0Var.f4962a.size());
                Iterator it = xp0Var.f12227a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ei0Var.c(xp0Var, 0L, vv.C(1, null, null), false);
                        break;
                    }
                    zh0 zh0VarA = sj0Var.f10307g.a(xp0Var.f12229b, (String) it.next());
                    if (zh0VarA == null || !zh0VarA.a(eq0Var, xp0Var)) {
                    }
                }
            }
        } else {
            List list = (List) cwVar.f4347c;
            synchronized (ei0Var) {
                Map map = ei0Var.f4963b;
                if (map.containsKey(str)) {
                    q9.i3 i3Var = (q9.i3) map.get(str);
                    List list2 = ei0Var.f4962a;
                    int iIndexOf = list2.indexOf(i3Var);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e3) {
                        p9.k.C.f31302h.d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e3);
                    }
                    ei0Var.f4963b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ei0Var.b((xp0) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        k60 k60Var = sj0Var.f10302b;
        a30 a30Var = new a30(eq0Var, sj0Var.f10304d, sj0Var.f10303c);
        Executor executor = sj0Var.f10305e;
        k60Var.x1(a30Var, executor);
        if (zp0Var.f13071r > 1) {
            com.google.android.gms.internal.consent_sdk.c cVar = sj0Var.f10311l;
            synchronized (cVar) {
                try {
                    if (!((AtomicBoolean) cVar.f13343g).getAndSet(true)) {
                        List list3 = (List) eq0Var.f5033b.f4347c;
                        if (list3.isEmpty()) {
                            ((y81) cVar.f13342f).f(new rj0(3, b(eq0Var)));
                        } else {
                            cVar.i = eq0Var;
                            oj0 oj0Var = (oj0) cVar.f13340d;
                            cVar.f13344h = new gj0(eq0Var, oj0Var, (y81) cVar.f13342f);
                            oj0Var.a(list3);
                            for (xp0 xp0VarA = ((gj0) cVar.f13344h).a(); xp0VarA != null; xp0VarA = ((gj0) cVar.f13344h).a()) {
                                cVar.v(xp0VarA);
                            }
                        }
                    }
                    dVarR = (y81) cVar.f13342f;
                } finally {
                }
            }
        } else {
            String strB2 = b(eq0Var);
            rr0 rr0Var = sj0Var.f10301a;
            pr0 pr0Var = pr0.RENDER_CONFIG_INIT;
            Objects.requireNonNull(rr0Var);
            dVarR = new hi(rr0Var, pr0Var, null, rr0.f10029d, Collections.EMPTY_LIST, vv.y(new rj0(3, strB2))).r();
            oj0 oj0Var2 = sj0Var.f10308h;
            synchronized (oj0Var2) {
                oj0Var2.f8698a.getClass();
                oj0Var2.i = SystemClock.elapsedRealtime();
            }
            int i10 = 0;
            for (xp0 xp0Var2 : (List) cwVar.f4347c) {
                Iterator it3 = xp0Var2.f12227a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    zh0 zh0VarA2 = sj0Var.f10307g.a(xp0Var2.f12229b, str2);
                    if (zh0VarA2 != null && zh0VarA2.a(eq0Var, xp0Var2)) {
                        hi hiVarA = rr0Var.a(dVarR, pr0.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(str2).length());
                        sb2.append("render-config-");
                        sb2.append(i10);
                        sb2.append("-");
                        sb2.append(str2);
                        String string = sb2.toString();
                        ed.d dVar = (ed.d) hiVarA.f6142c;
                        List list4 = (List) hiVarA.f6144e;
                        ed.d dVar2 = (ed.d) hiVarA.f6145f;
                        rr0 rr0Var2 = (rr0) hiVarA.f6146g;
                        Object obj2 = hiVarA.f6143d;
                        Objects.requireNonNull(rr0Var2);
                        dVarR = new hi(rr0Var2, obj2, string, dVar, list4, vv.H(dVar2, Throwable.class, new yq(sj0Var, xp0Var2, eq0Var, zh0VarA2, 4), rr0Var2.f10030a)).r();
                        break;
                    }
                    sj0Var = this;
                }
                i10++;
                sj0Var = this;
            }
            dVarR.a(new h30(19, oj0Var2), executor);
        }
        return dVarR;
    }
}
