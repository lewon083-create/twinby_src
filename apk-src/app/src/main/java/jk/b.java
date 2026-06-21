package jk;

import com.google.android.gms.internal.measurement.h5;
import hk.b2;
import hk.c0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26679b = e.f26706p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hk.l f26680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f26681d;

    public b(c cVar) {
        this.f26681d = cVar;
    }

    @Override // hk.b2
    public final void a(mk.r rVar, int i) {
        hk.l lVar = this.f26680c;
        if (lVar != null) {
            lVar.a(rVar, i);
        }
    }

    public final Object b(kk.g frame) throws Throwable {
        k kVar;
        k kVarL;
        Object obj = this.f26679b;
        boolean z5 = true;
        if (obj == e.f26706p || obj == e.f26702l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f26687h;
            c cVar = this.f26681d;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (true) {
                if (cVar.r(c.f26682c.get(cVar), true)) {
                    this.f26679b = e.f26702l;
                    Throwable thM = cVar.m();
                    if (thM != null) {
                        int i = mk.s.f28939a;
                        throw thM;
                    }
                    z5 = false;
                } else {
                    long andIncrement = c.f26683d.getAndIncrement(cVar);
                    long j10 = e.f26693b;
                    long j11 = andIncrement / j10;
                    int i10 = (int) (andIncrement % j10);
                    if (kVar2.f28938c != j11) {
                        k kVarL2 = cVar.l(j11, kVar2);
                        if (kVarL2 == null) {
                            continue;
                        } else {
                            kVar = kVarL2;
                        }
                    } else {
                        kVar = kVar2;
                    }
                    Object objA = cVar.A(kVar, i10, andIncrement, null);
                    d8.k kVar3 = e.f26703m;
                    if (objA == kVar3) {
                        throw new IllegalStateException("unreachable");
                    }
                    d8.k kVar4 = e.f26705o;
                    if (objA == kVar4) {
                        if (andIncrement < cVar.p()) {
                            kVar.b();
                        }
                        kVar2 = kVar;
                    } else {
                        if (objA == e.f26704n) {
                            hk.l lVarI = c0.i(nj.f.b(frame));
                            try {
                                this.f26680c = lVarI;
                                Object objA2 = cVar.A(kVar, i10, andIncrement, this);
                                if (objA2 == kVar3) {
                                    a(kVar, i10);
                                } else {
                                    if (objA2 == kVar4) {
                                        if (andIncrement < cVar.p()) {
                                            kVar.b();
                                        }
                                        k kVar5 = (k) c.f26687h.get(cVar);
                                        while (true) {
                                            if (cVar.r(c.f26682c.get(cVar), true)) {
                                                hk.l lVar = this.f26680c;
                                                Intrinsics.b(lVar);
                                                this.f26680c = null;
                                                this.f26679b = e.f26702l;
                                                Throwable thM2 = cVar.m();
                                                if (thM2 == null) {
                                                    ij.k kVar6 = ij.m.f21341c;
                                                    lVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    ij.k kVar7 = ij.m.f21341c;
                                                    lVar.resumeWith(h5.s(thM2));
                                                }
                                            } else {
                                                long andIncrement2 = c.f26683d.getAndIncrement(cVar);
                                                long j12 = e.f26693b;
                                                long j13 = andIncrement2 / j12;
                                                int i11 = (int) (andIncrement2 % j12);
                                                if (kVar5.f28938c != j13) {
                                                    kVarL = cVar.l(j13, kVar5);
                                                    if (kVarL == null) {
                                                    }
                                                } else {
                                                    kVarL = kVar5;
                                                }
                                                Object objA3 = cVar.A(kVarL, i11, andIncrement2, this);
                                                if (objA3 == e.f26703m) {
                                                    a(kVarL, i11);
                                                    break;
                                                }
                                                if (objA3 == e.f26705o) {
                                                    if (andIncrement2 < cVar.p()) {
                                                        kVarL.b();
                                                    }
                                                    kVar5 = kVarL;
                                                } else {
                                                    if (objA3 == e.f26704n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVarL.b();
                                                    this.f26679b = objA3;
                                                    this.f26680c = null;
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.b();
                                        this.f26679b = objA2;
                                        this.f26680c = null;
                                    }
                                    lVarI.h(Boolean.TRUE, null);
                                }
                                Object objS = lVarI.s();
                                if (objS == nj.a.f29512b) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                return objS;
                            } catch (Throwable th2) {
                                lVarI.A();
                                throw th2;
                            }
                        }
                        kVar.b();
                        this.f26679b = objA;
                    }
                }
            }
        }
        return Boolean.valueOf(z5);
    }
}
