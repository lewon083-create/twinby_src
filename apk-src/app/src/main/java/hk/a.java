package hk;

import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.measurement.j4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends k1 implements mj.a, a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f20628d;

    public a(CoroutineContext coroutineContext, boolean z5) {
        super(z5);
        D((c1) coroutineContext.get(b1.f20637b));
        this.f20628d = coroutineContext.plus(this);
    }

    @Override // hk.k1
    public final void C(oc ocVar) {
        c0.j(this.f20628d, ocVar);
    }

    @Override // hk.k1
    public final void M(Object obj) {
        if (!(obj instanceof t)) {
            V(obj);
        } else {
            t tVar = (t) obj;
            U(tVar.f20711a, t.f20710b.get(tVar) != 0);
        }
    }

    public final void W(b0 b0Var, a aVar, Function2 function2) {
        Object objInvoke;
        int iOrdinal = b0Var.ordinal();
        if (iOrdinal == 0) {
            j4.v(function2, aVar, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                Intrinsics.checkNotNullParameter(function2, "<this>");
                Intrinsics.checkNotNullParameter(this, "completion");
                mj.a aVarB = nj.f.b(nj.f.a(function2, aVar, this));
                Unit unit = Unit.f27471a;
                ij.k kVar = ij.m.f21341c;
                aVarB.resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                throw new ij.j();
            }
            Intrinsics.checkNotNullParameter(this, "completion");
            try {
                CoroutineContext coroutineContext = this.f20628d;
                Object objC = mk.u.c(coroutineContext, null);
                try {
                    Intrinsics.checkNotNullParameter(this, "frame");
                    if (function2 instanceof oj.a) {
                        kotlin.jvm.internal.k0.b(2, function2);
                        objInvoke = function2.invoke(aVar, this);
                    } else {
                        objInvoke = nj.f.c(function2, aVar, this);
                    }
                    mk.u.a(coroutineContext, objC);
                    if (objInvoke != nj.a.f29512b) {
                        ij.k kVar2 = ij.m.f21341c;
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    mk.u.a(coroutineContext, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                ij.k kVar3 = ij.m.f21341c;
                resumeWith(h5.s(th3));
            }
        }
    }

    @Override // hk.a0
    public final CoroutineContext e() {
        return this.f20628d;
    }

    @Override // mj.a
    public final CoroutineContext getContext() {
        return this.f20628d;
    }

    @Override // hk.k1
    public final String q() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // mj.a
    public final void resumeWith(Object obj) {
        Throwable thA = ij.m.a(obj);
        if (thA != null) {
            obj = new t(thA, false);
        }
        Object objI = I(obj);
        if (objI == c0.f20645e) {
            return;
        }
        l(objI);
    }

    public void V(Object obj) {
    }

    public void U(Throwable th2, boolean z5) {
    }
}
