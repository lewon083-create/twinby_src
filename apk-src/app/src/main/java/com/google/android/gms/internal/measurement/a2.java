package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends k5 {
    private static final a2 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        a2 a2Var = new a2();
        zzf = a2Var;
        k5.m(a2.class, a2Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            u1 u1Var = u1.f13983e;
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", u1Var, "zze", u1Var});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new t1(zzf);
        }
        if (i10 == 5) {
            return zzf;
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
        int iL = k3.f.L(this.zze);
        if (iL == 0) {
            return 1;
        }
        return iL;
    }
}
