package hk;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class e1 extends k1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1() {
        super(true);
        boolean z5 = true;
        D(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f20684c;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z5 = false;
            break;
        }
        k1 k1VarI = pVar.i();
        while (!k1VarI.y()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(k1VarI);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z5 = false;
                break;
            }
            k1VarI = pVar2.i();
        }
        this.f20658d = z5;
    }

    @Override // hk.k1
    public final boolean y() {
        return this.f20658d;
    }

    @Override // hk.k1
    public final boolean z() {
        return true;
    }
}
