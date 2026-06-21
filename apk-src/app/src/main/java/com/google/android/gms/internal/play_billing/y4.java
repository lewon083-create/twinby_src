package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends g3 {
    private static final y4 zzb;

    static {
        y4 y4Var = new y4();
        zzb = y4Var;
        g3.k(y4.class, y4Var);
    }

    public static y4 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new y4();
        }
        if (i10 == 4) {
            return new x4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
