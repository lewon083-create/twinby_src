package e6;

import com.google.android.gms.internal.measurement.h5;
import g6.d;
import hk.a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import oj.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f16270n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, mj.a aVar, int i) {
        super(2, aVar);
        this.f16268l = i;
        this.f16270n = cVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f16268l) {
            case 0:
                return new a(this.f16270n, aVar, 0);
            case 1:
                return new a(this.f16270n, aVar, 1);
            case 2:
                return new a(this.f16270n, aVar, 2);
            case 3:
                return new a(this.f16270n, aVar, 3);
            default:
                return new a(this.f16270n, aVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f16268l) {
        }
        return ((a) create(a0Var, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f16268l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f16269m;
                if (i == 0) {
                    h5.E(obj);
                    d dVar = this.f16270n.f16276a;
                    this.f16269m = 1;
                    if (dVar.a(null, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            case 1:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f16269m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                    return obj;
                }
                h5.E(obj);
                d dVar2 = this.f16270n.f16276a;
                this.f16269m = 1;
                Object objC = dVar2.c(this);
                return objC == aVar2 ? aVar2 : objC;
            case 2:
                nj.a aVar3 = nj.a.f29512b;
                int i11 = this.f16269m;
                if (i11 == 0) {
                    h5.E(obj);
                    d dVar3 = this.f16270n.f16276a;
                    this.f16269m = 1;
                    if (dVar3.f(null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            case 3:
                nj.a aVar4 = nj.a.f29512b;
                int i12 = this.f16269m;
                if (i12 == 0) {
                    h5.E(obj);
                    d dVar4 = this.f16270n.f16276a;
                    this.f16269m = 1;
                    if (dVar4.k(null, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            default:
                nj.a aVar5 = nj.a.f29512b;
                int i13 = this.f16269m;
                if (i13 == 0) {
                    h5.E(obj);
                    d dVar5 = this.f16270n.f16276a;
                    this.f16269m = 1;
                    if (dVar5.m(null, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
        }
    }
}
