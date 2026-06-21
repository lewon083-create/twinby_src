package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hf0 implements s9.l, o00 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u9.a f6120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ff0 f6121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sz f6122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6125h;
    public q9.o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6126j;

    public hf0(Context context, u9.a aVar) {
        this.f6119b = context;
        this.f6120c = aVar;
    }

    @Override // s9.l
    public final synchronized void E0(int i) {
        this.f6122e.destroy();
        if (!this.f6126j) {
            t9.c0.m("Inspector closed.");
            q9.o1 o1Var = this.i;
            if (o1Var != null) {
                try {
                    o1Var.j0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f6124g = false;
        this.f6123f = false;
        this.f6125h = 0L;
        this.f6126j = false;
        this.i = null;
    }

    public final synchronized void a(q9.o1 o1Var, wo woVar, ko koVar, wo woVar2) {
        if (d(o1Var)) {
            try {
                p9.k kVar = p9.k.C;
                fp fpVar = kVar.f31298d;
                sz szVarE = fp.e(this.f6119b, new j0(0, 0, 0), "", false, false, null, null, this.f6120c, null, null, new si(), null, null, null, null, null);
                this.f6122e = szVarE;
                k00 k00VarQ0 = szVarE.q0();
                if (k00VarQ0 == null) {
                    u9.i.h("Failed to obtain a web view for the ad inspector");
                    try {
                        kVar.f31302h.d("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        o1Var.j0(vv.C(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e3) {
                        p9.k.C.f31302h.d("InspectorUi.openInspector 3", e3);
                        return;
                    }
                }
                this.i = o1Var;
                Context context = this.f6119b;
                k00VarQ0.k(null, null, null, null, null, false, null, null, null, null, null, null, null, woVar, null, new ko(6, context), koVar, woVar2, null, null, null, null);
                k00VarQ0.f7062h = this;
                this.f6122e.loadUrl((String) q9.s.f31967e.f31970c.a(al.f3020ga));
                ob.z.a(context, new AdOverlayInfoParcel(this, this.f6122e, this.f6120c), true, null);
                kVar.f31304k.getClass();
                this.f6125h = System.currentTimeMillis();
            } catch (b00 e7) {
                u9.i.i("Failed to obtain a web view for the ad inspector", e7);
                try {
                    p9.k.C.f31302h.d("InspectorUi.openInspector 0", e7);
                    o1Var.j0(vv.C(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e10) {
                    p9.k.C.f31302h.d("InspectorUi.openInspector 1", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.o00
    public final synchronized void b(int i, String str, String str2, boolean z5) {
        if (z5) {
            t9.c0.m("Ad inspector loaded.");
            this.f6123f = true;
            c();
            return;
        }
        u9.i.h("Ad inspector failed to load.");
        try {
            bx bxVar = p9.k.C.f31302h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            bxVar.d("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb2.toString()));
            q9.o1 o1Var = this.i;
            if (o1Var != null) {
                o1Var.j0(vv.C(17, null, null));
            }
        } catch (RemoteException e3) {
            p9.k.C.f31302h.d("InspectorUi.onAdWebViewFinishedLoading 1", e3);
        }
        this.f6126j = true;
        this.f6122e.destroy();
    }

    public final synchronized void c() {
        if (this.f6123f && this.f6124g) {
            hx.f6284f.execute(new h30(11, this));
        }
    }

    public final synchronized boolean d(q9.o1 o1Var) {
        wk wkVar = al.fa;
        q9.s sVar = q9.s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            u9.i.h("Ad inspector had an internal error.");
            try {
                o1Var.j0(vv.C(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f6121d == null) {
            u9.i.h("Ad inspector had an internal error.");
            try {
                p9.k.C.f31302h.d("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                o1Var.j0(vv.C(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f6123f && !this.f6124g) {
            p9.k.C.f31304k.getClass();
            if (System.currentTimeMillis() >= this.f6125h + ((long) ((Integer) sVar.f31970c.a(al.f3051ia)).intValue())) {
                return true;
            }
        }
        u9.i.h("Ad inspector cannot be opened because it is already open.");
        try {
            o1Var.j0(vv.C(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // s9.l
    public final synchronized void m() {
        this.f6124g = true;
        c();
    }

    @Override // s9.l
    public final void A2() {
    }

    @Override // s9.l
    public final void D0() {
    }

    @Override // s9.l
    public final void L1() {
    }

    @Override // s9.l
    public final void T0() {
    }

    @Override // s9.l
    public final void X1() {
    }

    @Override // s9.l
    public final void d3() {
    }

    @Override // s9.l
    public final void i2() {
    }

    @Override // s9.l
    public final void p1() {
    }

    @Override // s9.l
    public final void w1() {
    }
}
