package e4;

import android.os.Handler;
import com.google.android.gms.internal.ads.e2;
import com.google.android.gms.internal.measurement.j4;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m4.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f16065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a0.a0 f16066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a1.e f16067e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f16069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f16070h;
    public f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q4.h f16071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f16072k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f16074m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f16068f = m3.z.o(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile long f16073l = -9223372036854775807L;

    public e(int i, w wVar, a0.a0 a0Var, a1.e eVar, c cVar) {
        this.f16064b = i;
        this.f16065c = wVar;
        this.f16066d = a0Var;
        this.f16067e = eVar;
        this.f16069g = cVar;
    }

    @Override // m4.k
    public final void d() {
        this.f16072k = true;
    }

    @Override // m4.k
    public final void load() {
        if (this.f16072k) {
            this.f16072k = false;
        }
        try {
            if (this.f16070h == null) {
                d dVarA = this.f16069g.a(this.f16064b);
                this.f16070h = dVarA;
                this.f16068f.post(new a1.c(this, dVarA.c(), this.f16070h, 11));
                d dVar = this.f16070h;
                dVar.getClass();
                this.f16071j = new q4.h(dVar, 0L, -1L);
                f fVar = new f(this.f16065c.f16210a, this.f16064b);
                this.i = fVar;
                fVar.b(this.f16067e);
            }
            while (!this.f16072k) {
                if (this.f16073l != -9223372036854775807L) {
                    f fVar2 = this.i;
                    fVar2.getClass();
                    fVar2.seek(this.f16074m, this.f16073l);
                    this.f16073l = -9223372036854775807L;
                }
                f fVar3 = this.i;
                fVar3.getClass();
                q4.h hVar = this.f16071j;
                hVar.getClass();
                if (fVar3.a(hVar, new e2()) == -1) {
                    break;
                }
            }
            this.f16072k = false;
            d dVar2 = this.f16070h;
            dVar2.getClass();
            if (dVar2.s()) {
                j4.g(this.f16070h);
                this.f16070h = null;
            }
        } catch (Throwable th2) {
            d dVar3 = this.f16070h;
            dVar3.getClass();
            if (dVar3.s()) {
                j4.g(this.f16070h);
                this.f16070h = null;
            }
            throw th2;
        }
    }
}
