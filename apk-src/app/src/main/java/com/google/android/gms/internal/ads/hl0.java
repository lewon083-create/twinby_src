package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6174a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6177d;

    public hl0(pn0 pn0Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f6176c = pn0Var;
        this.f6175b = j10;
        this.f6177d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        switch (this.f6174a) {
            case 0:
                ua.a aVar = (ua.a) this.f6176c;
                iq0 iq0Var = (iq0) this.f6177d;
                aVar.getClass();
                return vv.d(new il0(iq0Var, System.currentTimeMillis(), this.f6175b));
            default:
                ed.d dVarH = ((pn0) this.f6176c).h();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (((Boolean) q9.s.f31967e.f31970c.a(al.M2)).booleanValue()) {
                    timeUnit = TimeUnit.MICROSECONDS;
                }
                long j10 = this.f6175b;
                if (j10 > 0) {
                    dVarH = vv.I(dVarH, j10, timeUnit, (ScheduledExecutorService) this.f6177d);
                }
                return vv.H(dVarH, Throwable.class, new np(9, this), hx.f6285g);
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        switch (this.f6174a) {
            case 0:
                return 4;
            default:
                return ((pn0) this.f6176c).j();
        }
    }

    public hl0(ua.a aVar, iq0 iq0Var, long j10) {
        this.f6176c = aVar;
        this.f6177d = iq0Var;
        this.f6175b = j10;
    }
}
