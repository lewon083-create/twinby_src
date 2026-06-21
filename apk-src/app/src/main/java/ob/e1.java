package ob;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t5;
import com.google.android.gms.internal.measurement.z5;
import fh.zf;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends u3 implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1.e f30083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h1.e f30084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.e f30085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1.e f30086h;
    public final h1.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h1.e f30087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c1 f30088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ni.i f30089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1.e f30090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h1.e f30091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1.e f30092o;

    public e1(z3 z3Var) {
        super(z3Var);
        this.f30083e = new h1.e(0);
        this.f30084f = new h1.e(0);
        this.f30085g = new h1.e(0);
        this.f30086h = new h1.e(0);
        this.i = new h1.e(0);
        this.f30090m = new h1.e(0);
        this.f30091n = new h1.e(0);
        this.f30092o = new h1.e(0);
        this.f30087j = new h1.e(0);
        this.f30088k = new c1(this);
        this.f30089l = new ni.i(3, this);
    }

    public static final h1.e M(com.google.android.gms.internal.measurement.h2 h2Var) {
        h1.e eVar = new h1.e(0);
        for (com.google.android.gms.internal.measurement.l2 l2Var : h2Var.t()) {
            eVar.put(l2Var.p(), l2Var.q());
        }
        return eVar;
    }

    public static final w1 N(int i) {
        int i10 = i - 1;
        if (i10 == 1) {
            return w1.AD_STORAGE;
        }
        if (i10 == 2) {
            return w1.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return w1.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return w1.AD_PERSONALIZATION;
    }

    public final u1 G(String str, w1 w1Var) {
        C();
        I(str);
        com.google.android.gms.internal.measurement.c2 c2VarX = X(str);
        if (c2VarX != null) {
            Iterator it = c2VarX.u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.z1 z1Var = (com.google.android.gms.internal.measurement.z1) it.next();
                if (N(z1Var.p()) == w1Var) {
                    int iQ = z1Var.q() - 1;
                    if (iQ == 1) {
                        return u1.GRANTED;
                    }
                    if (iQ == 2) {
                        return u1.DENIED;
                    }
                }
            }
        }
        return u1.UNINITIALIZED;
    }

    public final boolean H(String str) {
        C();
        I(str);
        com.google.android.gms.internal.measurement.c2 c2VarX = X(str);
        if (c2VarX == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.z1 z1Var : c2VarX.p()) {
            if (z1Var.p() == 3 && z1Var.r() == 3) {
                return true;
            }
        }
        return false;
    }

    public final void I(String str) {
        D();
        C();
        pa.c0.f(str);
        h1.e eVar = this.i;
        if (eVar.get(str) == null) {
            n nVar = this.f30373c.f30607d;
            z3.T(nVar);
            ka.k kVarI0 = nVar.I0(str);
            h1.e eVar2 = this.f30092o;
            h1.e eVar3 = this.f30091n;
            h1.e eVar4 = this.f30090m;
            h1.e eVar5 = this.f30083e;
            if (kVarI0 != null) {
                com.google.android.gms.internal.measurement.g2 g2Var = (com.google.android.gms.internal.measurement.g2) L(str, (byte[]) kVarI0.f27324c).i();
                J(str, g2Var);
                eVar5.put(str, M((com.google.android.gms.internal.measurement.h2) g2Var.e()));
                eVar.put(str, (com.google.android.gms.internal.measurement.h2) g2Var.e());
                K(str, (com.google.android.gms.internal.measurement.h2) g2Var.e());
                eVar4.put(str, ((com.google.android.gms.internal.measurement.h2) g2Var.f13840c).A());
                eVar3.put(str, (String) kVarI0.f27325d);
                eVar2.put(str, (String) kVarI0.f27326e);
                return;
            }
            eVar5.put(str, null);
            this.f30085g.put(str, null);
            this.f30084f.put(str, null);
            this.f30086h.put(str, null);
            eVar.put(str, null);
            eVar4.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            this.f30087j.put(str, null);
        }
    }

    public final void J(String str, com.google.android.gms.internal.measurement.g2 g2Var) {
        l1 l1Var = (l1) this.f15951b;
        HashSet hashSet = new HashSet();
        h1.e eVar = new h1.e(0);
        h1.e eVar2 = new h1.e(0);
        h1.e eVar3 = new h1.e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.h2) g2Var.f13840c).z()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.d2) it.next()).p());
        }
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.h2) g2Var.f13840c).u(); i++) {
            com.google.android.gms.internal.measurement.e2 e2Var = (com.google.android.gms.internal.measurement.e2) ((com.google.android.gms.internal.measurement.h2) g2Var.f13840c).v(i).i();
            if (e2Var.h().isEmpty()) {
                s0 s0Var = l1Var.f30265g;
                l1.k(s0Var);
                s0Var.f30413j.f("EventConfig contained null event name");
            } else {
                String strH = e2Var.h();
                String strG = y1.g(e2Var.h(), y1.f30543a, y1.f30545c);
                if (!TextUtils.isEmpty(strG)) {
                    e2Var.b();
                    ((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).w(strG);
                    g2Var.b();
                    ((com.google.android.gms.internal.measurement.h2) g2Var.f13840c).H(i, (com.google.android.gms.internal.measurement.f2) e2Var.e());
                }
                if (((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).q() && ((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).r()) {
                    eVar.put(strH, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).s() && ((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).t()) {
                    eVar2.put(e2Var.h(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).u()) {
                    if (((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).v() < 2 || ((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).v() > 65535) {
                        s0 s0Var2 = l1Var.f30265g;
                        l1.k(s0Var2);
                        s0Var2.f30413j.h(e2Var.h(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).v()));
                    } else {
                        eVar3.put(e2Var.h(), Integer.valueOf(((com.google.android.gms.internal.measurement.f2) e2Var.f13840c).v()));
                    }
                }
            }
        }
        this.f30084f.put(str, hashSet);
        this.f30085g.put(str, eVar);
        this.f30086h.put(str, eVar2);
        this.f30087j.put(str, eVar3);
    }

    public final void K(String key, com.google.android.gms.internal.measurement.h2 h2Var) {
        Object oldValue;
        if (h2Var.y() == 0) {
            c1 c1Var = this.f30088k;
            c1Var.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            synchronized (((zf) c1Var.f11554g)) {
                try {
                    a0.b1 b1Var = (a0.b1) c1Var.f11553f;
                    b1Var.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    oldValue = ((LinkedHashMap) b1Var.f45c).remove(key);
                    if (oldValue != null) {
                        int i = c1Var.f11550c;
                        com.google.android.gms.internal.ads.w.d(key, oldValue);
                        c1Var.f11550c = i - 1;
                    }
                    Unit unit = Unit.f27471a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (oldValue != null) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(oldValue, "oldValue");
                return;
            }
            return;
        }
        l1 l1Var = (l1) this.f15951b;
        s0 s0Var = l1Var.f30265g;
        l1.k(s0Var);
        s0Var.f30418o.g(Integer.valueOf(h2Var.y()), "EES programs found");
        int i10 = 0;
        com.google.android.gms.internal.measurement.x3 x3Var = (com.google.android.gms.internal.measurement.x3) h2Var.x().get(0);
        try {
            com.google.android.gms.internal.measurement.d0 d0Var = new com.google.android.gms.internal.measurement.d0();
            ((HashMap) ((z5) d0Var.f13692a.f32798e).f14118a).put("internal.remoteConfig", new d1(this, key, 2));
            ((HashMap) ((z5) d0Var.f13692a.f32798e).f14118a).put("internal.appMetadata", new d1(this, key, i10));
            ((HashMap) ((z5) d0Var.f13692a.f32798e).f14118a).put("internal.logger", new aa.w(4, this));
            d0Var.b(x3Var);
            this.f30088k.c(key, d0Var);
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30418o.h(key, "EES program loaded for appId, activities", Integer.valueOf(x3Var.q().q()));
            for (com.google.android.gms.internal.measurement.w3 w3Var : x3Var.q().p()) {
                s0 s0Var3 = l1Var.f30265g;
                l1.k(s0Var3);
                s0Var3.f30418o.g(w3Var.p(), "EES program activity");
            }
        } catch (com.google.android.gms.internal.measurement.p0 unused) {
            s0 s0Var4 = ((l1) this.f15951b).f30265g;
            l1.k(s0Var4);
            s0Var4.f30411g.g(key, "Failed to load EES program. appId");
        }
    }

    public final com.google.android.gms.internal.measurement.h2 L(String str, byte[] bArr) {
        l1 l1Var = (l1) this.f15951b;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.h2.G();
        }
        try {
            com.google.android.gms.internal.measurement.h2 h2Var = (com.google.android.gms.internal.measurement.h2) ((com.google.android.gms.internal.measurement.g2) v0.p0(com.google.android.gms.internal.measurement.h2.F(), bArr)).e();
            s0 s0Var = l1Var.f30265g;
            l1.k(s0Var);
            s0Var.f30418o.h(h2Var.p() ? Long.valueOf(h2Var.q()) : null, "Parsed config. version, gmp_app_id", h2Var.r() ? h2Var.s() : null);
            return h2Var;
        } catch (t5 e3) {
            s0 s0Var2 = l1Var.f30265g;
            l1.k(s0Var2);
            s0Var2.f30413j.h(s0.K(str), "Unable to merge remote config. appId", e3);
            return com.google.android.gms.internal.measurement.h2.G();
        } catch (RuntimeException e7) {
            s0 s0Var3 = l1Var.f30265g;
            l1.k(s0Var3);
            s0Var3.f30413j.h(s0.K(str), "Unable to merge remote config. appId", e7);
            return com.google.android.gms.internal.measurement.h2.G();
        }
    }

    public final com.google.android.gms.internal.measurement.h2 O(String str) {
        D();
        C();
        pa.c0.f(str);
        I(str);
        return (com.google.android.gms.internal.measurement.h2) this.i.get(str);
    }

    public final String P(String str) {
        C();
        I(str);
        return (String) this.f30090m.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03fb, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0404, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0405, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0417, code lost:
    
        if (r5.v() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0419, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0422, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0423, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0435, code lost:
    
        if (r9.r0().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0437, code lost:
    
        r0 = r14.f30265g;
        ob.l1.k(r0);
        r0.f30411g.g(ob.s0.K(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0448, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x044a, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0450, code lost:
    
        r1 = r14.f30265g;
        ob.l1.k(r1);
        r1.f30411g.h(ob.s0.K(r29), "Error storing property filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0460, code lost:
    
        r9.D();
        r9.C();
        pa.c0.f(r29);
        r0 = r9.r0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0264, code lost:
    
        r6 = r0.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0270, code lost:
    
        if (r6.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x027c, code lost:
    
        if (((com.google.android.gms.internal.measurement.x1) r6.next()).p() != false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x027e, code lost:
    
        r0 = r14.f30265g;
        ob.l1.k(r0);
        r0.f30413j.h(ob.s0.K(r29), "Property filter with no ID. Audience definition ignored. appId, audienceId", java.lang.Integer.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0294, code lost:
    
        r6 = r0.u().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x029c, code lost:
    
        r7 = r6.hasNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02a0, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02b0, code lost:
    
        if (r7 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02b2, code lost:
    
        r7 = (com.google.android.gms.internal.measurement.q1) r6.next();
        r9.D();
        r9.C();
        pa.c0.f(r29);
        pa.c0.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02cc, code lost:
    
        if (r7.r().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02ce, code lost:
    
        r0 = r14.f30265g;
        ob.l1.k(r0);
        r0 = r0.f30413j;
        r4 = ob.s0.K(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02e3, code lost:
    
        if (r7.p() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02e5, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f5, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02f7, code lost:
    
        r0.i("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0304, code lost:
    
        r25 = r3;
        r3 = r7.a();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_ID, r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x031f, code lost:
    
        if (r7.p() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0321, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x032a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x032b, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.r());
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x033b, code lost:
    
        if (r7.z() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x033d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0346, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0347, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0359, code lost:
    
        if (r9.r0().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x035b, code lost:
    
        r0 = r14.f30265g;
        ob.l1.k(r0);
        r0.f30411g.g(ob.s0.K(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x036b, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0375, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0376, code lost:
    
        r1 = r14.f30265g;
        ob.l1.k(r1);
        r1.f30411g.h(ob.s0.K(r29), "Error storing event filter. appId", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0388, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.r().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0398, code lost:
    
        if (r3.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x039a, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.x1) r3.next();
        r9.D();
        r9.C();
        pa.c0.f(r29);
        pa.c0.i(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x03b4, code lost:
    
        if (r5.r().isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x03b6, code lost:
    
        r0 = r14.f30265g;
        ob.l1.k(r0);
        r0 = r0.f30413j;
        r3 = ob.s0.K(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x03cb, code lost:
    
        if (r5.p() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x03cd, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.q());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x03d6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x03d7, code lost:
    
        r0.i("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03e0, code lost:
    
        r6 = r5.a();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x03f9, code lost:
    
        if (r5.p() == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(java.lang.String r29, java.lang.String r30, java.lang.String r31, byte[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.e1.Q(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean R(String str, String str2) {
        Boolean bool;
        C();
        I(str);
        if ("1".equals(i(str, "measurement.upload.blacklist_internal")) && e4.Z(str2)) {
            return true;
        }
        if ("1".equals(i(str, "measurement.upload.blacklist_public")) && e4.z0(str2)) {
            return true;
        }
        Map map = (Map) this.f30085g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean S(String str, String str2) {
        Boolean bool;
        C();
        I(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f30086h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int T(String str, String str2) {
        Integer num;
        C();
        I(str);
        Map map = (Map) this.f30087j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean U(String str) {
        C();
        I(str);
        h1.e eVar = this.f30084f;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains(CommonUrlParts.OS_VERSION) || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean V(String str) {
        C();
        I(str);
        h1.e eVar = this.f30084f;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean W(String str, w1 w1Var) {
        C();
        I(str);
        com.google.android.gms.internal.measurement.c2 c2VarX = X(str);
        if (c2VarX == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.z1 z1Var : c2VarX.p()) {
            if (w1Var == N(z1Var.p())) {
                return z1Var.q() == 2;
            }
        }
        return false;
    }

    public final com.google.android.gms.internal.measurement.c2 X(String str) {
        C();
        I(str);
        com.google.android.gms.internal.measurement.h2 h2VarO = O(str);
        if (h2VarO == null || !h2VarO.B()) {
            return null;
        }
        return h2VarO.C();
    }

    @Override // ob.f
    public final String i(String str, String str2) {
        C();
        I(str);
        Map map = (Map) this.f30083e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // ob.u3
    public final void F() {
    }
}
