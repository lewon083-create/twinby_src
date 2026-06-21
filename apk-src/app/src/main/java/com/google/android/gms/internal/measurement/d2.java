package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends k5 {
    private static final d2 zzg;
    private int zzb;
    private String zzd = "";
    private q5 zze = k6.f13854f;
    private boolean zzf;

    static {
        d2 d2Var = new d2();
        zzg = d2Var;
        k5.m(d2.class, d2Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", k2.class, "zzf"});
        }
        if (i10 == 3) {
            return new d2();
        }
        if (i10 == 4) {
            return new t1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
}
