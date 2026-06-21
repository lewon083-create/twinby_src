package a1;

import io.appmetrica.analytics.impl.Tb;
import m3.z;
import s3.y;
import t.a0;
import t.c0;
import x0.b0;
import x0.v;
import yads.cl;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f315d;

    public /* synthetic */ b(int i, Object obj, boolean z5) {
        this.f313b = i;
        this.f315d = obj;
        this.f314c = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 5;
        switch (this.f313b) {
            case 0:
                v vVar = (v) this.f315d;
                boolean z5 = this.f314c;
                b0 b0Var = (b0) vVar.f35682d;
                if (b0Var.Y == z5) {
                    com.google.android.gms.internal.auth.g.O("Recorder", "Audio source silenced transitions to the same state " + z5);
                } else {
                    b0Var.Y = z5;
                    b0Var.K(true);
                }
                break;
            case 1:
                f fVar = (f) this.f315d;
                boolean z10 = this.f314c;
                g gVar = fVar.f325b;
                gVar.f341q = z10;
                if (gVar.f332g == 2) {
                    gVar.a();
                }
                break;
            case 2:
                ((hi.g) this.f315d).success(Boolean.valueOf(this.f314c));
                break;
            case 3:
                Tb.a((Tb) this.f315d, this.f314c);
                break;
            case 4:
                c0 c0Var = (c0) this.f315d;
                boolean z11 = this.f314c;
                c0Var.H = z11;
                if (z11) {
                    if (c0Var.M == 4 || c0Var.M == 5) {
                        c0Var.J(false);
                    }
                }
                break;
            case 5:
                o4.v vVar2 = (o4.v) this.f315d;
                boolean z12 = this.f314c;
                s3.t tVar = vVar2.f29701b;
                String str = z.f28608a;
                y yVar = tVar.f32648b;
                if (yVar.f32690c0 != z12) {
                    yVar.f32690c0 = z12;
                    yVar.f32708n.e(23, new io.sentry.i(z12, i));
                    break;
                }
                break;
            case 6:
                z.c cVar = (z.c) this.f315d;
                boolean z13 = this.f314c;
                if (cVar.f45767a != z13) {
                    cVar.f45767a = z13;
                    if (!z13) {
                        a0.o oVar = new a0.o("The camera control has became inactive.");
                        j1.h hVar = cVar.f45773g;
                        if (hVar != null) {
                            hVar.d(oVar);
                            cVar.f45773g = null;
                        }
                    } else if (cVar.f45768b) {
                        t.o oVar2 = cVar.f45769c;
                        oVar2.getClass();
                        k0.j.f(i0.o.w(new t.k(oVar2, 1))).a(new a0(16, cVar), cVar.f45770d);
                        cVar.f45768b = false;
                    }
                    break;
                }
                break;
            default:
                ((cl) this.f315d).a(this.f314c);
                break;
        }
    }
}
