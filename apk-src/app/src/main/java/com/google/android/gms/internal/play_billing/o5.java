package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o5 extends g3 {
    private static final o5 zzb;
    private int zzd;
    private int zze;

    static {
        o5 o5Var = new o5();
        zzb = o5Var;
        g3.k(o5.class, o5Var);
    }

    public static o5 n() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", p2.i});
        }
        if (i10 == 3) {
            return new o5();
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
