package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.view.InputEvent;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yq implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f12686e;

    public yq(rq rqVar, String str, vq vqVar, uq uqVar) {
        this.f12682a = 0;
        this.f12686e = rqVar;
        this.f12683b = str;
        this.f12685d = vqVar;
        this.f12684c = uqVar;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        ed.d dVarY;
        n81 n81VarD;
        switch (this.f12682a) {
            case 0:
                return b(obj);
            case 1:
                w20 w20Var = (w20) this.f12684c;
                Uri.Builder builder = (Uri.Builder) this.f12685d;
                String str = (String) this.f12683b;
                InputEvent inputEvent = (InputEvent) this.f12686e;
                if (((Integer) obj).intValue() != 1) {
                    builder.appendQueryParameter((String) q9.s.f31967e.f31970c.a(al.f3243vb), "10");
                    return vv.d(builder.toString());
                }
                Uri.Builder builderBuildUpon = builder.build().buildUpon();
                wk wkVar = al.f3259wb;
                yk ykVar = q9.s.f31967e.f31970c;
                builderBuildUpon.appendQueryParameter((String) ykVar.a(wkVar), "1");
                builderBuildUpon.appendQueryParameter((String) ykVar.a(al.f3243vb), "12");
                if (str.contains((CharSequence) ykVar.a(al.f3275xb))) {
                    builderBuildUpon.authority((String) ykVar.a(al.f3289yb));
                }
                xh0 xh0Var = w20Var.f11598c;
                Uri uriBuild = builderBuildUpon.build();
                xh0Var.getClass();
                try {
                    e6.c cVar = xh0Var.f12154a;
                    Objects.requireNonNull(cVar);
                    dVarY = cVar.d(uriBuild, inputEvent);
                    break;
                } catch (Exception e3) {
                    dVarY = vv.y(e3);
                }
                return vv.J(i81.s(dVarY), new np(2, builder), w20Var.f11601f);
            case 2:
                qb0 qb0Var = (qb0) this.f12684c;
                String str2 = (String) this.f12683b;
                wv wvVar = (wv) this.f12685d;
                p9.a aVar = (p9.a) this.f12686e;
                qb0Var.getClass();
                fp fpVar = p9.k.C.f31298d;
                sz szVarE = fp.e(qb0Var.f9415a, new j0(0, 0, 0), "native-omid", false, false, qb0Var.f9417c, null, qb0Var.f9418d, null, qb0Var.f9419e, qb0Var.f9420f, null, null, qb0Var.f9429p, qb0Var.f9430q, qb0Var.f9426m);
                ni niVar = new ni(szVarE);
                szVarE.q0().f7062h = new gk0(19, niVar);
                szVarE.loadData(Base64.encodeToString(str2.getBytes(), 1), "text/html", "base64");
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Te)).booleanValue()) {
                    if (wvVar != null) {
                        szVarE.q0().f7079z = wvVar;
                    }
                    szVarE.q0().f7077x = aVar;
                }
                return niVar;
            case 3:
                oq0 oq0Var = (oq0) this.f12684c;
                return vv.J(((qg0) this.f12685d).c((ku) this.f12686e), (z71) this.f12683b, (r81) oq0Var.f8762c);
            case 4:
                sj0 sj0Var = (sj0) this.f12684c;
                xp0 xp0Var = (xp0) this.f12685d;
                eq0 eq0Var = (eq0) this.f12686e;
                zh0 zh0Var = (zh0) this.f12683b;
                xr0 xr0VarK = xr0.k(sj0Var.f10309j, 12);
                xr0VarK.v0(xp0Var.E);
                xr0VarK.h();
                ed.d dVarI = vv.I(zh0Var.b(eq0Var, xp0Var), xp0Var.R, TimeUnit.MILLISECONDS, sj0Var.f10306f);
                sj0Var.f10308h.b(eq0Var, xp0Var, dVarI, sj0Var.f10303c);
                fs1.R(dVarI, sj0Var.f10310k, xr0VarK, false);
                return dVarI;
            case 5:
                du0 du0Var = (du0) this.f12684c;
                in0 in0Var = (in0) this.f12685d;
                oq0 oq0Var2 = (oq0) this.f12686e;
                to0 to0Var = (to0) this.f12683b;
                yq0 yq0Var = (yq0) obj;
                synchronized (du0Var) {
                    try {
                        du0Var.f4675b = true;
                        yq0Var.f12687a = (z50) ((kx0) in0Var.f6553c).f7326c;
                        if (du0Var.f4674a) {
                            n81VarD = vv.d(new er0(yq0Var, to0Var));
                        } else {
                            oq0Var2.q(to0Var.f10679g, yq0Var);
                            n81VarD = n81.f8237c;
                        }
                    } finally {
                    }
                }
                return n81VarD;
            case 6:
                return ((cz0) ((rx0) this.f12684c).f10078b.f5992g.get()).b((Context) this.f12685d, (View) this.f12686e, (Activity) this.f12683b);
            default:
                return ((cz0) ((rx0) this.f12684c).f10078b.f5992g.get()).d((Context) this.f12685d, (String) this.f12683b, (View) this.f12686e);
        }
    }

    public ed.d b(Object obj) {
        jx jxVar = new jx();
        pq pqVarN = ((rq) this.f12686e).n();
        t9.c0.m("callJs > getEngine: Promise created");
        pqVarN.e(new cw(this, pqVarN, obj, jxVar, 7), new ut(this, jxVar, pqVarN, 6));
        return jxVar;
    }

    public /* synthetic */ yq(qb0 qb0Var, String str, tv tvVar, p9.a aVar) {
        this.f12682a = 2;
        this.f12684c = qb0Var;
        this.f12683b = str;
        this.f12685d = tvVar;
        this.f12686e = aVar;
    }

    public /* synthetic */ yq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f12682a = i;
        this.f12684c = obj;
        this.f12685d = obj2;
        this.f12686e = obj3;
        this.f12683b = obj4;
    }

    public /* synthetic */ yq(Object obj, Object obj2, String str, Object obj3, int i) {
        this.f12682a = i;
        this.f12684c = obj;
        this.f12685d = obj2;
        this.f12683b = str;
        this.f12686e = obj3;
    }
}
