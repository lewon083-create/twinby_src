package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j71 extends ix {
    @Override // com.google.android.gms.internal.ads.ix
    public final boolean P(p71 p71Var, o71 o71Var, o71 o71Var2) {
        synchronized (p71Var) {
            try {
                if (p71Var.f8954d != o71Var) {
                    return false;
                }
                p71Var.f8954d = o71Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean V(h71 h71Var, e71 e71Var, e71 e71Var2) {
        synchronized (h71Var) {
            try {
                if (h71Var.f8953c != e71Var) {
                    return false;
                }
                h71Var.f8953c = e71Var2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final o71 X(h71 h71Var) {
        o71 o71Var;
        o71 o71Var2 = o71.f8627c;
        synchronized (h71Var) {
            try {
                o71Var = h71Var.f8954d;
                if (o71Var != o71Var2) {
                    h71Var.f8954d = o71Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o71Var;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final e71 d0(h71 h71Var) {
        e71 e71Var;
        e71 e71Var2 = e71.f4867d;
        synchronized (h71Var) {
            try {
                e71Var = h71Var.f8953c;
                if (e71Var != e71Var2) {
                    h71Var.f8953c = e71Var2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e71Var;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final boolean h0(p71 p71Var, Object obj, Object obj2) {
        synchronized (p71Var) {
            try {
                if (p71Var.f8952b != obj) {
                    return false;
                }
                p71Var.f8952b = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void l(o71 o71Var, Thread thread) {
        o71Var.f8628a = thread;
    }

    @Override // com.google.android.gms.internal.ads.ix
    public final void y(o71 o71Var, o71 o71Var2) {
        o71Var.f8629b = o71Var2;
    }
}
