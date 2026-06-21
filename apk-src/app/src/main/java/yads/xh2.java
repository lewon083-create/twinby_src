package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xh2 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f44695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh2 f44696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f44697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00 f44698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d03 f44699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f44700h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh2(long j10, Context context, e00 e00Var, d03 d03Var, zh2 zh2Var, List list, mj.a aVar) {
        super(2, aVar);
        this.f44695c = list;
        this.f44696d = zh2Var;
        this.f44697e = context;
        this.f44698f = e00Var;
        this.f44699g = d03Var;
        this.f44700h = j10;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        List list = this.f44695c;
        zh2 zh2Var = this.f44696d;
        xh2 xh2Var = new xh2(this.f44700h, this.f44697e, this.f44698f, this.f44699g, zh2Var, list, aVar);
        xh2Var.f44694b = obj;
        return xh2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((xh2) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        hk.a0 a0Var = (hk.a0) this.f44694b;
        List<es1> list = this.f44695c;
        zh2 zh2Var = this.f44696d;
        Context context = this.f44697e;
        e00 e00Var = this.f44698f;
        d03 d03Var = this.f44699g;
        long j10 = this.f44700h;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.j(list, 10));
        for (es1 es1Var : list) {
            zh2Var.getClass();
            arrayList.add(hk.c0.b(a0Var, new uh2(zh2Var, es1Var, context, e00Var, j10, d03Var, null), 3));
        }
        return arrayList;
    }
}
