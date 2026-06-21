package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends t5 {
    private static final a2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        t5.l(a2.class, a2Var);
    }

    public static z1 m() {
        return (z1) zzb.g();
    }

    public static /* synthetic */ void n(a2 a2Var, String str) {
        a2Var.zzd |= 2;
        a2Var.zzf = str;
    }

    public static /* synthetic */ void o(a2 a2Var, long j10) {
        a2Var.zzd |= 4;
        a2Var.zzg = j10;
    }

    public static /* synthetic */ void p(a2 a2Var, int i) {
        a2Var.zze = i - 2;
        a2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new a2();
        }
        if (i10 == 4) {
            return new z1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
