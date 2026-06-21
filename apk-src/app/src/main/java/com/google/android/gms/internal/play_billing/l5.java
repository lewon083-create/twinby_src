package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l5 extends g3 {
    private static final l5 zzb;
    private int zzd;
    private int zzf;
    private k3 zze = d4.f14161f;
    private String zzg = "";

    static {
        l5 l5Var = new l5();
        zzb = l5Var;
        g3.k(l5.class, l5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new l5();
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
