package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 extends t5 {
    private static final g4 zzb;
    private int zzd;
    private f4 zze;
    private w0 zzf;
    private String zzg = "";

    static {
        g4 g4Var = new g4();
        zzb = g4Var;
        t5.l(g4.class, g4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new g4();
        }
        if (i10 == 4) {
            return new v3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
