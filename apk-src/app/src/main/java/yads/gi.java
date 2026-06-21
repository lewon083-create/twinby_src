package yads;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gi extends oj.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hi f38765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(hi hiVar, mj.a aVar) {
        super(2, aVar);
        this.f38765b = hiVar;
    }

    @Override // oj.a
    public final mj.a create(Object obj, mj.a aVar) {
        return new gi(this.f38765b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new gi(this.f38765b, (mj.a) obj2).invokeSuspend(Unit.f27471a);
    }

    @Override // oj.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        nj.a aVar = nj.a.f29512b;
        com.google.android.gms.internal.measurement.h5.E(obj);
        try {
            long jB = ((vg1) this.f38765b.f39197e.f40180a).b("ExitInfoAnrLastReportedTimestamp");
            hi hiVar = this.f38765b;
            ei eiVar = hiVar.f39195c;
            wf wfVar = hiVar.f39193a;
            List listA = eiVar.a(wfVar.f44367b, wfVar.f44368c, jB);
            if (listA.isEmpty()) {
                return Unit.f27471a;
            }
            this.f38765b.f39199g.getClass();
            ArrayList arrayListA = mf.a(listA);
            if (arrayListA.isEmpty()) {
                return Unit.f27471a;
            }
            ArrayList arrayListA2 = this.f38765b.f39199g.a(arrayListA);
            if (arrayListA2.isEmpty()) {
                return Unit.f27471a;
            }
            this.f38765b.f39196d.a(arrayListA2);
            hi.a(this.f38765b, arrayListA2);
            this.f38765b.f39200h.set(false);
            return Unit.f27471a;
        } finally {
            this.f38765b.f39200h.set(false);
        }
    }
}
