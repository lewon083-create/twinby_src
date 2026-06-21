package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.um1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2 f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e3 f14388b;

    public z3(e3 e3Var, q2 q2Var) {
        e3 e3Var2 = a3.f14133a;
        this.f14388b = e3Var;
        this.f14387a = q2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final boolean a(Object obj) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final void b(Object obj) {
        this.f14388b.getClass();
        j4 j4Var = ((g3) obj).zzc;
        if (j4Var.f14224e) {
            j4Var.f14224e = false;
        }
        e3 e3Var = a3.f14133a;
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final int c(q2 q2Var) {
        j4 j4Var = ((g3) q2Var).zzc;
        int i = j4Var.f14223d;
        if (i != -1) {
            return i;
        }
        int iV = 0;
        for (int i10 = 0; i10 < j4Var.f14220a; i10++) {
            int i11 = j4Var.f14221b[i10] >>> 3;
            w2 w2Var = (w2) j4Var.f14222c[i10];
            int iE0 = x2.e0(8);
            int iE02 = x2.e0(i11) + x2.e0(16);
            int iE03 = x2.e0(24);
            int iE = w2Var.e();
            iV = l7.o.v(iE0 + iE0, iE02, om1.C(iE, iE, iE03), iV);
        }
        j4Var.f14223d = iV;
        return iV;
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final void d(Object obj, Object obj2) {
        g4.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final void e(Object obj, byte[] bArr, int i, int i10, um1 um1Var) {
        g3 g3Var = (g3) obj;
        if (g3Var.zzc == j4.f14219f) {
            g3Var.zzc = j4.b();
        }
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final int f(g3 g3Var) {
        return g3Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final boolean g(g3 g3Var, g3 g3Var2) {
        return g3Var.zzc.equals(g3Var2.zzc);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final void h(Object obj, t3 t3Var) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.f4
    public final g3 i() {
        q2 q2Var = this.f14387a;
        return q2Var instanceof g3 ? (g3) ((g3) q2Var).d(4) : ((f3) ((g3) q2Var).d(5)).c();
    }
}
