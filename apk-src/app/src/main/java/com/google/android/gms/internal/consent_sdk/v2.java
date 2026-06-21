package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends t5 {
    private static final v2 zzb;
    private int zzd;
    private u2 zze;
    private i2 zzf;

    static {
        v2 v2Var = new v2();
        zzb = v2Var;
        t5.l(v2.class, v2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new v2();
        }
        if (i10 == 4) {
            return new k2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
