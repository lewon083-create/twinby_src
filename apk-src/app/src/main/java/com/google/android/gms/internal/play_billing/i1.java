package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends d3 {
    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean A(n1 n1Var, f1 f1Var, f1 f1Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.f14253c != f1Var) {
                    return false;
                }
                n1Var.f14253c = f1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean E(n1 n1Var, Object obj, Object obj2) {
        synchronized (n1Var) {
            try {
                if (n1Var.f14252b != obj) {
                    return false;
                }
                n1Var.f14252b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final boolean G(n1 n1Var, m1 m1Var, m1 m1Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.f14254d != m1Var) {
                    return false;
                }
                n1Var.f14254d = m1Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final f1 e(n1 n1Var) {
        f1 f1Var;
        f1 f1Var2 = f1.f14178d;
        synchronized (n1Var) {
            try {
                f1Var = n1Var.f14253c;
                if (f1Var != f1Var2) {
                    n1Var.f14253c = f1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final m1 p(n1 n1Var) {
        m1 m1Var;
        m1 m1Var2 = m1.f14241c;
        synchronized (n1Var) {
            try {
                m1Var = n1Var.f14254d;
                if (m1Var != m1Var2) {
                    n1Var.f14254d = m1Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m1Var;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void t(m1 m1Var, m1 m1Var2) {
        m1Var.f14243b = m1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.d3
    public final void v(m1 m1Var, Thread thread) {
        m1Var.f14242a = thread;
    }
}
