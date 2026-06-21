package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tj0 implements fi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f10628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z10 f10629d;

    public /* synthetic */ tj0(Context context, Executor executor, z10 z10Var, int i) {
        this.f10626a = i;
        this.f10627b = context;
        this.f10628c = executor;
        this.f10629d = z10Var;
    }

    public static final void c(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) {
        try {
            pq0 pq0Var = (pq0) ci0Var.f4217b;
            q9.d3 d3Var = ((iq0) eq0Var.f5032a.f9149c).f6572d;
            try {
                pq0Var.f9154a.z1(xp0Var.f12266v.toString(), d3Var);
            } catch (Throwable th2) {
                throw new kq0(th2);
            }
        } catch (Exception e3) {
            u9.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f4216a)), e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) {
        kq0 kq0Var;
        switch (this.f10626a) {
            case 0:
                JSONObject jSONObject = xp0Var.f12266v;
                IInterface iInterface = ci0Var.f4218c;
                Object obj = ci0Var.f4217b;
                Context context = this.f10627b;
                try {
                    iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
                    l7.n nVar = iq0Var.f6583p;
                    q9.d3 d3Var = iq0Var.f6572d;
                    if (nVar.f28052c == 3) {
                        pq0 pq0Var = (pq0) obj;
                        try {
                            pq0Var.f9154a.v2(new xa.b(context), d3Var, jSONObject.toString(), (nr) iInterface);
                            return;
                        } finally {
                        }
                    }
                    pq0 pq0Var2 = (pq0) obj;
                    try {
                        pq0Var2.f9154a.d1(new xa.b(context), d3Var, jSONObject.toString(), (nr) iInterface);
                        return;
                    } finally {
                    }
                } catch (Exception e3) {
                    u9.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f4216a)), e3);
                    return;
                }
                u9.i.i("Fail to load ad from adapter ".concat(String.valueOf(ci0Var.f4216a)), e3);
                return;
            default:
                pq0 pq0Var3 = (pq0) ci0Var.f4217b;
                if (pq0Var3.a()) {
                    c(eq0Var, xp0Var, ci0Var);
                    return;
                }
                cw cwVar = new cw(this, eq0Var, xp0Var, ci0Var, 18);
                IInterface iInterface2 = ci0Var.f4218c;
                xi0 xi0Var = (xi0) iInterface2;
                synchronized (xi0Var) {
                    xi0Var.f12158d = cwVar;
                }
                Context context2 = this.f10627b;
                iq0 iq0Var2 = (iq0) eq0Var.f5032a.f9149c;
                yu yuVar = (yu) iInterface2;
                String string = xp0Var.f12266v.toString();
                try {
                    pq0Var3.f9154a.S1(new xa.b(context2), iq0Var2.f6572d, yuVar, string);
                    return;
                } finally {
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) {
        switch (this.f10626a) {
            case 0:
                oq0 oq0Var = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                sc0 sc0Var = new sc0(new zd1(this, ci0Var, xp0Var, 17), null, 0);
                z10 z10Var = this.f10629d;
                y10 y10Var = new y10(z10Var.f12821c, z10Var.f12822d, oq0Var, sc0Var);
                ((u60) y10Var.f12441h.j()).x1(new u20(0, (pq0) ci0Var.f4217b), this.f10628c);
                ((wi0) ci0Var.f4218c).m4((vj0) y10Var.C.j());
                return y10Var.h0();
            default:
                oq0 oq0Var2 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                sc0 sc0Var2 = new sc0(new ki0(this, ci0Var, xp0Var, 1), null, 0);
                z10 z10Var2 = this.f10629d;
                y10 y10Var2 = new y10(z10Var2.f12821c, z10Var2.f12822d, oq0Var2, sc0Var2);
                ((u60) y10Var2.f12441h.j()).x1(new u20(0, (pq0) ci0Var.f4217b), this.f10628c);
                w60 w60Var = (w60) y10Var2.f12447o.j();
                g60 g60Var = (g60) y10Var2.f12448p.j();
                f70 f70Var = (f70) y10Var2.f12453u.j();
                y80 y80Var = (y80) y10Var2.A.j();
                xi0 xi0Var = (xi0) ci0Var.f4218c;
                yj0 yj0Var = new yj0(this, f70Var, g60Var, w60Var, y80Var);
                synchronized (xi0Var) {
                    xi0Var.f12156b = yj0Var;
                }
                return y10Var2.h0();
        }
    }
}
