package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nm0 implements ms1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qs1 f8367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qs1 f8368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qs1 f8369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qs1 f8370e;

    public /* synthetic */ nm0(ms1 ms1Var, ls1 ls1Var, ls1 ls1Var2, ls1 ls1Var3, int i) {
        this.f8366a = i;
        this.f8367b = ms1Var;
        this.f8368c = ls1Var;
        this.f8369d = ls1Var2;
        this.f8370e = ls1Var3;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final Object j() {
        switch (this.f8366a) {
            case 0:
                tl0 tl0VarA = ((vl0) this.f8367b).j();
                im0 im0Var = (im0) this.f8368c.j();
                List list = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f8370e.j();
                if (list.contains("10")) {
                    return new hl0(im0Var, ((Integer) q9.s.f31967e.f31970c.a(al.f3186rd)).intValue(), scheduledExecutorService);
                }
                return new hl0(tl0VarA, ((Integer) q9.s.f31967e.f31970c.a(al.f3186rd)).intValue(), scheduledExecutorService);
            case 1:
                tl0 tl0VarJ = ((bm0) this.f8367b).j();
                im0 im0Var2 = (im0) this.f8368c.j();
                List list2 = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f8370e.j();
                if (list2.contains("54")) {
                    return new hl0(im0Var2, ((Integer) q9.s.f31967e.f31970c.a(al.Bd)).intValue(), scheduledExecutorService2);
                }
                return new hl0(tl0VarJ, ((Integer) q9.s.f31967e.f31970c.a(al.Bd)).intValue(), scheduledExecutorService2);
            case 2:
                rl0 rl0VarJ = ((dm0) this.f8367b).j();
                im0 im0Var3 = (im0) this.f8368c.j();
                List list3 = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f8370e.j();
                if (list3.contains("13")) {
                    return new hl0(im0Var3, ((Integer) q9.s.f31967e.f31970c.a(al.Ad)).intValue(), scheduledExecutorService3);
                }
                return new hl0(rl0VarJ, ((Integer) q9.s.f31967e.f31970c.a(al.Ad)).intValue(), scheduledExecutorService3);
            case 3:
                tl0 tl0VarJ2 = ((um0) this.f8367b).j();
                im0 im0Var4 = (im0) this.f8368c.j();
                List list4 = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) this.f8370e.j();
                if (list4.contains("60")) {
                    return new hl0(im0Var4, ((Integer) q9.s.f31967e.f31970c.a(al.f2946be)).intValue(), scheduledExecutorService4);
                }
                return new hl0(tl0VarJ2, ((Integer) q9.s.f31967e.f31970c.a(al.f2946be)).intValue(), scheduledExecutorService4);
            case 4:
                gl0 gl0VarJ = ((mn0) this.f8367b).j();
                im0 im0Var5 = (im0) this.f8368c.j();
                List list5 = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService5 = (ScheduledExecutorService) this.f8370e.j();
                if (list5.contains("35")) {
                    return new hl0(im0Var5, ((Integer) q9.s.f31967e.f31970c.a(al.f3142od)).intValue(), scheduledExecutorService5);
                }
                return new hl0(gl0VarJ, ((Integer) q9.s.f31967e.f31970c.a(al.f3142od)).intValue(), scheduledExecutorService5);
            default:
                rl0 rl0VarJ2 = ((wn0) this.f8367b).j();
                im0 im0Var6 = (im0) this.f8368c.j();
                List list6 = (List) this.f8369d.j();
                ScheduledExecutorService scheduledExecutorService6 = (ScheduledExecutorService) this.f8370e.j();
                if (list6.contains("39")) {
                    return new hl0(im0Var6, ((Integer) q9.s.f31967e.f31970c.a(al.f3099ld)).intValue(), scheduledExecutorService6);
                }
                return new hl0(rl0VarJ2, ((Integer) q9.s.f31967e.f31970c.a(al.f3099ld)).intValue(), scheduledExecutorService6);
        }
    }
}
