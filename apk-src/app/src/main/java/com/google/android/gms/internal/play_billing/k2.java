package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends g3 {
    private static final k2 zzb;
    private int zzd;
    private o2 zze;
    private o2 zzf;
    private int zzg;

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        g3.k(k2.class, k2Var);
    }

    public static j2 n() {
        return (j2) zzb.f();
    }

    public static /* synthetic */ void o(k2 k2Var, o2 o2Var) {
        k2Var.zze = o2Var;
        k2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", p2.f14279b});
        }
        if (i10 == 3) {
            return new k2();
        }
        if (i10 == 4) {
            return new j2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
