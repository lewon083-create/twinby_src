package d8;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.google.android.gms.internal.play_billing.a2;
import com.google.android.gms.internal.play_billing.d2;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.e2;
import com.google.android.gms.internal.play_billing.f2;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.t1;
import com.google.android.gms.internal.play_billing.t5;
import com.google.android.gms.internal.play_billing.u1;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.u5;
import com.google.android.gms.internal.play_billing.v5;
import com.google.android.gms.internal.play_billing.w5;
import com.google.android.gms.internal.play_billing.x1;
import com.google.android.gms.internal.play_billing.x5;
import com.google.android.gms.internal.play_billing.y1;
import com.google.android.gms.internal.play_billing.z1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends e {
    public final Context F;
    public volatile int G;
    public volatile com.google.android.gms.internal.play_billing.h H;
    public volatile h0 I;
    public volatile z1 J;

    public i0(Context context) {
        super(context);
        this.G = 0;
        this.F = context;
    }

    public final /* synthetic */ void L(b bVar, s3.q qVar) {
        super.e(bVar, qVar);
    }

    public final /* synthetic */ void M(k kVar, s3.q qVar) {
        super.f(kVar, qVar);
    }

    public final /* synthetic */ void N(fe.c cVar, p pVar) {
        super.c(cVar, pVar);
    }

    public final synchronized boolean O() {
        if (this.G == 2 && this.H != null) {
            if (this.I != null) {
                return true;
            }
        }
        return false;
    }

    public final x1 P(int i) {
        if (!O()) {
            o1.g("BillingClientTesting", "Billing Override Service is not ready.");
            Q(106, 28, n0.a(-1, "Billing Override Service connection is disconnected."));
            return new u1();
        }
        e0 e0Var = new e0(this, i, 0);
        u5 u5Var = new u5();
        u5Var.f14333c = new x5();
        w5 w5Var = new w5(u5Var);
        u5Var.f14332b = w5Var;
        u5Var.f14331a = e0.class;
        try {
            e0Var.s(u5Var);
            u5Var.f14331a = "billingOverrideService.getBillingOverride";
            return w5Var;
        } catch (Exception e3) {
            q3 q3Var = new q3(e3);
            d3 d3Var = t5.f14318g;
            v5 v5Var = w5Var.f14355c;
            if (d3Var.w(v5Var, null, q3Var)) {
                t5.d(v5Var);
            }
            return w5Var;
        }
    }

    public final void Q(int i, int i10, j jVar) {
        s4 s4VarB = l0.b(i, i10, jVar);
        Objects.requireNonNull(s4VarB, "ApiFailure should not be null");
        this.f15600g.W(s4VarB);
    }

    public final void R(int i, Consumer consumer, Runnable runnable) {
        z1 z1Var;
        y1 y1Var;
        y1 d2Var;
        x1 x1VarP = P(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.J == null) {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.J = scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof z1 ? (z1) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new d2(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                }
                z1Var = this.J;
            } finally {
            }
        }
        if (!x1VarP.isDone()) {
            f2 f2Var = new f2();
            f2Var.i = x1VarP;
            e2 e2Var = new e2();
            e2Var.f14168b = f2Var;
            f2Var.f14182j = ((d2) z1Var).schedule(e2Var, 28500L, timeUnit);
            x1VarP.c(e2Var, r1.f14293b);
            x1VarP = f2Var;
        }
        la.m mVar = new la.m(this, i, consumer, runnable);
        synchronized (this) {
            try {
                if (this.D == null) {
                    ExecutorService executorServiceQ = q();
                    if (executorServiceQ instanceof y1) {
                        d2Var = (y1) executorServiceQ;
                    } else {
                        d2Var = executorServiceQ instanceof ScheduledExecutorService ? new d2((ScheduledExecutorService) executorServiceQ) : new a2(executorServiceQ);
                    }
                    this.D = d2Var;
                }
                y1Var = this.D;
            } finally {
            }
        }
        x1VarP.c(new t1(x1VarP, mVar), y1Var);
    }

    @Override // d8.e, d8.d
    public final void a() {
        synchronized (this) {
            u4 u4VarD = l0.d(27);
            Objects.requireNonNull(u4VarD, "ApiSuccess should not be null");
            this.f15600g.Y(u4VarD);
            try {
                try {
                    if (this.I != null && this.H != null) {
                        o1.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.F.unbindService(this.I);
                        this.I = new h0(0, this);
                    }
                    this.H = null;
                    if (this.J != null) {
                        ((a2) this.J).shutdownNow();
                        this.J = null;
                    }
                } catch (RuntimeException e3) {
                    o1.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e3);
                }
                this.G = 3;
            } catch (Throwable th2) {
                this.G = 3;
                throw th2;
            }
        }
        super.a();
    }

    @Override // d8.e, d8.d
    public final void c(fe.c cVar, p pVar) {
        R(7, new d0(0, pVar), new aa.y(this, cVar, pVar, 7));
    }

    @Override // d8.e
    public final void e(b bVar, s3.q qVar) {
        R(3, new d0(2, qVar), new aa.y(this, bVar, qVar, 9));
    }

    @Override // d8.e
    public final void f(k kVar, s3.q qVar) {
        R(4, new d0(kVar, qVar), new aa.y(this, kVar, qVar, 8));
    }

    @Override // d8.e
    public final j j(Activity activity, com.google.android.gms.internal.ads.i0 i0Var) {
        int iIntValue = 0;
        try {
            iIntValue = ((Integer) P(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e3) {
            Q(114, 28, n0.E);
            o1.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e3);
        } catch (Exception e7) {
            if (e7 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            Q(107, 28, n0.E);
            o1.h("BillingClientTesting", "An error occurred while retrieving billing override.", e7);
        }
        if (iIntValue > 0) {
            j jVarA = n0.a(iIntValue, "Billing override value was set by a license tester.");
            Q(105, 2, jVarA);
            K(jVarA);
            return jVarA;
        }
        try {
            return super.j(activity, i0Var);
        } catch (Exception e10) {
            j jVar = n0.i;
            Q(115, 2, jVar);
            o1.h("BillingClientTesting", "An internal error occurred.", e10);
            return jVar;
        }
    }

    @Override // d8.e
    public final void l(f fVar) {
        synchronized (this) {
            if (O()) {
                o1.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                u4 u4VarD = l0.d(26);
                Objects.requireNonNull(u4VarD, "ApiSuccess should not be null");
                this.f15600g.Y(u4VarD);
            } else {
                int i = 1;
                if (this.G == 1) {
                    o1.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.G == 3) {
                    o1.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    Q(38, 26, n0.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.G = 1;
                    o1.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.I = new h0(0, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> listQueryIntentServices = this.F.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                o1.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.F.bindService(intent2, this.I, 1)) {
                                    o1.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    o1.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i = 39;
                        }
                    }
                    this.G = 0;
                    o1.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    Q(i, 26, n0.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.l(fVar);
    }

    public i0(fd.b bVar, Context context) {
        super(bVar, context);
        this.G = 0;
        this.F = context;
    }

    public i0(fd.b bVar, Context context, s sVar) {
        super(bVar, context, sVar);
        this.G = 0;
        this.F = context;
    }

    public i0(fd.b bVar, Context context, s sVar, oi.i iVar) {
        super(bVar, context, sVar, iVar);
        this.G = 0;
        this.F = context;
    }
}
