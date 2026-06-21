package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wf f39193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hk.a0 f39194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ei f39195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fi f39196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kf f39197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y10 f39198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mf f39199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f39200h = new AtomicBoolean(false);

    public hi(wf wfVar, hk.a0 a0Var, ei eiVar, fi fiVar, kf kfVar, ko2 ko2Var) {
        this.f39193a = wfVar;
        this.f39194b = a0Var;
        this.f39195c = eiVar;
        this.f39196d = fiVar;
        this.f39197e = kfVar;
        this.f39198f = new y10(ko2Var);
        this.f39199g = new mf(wfVar.a());
    }

    public static final void a(hi hiVar, ArrayList arrayList) {
        Long l10;
        hiVar.getClass();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(((pb2) it.next()).f41867a.f40515a);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(((pb2) it.next()).f41867a.f40515a);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l10 = lValueOf;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            long jLongValue = l10.longValue();
            long jB = ((vg1) hiVar.f39197e.f40180a).b("ExitInfoAnrLastReportedTimestamp");
            kf kfVar = hiVar.f39197e;
            ((vg1) kfVar.f40180a).a("ExitInfoAnrLastReportedTimestamp", Math.max(jB, jLongValue));
        }
    }
}
