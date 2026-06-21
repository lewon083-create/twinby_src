package p2;

import com.google.android.gms.internal.measurement.h5;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f31037l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31038m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f31039n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, mj.a aVar, int i) {
        super(2, aVar);
        this.f31037l = i;
        this.f31039n = obj;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f31037l) {
            case 0:
                return new o((e0) this.f31039n, aVar, 0);
            case 1:
                return new o((e0) this.f31039n, aVar, 1);
            case 2:
                return new o((e0) this.f31039n, aVar, 2);
            default:
                return new o((od.b) this.f31039n, aVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31037l) {
        }
        return ((o) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapA;
        switch (this.f31037l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f31038m;
                if (i == 0) {
                    h5.E(obj);
                    e0 e0Var = (e0) this.f31039n;
                    this.f31038m = 1;
                    if (e0.d(e0Var, this) == aVar) {
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
                e0 e0Var2 = (e0) this.f31039n;
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f31038m;
                if (i10 == 0) {
                    h5.E(obj);
                    com.google.firebase.messaging.y yVar = e0Var2.i;
                    this.f31038m = 1;
                    Object objM = ((hk.r) yVar.f14900c).m(this);
                    if (objM != aVar2) {
                        objM = Unit.f27471a;
                    }
                    if (objM == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h5.E(obj);
                        return Unit.f27471a;
                    }
                    h5.E(obj);
                }
                kk.e eVar = e0Var2.g().f31091c;
                jk.a aVar3 = jk.a.f26676c;
                kk.e eVarA = eVar instanceof lk.e ? lk.g.a((lk.e) eVar, null, 0, aVar3, 1) : new lk.c(eVar, kotlin.coroutines.g.f27499b, 0, aVar3);
                d7.a aVar4 = new d7.a(2, e0Var2);
                this.f31038m = 2;
                if (eVarA.p(aVar4, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f27471a;
            case 2:
                e0 e0Var3 = (e0) this.f31039n;
                m7.a aVar5 = e0Var3.f30958h;
                nj.a aVar6 = nj.a.f29512b;
                int i11 = this.f31038m;
                try {
                    if (i11 == 0) {
                        h5.E(obj);
                        if (aVar5.q() instanceof o0) {
                            return aVar5.q();
                        }
                        this.f31038m = 1;
                        if (e0Var3.h(this) == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h5.E(obj);
                            return (w0) obj;
                        }
                        h5.E(obj);
                    }
                    this.f31038m = 2;
                    obj = e0.e(e0Var3, false, this);
                    if (obj == aVar6) {
                        return aVar6;
                    }
                    return (w0) obj;
                } catch (Throwable th2) {
                    return new q0(th2, -1);
                }
            default:
                nj.a aVar7 = nj.a.f29512b;
                int i12 = this.f31038m;
                if (i12 == 0) {
                    h5.E(obj);
                    kk.e data = ((od.b) this.f31039n).f30638c.getData();
                    this.f31038m = 1;
                    obj = kk.u.c(data, this);
                    if (obj == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                t2.b bVar = (t2.b) obj;
                return (bVar == null || (mapA = bVar.a()) == null) ? kotlin.collections.j0.d() : mapA;
        }
    }
}
