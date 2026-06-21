package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c5 extends g3 {
    private static final c5 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        c5 c5Var = new c5();
        zzb = c5Var;
        g3.k(c5.class, c5Var);
    }

    public static /* synthetic */ void n(c5 c5Var, int i) {
        c5Var.zzd |= 4;
        c5Var.zzg = i;
    }

    public static /* synthetic */ void o(c5 c5Var, long j10) {
        c5Var.zzd |= 8;
        c5Var.zzh = j10;
    }

    public static /* synthetic */ void p(c5 c5Var, String str) {
        str.getClass();
        c5Var.zzd |= 2;
        c5Var.zzf = str;
    }

    public static /* synthetic */ void q(c5 c5Var, String str) {
        str.getClass();
        c5Var.zzd |= 1;
        c5Var.zze = str;
    }

    public static b5 r() {
        return (b5) zzb.f();
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new c5();
        }
        if (i10 == 4) {
            return new b5(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
