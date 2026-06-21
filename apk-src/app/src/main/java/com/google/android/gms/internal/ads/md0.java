package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import io.appmetrica.analytics.impl.C0232ia;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.sentry.SentryEvent;
import io.sentry.clientreport.DiscardedEvent;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class md0 implements w70, q9.a, r60, m60, k70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f7858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nq0 f7859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sd0 f7860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eq0 f7861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final xp0 f7862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kh0 f7863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7864h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f7865j;
    public long i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f7867l = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f7868m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7866k = ((Boolean) q9.s.f31967e.f31970c.a(al.B7)).booleanValue();

    public md0(Context context, nq0 nq0Var, sd0 sd0Var, eq0 eq0Var, xp0 xp0Var, kh0 kh0Var, String str) {
        this.f7858b = context;
        this.f7859c = nq0Var;
        this.f7860d = sd0Var;
        this.f7861e = eq0Var;
        this.f7862f = xp0Var;
        this.f7863g = kh0Var;
        this.f7864h = str;
    }

    public final boolean a() {
        String strO;
        if (this.f7865j == null) {
            synchronized (this) {
                if (this.f7865j == null) {
                    String str = (String) q9.s.f31967e.f31970c.a(al.Q1);
                    t9.g0 g0Var = p9.k.C.f31297c;
                    try {
                        strO = t9.g0.O(this.f7858b);
                    } catch (RemoteException unused) {
                        strO = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strO != null) {
                        try {
                            zMatches = Pattern.matches(str, strO);
                        } catch (RuntimeException e3) {
                            p9.k.C.f31302h.d("CsiActionsListener.isPatternMatched", e3);
                        }
                    }
                    this.f7865j = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f7865j.booleanValue();
    }

    public final zd1 b(String str) {
        eq0 eq0Var = this.f7861e;
        cw cwVar = eq0Var.f5033b;
        pp0 pp0Var = eq0Var.f5032a;
        zd1 zd1VarA = this.f7860d.a();
        zd1VarA.v("gqi", ((zp0) cwVar.f4348d).f13056b);
        xp0 xp0Var = this.f7862f;
        zd1VarA.t(xp0Var);
        zd1VarA.v("action", str);
        zd1VarA.v("ad_format", this.f7864h.toUpperCase(Locale.ROOT));
        List list = xp0Var.f12262t;
        if (!list.isEmpty()) {
            zd1VarA.v("ancn", (String) list.get(0));
        }
        if (xp0Var.b()) {
            p9.k kVar = p9.k.C;
            zd1VarA.v("device_connectivity", true != kVar.f31302h.i(this.f7858b) ? "offline" : Device.JsonKeys.ONLINE);
            kVar.f31304k.getClass();
            zd1VarA.v("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zd1VarA.v("offline_ad", "1");
        }
        if (((Boolean) q9.s.f31967e.f31970c.a(al.I7)).booleanValue()) {
            boolean z5 = hl.l.A((iq0) pp0Var.f9149c) != 1;
            zd1VarA.v("scar", String.valueOf(z5));
            if (z5) {
                q9.d3 d3Var = ((iq0) pp0Var.f9149c).f6572d;
                zd1VarA.v("ragent", d3Var.f31815q);
                zd1VarA.v("rtype", hl.l.w(hl.l.x(d3Var)));
            }
        }
        return zd1VarA;
    }

    public final void c(zd1 zd1Var) {
        if (!this.f7862f.b()) {
            zd1Var.w();
            return;
        }
        wd0 wd0Var = ((sd0) zd1Var.f12972d).f10244a;
        String strA = wd0Var.f11752f.a((ConcurrentHashMap) zd1Var.f12971c);
        p9.k.C.f31304k.getClass();
        cb cbVar = new cb(System.currentTimeMillis(), ((zp0) this.f7861e.f5033b.f4348d).f13056b, strA, 2);
        kh0 kh0Var = this.f7863g;
        kh0Var.getClass();
        kh0Var.a(new n90(13, kh0Var, cbVar));
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void g() {
        if (a()) {
            zd1 zd1VarB = b("adapter_impression");
            zd1VarB.v("imp_type", String.valueOf(this.f7862f.f12235e));
            boolean z5 = this.f7868m.get();
            String str = CommonUrlParts.Values.FALSE_INTEGER;
            if (z5) {
                zd1VarB.v("po", "1");
                p9.k.C.f31304k.getClass();
                zd1VarB.v("pil", String.valueOf(System.currentTimeMillis() - this.i));
            } else {
                zd1VarB.v("po", CommonUrlParts.Values.FALSE_INTEGER);
            }
            wk wkVar = al.Ne;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && h()) {
                t9.g0 g0Var = p9.k.C.f31297c;
                zd1VarB.v(C0232ia.f24064g, true != t9.g0.h(this.f7858b) ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                zd1VarB.v("fg_show", true != this.f7867l.get() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            if (((Boolean) sVar.f31970c.a(al.Oe)).booleanValue() && h()) {
                if (true == p9.k.C.f31301g.A()) {
                    str = "1";
                }
                zd1VarB.v("fg_al", str);
            }
            zd1VarB.w();
        }
    }

    public final boolean h() {
        int i = this.f7862f.f12229b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void i() {
        if (this.f7866k) {
            zd1 zd1VarB = b("ifts");
            zd1VarB.v(DiscardedEvent.JsonKeys.REASON, "blocked");
            zd1VarB.w();
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void n() {
        if (a()) {
            this.f7868m.set(true);
            p9.k kVar = p9.k.C;
            kVar.f31304k.getClass();
            this.i = System.currentTimeMillis();
            zd1 zd1VarB = b("presentation");
            wk wkVar = al.Ne;
            q9.s sVar = q9.s.f31967e;
            if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && h()) {
                boolean z5 = !t9.g0.h(this.f7858b);
                AtomicBoolean atomicBoolean = this.f7867l;
                atomicBoolean.set(z5);
                zd1VarB.v(C0232ia.f24064g, true != atomicBoolean.get() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            if (((Boolean) sVar.f31970c.a(al.Oe)).booleanValue() && h()) {
                zd1VarB.v("fg_al", true != kVar.f31301g.A() ? CommonUrlParts.Values.FALSE_INTEGER : "1");
            }
            zd1VarB.w();
        }
    }

    @Override // q9.a
    public final void onAdClicked() {
        if (this.f7862f.b()) {
            c(b("click"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.m60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(q9.x1 r6) {
        /*
            r5 = this;
            boolean r0 = r5.f7866k
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            com.google.android.gms.internal.ads.zd1 r0 = r5.b(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.v(r1, r2)
            int r1 = r6.f31976b
            java.lang.String r2 = r6.f31977c
            java.lang.String r3 = r6.f31978d
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            q9.x1 r3 = r6.f31979e
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.f31978d
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            q9.x1 r6 = r6.f31979e
            int r1 = r6.f31976b
            java.lang.String r2 = r6.f31977c
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.v(r6, r1)
        L3d:
            com.google.android.gms.internal.ads.nq0 r6 = r5.f7859c
            java.util.regex.Pattern r6 = r6.f8431a
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            r0.v(r1, r6)
        L5d:
            r0.w()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.md0.p0(q9.x1):void");
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void r() {
        if (a()) {
            b("adapter_shown").w();
        }
    }

    @Override // com.google.android.gms.internal.ads.m60
    public final void y0(g90 g90Var) {
        if (this.f7866k) {
            zd1 zd1VarB = b("ifts");
            zd1VarB.v(DiscardedEvent.JsonKeys.REASON, SentryEvent.JsonKeys.EXCEPTION);
            if (!TextUtils.isEmpty(g90Var.getMessage())) {
                zd1VarB.v("msg", g90Var.getMessage());
            }
            zd1VarB.w();
        }
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void z() {
        boolean zA = a();
        xp0 xp0Var = this.f7862f;
        if (zA || xp0Var.b()) {
            zd1 zd1VarB = b("impression");
            zd1VarB.v("imp_type", String.valueOf(xp0Var.f12235e));
            if (this.i > 0) {
                p9.k.C.f31304k.getClass();
                zd1VarB.v("p_imp_l", String.valueOf(System.currentTimeMillis() - this.i));
            }
            if (((Boolean) q9.s.f31967e.f31970c.a(al.Ne)).booleanValue() && h()) {
                t9.g0 g0Var = p9.k.C.f31297c;
                boolean zH = t9.g0.h(this.f7858b);
                String str = CommonUrlParts.Values.FALSE_INTEGER;
                zd1VarB.v(C0232ia.f24064g, true != zH ? "1" : CommonUrlParts.Values.FALSE_INTEGER);
                if (true == this.f7867l.get()) {
                    str = "1";
                }
                zd1VarB.v("fg_show", str);
            }
            c(zd1VarB);
        }
    }
}
