package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 extends d3 {
    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean B(t5 t5Var, s5 s5Var, s5 s5Var2) {
        synchronized (t5Var) {
            try {
                if (t5Var.f14322d != s5Var) {
                    return false;
                }
                t5Var.f14322d = s5Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void j(s5 s5Var, s5 s5Var2) {
        s5Var.f14302b = s5Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void s(s5 s5Var, Thread thread) {
        s5Var.f14301a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean u(t5 t5Var, h4 h4Var, h4 h4Var2) {
        synchronized (t5Var) {
            try {
                if (t5Var.f14321c != h4Var) {
                    return false;
                }
                t5Var.f14321c = h4Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean w(t5 t5Var, Object obj, Object obj2) {
        synchronized (t5Var) {
            try {
                if (t5Var.f14320b != obj) {
                    return false;
                }
                t5Var.f14320b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
