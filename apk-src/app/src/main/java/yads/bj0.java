package yads;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bj0 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dj0 f37035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(dj0 dj0Var, String str, mj.a aVar) {
        super(2, aVar);
        this.f37035b = dj0Var;
        this.f37036c = str;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new bj0(this.f37035b, this.f37036c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bj0(this.f37035b, this.f37036c, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        dj0 dj0Var = this.f37035b;
        String str = this.f37036c;
        AtomicBoolean atomicBoolean = dj0.f37779e;
        dj0Var.a(str);
        return Unit.f27471a;
    }
}
