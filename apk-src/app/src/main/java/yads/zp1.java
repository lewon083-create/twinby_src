package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zp1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f45506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f45508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f45509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp1(List list, com.monetization.ads.mediation.base.initialize.a aVar, Context context, mj.a aVar2) {
        super(2, aVar2);
        this.f45507c = list;
        this.f45508d = aVar;
        this.f45509e = context;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        zp1 zp1Var = new zp1(this.f45507c, this.f45508d, this.f45509e, aVar);
        zp1Var.f45506b = obj;
        return zp1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zp1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        hk.a0 a0Var = (hk.a0) this.f45506b;
        List list = this.f45507c;
        com.monetization.ads.mediation.base.initialize.a aVar2 = this.f45508d;
        Context context = this.f45509e;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hk.c0.m(a0Var, null, new yp1(aVar2, context, (sq1) it.next(), null), 3);
        }
        return Unit.f27471a;
    }
}
