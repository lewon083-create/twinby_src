package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends t5 {
    private static final j3 zzb;
    private int zzd;
    private i3 zze;
    private z3 zzf;
    private int zzg;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        t5.l(j3.class, j3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003᠌\u0002\u0004ဉ\u0001", new Object[]{"zzd", "zze", "zzg", u0.f13568l, "zzf"});
        }
        if (i10 == 3) {
            return new j3();
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
