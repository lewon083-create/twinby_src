package s3;

import android.util.Pair;
import g0.s2;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import yads.dn1;
import yads.en1;
import yads.jm1;
import yads.xf1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f32633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Serializable f32638h;

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, boolean z5, int i) {
        this.f32632b = i;
        this.f32634d = obj;
        this.f32635e = obj2;
        this.f32636f = obj3;
        this.f32637g = obj4;
        this.f32638h = serializable;
        this.f32633c = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f32632b) {
            case 0:
                r0 r0Var = (r0) this.f32634d;
                Pair pair = (Pair) this.f32635e;
                ((t3.d) r0Var.f32642b.f12166j).m(((Integer) pair.first).intValue(), (i4.c0) pair.second, (i4.u) this.f32636f, (f4.g) this.f32637g, (IOException) this.f32638h, this.f32633c);
                break;
            case 1:
                x0.k0 k0Var = (x0.k0) this.f32634d;
                q0.m mVar = (q0.m) this.f32635e;
                g0.f0 f0Var = (g0.f0) this.f32636f;
                y0.a aVar = (y0.a) this.f32637g;
                s2 s2Var = (s2) this.f32638h;
                if (f0Var == k0Var.e()) {
                    k0Var.f35637v = mVar.d(f0Var, true);
                    x0.m0 m0Var = (x0.m0) aVar.a(y0.a.M);
                    Objects.requireNonNull(m0Var);
                    m0Var.b(k0Var.f35637v, s2Var, this.f32633c);
                    k0Var.Q();
                }
                break;
            default:
                ((dn1) this.f32634d).a((en1) this.f32635e, (xf1) this.f32636f, (jm1) this.f32637g, (IOException) this.f32638h, this.f32633c);
                break;
        }
    }
}
