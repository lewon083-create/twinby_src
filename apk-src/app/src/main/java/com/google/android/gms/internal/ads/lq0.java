package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xp0 f7592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zp0 f7593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bt0 f7594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zs0 f7595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final as0 f7596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w20 f7597f;

    public lq0(bt0 bt0Var, zs0 zs0Var, xp0 xp0Var, zp0 zp0Var, w20 w20Var, as0 as0Var) {
        this.f7592a = xp0Var;
        this.f7593b = zp0Var;
        this.f7594c = bt0Var;
        this.f7595d = zs0Var;
        this.f7597f = w20Var;
        this.f7596e = as0Var;
    }

    public final void a(ArrayList arrayList, g70 g70Var) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            xp0 xp0Var = this.f7592a;
            if (xp0Var.f12242i0) {
                String str2 = this.f7593b.f13056b;
                zs0 zs0Var = this.f7595d;
                zs0Var.getClass();
                p9.k.C.f31304k.getClass();
                cb cbVar = new cb(System.currentTimeMillis(), str2, str, 2);
                kh0 kh0Var = zs0Var.f13101a;
                kh0Var.getClass();
                kh0Var.a(new n90(13, kh0Var, cbVar));
            } else {
                as0 as0Var = this.f7596e;
                this.f7594c.b(str, xp0Var.f12271x0, as0Var, g70Var);
            }
        }
    }

    public final void b(int i, ArrayList arrayList) {
        ed.d dVarD;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (((Boolean) q9.s.f31967e.f31970c.a(al.f3111mb)).booleanValue() && w20.b(str)) {
                dVarD = this.f7597f.a(str, q9.r.f31959g.f31964e);
            } else {
                dVarD = vv.d(str);
            }
            d8.e0 e0Var = new d8.e0(this, i, 8);
            dVarD.a(new l81(0, dVarD, e0Var), hx.f6279a);
        }
    }
}
