package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends k5 {
    private static final c2 zzi;
    private int zzb;
    private q5 zzd;
    private q5 zze;
    private q5 zzf;
    private boolean zzg;
    private q5 zzh;

    static {
        c2 c2Var = new c2();
        zzi = c2Var;
        k5.m(c2.class, c2Var);
    }

    public c2() {
        k6 k6Var = k6.f13854f;
        this.zzd = k6Var;
        this.zze = k6Var;
        this.zzf = k6Var;
        this.zzh = k6Var;
    }

    public static c2 v() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", z1.class, "zze", a2.class, "zzf", b2.class, "zzg", "zzh", z1.class});
        }
        if (i10 == 3) {
            return new c2();
        }
        if (i10 == 4) {
            return new t1(zzi);
        }
        if (i10 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final List q() {
        return this.zze;
    }

    public final List r() {
        return this.zzf;
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final boolean t() {
        return this.zzg;
    }

    public final q5 u() {
        return this.zzh;
    }
}
