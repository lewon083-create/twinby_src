package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h3 extends k5 {
    private static final h3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private r2 zzf;

    static {
        h3 h3Var = new h3();
        zzg = h3Var;
        k5.m(h3.class, h3Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new h3();
        }
        if (i10 == 4) {
            return new t1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }
}
