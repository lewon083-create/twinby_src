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
public final class wp1 extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.monetization.ads.mediation.base.initialize.a f44446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f44447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hp f44448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp1(com.monetization.ads.mediation.base.initialize.a aVar, Context context, hp hpVar, mj.a aVar2) {
        super(2, aVar2);
        this.f44446c = aVar;
        this.f44447d = context;
        this.f44448e = hpVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new wp1(this.f44446c, this.f44447d, this.f44448e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wp1) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objD;
        Object obj2 = nj.a.f29512b;
        int i = this.f44445b;
        if (i == 0) {
            com.google.android.gms.internal.measurement.h5.E(obj);
            com.monetization.ads.mediation.base.initialize.a aVar = this.f44446c;
            Context context = this.f44447d;
            hp hpVar = this.f44448e;
            this.f44445b = 1;
            AtomicBoolean atomicBoolean = com.monetization.ads.mediation.base.initialize.a.f15069g;
            aVar.getClass();
            if (com.monetization.ads.mediation.base.initialize.a.f15070h.getAndSet(false)) {
                aVar.f15072b.getClass();
                List list = hpVar.f39289b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    kotlin.collections.x.m(arrayList, ((gb) it.next()).f38690c);
                }
                zp1 zp1Var = new zp1(aVar.f15075e.a(arrayList), aVar, context, null);
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
