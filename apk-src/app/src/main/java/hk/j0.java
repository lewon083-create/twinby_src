package hk;

import com.google.android.gms.internal.ads.g81;
import com.google.android.gms.internal.measurement.h5;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j0 extends ok.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20674d;

    public j0(int i) {
        super(0L, false);
        this.f20674d = i;
    }

    public abstract mj.a c();

    public Throwable d(Object obj) {
        t tVar = obj instanceof t ? (t) obj : null;
        if (tVar != null) {
            return tVar.f20711a;
        }
        return null;
    }

    public final void i(Throwable th2) {
        c0.j(c().getContext(), new g81("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mj.a aVarC = c();
            Intrinsics.c(aVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            mk.f fVar = (mk.f) aVarC;
            oj.c cVar = fVar.f28913f;
            Object obj = fVar.f28915h;
            CoroutineContext context = cVar.getContext();
            Object objC = mk.u.c(context, obj);
            c1 c1Var = null;
            z1 z1VarC = objC != mk.u.f28941a ? v.c(cVar, context, objC) : null;
            try {
                CoroutineContext context2 = cVar.getContext();
                Object objK = k();
                Throwable thD = d(objK);
                if (thD == null) {
                    int i = this.f20674d;
                    boolean z5 = true;
                    if (i != 1 && i != 2) {
                        z5 = false;
                    }
                    if (z5) {
                        c1Var = (c1) context2.get(b1.f20637b);
                    }
                }
                if (c1Var != null && !c1Var.isActive()) {
                    CancellationException cancellationExceptionV = ((k1) c1Var).v();
                    b(cancellationExceptionV);
                    ij.k kVar = ij.m.f21341c;
                    cVar.resumeWith(h5.s(cancellationExceptionV));
                } else if (thD != null) {
                    ij.k kVar2 = ij.m.f21341c;
                    cVar.resumeWith(h5.s(thD));
                } else {
                    ij.k kVar3 = ij.m.f21341c;
                    cVar.resumeWith(e(objK));
                }
                Unit unit = Unit.f27471a;
                if (z1VarC != null && !z1VarC.X()) {
                    return;
                }
                mk.u.a(context, objC);
            } catch (Throwable th2) {
                if (z1VarC == null || z1VarC.X()) {
                    mk.u.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            i(th3);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
