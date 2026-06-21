package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Binder;
import android.os.Handler;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinVersion;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ox0 implements q1, t21, lx, w9.c, k81, jr0, e80, p00, qg0, q40 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ox0 f8849d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8851c;

    public /* synthetic */ ox0(int i, Object obj) {
        this.f8850b = i;
        this.f8851c = obj;
    }

    public static final ox0 d(Context context) {
        ox0 ox0Var;
        synchronized (ox0.class) {
            try {
                if (f8849d == null) {
                    f8849d = new ox0(context);
                }
                ox0Var = f8849d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ox0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.google.android.gms.internal.ads.zv] */
    @Override // com.google.android.gms.internal.ads.jr0
    public Object a(Object obj) {
        switch (this.f8850b) {
            case 15:
                eq0 eq0Var = (eq0) obj;
                n90 n90Var = ((b50) this.f8851c).f3621d;
                for (dq0 dq0Var : (ArrayList) eq0Var.f5033b.f4349e) {
                    Map map = (Map) n90Var.f8248c;
                    String str = dq0Var.f4629a;
                    JSONObject jSONObject = dq0Var.f4630b;
                    if (map.containsKey(str) && jSONObject != null) {
                        q20 q20Var = (q20) map.get(str);
                        switch (q20Var.f9294a) {
                            case 0:
                                if (((Boolean) q9.s.f31967e.f31970c.a(al.va)).booleanValue()) {
                                    ff0 ff0Var = (ff0) q20Var.f9295b;
                                    synchronized (ff0Var) {
                                        ff0Var.f5352p = jSONObject;
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            default:
                                ((zv) ((n90) q20Var.f9295b).f8249d).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                                break;
                        }
                    } else {
                        Map map2 = (Map) n90Var.f8249d;
                        if (map2.containsKey(str) && jSONObject != null) {
                            k20 k20Var = (k20) map2.get(str);
                            HashMap map3 = new HashMap();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String strOptString = jSONObject.optString(next);
                                if (strOptString != null) {
                                    map3.put(next, strOptString);
                                }
                            }
                            k20Var.a(map3);
                        }
                    }
                }
                return eq0Var;
            default:
                kh0.d((SQLiteDatabase) obj, (u9.l) this.f8851c);
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.q1
    public long b(long j10) {
        g2 g2Var = (g2) this.f8851c;
        g2Var.getClass();
        String str = cq0.f4293a;
        return Math.max(0L, Math.min((j10 * ((long) g2Var.f5608e)) / 1000000, g2Var.f5612j - 1));
    }

    @Override // com.google.android.gms.internal.ads.qg0
    public /* synthetic */ ed.d c(ku kuVar) {
        return ((xg0) ((js1) ((oq0) this.f8851c).f8764e).j()).m4(kuVar, Binder.getCallingUid());
    }

    public AtomicReference e(String str) {
        synchronized (this) {
            try {
                HashMap map = (HashMap) this.f8851c;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) ((HashMap) this.f8851c).get(str);
    }

    @Override // com.google.android.gms.internal.ads.t21
    public /* synthetic */ void f(long j10, tk0 tk0Var) {
        switch (this.f8850b) {
            case 3:
                pn1.g(j10, tk0Var, ((x5) this.f8851c).I);
                break;
            default:
                pn1.g(j10, tk0Var, ((o9) this.f8851c).f8641c);
                break;
        }
    }

    public void g(qa qaVar, b7 b7Var, l81 l81Var) {
        synchronized (qaVar.f9376f) {
            qaVar.f9379j = true;
        }
        qaVar.a("post-response");
        ((ja) this.f8851c).f6765c.post(new d1(qaVar, b7Var, l81Var, 1));
    }

    @Override // com.google.android.gms.internal.ads.q40
    /* JADX INFO: renamed from: h */
    public q9.b2 mo3h() throws kq0 {
        try {
            return ((pq0) this.f8851c).f9154a.J();
        } catch (Throwable th2) {
            throw new kq0(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        switch (this.f8850b) {
            case 14:
                e30 e30Var = (e30) this.f8851c;
                at0 at0Var = e30Var.f4814h;
                eq0 eq0Var = e30Var.f4812f;
                xp0 xp0Var = e30Var.f4813g;
                e30Var.i.b(true == p9.k.C.f31302h.i(e30Var.f4808b) ? 2 : 1, at0Var.b(eq0Var, xp0Var, false, "", (String) obj, xp0Var.f12231c, null, null));
                break;
            case 23:
                ((we0) obj).f11792n = true;
                ((pf0) this.f8851c).f9044e.c();
                break;
            default:
                eq0 eq0Var2 = (eq0) obj;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.G2)).booleanValue()) {
                    ((cg0) this.f8851c).f4210k.l(eq0Var2);
                }
                break;
        }
    }

    public gx1[] j(Handler handler, ht1 ht1Var, ht1 ht1Var2) {
        jz jzVar = (jz) this.f8851c;
        bw1 bw1Var = bw1.f3936f;
        Context context = jzVar.f7010b;
        jw1 jw1Var = new jw1(context, 0);
        ix.k0(!jw1Var.f6955b);
        jw1Var.f6955b = true;
        if (((l91) jw1Var.f6959f) == null) {
            jw1Var.f6959f = new l91(new t10[0]);
        }
        if (((com.google.android.gms.internal.consent_sdk.c) jw1Var.f6958e) == null) {
            if (((hw1) jw1Var.f6960g) == null) {
                jw1Var.f6960g = new hw1(context);
            }
            if (((c6) jw1Var.f6957d) == null) {
                jw1Var.f6957d = c6.f4050k;
            }
            l91 l91Var = new l91(context);
            hv1 hv1Var = context != null ? null : (hv1) jw1Var.f6956c;
            Context context2 = (Context) l91Var.f7465c;
            if (context2 == null) {
                l91Var.f7466d = hv1Var;
            }
            hw1 hw1Var = (hw1) jw1Var.f6960g;
            l91Var.f7467e = hw1Var;
            if (hw1Var == null) {
                l91Var.f7467e = new hw1(context2);
            }
            com.google.android.gms.internal.consent_sdk.c cVar = new com.google.android.gms.internal.consent_sdk.c();
            Context context3 = (Context) l91Var.f7465c;
            cVar.f13337a = context3;
            hw1 hw1Var2 = (hw1) l91Var.f7467e;
            hw1Var2.getClass();
            cVar.i = hw1Var2;
            cVar.f13341e = (hv1) l91Var.f7466d;
            cVar.f13338b = context3 != null ? new xo0(14, cVar) : null;
            cVar.f13340d = c6.f4047g;
            jw1Var.f6958e = cVar;
        } else {
            ix.k0(((hw1) jw1Var.f6960g) == null);
            ix.k0(((c6) jw1Var.f6957d) == null);
        }
        int i = 3;
        pw1 pw1Var = new pw1(context, new zk(context, i), handler, ht1Var2, new nw1(jw1Var));
        i0 i0Var = new i0();
        i0Var.f6313c = context;
        i0Var.f6314d = bw1.f3936f;
        i0Var.f6315e = new zk(context, i);
        i0Var.f6314d = bw1Var;
        i0Var.f6316f = handler;
        i0Var.f6317g = ht1Var;
        ix.k0(!i0Var.f6312b);
        Handler handler2 = (Handler) i0Var.f6316f;
        ix.k0((handler2 == null && ((ht1) i0Var.f6317g) == null) || !(handler2 == null || ((ht1) i0Var.f6317g) == null));
        i0Var.f6312b = true;
        return new gx1[]{pw1Var, new k0(i0Var)};
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        int i = this.f8850b;
    }

    public void o() {
        synchronized (ox0.class) {
            n90 n90Var = (n90) this.f8851c;
            n90Var.p("vendor_scoped_gpid_v2_id");
            n90Var.p("vendor_scoped_gpid_v2_creation_time");
        }
    }

    @Override // w9.c
    public void w(la.m mVar) {
        switch (this.f8850b) {
            case 10:
                try {
                    ((gs) this.f8851c).a(mVar.j());
                } catch (RemoteException e3) {
                    u9.i.f("", e3);
                    return;
                }
                break;
            default:
                try {
                    ((es) this.f8851c).a(mVar.j());
                } catch (RemoteException e7) {
                    u9.i.f("", e7);
                }
                break;
        }
    }

    public /* synthetic */ ox0(ss ssVar, IInterface iInterface, int i) {
        this.f8850b = i;
        this.f8851c = iInterface;
    }

    public ox0(int i) {
        this.f8850b = i;
        switch (i) {
            case 7:
                this.f8851c = new HashMap();
                break;
            default:
                this.f8851c = new CopyOnWriteArrayList();
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.p00, com.google.android.gms.internal.ads.kx, com.google.android.gms.internal.ads.vm, com.google.android.gms.internal.ads.al0
    /* JADX INFO: renamed from: h */
    public void mo4h() {
        switch (this.f8850b) {
            case 21:
                ((ni) this.f8851c).e();
                break;
            default:
                ed.d dVarA = ((k7) this.f8851c).a();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.C8)).booleanValue()) {
                    ea1 ea1Var = new ea1("persistFlags", 4);
                    dVarA.a(new l81(0, dVarA, ea1Var), hx.f6285g);
                } else {
                    ix.m(dVarA, "persistFlags");
                }
                break;
        }
    }

    public ox0(Context context) {
        this.f8850b = 0;
        if (n90.f8246e == null) {
            n90.f8246e = new n90(context, 18);
        }
        this.f8851c = n90.f8246e;
        kx0.B(context);
    }

    public ox0(Handler handler) {
        this.f8850b = 5;
        this.f8851c = new ja(this, handler);
    }

    public ox0(qq qqVar, pq pqVar) {
        this.f8850b = 9;
        this.f8851c = pqVar;
        Objects.requireNonNull(qqVar);
    }

    public ox0(byte[] bArr) {
        this.f8850b = 6;
        this.f8851c = new byte[256];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.f8851c)[i] = (byte) i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            byte[] bArr2 = (byte[]) this.f8851c;
            byte b2 = bArr2[i11];
            i10 = (i10 + b2 + bArr[i11 % bArr.length]) & KotlinVersion.MAX_COMPONENT_VALUE;
            bArr2[i11] = bArr2[i10];
            bArr2[i10] = b2;
        }
    }

    @Override // com.google.android.gms.internal.ads.lx, com.google.android.gms.internal.ads.e80
    /* JADX INFO: renamed from: a */
    public void mo7a(Object obj) {
        switch (this.f8850b) {
            case 9:
                hq hqVar = (hq) obj;
                t9.c0.m("Getting a new session for JS Engine.");
                hqVar.getClass();
                ((jx) ((pq) this.f8851c).f2253b).b(new tq(hqVar));
                break;
            case 16:
                ((p60) obj).j((q9.x1) this.f8851c);
                break;
            case 17:
                ((h70) obj).a((q9.h3) this.f8851c);
                break;
            case 18:
                ((a80) obj).B((wj) this.f8851c);
                break;
            default:
                ((z80) obj).a((aa.t) this.f8851c);
                break;
        }
    }

    private final void l(Throwable th2) {
    }

    private final void m(Throwable th2) {
    }

    private final void n(Throwable th2) {
    }
}
