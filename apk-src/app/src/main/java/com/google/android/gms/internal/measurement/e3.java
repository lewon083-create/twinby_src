package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends k5 {
    private static final e3 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        e3 e3Var = new e3();
        zzf = e3Var;
        k5.m(e3.class, e3Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new e3();
        }
        if (i10 == 4) {
            return new t1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }
}
