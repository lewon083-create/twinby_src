package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w71 extends gr {
    @Override // com.google.android.gms.internal.ads.gr
    public final int A(u71 u71Var) {
        int i;
        synchronized (u71Var) {
            i = u71Var.f12065j - 1;
            u71Var.f12065j = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final void u(u71 u71Var, Set set) {
        synchronized (u71Var) {
            try {
                if (u71Var.i == null) {
                    u71Var.i = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
