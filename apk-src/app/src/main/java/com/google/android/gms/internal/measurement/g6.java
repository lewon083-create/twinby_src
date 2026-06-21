package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.um1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 implements m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t4 f13763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i5 f13764b;

    public g6(i5 i5Var, t4 t4Var) {
        i5 i5Var2 = d5.f13706a;
        this.f13764b = i5Var;
        this.f13763a = t4Var;
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final boolean a(Object obj) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final void b(Object obj, Object obj2) {
        n6.b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final int c(t4 t4Var) {
        q6 q6Var = ((k5) t4Var).zzc;
        int i = q6Var.f13930d;
        if (i != -1) {
            return i;
        }
        int iV = 0;
        for (int i10 = 0; i10 < q6Var.f13927a; i10++) {
            int i11 = q6Var.f13928b[i10] >>> 3;
            z4 z4Var = (z4) q6Var.f13929c[i10];
            int iM = a5.M(8);
            int iM2 = a5.M(i11) + a5.M(16);
            int iM3 = a5.M(24);
            int iE = z4Var.e();
            iV = l7.o.v(iM + iM, iM2, om1.A(iE, iE, iM3), iV);
        }
        q6Var.f13930d = iV;
        return iV;
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final void d(Object obj, z5 z5Var) {
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final boolean e(k5 k5Var, k5 k5Var2) {
        return k5Var.zzc.equals(k5Var2.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final void f(Object obj) {
        this.f13764b.getClass();
        q6 q6Var = ((k5) obj).zzc;
        if (q6Var.f13931e) {
            q6Var.f13931e = false;
        }
        i5 i5Var = d5.f13706a;
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final void g(Object obj, byte[] bArr, int i, int i10, um1 um1Var) {
        k5 k5Var = (k5) obj;
        if (k5Var.zzc == q6.f13926f) {
            k5Var.zzc = q6.a();
        }
        throw y8.e.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final k5 h() {
        t4 t4Var = this.f13763a;
        return t4Var instanceof k5 ? (k5) ((k5) t4Var).o(4) : ((j5) ((k5) t4Var).o(5)).d();
    }

    @Override // com.google.android.gms.internal.measurement.m6
    public final int i(k5 k5Var) {
        return k5Var.zzc.hashCode();
    }
}
