package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob0 implements z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q9.g3 f8656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xp0 f8657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zp0 f8658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p9.a f8659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wv f8660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f8661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f8662h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ob0(Object obj, q9.g3 g3Var, xp0 xp0Var, zp0 zp0Var, p9.a aVar, wv wvVar, String str, String str2, int i) {
        this.f8655a = i;
        this.i = obj;
        this.f8656b = g3Var;
        this.f8657c = xp0Var;
        this.f8658d = zp0Var;
        this.f8659e = aVar;
        this.f8660f = wvVar;
        this.f8661g = str;
        this.f8662h = str2;
    }

    @Override // com.google.android.gms.internal.ads.z71
    public final ed.d a(Object obj) {
        de0 de0Var;
        switch (this.f8655a) {
            case 0:
                qb0 qb0Var = (qb0) this.i;
                q9.g3 g3Var = this.f8656b;
                xp0 xp0Var = this.f8657c;
                zp0 zp0Var = this.f8658d;
                p9.a aVar = this.f8659e;
                wv wvVar = this.f8660f;
                String str = this.f8661g;
                String str2 = this.f8662h;
                sz szVarA = qb0Var.f9423j.a(g3Var, xp0Var, zp0Var);
                ni niVar = new ni(szVarA);
                lc0 lc0Var = qb0Var.f9425l.f8272a;
                k00 k00VarQ0 = szVarA.q0();
                wk wkVar = al.Te;
                q9.s sVar = q9.s.f31967e;
                k00VarQ0.k(lc0Var, lc0Var, lc0Var, lc0Var, lc0Var, false, null, !((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? new p9.a(qb0Var.f9415a, null) : aVar, null, true != ((Boolean) sVar.f31970c.a(wkVar)).booleanValue() ? null : wvVar, qb0Var.f9428o, qb0Var.f9427n, qb0Var.f9426m, null, lc0Var, null, null, null, null, null, null, null);
                szVarA.u0("/getNativeAdViewSignals", uo.f11023n);
                szVarA.u0("/getNativeClickMeta", uo.f11024o);
                if (((Boolean) sVar.f31970c.a(al.G8)).booleanValue()) {
                    if (((Boolean) sVar.f31970c.a(al.I8)).booleanValue() && (de0Var = qb0Var.f9432s) != null) {
                        szVarA.u0("/onDeviceStorageEvent", new ko(3, de0Var));
                    }
                }
                k00 k00VarQ02 = szVarA.q0();
                synchronized (k00VarQ02.f7059e) {
                    k00VarQ02.f7073t = true;
                    break;
                }
                szVarA.q0().f7062h = new yz(niVar, 1);
                szVarA.K0(str, str2);
                return niVar;
            default:
                xb0 xb0Var = (xb0) this.i;
                q9.g3 g3Var2 = this.f8656b;
                xp0 xp0Var2 = this.f8657c;
                zp0 zp0Var2 = this.f8658d;
                p9.a aVar2 = this.f8659e;
                wv wvVar2 = this.f8660f;
                String str3 = this.f8661g;
                String str4 = this.f8662h;
                sz szVarA2 = xb0Var.f12101c.a(g3Var2, xp0Var2, zp0Var2);
                ni niVar2 = new ni(szVarA2);
                if (xb0Var.f12099a.f6570b != null) {
                    xb0Var.a(szVarA2, aVar2, wvVar2);
                    szVarA2.W0(new j0(5, 0, 0));
                } else {
                    lc0 lc0Var2 = xb0Var.f12102d.f8272a;
                    k00 k00VarQ03 = szVarA2.q0();
                    wk wkVar2 = al.Te;
                    q9.s sVar2 = q9.s.f31967e;
                    k00VarQ03.k(lc0Var2, lc0Var2, lc0Var2, lc0Var2, lc0Var2, false, null, !((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue() ? new p9.a(xb0Var.f12103e, null) : aVar2, null, true != ((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue() ? null : wvVar2, xb0Var.f12106h, xb0Var.f12105g, xb0Var.f12104f, null, lc0Var2, null, null, null, null, xb0Var.f12107j, null, null);
                    xb0.b(szVarA2);
                }
                szVarA2.q0().f7062h = new wb0(xb0Var, szVarA2, niVar2, 0);
                szVarA2.K0(str3, str4);
                return niVar2;
        }
    }
}
