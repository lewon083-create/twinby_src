package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends g3 {
    private static final h5 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        h5 h5Var = new h5();
        zzb = h5Var;
        g3.k(h5.class, h5Var);
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", p2.f14285h, "zzf"});
        }
        if (i10 == 3) {
            return new h5();
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
