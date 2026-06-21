package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 implements fi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8316c;

    public /* synthetic */ ni0(Context context, Object obj, int i) {
        this.f8314a = i;
        this.f8315b = context;
        this.f8316c = obj;
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final void a(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) throws kq0 {
        switch (this.f8314a) {
            case 0:
                try {
                    os osVar = (os) ci0Var.f4217b;
                    osVar.U2(xp0Var.Z);
                    osVar.e3(xp0Var.U, xp0Var.f12266v.toString(), ((iq0) eq0Var.f5032a.f9149c).f6572d, new xa.b(this.f8315b), new mi0(ci0Var), (nr) ci0Var.f4218c);
                    return;
                } catch (RemoteException e3) {
                    t9.c0.n("Remote exception loading an app open RTB ad", e3);
                    throw new kq0(e3);
                }
            case 1:
                try {
                    os osVar2 = (os) ci0Var.f4217b;
                    osVar2.U2(xp0Var.Z);
                    osVar2.j2(xp0Var.U, xp0Var.f12266v.toString(), ((iq0) eq0Var.f5032a.f9149c).f6572d, new xa.b(this.f8315b), new aj0(this, ci0Var), (nr) ci0Var.f4218c);
                    return;
                } catch (RemoteException e7) {
                    t9.c0.n("Remote exception loading a interstitial RTB ad", e7);
                    throw new kq0(e7);
                }
            default:
                try {
                    Object obj = ci0Var.f4217b;
                    IInterface iInterface = ci0Var.f4218c;
                    os osVar3 = (os) obj;
                    String str = xp0Var.Z;
                    JSONObject jSONObject = xp0Var.f12266v;
                    osVar3.U2(str);
                    iq0 iq0Var = (iq0) eq0Var.f5032a.f9149c;
                    int i = iq0Var.f6583p.f28052c;
                    Context context = this.f8315b;
                    if (i == 3) {
                        osVar3.g4(xp0Var.U, jSONObject.toString(), iq0Var.f6572d, new xa.b(context), new uj0(this, ci0Var), (nr) iInterface);
                    } else {
                        osVar3.x1(xp0Var.U, jSONObject.toString(), iq0Var.f6572d, new xa.b(context), new uj0(this, ci0Var), (nr) iInterface);
                    }
                    return;
                } catch (RemoteException e10) {
                    t9.c0.n("Remote exception loading a rewarded RTB ad", e10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.fi0
    public final Object b(eq0 eq0Var, xp0 xp0Var, ci0 ci0Var) {
        switch (this.f8314a) {
            case 0:
                cw cwVar = new cw(xp0Var, (os) ci0Var.f4217b, k9.a.APP_OPEN_AD);
                oq0 oq0Var = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                ut utVar = new ut(12, cwVar, (Object) null);
                l7.n nVar = new l7.n(xp0Var.f12228a0, 2);
                q10 q10Var = (q10) this.f8316c;
                n10 n10Var = q10Var.f9260c;
                q10 q10Var2 = q10Var.f9261d;
                o10 o10Var = new o10(n10Var, q10Var2, oq0Var, utVar, nVar);
                ls1 ls1Var = o10Var.f8554m;
                cwVar.f4350f = (q60) ls1Var.j();
                ((wi0) ci0Var.f4218c).m4(new bk0((g60) o10Var.f8558q.j(), (u80) o10Var.f8560s.j(), (q60) ls1Var.j(), (w60) o10Var.f8557p.j(), (y60) o10Var.f8561t.j(), (x70) q10Var2.R.j(), (f70) o10Var.f8562u.j(), (b90) o10Var.f8563v.j(), (v70) o10Var.f8564w.j(), (o60) o10Var.f8566y.j()));
                return o10Var.h0();
            case 1:
                cw cwVar2 = new cw(xp0Var, (os) ci0Var.f4217b, k9.a.INTERSTITIAL);
                oq0 oq0Var2 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                ut utVar2 = new ut(12, cwVar2, (Object) null);
                w10 w10Var = (w10) this.f8316c;
                n10 n10Var2 = w10Var.f11572b;
                w10 w10Var2 = w10Var.f11573c;
                v10 v10Var = new v10(n10Var2, w10Var2, oq0Var2, utVar2);
                ls1 ls1Var2 = v10Var.f11190l;
                cwVar2.f4350f = (q60) ls1Var2.j();
                ((wi0) ci0Var.f4218c).m4(new bk0((g60) v10Var.f11194p.j(), (u80) v10Var.f11197s.j(), (q60) ls1Var2.j(), (w60) v10Var.f11193o.j(), (y60) v10Var.f11198t.j(), (x70) w10Var2.R.j(), (f70) v10Var.f11200v.j(), (b90) v10Var.f11201w.j(), (v70) v10Var.f11202x.j(), (o60) v10Var.f11204z.j()));
                return v10Var.h0();
            default:
                cw cwVar3 = new cw(xp0Var, (os) ci0Var.f4217b, k9.a.REWARDED);
                oq0 oq0Var3 = new oq0(eq0Var, xp0Var, ci0Var.f4216a);
                sc0 sc0Var = new sc0(cwVar3, null, 0);
                z10 z10Var = (z10) this.f8316c;
                n10 n10Var3 = z10Var.f12821c;
                z10 z10Var2 = z10Var.f12822d;
                y10 y10Var = new y10(n10Var3, z10Var2, oq0Var3, sc0Var);
                ls1 ls1Var3 = y10Var.f12444l;
                cwVar3.f4350f = (q60) ls1Var3.j();
                ((wi0) ci0Var.f4218c).m4(new ak0((g60) y10Var.f12448p.j(), (u80) y10Var.f12450r.j(), (q60) ls1Var3.j(), (w60) y10Var.f12447o.j(), (y60) y10Var.f12451s.j(), (o60) y10Var.f12457y.j(), (x70) z10Var2.V.j(), (b90) y10Var.f12454v.j(), (f70) y10Var.f12453u.j(), (y80) y10Var.A.j(), (v70) y10Var.f12455w.j()));
                return y10Var.h0();
        }
    }
}
