package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends t5 {
    private static final x3 zzb;
    private int zzd;
    private f6 zzh = f6.f13387c;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        x3 x3Var = new x3();
        zzb = x3Var;
        t5.l(x3.class, x3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", w3.f13603a});
        }
        if (i10 == 3) {
            return new x3();
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
