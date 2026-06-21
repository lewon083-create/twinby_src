package com.google.android.gms.internal.consent_sdk;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends t5 {
    private static final y1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        t5.l(y1.class, y1Var);
    }

    public static x1 m() {
        return (x1) zzb.g();
    }

    public static /* synthetic */ void n(y1 y1Var, int i) {
        y1Var.zzd |= 8;
        y1Var.zzh = i;
    }

    public static /* synthetic */ void o(y1 y1Var) {
        String str = Build.MODEL;
        str.getClass();
        y1Var.zzd |= 4;
        y1Var.zzg = str;
    }

    public static /* synthetic */ void p(y1 y1Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        y1Var.zzd |= 2;
        y1Var.zzf = str;
    }

    public static /* synthetic */ void q(y1 y1Var) {
        y1Var.zze = 1;
        y1Var.zzd = 1 | y1Var.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new y1();
        }
        if (i10 == 4) {
            return new x1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
