package jk;

import a0.u;
import hk.b2;
import kotlin.Unit;
import kotlin.jvm.internal.g0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f26716l;

    public m(int i, a aVar) {
        super(i);
        this.f26716l = aVar;
        if (aVar != a.f26675b) {
            if (i < 1) {
                throw new IllegalArgumentException(u.k(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + g0.a(c.class).d() + " instead").toString());
        }
    }

    public final Object D(Object obj, boolean z5) {
        k kVar;
        m mVar;
        Object obj2;
        if (this.f26716l == a.f26677d) {
            Object objI = super.i(obj);
            return (!(objI instanceof i) || (objI instanceof h)) ? objI : Unit.f27471a;
        }
        Object obj3 = e.f26695d;
        k kVar2 = (k) c.f26686g.get(this);
        while (true) {
            long andIncrement = c.f26682c.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i = e.f26693b;
            long j11 = i;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (kVar2.f28938c != j12) {
                k kVarB = c.b(this, j12, kVar2);
                if (kVarB != null) {
                    kVar = kVarB;
                    obj2 = obj;
                    mVar = this;
                } else if (zR) {
                    return new h(o());
                }
            } else {
                kVar = kVar2;
                mVar = this;
                obj2 = obj;
            }
            int iE = c.e(mVar, kVar, i10, obj2, j10, obj3, zR);
            kVar2 = kVar;
            if (iE == 0) {
                kVar2.b();
                return Unit.f27471a;
            }
            if (iE == 1) {
                return Unit.f27471a;
            }
            if (iE == 2) {
                if (zR) {
                    kVar2.i();
                    return new h(o());
                }
                b2 b2Var = obj3 instanceof b2 ? (b2) obj3 : null;
                if (b2Var != null) {
                    b2Var.a(kVar2, i10 + i);
                }
                j((kVar2.f28938c * j11) + ((long) i10));
                return Unit.f27471a;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iE == 4) {
                if (j10 < c.f26683d.get(this)) {
                    kVar2.b();
                }
                return new h(o());
            }
            if (iE == 5) {
                kVar2.b();
            }
            obj = obj2;
        }
    }

    @Override // jk.c, jk.s
    public final Object c(Object obj, mj.a aVar) throws Throwable {
        if (D(obj, true) instanceof h) {
            throw o();
        }
        return Unit.f27471a;
    }

    @Override // jk.c, jk.s
    public final Object i(Object obj) {
        return D(obj, false);
    }

    @Override // jk.c
    public final boolean t() {
        return this.f26716l == a.f26676c;
    }
}
