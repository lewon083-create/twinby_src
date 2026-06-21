package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends t5 {
    private static final e2 zzb;
    private int zzd;
    private a2 zze;
    private d2 zzg;
    private y1 zzh;
    private v1 zzi;
    private String zzf = "";
    private w5 zzj = n6.f13497f;

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        t5.l(e2.class, e2Var);
    }

    public static w1 m() {
        return (w1) zzb.g();
    }

    public static void n(e2 e2Var, String str) {
        str.getClass();
        w5 w5Var = e2Var.zzj;
        if (!((g5) w5Var).f13393b) {
            int size = w5Var.size();
            e2Var.zzj = w5Var.d(size + size);
        }
        e2Var.zzj.add(str);
    }

    public static /* synthetic */ void o(e2 e2Var, String str) {
        e2Var.zzd |= 2;
        e2Var.zzf = str;
    }

    public static /* synthetic */ void p(e2 e2Var, v1 v1Var) {
        e2Var.zzi = v1Var;
        e2Var.zzd |= 16;
    }

    public static /* synthetic */ void q(e2 e2Var, y1 y1Var) {
        e2Var.zzh = y1Var;
        e2Var.zzd |= 8;
    }

    public static /* synthetic */ void r(e2 e2Var, a2 a2Var) {
        e2Var.zze = a2Var;
        e2Var.zzd |= 1;
    }

    public static /* synthetic */ void s(e2 e2Var, d2 d2Var) {
        e2Var.zzg = d2Var;
        e2Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new e2();
        }
        if (i10 == 4) {
            return new w1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
