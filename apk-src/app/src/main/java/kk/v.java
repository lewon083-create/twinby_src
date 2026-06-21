package kk;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f27467a = new AtomicReference(null);

    public final Object a(s frame) {
        hk.l lVar = new hk.l(1, nj.f.b(frame));
        lVar.t();
        while (true) {
            AtomicReference atomicReference = this.f27467a;
            d8.k kVar = u.f27465a;
            if (atomicReference.compareAndSet(kVar, lVar)) {
                break;
            }
            if (atomicReference.get() != kVar) {
                ij.k kVar2 = ij.m.f21341c;
                lVar.resumeWith(Unit.f27471a);
                break;
            }
        }
        Object objS = lVar.s();
        nj.a aVar = nj.a.f29512b;
        if (objS == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objS == aVar ? objS : Unit.f27471a;
    }
}
