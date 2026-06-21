package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements pn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bx f11839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1.e f11840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f11841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r81 f11842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f11843e;

    public wl0(Context context, bx bxVar, ScheduledExecutorService scheduledExecutorService, r81 r81Var) {
        if (!((Boolean) q9.s.f31967e.f31970c.a(al.F3)).booleanValue()) {
            this.f11840b = new a1.e(context);
        }
        this.f11843e = context;
        this.f11839a = bxVar;
        this.f11841c = scheduledExecutorService;
        this.f11842d = r81Var;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final ed.d h() {
        Task taskB;
        wk wkVar = al.B3;
        q9.s sVar = q9.s.f31967e;
        if (((Boolean) sVar.f31970c.a(wkVar)).booleanValue()) {
            if (!((Boolean) sVar.f31970c.a(al.G3)).booleanValue()) {
                if (!((Boolean) sVar.f31970c.a(al.C3)).booleanValue()) {
                    return vv.K(gr.p(this.f11840b.b()), u5.f10826m, hx.f6285g);
                }
                if (((Boolean) sVar.f31970c.a(al.F3)).booleanValue()) {
                    nz.f(this.f11843e, false);
                    synchronized (nz.f8519y) {
                        taskB = nz.f8517w;
                    }
                } else {
                    taskB = this.f11840b.b();
                }
                if (taskB == null) {
                    return vv.d(new xl0(null, -1, 0));
                }
                ed.d dVarJ = vv.J(gr.p(taskB), n20.f8160j, hx.f6285g);
                if (((Boolean) sVar.f31970c.a(al.D3)).booleanValue()) {
                    dVarJ = vv.I(dVarJ, ((Long) sVar.f31970c.a(al.E3)).longValue(), TimeUnit.MILLISECONDS, this.f11841c);
                }
                return vv.G(dVarJ, Exception.class, new ju(4, this), this.f11842d);
            }
        }
        return vv.d(new xl0(null, -1, 0));
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final int j() {
        return 11;
    }
}
