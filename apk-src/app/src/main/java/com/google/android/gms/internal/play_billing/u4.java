package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends g3 {
    private static final u4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        u4 u4Var = new u4();
        zzb = u4Var;
        g3.k(u4.class, u4Var);
    }

    public static /* synthetic */ void n(u4 u4Var, g5 g5Var) {
        u4Var.zzf = g5Var;
        u4Var.zze = 2;
    }

    public static /* synthetic */ void o(u4 u4Var, q5 q5Var) {
        u4Var.zzf = q5Var;
        u4Var.zze = 3;
    }

    public static /* synthetic */ void p(u4 u4Var, int i) {
        u4Var.zzg = i - 1;
        u4Var.zzd |= 1;
    }

    public static t4 q() {
        return (t4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p2.f14280c, g5.class, q5.class, i5.class});
        }
        if (i10 == 3) {
            return new u4();
        }
        if (i10 == 4) {
            return new t4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
