package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class io0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx f6555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f6557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r81 f6558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6560f;

    public io0(bx bxVar, boolean z5, r81 r81Var, ScheduledExecutorService scheduledExecutorService, int i, int i10) {
        this.f6555a = bxVar;
        this.f6556b = z5;
        this.f6558d = r81Var;
        this.f6557c = scheduledExecutorService;
        this.f6559e = i;
        this.f6560f = i10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        wk wkVar = al.M7;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue() && this.f6556b) {
            return vv.d(new kl0(null, 5));
        }
        if (this.f6560f == 2) {
            return vv.d(new kl0(null, 5));
        }
        if (!Arrays.asList(((String) sVar.f31970c.a(al.O7)).split(StringUtils.COMMA)).contains(String.valueOf(this.f6559e))) {
            return vv.d(new kl0(null, 5));
        }
        n81 n81Var = n81.f8237c;
        u5 u5Var = u5.f10829p;
        r81 r81Var = this.f6558d;
        return vv.G(vv.I(vv.K(n81Var, u5Var, r81Var), ((Long) om.f8738b.r()).longValue(), TimeUnit.MILLISECONDS, this.f6557c), Exception.class, new ju(6, this), r81Var);
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 50;
    }
}
