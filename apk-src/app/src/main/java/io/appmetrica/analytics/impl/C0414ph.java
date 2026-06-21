package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0414ph extends Qg {
    public C0414ph(Y4 y42) {
        super(y42);
    }

    @Override // io.appmetrica.analytics.impl.Qg
    public final boolean a(@NonNull Q5 q5) {
        ((C0302l5) this.f22888a.f23296p).e();
        Qk qk2 = this.f22888a.f23290j;
        synchronized (qk2) {
            try {
                Ck ckB = qk2.b(q5);
                if (ckB.f22227g) {
                    ckB.f22227g = false;
                    Tk tk2 = ckB.f22222b;
                    tk2.a(Tk.i, Boolean.FALSE);
                    tk2.b();
                }
                if (qk2.f22897g != 1) {
                    qk2.b(qk2.f22896f, q5);
                }
                qk2.f22897g = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
