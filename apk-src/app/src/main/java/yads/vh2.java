package yads;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vh2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zh2 f44044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f44045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e00 f44046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d03 f44047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f44048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f44049h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh2(long j10, Context context, e00 e00Var, d03 d03Var, zh2 zh2Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f44044c = zh2Var;
        this.f44045d = context;
        this.f44046e = e00Var;
        this.f44047f = d03Var;
        this.f44048g = list;
        this.f44049h = j10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        zh2 zh2Var = this.f44044c;
        return new vh2(this.f44049h, this.f44045d, this.f44046e, this.f44047f, zh2Var, this.f44048g, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vh2) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        int i = this.f44043b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
            return obj;
        }
        com.google.android.gms.internal.measurement.h5.E(obj);
        zh2 zh2Var = this.f44044c;
        Context context = this.f44045d;
        e00 e00Var = this.f44046e;
        d03 d03Var = this.f44047f;
        List list = this.f44048g;
        long j10 = this.f44049h;
        this.f44043b = 1;
        Object objA = zh2.a(j10, context, e00Var, d03Var, zh2Var, list, this);
        return objA == aVar ? aVar : objA;
    }
}
