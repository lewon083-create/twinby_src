package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 extends k5 {
    private static final i2 zzd;
    private q5 zzb = k6.f13854f;

    static {
        i2 i2Var = new i2();
        zzd = i2Var;
        k5.m(i2.class, i2Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i10 == 3) {
            return new i2();
        }
        if (i10 == 4) {
            return new t1(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }
}
