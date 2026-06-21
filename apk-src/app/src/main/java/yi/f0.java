package yi;

import android.graphics.drawable.Drawable;
import android.view.Display;
import yads.ak2;
import yads.al3;
import yads.as;
import yads.bg3;
import yads.cc2;
import yads.cw0;
import yads.h73;
import yads.ig0;
import yads.iz;
import yads.kk1;
import yads.lm1;
import yads.nx0;
import yads.oe2;
import yads.of1;
import yads.pk0;
import yads.q20;
import yads.qp;
import yads.qp2;
import yads.rj3;
import yads.sh3;
import yads.ta0;
import yads.tx0;
import yads.u31;
import yads.uu0;
import yads.vs1;
import yads.xh3;
import yads.xk1;
import yads.xn0;
import yads.xy0;
import yads.yk1;
import yads.zj2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements of1, cc2, ak2, al3, qp2, ta0, qp, xy0, u31, sh3, xk1, iz, as {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45657c;

    public /* synthetic */ f0(int i, Object obj) {
        this.f45656b = i;
        this.f45657c = obj;
    }

    @Override // yads.xk1
    public int a(Object obj) {
        return yk1.a((nx0) this.f45657c, (kk1) obj);
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((pk0) obj).a((Exception) this.f45657c);
    }

    @Override // yads.xy0
    public Object apply(Object obj) {
        return ((tx0) this.f45657c).a((h73) obj);
    }

    public void b(Display display) {
        ((xh3) this.f45657c).a(display);
    }

    public void c(d8.j jVar) {
        jh.b bVar = (jh.b) this.f45657c;
        l lVarH = ya.e.h(jVar);
        i iVar = new i();
        iVar.f45668a = lVarH;
        iVar.f45669b = "";
        bVar.e(iVar);
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        switch (this.f45656b) {
            case 4:
                ((oe2) obj).a((lm1) this.f45657c);
                break;
            case 14:
                ((oe2) obj).a((ig0) this.f45657c);
                break;
            case 15:
                ((xn0) this.f45657c).a((oe2) obj);
                break;
            case 16:
                ((oe2) obj).a((vs1) this.f45657c);
                break;
            case 17:
                ((oe2) obj).a((q20) this.f45657c);
                break;
            default:
                ((oe2) obj).a((rj3) this.f45657c);
                break;
        }
    }

    @Override // yads.qp
    public long a(long j10) {
        return ((cw0) this.f45657c).a(j10);
    }

    @Override // yads.cc2
    public void a() {
        bg3.a((bg3) this.f45657c);
    }

    @Override // yads.as
    public void a(long j10, long j11, long j12) {
        ((zj2) this.f45657c).a(j10, j11, j12);
    }

    @Override // yads.u31
    public void a(Drawable drawable) {
        uu0.a((uu0) this.f45657c, drawable);
    }
}
