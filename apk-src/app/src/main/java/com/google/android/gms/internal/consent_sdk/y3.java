package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 extends t5 {
    private static final y3 zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";
    private String zzh = "";

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        t5.l(y3.class, y3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new y3();
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
