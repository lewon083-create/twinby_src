package d7;

import kk.f;
import kotlin.Unit;
import kotlin.jvm.internal.f0;
import p2.e0;
import p2.o0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15574c;

    public /* synthetic */ a(int i, Object obj) {
        this.f15573b = i;
        this.f15574c = obj;
    }

    @Override // kk.f
    public final Object emit(Object obj, mj.a aVar) {
        switch (this.f15573b) {
            case 0:
                ((f2.a) this.f15574c).accept(obj);
                return Unit.f27471a;
            case 1:
                ((f0) this.f15574c).f27510b = obj;
                throw new lk.a(this);
            default:
                e0 e0Var = (e0) this.f15574c;
                if (e0Var.f30958h.q() instanceof o0) {
                    return Unit.f27471a;
                }
                Object objE = e0.e(e0Var, true, aVar);
                return objE == nj.a.f29512b ? objE : Unit.f27471a;
        }
    }
}
