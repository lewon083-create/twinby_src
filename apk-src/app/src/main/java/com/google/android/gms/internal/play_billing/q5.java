package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends g3 {
    private static final q5 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        q5 q5Var = new q5();
        zzb = q5Var;
        g3.k(q5.class, q5Var);
    }

    public static /* synthetic */ void n(q5 q5Var) {
        q5Var.zzd |= 2;
        q5Var.zzf = true;
    }

    public static p5 o() {
        return (p5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new q5();
        }
        if (i10 == 4) {
            return new p5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
