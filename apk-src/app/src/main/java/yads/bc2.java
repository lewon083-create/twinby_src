package yads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bc2 implements yb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f36988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ac2 f36989c = ac2.f36683b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cc2 f36990d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f36991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f36992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36993h;

    public bc2(boolean z5, Handler handler) {
        this.f36987a = z5;
        this.f36988b = handler;
    }

    public final void a(long j10, cc2 cc2Var) {
        a();
        this.f36990d = cc2Var;
        this.f36991f = j10;
        this.f36992g = j10;
        if (this.f36987a) {
            this.f36988b.post(new t.a0(19, this));
        } else {
            c();
        }
    }

    public final void c() {
        this.f36989c = ac2.f36684c;
        this.f36993h = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f36991f);
        if (jMin > 0) {
            this.f36988b.postDelayed(new zb2(this), jMin);
            return;
        }
        cc2 cc2Var = this.f36990d;
        if (cc2Var != null) {
            cc2Var.a();
        }
        a();
    }

    public static final void a(bc2 bc2Var) {
        bc2Var.c();
    }

    public final void a() {
        ac2 ac2Var = ac2.f36683b;
        if (ac2Var == this.f36989c) {
            return;
        }
        this.f36989c = ac2Var;
        this.f36990d = null;
        this.f36988b.removeCallbacksAndMessages(null);
    }
}
