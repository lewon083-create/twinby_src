package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.o5;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.v4;
import com.google.android.gms.internal.play_billing.w4;
import com.google.android.gms.internal.play_billing.y4;
import io.sentry.TransactionOptions;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f15716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15717c;

    public /* synthetic */ z(e eVar, f fVar) {
        this.f15717c = eVar;
        this.f15716b = fVar;
    }

    public final void a(j jVar) {
        synchronized (this.f15717c.f15594a) {
            try {
                if (this.f15717c.f15595b == 3) {
                    return;
                }
                this.f15716b.onBillingSetupFinished(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z5;
        o1.g("BillingClient", "Billing service died.");
        try {
            e eVar = this.f15717c;
            synchronized (eVar.f15594a) {
                z5 = true;
                if (eVar.f15595b != 1) {
                    z5 = false;
                }
            }
            if (z5) {
                a1.e eVar2 = this.f15717c.f15600g;
                r4 r4VarR = s4.r();
                r4VarR.f(6);
                v4 v4VarR = w4.r();
                v4VarR.f(122);
                r4VarR.e(v4VarR);
                eVar2.W((s4) r4VarR.b());
            } else {
                this.f15717c.f15600g.Z(y4.n());
            }
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f15717c.f15594a) {
            if (this.f15717c.f15595b != 3 && this.f15717c.f15595b != 0) {
                this.f15717c.t(0);
                this.f15717c.u();
                this.f15716b.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.d bVar;
        o1.f("BillingClient", "Billing service connected.");
        synchronized (this.f15717c.f15594a) {
            try {
                if (this.f15717c.f15595b == 3) {
                    return;
                }
                e eVar = this.f15717c;
                int i = com.google.android.gms.internal.play_billing.c.f14145c;
                if (iBinder == null) {
                    bVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    bVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.play_billing.d ? (com.google.android.gms.internal.play_billing.d) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.play_billing.b(iBinder, "com.android.vending.billing.IInAppBillingService", 4);
                }
                eVar.f15601h = bVar;
                e eVar2 = this.f15717c;
                if (e.m(new aa.w(1, this), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, new ac.g(7, this), eVar2.D(), eVar2.q()) == null) {
                    e eVar3 = this.f15717c;
                    j jVarN = eVar3.n();
                    eVar3.H(25, 6, jVarN);
                    a(jVarN);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z5;
        o1.g("BillingClient", "Billing service disconnected.");
        try {
            e eVar = this.f15717c;
            synchronized (eVar.f15594a) {
                z5 = true;
                if (eVar.f15595b != 1) {
                    z5 = false;
                }
            }
            if (z5) {
                a1.e eVar2 = this.f15717c.f15600g;
                r4 r4VarR = s4.r();
                r4VarR.f(6);
                v4 v4VarR = w4.r();
                v4VarR.f(121);
                r4VarR.e(v4VarR);
                eVar2.W((s4) r4VarR.b());
            } else {
                this.f15717c.f15600g.b0(o5.n());
            }
        } catch (Throwable th2) {
            o1.h("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f15717c.f15594a) {
            try {
                if (this.f15717c.f15595b == 3) {
                    return;
                }
                this.f15717c.t(0);
                this.f15716b.onBillingServiceDisconnected();
            } finally {
            }
        }
    }
}
