package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 implements ma0, w70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sr f5752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q60 f5753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i70 f5754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g60 f5755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u80 f5756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f5757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xp0 f5758h;
    public final u9.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iq0 f5759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5760k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5761l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5762m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final pr f5763n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qr f5764o;

    public gb0(pr prVar, qr qrVar, sr srVar, q60 q60Var, i70 i70Var, g60 g60Var, u80 u80Var, Context context, xp0 xp0Var, u9.a aVar, iq0 iq0Var) {
        this.f5763n = prVar;
        this.f5764o = qrVar;
        this.f5752b = srVar;
        this.f5753c = q60Var;
        this.f5754d = i70Var;
        this.f5755e = g60Var;
        this.f5756f = u80Var;
        this.f5757g = context;
        this.f5758h = xp0Var;
        this.i = aVar;
        this.f5759j = iq0Var;
    }

    public static final HashMap w(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final int A() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void P() {
        try {
            sr srVar = this.f5752b;
            if (srVar != null) {
                srVar.M();
            }
        } catch (RemoteException e3) {
            u9.i.i("Failed to call destroy", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3 A[Catch: RemoteException -> 0x0032, JSONException -> 0x0050, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x0032, blocks: (B:2:0x0000, B:5:0x0022, B:9:0x002c, B:14:0x0039, B:16:0x0041, B:17:0x0050, B:19:0x0056, B:21:0x0062, B:24:0x006e, B:27:0x0075, B:29:0x008b, B:41:0x00ac, B:44:0x00b3, B:45:0x00b7, B:46:0x00cd, B:48:0x00d3, B:52:0x00e5, B:54:0x00f1, B:57:0x0103, B:59:0x012c), top: B:66:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.ma0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r14, java.util.Map r15, java.util.Map r16, android.view.View.OnTouchListener r17, android.view.View.OnClickListener r18) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gb0.a(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void e(q9.l1 l1Var) {
        u9.i.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void f(View view, View view2, Map map, Map map2, boolean z5, ImageView.ScaleType scaleType) {
        if (this.f5761l && this.f5758h.L) {
            return;
        }
        x(view);
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void g() {
        try {
            sr srVar = this.f5752b;
            if (srVar == null || !srVar.B()) {
                return;
            }
            xp0 xp0Var = this.f5758h;
            if (xp0Var.f12235e != 4 && !xp0Var.D0) {
                return;
            }
            srVar.u();
            this.f5753c.a();
        } catch (RemoteException e3) {
            u9.i.i("Failed to report impression from an adapter", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void h(View view) {
        try {
            xa.b bVar = new xa.b(view);
            sr srVar = this.f5752b;
            if (srVar != null) {
                srVar.a4(bVar);
                return;
            }
            pr prVar = this.f5763n;
            if (prVar != null) {
                Parcel parcelD0 = prVar.D0();
                vg.e(parcelD0, bVar);
                prVar.L1(parcelD0, 16);
            } else {
                qr qrVar = this.f5764o;
                if (qrVar != null) {
                    Parcel parcelD02 = qrVar.D0();
                    vg.e(parcelD02, bVar);
                    qrVar.L1(parcelD02, 14);
                }
            }
        } catch (RemoteException e3) {
            u9.i.i("Failed to call untrackView", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void k() {
        this.f5761l = true;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void l(View view, View view2, Map map, Map map2, boolean z5, ImageView.ScaleType scaleType, int i) {
        if (!this.f5761l) {
            u9.i.h("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f5758h.L) {
            x(view2);
        } else {
            u9.i.h("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean m() {
        return this.f5758h.L;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void o(q9.j1 j1Var) {
        u9.i.h("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            boolean z5 = this.f5760k;
            xp0 xp0Var = this.f5758h;
            if (!z5) {
                this.f5760k = p9.k.C.f31308o.d(this.f5757g, this.i.f34365b, xp0Var.C.toString(), this.f5759j.f6575g);
            }
            if (this.f5762m) {
                sr srVar = this.f5752b;
                q60 q60Var = this.f5753c;
                if (srVar != null) {
                    if (xp0Var.D0) {
                        if (srVar.B()) {
                            return;
                        }
                        srVar.u();
                        q60Var.a();
                        return;
                    }
                    if (srVar.B() && xp0Var.f12235e == 4) {
                        this.f5754d.a();
                        return;
                    } else {
                        srVar.u();
                        q60Var.a();
                        return;
                    }
                }
                pr prVar = this.f5763n;
                if (prVar != null) {
                    Parcel parcelP1 = prVar.p1(prVar.D0(), 13);
                    ClassLoader classLoader = vg.f11374a;
                    boolean z10 = parcelP1.readInt() != 0;
                    parcelP1.recycle();
                    if (!z10) {
                        prVar.L1(prVar.D0(), 10);
                        q60Var.a();
                        return;
                    }
                }
                qr qrVar = this.f5764o;
                if (qrVar != null) {
                    Parcel parcelP12 = qrVar.p1(qrVar.D0(), 11);
                    ClassLoader classLoader2 = vg.f11374a;
                    boolean z11 = parcelP12.readInt() != 0;
                    parcelP12.recycle();
                    if (z11) {
                        return;
                    }
                    qrVar.L1(qrVar.D0(), 8);
                    q60Var.a();
                }
            }
        } catch (RemoteException e3) {
            u9.i.i("Failed to call recordImpression", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean s(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final boolean u() {
        return true;
    }

    public final void x(View view) {
        try {
            sr srVar = this.f5752b;
            u80 u80Var = this.f5756f;
            g60 g60Var = this.f5755e;
            if (srVar != null && !srVar.Z()) {
                srVar.m0(new xa.b(view));
                g60Var.onAdClicked();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue()) {
                    u80Var.J();
                    return;
                }
                return;
            }
            pr prVar = this.f5763n;
            if (prVar != null) {
                Parcel parcelP1 = prVar.p1(prVar.D0(), 14);
                ClassLoader classLoader = vg.f11374a;
                boolean z5 = parcelP1.readInt() != 0;
                parcelP1.recycle();
                if (!z5) {
                    xa.b bVar = new xa.b(view);
                    Parcel parcelD0 = prVar.D0();
                    vg.e(parcelD0, bVar);
                    prVar.L1(parcelD0, 11);
                    g60Var.onAdClicked();
                    if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue()) {
                        u80Var.J();
                        return;
                    }
                    return;
                }
            }
            qr qrVar = this.f5764o;
            if (qrVar != null) {
                Parcel parcelP12 = qrVar.p1(qrVar.D0(), 12);
                ClassLoader classLoader2 = vg.f11374a;
                boolean z10 = parcelP12.readInt() != 0;
                parcelP12.recycle();
                if (z10) {
                    return;
                }
                xa.b bVar2 = new xa.b(view);
                Parcel parcelD02 = qrVar.D0();
                vg.e(parcelD02, bVar2);
                qrVar.L1(parcelD02, 9);
                g60Var.onAdClicked();
                if (((Boolean) q9.s.f31967e.f31970c.a(al.Xb)).booleanValue()) {
                    u80Var.J();
                }
            }
        } catch (RemoteException e3) {
            u9.i.i("Failed to call handleClick", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void e0() {
    }

    @Override // com.google.android.gms.internal.ads.w70
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void t() {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void y() {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void F(String str) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void b(View view) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void i(co coVar) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void n(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void v(View view, MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.ma0
    public final void p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}
