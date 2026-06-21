package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 implements z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b2 f8615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6 f8616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8617c;

    static {
        int i = rs.H;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        try {
            return f(a2Var);
        } catch (eb unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f8615a = b2Var;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        t6 t6Var = this.f8616b;
        if (t6Var != null) {
            p6 p6Var = (p6) t6Var.i;
            q6 q6Var = (q6) p6Var.f8936e;
            q6Var.f9349a = 0;
            q6Var.f9350b = 0L;
            q6Var.f9351c = 0;
            q6Var.f9352d = 0;
            q6Var.f9353e = 0;
            ((tk0) p6Var.f8937f).y(0);
            p6Var.f8933b = -1;
            p6Var.f8935d = false;
            if (j10 == 0) {
                t6Var.e(!t6Var.f10505g);
                return;
            }
            if (t6Var.f10502d != 0) {
                long j12 = (((long) t6Var.f10503e) * j11) / 1000000;
                t6Var.f10499a = j12;
                r6 r6Var = (r6) t6Var.f10509l;
                String str = cq0.f4293a;
                r6Var.f(j12);
                t6Var.f10502d = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x018f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0190  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r21, com.google.android.gms.internal.ads.e2 r22) throws com.google.android.gms.internal.ads.eb, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o6.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final boolean f(a2 a2Var) {
        q6 q6Var = new q6(0);
        if (q6Var.d(a2Var, true) && (q6Var.f9349a & 2) == 2) {
            int iMin = Math.min(q6Var.f9353e, 8);
            tk0 tk0Var = new tk0(iMin);
            a2Var.E(tk0Var.f10641a, 0, iMin);
            tk0Var.E(0);
            if (tk0Var.B() >= 5 && tk0Var.K() == 127 && tk0Var.P() == 1179402563) {
                this.f8616b = new n6(0);
                return true;
            }
            tk0Var.E(0);
            try {
                if (rs.y(1, tk0Var, true)) {
                    this.f8616b = new u6(0);
                    return true;
                }
            } catch (eb unused) {
            }
            tk0Var.E(0);
            if (s6.i(tk0Var, s6.f10181o)) {
                this.f8616b = new s6(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
