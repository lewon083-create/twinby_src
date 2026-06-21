package aj;

import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1032m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e0 f1033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f1035p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, String str, String str2, mj.a aVar, int i) {
        super(2, aVar);
        this.f1031l = i;
        this.f1033n = e0Var;
        this.f1034o = str;
        this.f1035p = str2;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f1031l) {
            case 0:
                return new z(this.f1033n, this.f1034o, this.f1035p, aVar, 0);
            case 1:
                return new z(this.f1033n, this.f1034o, this.f1035p, aVar, 1);
            default:
                return new z(this.f1033n, this.f1034o, this.f1035p, aVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hk.a0 a0Var = (hk.a0) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f1031l) {
        }
        return ((z) create(a0Var, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f1031l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f1032m;
                if (i == 0) {
                    h5.E(obj);
                    this.f1032m = 1;
                    if (e0.a(this.f1033n, this.f1034o, this.f1035p, this) == aVar) {
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
                int i10 = this.f1032m;
                if (i10 == 0) {
                    h5.E(obj);
                    this.f1032m = 1;
                    if (e0.a(this.f1033n, this.f1034o, this.f1035p, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
            default:
                nj.a aVar3 = nj.a.f29512b;
                int i11 = this.f1032m;
                if (i11 == 0) {
                    h5.E(obj);
                    this.f1032m = 1;
                    if (e0.a(this.f1033n, this.f1034o, this.f1035p, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                return Unit.f27471a;
        }
    }
}
