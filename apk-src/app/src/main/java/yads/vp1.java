package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class vp1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f44109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f44110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f44111e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, mj.a aVar2) {
        super(2, aVar2);
        this.f44109c = aVar;
        this.f44110d = context;
        this.f44111e = hpVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new vp1(this.f44109c, this.f44110d, this.f44111e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vp1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        List<es1> arrayList;
        List list;
        Object obj2 = nj.a.f29512b;
        int i = this.f44108b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f44109c;
            Context context = this.f44110d;
            hp hpVar = this.f44111e;
            this.f44108b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f15069g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f15069g.getAndSet(false)) {
                aVar.f15072b.getClass();
                is1 is1Var = hpVar.f39290c;
                if (is1Var == null || (list = is1Var.f39629c) == null) {
                    arrayList = kotlin.collections.b0.f27475b;
                } else {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kotlin.collections.x.m(arrayList, ((zr1) it.next()).f45525c);
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.t.j(arrayList, 10));
                for (es1 es1Var : arrayList) {
                    aVar.f15073c.getClass();
                    arrayList2.add(new sq1(es1Var.f38250b, es1Var.f38251c, null, null, null, null, null));
                }
                zp1 zp1Var = new zp1(aVar.f15075e.a(arrayList2), aVar, context, null);
                hk.r1 r1Var = new hk.r1(getContext(), this);
                objD = com.google.android.gms.internal.measurement.h5.D(r1Var, r1Var, zp1Var);
                Object obj3 = nj.a.f29512b;
                if (objD == obj3) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (objD != obj3) {
                    objD = Unit.f27471a;
                }
                if (objD != obj3) {
                    objD = Unit.f27471a;
                }
            } else {
                objD = Unit.f27471a;
            }
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.android.gms.internal.measurement.h5.E(obj);
        }
        return Unit.f27471a;
    }
}
