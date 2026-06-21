package pk;

import hk.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import mk.r;
import wj.n;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31511b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31512c = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31513d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f31514e = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f31515f = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f31516a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public g() {
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = 1;
        this.f31516a = new k(2, this);
    }

    public final void a(b bVar) {
        Object objB;
        long j10;
        i iVar;
        while (true) {
            int andDecrement = f31515f.getAndDecrement(this);
            if (andDecrement <= 1) {
                n nVar = this.f31516a;
                if (andDecrement > 0) {
                    bVar.h(Unit.f27471a, nVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31513d;
                i iVar2 = (i) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f31514e.getAndIncrement(this);
                e eVar = e.f31509b;
                long j11 = andIncrement / ((long) h.f31522f);
                while (true) {
                    objB = mk.a.b(iVar2, j11, eVar);
                    if (!mk.a.e(objB)) {
                        r rVarC = mk.a.c(objB);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            iVar = iVar2;
                            j10 = andIncrement;
                            if (rVar.f28938c >= rVarC.f28938c) {
                                break;
                            }
                            if (!rVarC.j()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (rVarC.f()) {
                                        rVarC.e();
                                    }
                                    iVar2 = iVar;
                                    andIncrement = j10;
                                }
                            }
                            if (rVar.f()) {
                                rVar.e();
                            }
                        }
                    } else {
                        j10 = andIncrement;
                        break;
                    }
                    iVar2 = iVar;
                    andIncrement = j10;
                }
                i iVar3 = (i) mk.a.c(objB);
                AtomicReferenceArray atomicReferenceArray = iVar3.f31523e;
                int i = (int) (j10 % ((long) h.f31522f));
                while (!atomicReferenceArray.compareAndSet(i, null, bVar)) {
                    if (atomicReferenceArray.get(i) != null) {
                        d8.k kVar = h.f31518b;
                        d8.k kVar2 = h.f31519c;
                        while (!atomicReferenceArray.compareAndSet(i, kVar, kVar2)) {
                            if (atomicReferenceArray.get(i) != kVar) {
                                break;
                            }
                        }
                        bVar.h(Unit.f27471a, nVar);
                        return;
                    }
                }
                bVar.a(iVar3, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.g.b():void");
    }
}
