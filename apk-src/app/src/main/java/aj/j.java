package aj;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f976o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(e0 e0Var, List list, mj.a aVar, int i) {
        super(2, aVar);
        this.f973l = i;
        this.f975n = e0Var;
        this.f976o = list;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f973l) {
            case 0:
                return new j(this.f975n, this.f976o, aVar, 0);
            case 1:
                return new j(this.f975n, this.f976o, aVar, 1);
            default:
                return new j(this.f975n, this.f976o, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hk.a0 a0Var = (hk.a0) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f973l) {
        }
        return ((j) create(a0Var, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f973l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f974m;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                Context context = this.f975n.f952b;
                mj.a aVar2 = null;
                if (context == null) {
                    Intrinsics.g("context");
                    throw null;
                }
                p2.h hVarA = f0.a(context);
                i iVar = new i(this.f976o, aVar2, 0);
                this.f974m = 1;
                Object objE = a.a.e(hVarA, iVar, this);
                return objE == aVar ? aVar : objE;
            case 1:
                nj.a aVar3 = nj.a.f29512b;
                int i10 = this.f974m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                this.f974m = 1;
                Object objF = e0.f(this.f975n, this.f976o, this);
                return objF == aVar3 ? aVar3 : objF;
            default:
                nj.a aVar4 = nj.a.f29512b;
                int i11 = this.f974m;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                this.f974m = 1;
                Object objF2 = e0.f(this.f975n, this.f976o, this);
                return objF2 == aVar4 ? aVar4 : objF2;
        }
    }
}
