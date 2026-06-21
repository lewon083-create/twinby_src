package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends t5 {
    private static final g2 zzb;

    static {
        g2 g2Var = new g2();
        zzb = g2Var;
        t5.l(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new g2();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
