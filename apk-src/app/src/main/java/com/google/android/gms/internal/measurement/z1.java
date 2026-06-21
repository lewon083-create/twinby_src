package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends k5 {
    private static final z1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        z1 z1Var = new z1();
        zzg = z1Var;
        k5.m(z1.class, z1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", u1.f13983e, "zze", u1.f13982d, "zzf", u1.f13984f});
        }
        if (i10 == 3) {
            return new z1();
        }
        if (i10 == 4) {
            return new t1(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int iL = k3.f.L(this.zzd);
        if (iL == 0) {
            return 1;
        }
        return iL;
    }

    public final int q() {
        int i;
        int i10 = this.zze;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                i = i10 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int r() {
        int i;
        int i10 = this.zzf;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                i = i10 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
