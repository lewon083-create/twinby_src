package u0;

import a0.q2;
import com.google.android.gms.internal.measurement.b4;
import g0.c0;
import g0.d0;
import g0.f0;
import java.util.ArrayList;
import java.util.Collection;
import s3.q;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0.b f34007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f34008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f34009d;

    public f(f0 f0Var, g gVar, q qVar) {
        this.f34009d = gVar;
        this.f34007b = new g0.b(f0Var.g(), qVar);
        this.f34008c = new h(f0Var.p());
    }

    @Override // a0.p2
    public final void c(q2 q2Var) {
        b4.e();
        this.f34009d.c(q2Var);
    }

    @Override // a0.p2
    public final void d(q2 q2Var) {
        b4.e();
        this.f34009d.d(q2Var);
    }

    @Override // a0.p2
    public final void e(q2 q2Var) {
        b4.e();
        this.f34009d.e(q2Var);
    }

    @Override // g0.f0
    public final c0 g() {
        return this.f34007b;
    }

    @Override // a0.p2
    public final void h(q2 q2Var) {
        b4.e();
        this.f34009d.h(q2Var);
    }

    @Override // g0.f0
    public final void k(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // g0.f0
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // g0.f0
    public final boolean n() {
        return false;
    }

    @Override // g0.f0
    public final d0 p() {
        return this.f34008c;
    }

    @Override // g0.f0
    public final ed.d release() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
