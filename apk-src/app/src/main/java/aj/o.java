package aj;

import android.content.Context;
import com.google.android.gms.internal.measurement.h5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends oj.i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e0 f994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f995q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, e0 e0Var, kotlin.jvm.internal.f0 f0Var, mj.a aVar, int i) {
        super(2, aVar);
        this.f990l = i;
        this.f993o = str;
        this.f994p = e0Var;
        this.f995q = f0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f990l) {
            case 0:
                return new o(this.f993o, this.f994p, this.f995q, aVar, 0);
            case 1:
                return new o(this.f993o, this.f994p, this.f995q, aVar, 1);
            case 2:
                return new o(this.f993o, this.f994p, this.f995q, aVar, 2);
            default:
                return new o(this.f993o, this.f994p, this.f995q, aVar, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hk.a0 a0Var = (hk.a0) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f990l) {
        }
        return ((o) create(a0Var, aVar)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kotlin.jvm.internal.f0 f0Var;
        kotlin.jvm.internal.f0 f0Var2;
        kotlin.jvm.internal.f0 f0Var3;
        kotlin.jvm.internal.f0 f0Var4;
        switch (this.f990l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f992n;
                if (i == 0) {
                    h5.E(obj);
                    t2.e eVarB = ya.e.b(this.f993o);
                    Context context = this.f994p.f952b;
                    if (context == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    n nVar = new n(f0.a(context).getData(), eVarB, 0);
                    kotlin.jvm.internal.f0 f0Var5 = this.f995q;
                    this.f991m = f0Var5;
                    this.f992n = 1;
                    Object objC = kk.u.c(nVar, this);
                    if (objC == aVar) {
                        return aVar;
                    }
                    f0Var = f0Var5;
                    obj = objC;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var = this.f991m;
                    h5.E(obj);
                }
                f0Var.f27510b = obj;
                return Unit.f27471a;
            case 1:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f992n;
                if (i10 == 0) {
                    h5.E(obj);
                    t2.e eVarA = ya.e.A(this.f993o);
                    e0 e0Var = this.f994p;
                    Context context2 = e0Var.f952b;
                    if (context2 == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    bb.e eVar = new bb.e(f0.a(context2).getData(), eVarA, e0Var, 3);
                    kotlin.jvm.internal.f0 f0Var6 = this.f995q;
                    this.f991m = f0Var6;
                    this.f992n = 1;
                    Object objC2 = kk.u.c(eVar, this);
                    if (objC2 == aVar2) {
                        return aVar2;
                    }
                    f0Var2 = f0Var6;
                    obj = objC2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var2 = this.f991m;
                    h5.E(obj);
                }
                f0Var2.f27510b = obj;
                return Unit.f27471a;
            case 2:
                nj.a aVar3 = nj.a.f29512b;
                int i11 = this.f992n;
                if (i11 == 0) {
                    h5.E(obj);
                    t2.e eVarR = ya.e.r(this.f993o);
                    Context context3 = this.f994p.f952b;
                    if (context3 == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    n nVar2 = new n(f0.a(context3).getData(), eVarR, 1);
                    kotlin.jvm.internal.f0 f0Var7 = this.f995q;
                    this.f991m = f0Var7;
                    this.f992n = 1;
                    Object objC3 = kk.u.c(nVar2, this);
                    if (objC3 == aVar3) {
                        return aVar3;
                    }
                    f0Var3 = f0Var7;
                    obj = objC3;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var3 = this.f991m;
                    h5.E(obj);
                }
                f0Var3.f27510b = obj;
                return Unit.f27471a;
            default:
                nj.a aVar4 = nj.a.f29512b;
                int i12 = this.f992n;
                if (i12 == 0) {
                    h5.E(obj);
                    t2.e eVarA2 = ya.e.A(this.f993o);
                    Context context4 = this.f994p.f952b;
                    if (context4 == null) {
                        Intrinsics.g("context");
                        throw null;
                    }
                    n nVar3 = new n(f0.a(context4).getData(), eVarA2, 2);
                    kotlin.jvm.internal.f0 f0Var8 = this.f995q;
                    this.f991m = f0Var8;
                    this.f992n = 1;
                    Object objC4 = kk.u.c(nVar3, this);
                    if (objC4 == aVar4) {
                        return aVar4;
                    }
                    f0Var4 = f0Var8;
                    obj = objC4;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var4 = this.f991m;
                    h5.E(obj);
                }
                f0Var4.f27510b = obj;
                return Unit.f27471a;
        }
    }
}
