package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a5 extends g3 {
    private static final a5 zzb;
    private int zzd;
    private int zzf;
    private w4 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private j3 zzg = h3.f14205f;
    private k3 zzh = d4.f14161f;

    static {
        a5 a5Var = new a5();
        zzb = a5Var;
        g3.k(a5.class, a5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", p2.f14283f, "zzg", p2.f14282e, "zzh", l5.class, "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new a5();
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
