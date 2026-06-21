package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fp0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns1 f5416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f5417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f5418d;

    public /* synthetic */ fp0(ns1 ns1Var, ls1 ls1Var, ls1 ls1Var2, int i) {
        this.f5415a = i;
        this.f5416b = ns1Var;
        this.f5417c = ls1Var;
        this.f5418d = ls1Var2;
    }

    public ep0 a() {
        yw ywVarN;
        yw ywVarN2;
        switch (this.f5415a) {
            case 0:
                Context context = (Context) this.f5416b.f8433a;
                sq0 sq0Var = (sq0) this.f5417c.j();
                dr0 dr0Var = (dr0) this.f5418d.j();
                wk wkVar = al.f2939b7;
                q9.s sVar = q9.s.f31967e;
                if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
                    t9.e0 e0VarG = p9.k.C.f31302h.g();
                    synchronized (e0VarG.f33564a) {
                        ywVarN = e0VarG.f33576n;
                        break;
                    }
                } else {
                    ywVarN = p9.k.C.f31302h.g().n();
                }
                boolean z5 = false;
                if (ywVarN != null && ywVarN.f12774j) {
                    z5 = true;
                }
                if (((Integer) sVar.f31970c.a(al.f3181r7)).intValue() > 0) {
                    if (!((Boolean) sVar.f31970c.a(al.f2923a7)).booleanValue() || z5) {
                        cr0 cr0VarA = dr0Var.a(wq0.f11877d, context, sq0Var, new in0(1, new kx0(25)));
                        ut utVar = new ut(17, (Object) new xo0(), false);
                        oq0 oq0Var = cr0VarA.f4303a;
                        gx gxVar = hx.f6279a;
                        return new hi(utVar, new oq0(oq0Var, gxVar), cr0VarA.f4304b, ((xq0) oq0Var.f8763d).f12285h, gxVar);
                    }
                }
                return new xo0();
            default:
                Context context2 = (Context) this.f5416b.f8433a;
                sq0 sq0Var2 = (sq0) this.f5417c.j();
                dr0 dr0Var2 = (dr0) this.f5418d.j();
                wk wkVar2 = al.f2939b7;
                q9.s sVar2 = q9.s.f31967e;
                if (!((Boolean) sVar2.f31970c.a(wkVar2)).booleanValue()) {
                    t9.e0 e0VarG2 = p9.k.C.f31302h.g();
                    synchronized (e0VarG2.f33564a) {
                        ywVarN2 = e0VarG2.f33576n;
                        break;
                    }
                } else {
                    ywVarN2 = p9.k.C.f31302h.g().n();
                }
                boolean z10 = false;
                if (ywVarN2 != null && ywVarN2.f12774j) {
                    z10 = true;
                }
                if (((Integer) sVar2.f31970c.a(al.f2970d7)).intValue() > 0) {
                    if (!((Boolean) sVar2.f31970c.a(al.f2923a7)).booleanValue() || z10) {
                        cr0 cr0VarA2 = dr0Var2.a(wq0.f11875b, context2, sq0Var2, new in0(1, new kx0(25)));
                        ut utVar2 = new ut(17, (Object) new xo0(), false);
                        oq0 oq0Var2 = cr0VarA2.f4303a;
                        gx gxVar2 = hx.f6279a;
                        return new hi(utVar2, new oq0(oq0Var2, gxVar2), cr0VarA2.f4304b, ((xq0) oq0Var2.f8763d).f12285h, gxVar2);
                    }
                }
                return new xo0();
        }
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f5415a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return new h01("0t12poYWosmBpngKvXFsIJ660Q+4XUg0b7zXGmPDXQpDG3a/Lo5YnElAjbhGuK/3", "2X8cf0JDVCgUXbkJnirLCT8PfoAeQLAghvQ5pw2PRcc=", (jd) this.f5416b.f8433a, (wz0) this.f5417c.j(), ((j21) this.f5418d.j()).a(114), 1);
            default:
                return new h01("3oTRZjKQOSoYyvNcYQSsDbCCM8OIxNI6HsD2yraLy7cjC5n8lPLLp8aPMOPQzMR5", "MHRGFnzrWite6OUEzeDGE6xEKTeZ1rlshMbJC9yXOH8=", (jd) this.f5416b.f8433a, (wz0) this.f5417c.j(), ((j21) this.f5418d.j()).a(117), 0);
        }
    }
}
