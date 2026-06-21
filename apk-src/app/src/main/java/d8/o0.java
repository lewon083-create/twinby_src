package d8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.ads.jw1;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.z2;
import ob.z3;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15695a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15698d;

    public o0(jw1 jw1Var, boolean z5) {
        this.f15698d = jw1Var;
        this.f15697c = z5;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.f15696b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.f15697c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.f15696b = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void b() {
        z3 z3Var = (z3) this.f15698d;
        z3Var.k0();
        z3Var.e().C();
        z3Var.e().C();
        if (this.f15696b) {
            z3Var.b().f30418o.f("Unregistering connectivity change receiver");
            this.f15696b = false;
            this.f15697c = false;
            try {
                z3Var.f30615m.f30260b.unregisterReceiver(this);
            } catch (IllegalArgumentException e3) {
                z3Var.b().f30411g.g(e3, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.f15696b) {
            o1.g("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f15696b = false;
        }
    }

    public void d(Bundle bundle, j jVar, int i) {
        z2 z2VarQ;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
                ((a1.e) ((m0) ((jw1) this.f15698d).f6958e)).W(l0.b(23, i, jVar));
                return;
            }
            m0 m0Var = (m0) ((jw1) this.f15698d).f6958e;
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            int i10 = z2.f14386a;
            synchronized (z2.class) {
                int i11 = z2.f14386a;
                c4 c4Var = c4.f14151c;
                z2VarQ = d3.q();
                int i12 = z2.f14386a;
            }
            ((a1.e) m0Var).W(s4.n(byteArray, z2VarQ));
        } catch (Throwable unused) {
            o1.g("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ee  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r12, android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.o0.onReceive(android.content.Context, android.content.Intent):void");
    }

    public o0(z3 z3Var) {
        pa.c0.i(z3Var);
        this.f15698d = z3Var;
    }
}
