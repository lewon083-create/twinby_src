package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x3 extends k5 {
    private static final x3 zzf;
    private int zzb;
    private q5 zzd = k6.f13854f;
    private v3 zze;

    static {
        x3 x3Var = new x3();
        zzf = x3Var;
        k5.m(x3.class, x3Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", y3.class, "zze"});
        }
        if (i10 == 3) {
            return new x3();
        }
        if (i10 == 4) {
            return new t1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final v3 q() {
        v3 v3Var = this.zze;
        return v3Var == null ? v3.r() : v3Var;
    }
}
