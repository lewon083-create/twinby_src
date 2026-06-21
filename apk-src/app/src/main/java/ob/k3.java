package ob;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.m6;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kw0 f30238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k6.t0 f30240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m6 f30241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l6.i f30242h;

    public k3(l1 l1Var) {
        super(l1Var);
        this.f30239e = true;
        this.f30240f = new k6.t0(7, this);
        m6 m6Var = new m6();
        m6Var.f7791e = this;
        l1 l1Var2 = (l1) this.f15951b;
        m6Var.f7790d = new j3(m6Var, l1Var2, 0);
        l1Var2.f30269l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m6Var.f7788b = jElapsedRealtime;
        m6Var.f7789c = jElapsedRealtime;
        this.f30241g = m6Var;
        this.f30242h = new l6.i(15, this);
    }

    @Override // ob.f0
    public final boolean F() {
        return false;
    }

    public final void G() {
        C();
        if (this.f30238d == null) {
            this.f30238d = new kw0(Looper.getMainLooper(), 1);
        }
    }
}
