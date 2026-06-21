package yads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ii extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f39546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ko2 f39547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk.a0 f39548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(Context context, ko2 ko2Var, hk.a0 a0Var, mj.a aVar) {
        super(2, aVar);
        this.f39546b = context;
        this.f39547c = ko2Var;
        this.f39548d = a0Var;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new ii(this.f39546b, this.f39547c, this.f39548d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ii) create((hk.a0) obj, (mj.a) obj2)).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        try {
            if (ji.f39871b != null) {
                return Unit.f27471a;
            }
            pt2 pt2VarA = fw2.a().a(this.f39546b);
            if (pt2VarA != null && pt2VarA.f42033i0) {
                Set set = pt2VarA.f42043n0;
                if (set == null) {
                    set = kotlin.collections.d0.f27478b;
                }
                Integer num = pt2VarA.f42035j0;
                int iIntValue = num != null ? num.intValue() : 10;
                Integer num2 = pt2VarA.f42037k0;
                int iIntValue2 = num2 != null ? num2.intValue() : 91;
                Boolean bool = pt2VarA.f42039l0;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                wf wfVar = new wf(set, iIntValue, iIntValue2, zBooleanValue);
                ei eiVar = new ei(this.f39546b);
                fi fiVar = new fi(this.f39547c, zBooleanValue);
                kf kfVar = new kf(wg1.a(this.f39546b, "YadPreferenceFile"));
                AtomicBoolean atomicBoolean = ji.f39870a;
                ji.f39871b = new hi(wfVar, this.f39548d, eiVar, fiVar, kfVar, this.f39547c);
                hi hiVar = ji.f39871b;
                if (hiVar != null && !hiVar.f39200h.getAndSet(true)) {
                    hk.c0.m(hiVar.f39194b, hiVar.f39198f, new gi(hiVar, null), 2);
                }
            }
            ji.f39870a.set(false);
            return Unit.f27471a;
        } finally {
            ji.f39870a.set(false);
        }
    }
}
