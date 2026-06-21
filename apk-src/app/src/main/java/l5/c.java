package l5;

import com.google.android.gms.internal.ads.p6;
import com.google.android.gms.internal.ads.q6;
import com.google.android.gms.internal.ads.t6;
import j3.d0;
import m3.p;
import m3.z;
import q4.k;
import q4.l;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f27927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6 f27928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27929c;

    /* JADX WARN: Removed duplicated region for block: B:70:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0199  */
    @Override // q4.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(q4.l r25, com.google.android.gms.internal.ads.e2 r26) throws j3.d0 {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.a(q4.l, com.google.android.gms.internal.ads.e2):int");
    }

    @Override // q4.k
    public final void b(m mVar) {
        this.f27927a = mVar;
    }

    @Override // q4.k
    public final boolean d(l lVar) {
        try {
            return e(lVar);
        } catch (d0 unused) {
            return false;
        }
    }

    public final boolean e(l lVar) {
        boolean zB;
        q6 q6Var = new q6(1);
        if (q6Var.a(lVar, true) && (q6Var.f9349a & 2) == 2) {
            int iMin = Math.min(q6Var.f9353e, 8);
            p pVar = new p(iMin);
            lVar.V(pVar.f28589a, 0, iMin);
            pVar.M(0);
            if (pVar.a() >= 5 && pVar.z() == 127 && pVar.B() == 1179402563) {
                this.f27928b = new b(1);
                return true;
            }
            pVar.M(0);
            try {
                zB = q4.b.B(1, pVar, true);
            } catch (d0 unused) {
                zB = false;
            }
            if (zB) {
                this.f27928b = new f(1);
            } else {
                pVar.M(0);
                if (e.i(pVar, e.f27930o)) {
                    this.f27928b = new e(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // q4.k
    public final void seek(long j10, long j11) {
        t6 t6Var = this.f27928b;
        if (t6Var != null) {
            p6 p6Var = (p6) t6Var.i;
            q6 q6Var = (q6) p6Var.f8936e;
            q6Var.f9349a = 0;
            q6Var.f9350b = 0L;
            q6Var.f9351c = 0;
            q6Var.f9352d = 0;
            q6Var.f9353e = 0;
            ((p) p6Var.f8937f).J(0);
            p6Var.f8933b = -1;
            p6Var.f8935d = false;
            if (j10 == 0) {
                t6Var.d(!t6Var.f10505g);
                return;
            }
            if (t6Var.f10502d != 0) {
                long j12 = (((long) t6Var.f10503e) * j11) / 1000000;
                t6Var.f10499a = j12;
                d dVar = (d) t6Var.f10509l;
                String str = z.f28608a;
                dVar.o(j12);
                t6Var.f10502d = 2;
            }
        }
    }

    @Override // q4.k
    public final void release() {
    }
}
