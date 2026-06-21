package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 extends g3 {
    private static final n5 zzb;
    private int zzd;
    private w4 zze;

    static {
        n5 n5Var = new n5();
        zzb = n5Var;
        g3.k(n5.class, n5Var);
    }

    public static /* synthetic */ void n(n5 n5Var, w4 w4Var) {
        n5Var.zze = w4Var;
        n5Var.zzd |= 1;
    }

    public static m5 o() {
        return (m5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new n5();
        }
        if (i10 == 4) {
            return new m5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
