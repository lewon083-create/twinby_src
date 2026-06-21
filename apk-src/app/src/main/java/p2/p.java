package p2;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f31041l;

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        p pVar = new p(2, aVar);
        pVar.f31041l = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((w0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        h5.E(obj);
        return Boolean.valueOf(!(((w0) this.f31041l) instanceof o0));
    }
}
