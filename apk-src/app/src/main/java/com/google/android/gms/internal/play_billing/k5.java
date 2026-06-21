package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k5 extends g3 {
    private static final k5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private c5 zzg;
    private d5 zzh;

    static {
        k5 k5Var = new k5();
        zzb = k5Var;
        g3.k(k5.class, k5Var);
    }

    public static /* synthetic */ void n(k5 k5Var, s4 s4Var) {
        k5Var.zzf = s4Var;
        k5Var.zze = 2;
    }

    public static /* synthetic */ void o(k5 k5Var, u4 u4Var) {
        k5Var.zzf = u4Var;
        k5Var.zze = 3;
    }

    public static /* synthetic */ void p(k5 k5Var, y4 y4Var) {
        y4Var.getClass();
        k5Var.zzf = y4Var;
        k5Var.zze = 7;
    }

    public static /* synthetic */ void q(k5 k5Var, c5 c5Var) {
        c5Var.getClass();
        k5Var.zzg = c5Var;
        k5Var.zzd |= 1;
    }

    public static /* synthetic */ void r(k5 k5Var, n5 n5Var) {
        k5Var.zzf = n5Var;
        k5Var.zze = 8;
    }

    public static /* synthetic */ void s(k5 k5Var, o5 o5Var) {
        k5Var.zzf = o5Var;
        k5Var.zze = 4;
    }

    public static j5 t() {
        return (j5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", s4.class, u4.class, o5.class, a5.class, "zzh", y4.class, n5.class});
        }
        if (i10 == 3) {
            return new k5();
        }
        if (i10 == 4) {
            return new j5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
