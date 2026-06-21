package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 extends g3 {
    private static final g5 zzb;
    private int zzd;
    private int zze;

    static {
        g5 g5Var = new g5();
        zzb = g5Var;
        g3.k(g5.class, g5Var);
    }

    public static /* synthetic */ void n(g5 g5Var, int i) {
        g5Var.zze = i - 1;
        g5Var.zzd |= 1;
    }

    public static e5 o() {
        return (e5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", p2.f14284g});
        }
        if (i10 == 3) {
            return new g5();
        }
        if (i10 == 4) {
            return new e5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
