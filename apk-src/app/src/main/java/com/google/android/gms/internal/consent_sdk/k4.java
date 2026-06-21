package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 extends t5 {
    private static final k4 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        k4 k4Var = new k4();
        zzb = k4Var;
        t5.l(k4.class, k4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", u0.C, "zzf", v6.f13598a, "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new k4();
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
