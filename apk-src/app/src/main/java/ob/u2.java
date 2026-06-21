package ob;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile r2 f30444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile r2 f30445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public r2 f30446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f30447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.v0 f30448h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile r2 f30449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r2 f30450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f30451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f30452m;

    public u2(l1 l1Var) {
        super(l1Var);
        this.f30452m = new Object();
        this.f30447g = new ConcurrentHashMap();
    }

    @Override // ob.f0
    public final boolean F() {
        return false;
    }

    public final void G(r2 r2Var, boolean z5, long j10) {
        l1 l1Var = (l1) this.f15951b;
        x xVar = l1Var.f30272o;
        l1.f(xVar);
        l1Var.f30269l.getClass();
        xVar.F(SystemClock.elapsedRealtime());
        boolean z10 = r2Var != null && r2Var.f30388d;
        k3 k3Var = l1Var.i;
        l1.i(k3Var);
        if (!k3Var.f30241g.c(j10, z10, z5) || r2Var == null) {
            return;
        }
        r2Var.f30388d = false;
    }

    public final r2 H(com.google.android.gms.internal.measurement.v0 v0Var) {
        pa.c0.i(v0Var);
        Integer numValueOf = Integer.valueOf(v0Var.f14012b);
        ConcurrentHashMap concurrentHashMap = this.f30447g;
        r2 r2Var = (r2) concurrentHashMap.get(numValueOf);
        if (r2Var == null) {
            String strJ = J(v0Var.f14013c);
            e4 e4Var = ((l1) this.f15951b).f30267j;
            l1.h(e4Var);
            r2 r2Var2 = new r2(null, strJ, e4Var.x0());
            concurrentHashMap.put(numValueOf, r2Var2);
            r2Var = r2Var2;
        }
        return this.f30449j != null ? this.f30449j : r2Var;
    }

    public final r2 I(boolean z5) {
        D();
        C();
        if (!z5) {
            return this.f30446f;
        }
        r2 r2Var = this.f30446f;
        return r2Var != null ? r2Var : this.f30450k;
    }

    public final String J(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        l1 l1Var = (l1) this.f15951b;
        int length2 = str2.length();
        l1Var.f30263e.getClass();
        if (length2 <= 500) {
            return str2;
        }
        l1Var.f30263e.getClass();
        return str2.substring(0, 500);
    }

    public final void K(com.google.android.gms.internal.measurement.v0 v0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((l1) this.f15951b).f30263e.Q() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f30447g.put(Integer.valueOf(v0Var.f14012b), new r2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void L(String str, r2 r2Var, boolean z5) {
        r2 r2Var2;
        r2 r2Var3 = this.f30444d == null ? this.f30445e : this.f30444d;
        if (r2Var.f30386b == null) {
            r2Var2 = new r2(r2Var.f30385a, str != null ? J(str) : null, r2Var.f30387c, r2Var.f30389e, r2Var.f30390f);
        } else {
            r2Var2 = r2Var;
        }
        this.f30445e = this.f30444d;
        this.f30444d = r2Var2;
        l1 l1Var = (l1) this.f15951b;
        l1Var.f30269l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i1 i1Var = l1Var.f30266h;
        l1.k(i1Var);
        i1Var.L(new s2(this, r2Var2, r2Var3, jElapsedRealtime, z5));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(ob.r2 r18, ob.r2 r19, long r20, boolean r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.u2.M(ob.r2, ob.r2, long, boolean, android.os.Bundle):void");
    }
}
