package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w3 extends k5 {
    private static final w3 zzf;
    private int zzb;
    private String zzd = "";
    private q5 zze = k6.f13854f;

    static {
        w3 w3Var = new w3();
        zzf = w3Var;
        k5.m(w3.class, w3Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", y3.class});
        }
        if (i10 == 3) {
            return new w3();
        }
        if (i10 == 4) {
            return new t1(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }
}
