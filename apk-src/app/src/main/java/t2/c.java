package t2;

import com.google.android.gms.internal.measurement.h5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oj.i;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f33398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f33399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f33400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f33401o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, mj.a aVar, int i) {
        super(2, aVar);
        this.f33398l = i;
        switch (i) {
            case 1:
                this.f33401o = (i) function2;
                super(2, aVar);
                break;
            default:
                this.f33401o = (i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, oj.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        switch (this.f33398l) {
            case 0:
                c cVar = new c(this.f33401o, aVar, 0);
                cVar.f33400n = obj;
                return cVar;
            default:
                c cVar2 = new c(this.f33401o, aVar, 1);
                cVar2.f33400n = obj;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        mj.a aVar = (mj.a) obj2;
        switch (this.f33398l) {
        }
        return ((c) create(bVar, aVar)).invokeSuspend(Unit.f27471a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function2, oj.i] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kotlin.jvm.functions.Function2, oj.i] */
    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f33398l) {
            case 0:
                nj.a aVar = nj.a.f29512b;
                int i = this.f33399m;
                if (i == 0) {
                    h5.E(obj);
                    b bVar = (b) this.f33400n;
                    this.f33399m = 1;
                    obj = this.f33401o.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h5.E(obj);
                }
                b bVar2 = (b) obj;
                Intrinsics.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.f33397b.f27180c).set(true);
                return bVar2;
            default:
                nj.a aVar2 = nj.a.f29512b;
                int i10 = this.f33399m;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f33400n;
                    h5.E(obj);
                    return bVar3;
                }
                h5.E(obj);
                b bVar4 = new b(j0.m(((b) this.f33400n).a()), false);
                this.f33400n = bVar4;
                this.f33399m = 1;
                return this.f33401o.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
