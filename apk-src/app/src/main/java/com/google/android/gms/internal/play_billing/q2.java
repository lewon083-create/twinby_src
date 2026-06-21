package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q2 {
    protected int zza;

    public abstract int a(f4 f4Var);

    public final byte[] b() {
        try {
            g3 g3Var = (g3) this;
            int iE = g3Var.e();
            byte[] bArr = new byte[iE];
            x2 x2Var = new x2(iE, bArr);
            f4 f4VarA = c4.f14151c.a(g3Var.getClass());
            t3 t3Var = x2Var.f14365c;
            if (t3Var == null) {
                t3Var = new t3(x2Var);
            }
            f4VarA.h(g3Var, t3Var);
            if (iE - x2Var.f14368f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e3) {
            throw new RuntimeException(pe.a.f("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e3);
        }
    }
}
