package zl;

import android.os.Bundle;
import android.view.View;
import g2.x1;
import java.lang.reflect.Constructor;
import yads.af;
import yads.ew0;
import yads.h73;
import yads.iz;
import yads.kb0;
import yads.kv1;
import yads.l73;
import yads.lm1;
import yads.md0;
import yads.ms2;
import yads.mv1;
import yads.mx;
import yads.n33;
import yads.nq0;
import yads.nx0;
import yads.o20;
import yads.o92;
import yads.od0;
import yads.oe2;
import yads.of1;
import yads.on3;
import yads.pc;
import yads.pf1;
import yads.q83;
import yads.re;
import yads.s63;
import yads.sk0;
import yads.sl2;
import yads.sq0;
import yads.t21;
import yads.u63;
import yads.uc;
import yads.uv0;
import yads.v21;
import yads.vl1;
import yads.w01;
import yads.wq;
import yads.xq;
import yads.xv;
import yads.xy0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements pf1, sq0, t21, wq, xy0, md0, iz, sk0, g2.q, of1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46577b;

    public /* synthetic */ g0(int i) {
        this.f46577b = i;
    }

    @Override // yads.md0
    public Constructor a() {
        switch (this.f46577b) {
            case 12:
                return od0.a();
            default:
                return od0.b();
        }
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((ms2) obj).f40999b.release();
    }

    @Override // yads.xy0
    public Object apply(Object obj) {
        switch (this.f46577b) {
            case 6:
                return mv1.a((h73) obj);
            default:
                return new kb0((xv) obj);
        }
    }

    @Override // yads.sq0
    public nq0[] createExtractors() {
        switch (this.f46577b) {
            case 1:
                return kv1.a();
            case 5:
                return mv1.d();
            case 11:
                return o92.a();
            case 14:
                return on3.a();
            case 16:
                return pc.a();
            case 18:
                return re.a();
            default:
                return uv0.a();
        }
    }

    @Override // yads.wq
    public xq fromBundle(Bundle bundle) {
        switch (this.f46577b) {
            case 3:
                return l73.a(bundle);
            case 4:
                return lm1.a(bundle);
            case 7:
                return mx.a(bundle);
            case 8:
                return n33.b(bundle);
            case 9:
                return nx0.a(bundle);
            case 10:
                return o20.a(bundle);
            case 17:
                return q83.a(bundle);
            case 19:
                return s63.a(bundle);
            case 21:
                return sl2.a(bundle);
            case 23:
                return u63.a(bundle);
            case 27:
                return vl1.a(bundle);
            default:
                return w01.b(bundle);
        }
    }

    @Override // yads.of1
    public void invoke(Object obj) {
        ((oe2) obj).onRenderedFirstFrame();
    }

    @Override // g2.q
    public x1 l(View view, x1 x1Var) {
        return uc.a(view, x1Var);
    }

    @Override // yads.sk0
    public void release() {
        sk0.lambda$static$0();
    }

    @Override // yads.pf1
    public void a(Object obj, ew0 ew0Var) {
        kb0.a((af) obj, ew0Var);
    }

    @Override // yads.t21
    public boolean a(int i, int i10, int i11, int i12, int i13) {
        switch (this.f46577b) {
            case 2:
                return kv1.a(i, i10, i11, i12, i13);
            default:
                return v21.b(i, i10, i11, i12, i13);
        }
    }
}
