package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends k5 {
    private static final v3 zzd;
    private q5 zzb = k6.f13854f;

    static {
        v3 v3Var = new v3();
        zzd = v3Var;
        k5.m(v3.class, v3Var);
    }

    public static v3 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w3.class});
        }
        if (i10 == 3) {
            return new v3();
        }
        if (i10 == 4) {
            return new t1(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
}
