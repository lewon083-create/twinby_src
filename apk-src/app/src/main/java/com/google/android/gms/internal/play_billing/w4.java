package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class w4 extends g3 {
    private static final w4 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        w4 w4Var = new w4();
        zzb = w4Var;
        g3.k(w4.class, w4Var);
    }

    public static /* synthetic */ void n(w4 w4Var, String str) {
        w4Var.zzd |= 8;
        w4Var.zzh = str;
    }

    public static /* synthetic */ void o(w4 w4Var, String str) {
        str.getClass();
        w4Var.zzd |= 2;
        w4Var.zzf = str;
    }

    public static /* synthetic */ void p(w4 w4Var, int i) {
        w4Var.zzd |= 1;
        w4Var.zze = i;
    }

    public static /* synthetic */ void q(w4 w4Var, int i) {
        w4Var.zzg = i - 1;
        w4Var.zzd |= 4;
    }

    public static v4 r() {
        return (v4) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", p2.f14281d, "zzh"});
        }
        if (i10 == 3) {
            return new w4();
        }
        if (i10 == 4) {
            return new v4(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
