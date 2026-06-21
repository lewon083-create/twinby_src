package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends t5 {
    private static final v1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        v1 v1Var = new v1();
        zzb = v1Var;
        t5.l(v1.class, v1Var);
    }

    public static u1 m() {
        return (u1) zzb.g();
    }

    public static /* synthetic */ void n(v1 v1Var, String str) {
        str.getClass();
        v1Var.zzd |= 1;
        v1Var.zze = str;
    }

    public static /* synthetic */ void o(v1 v1Var, String str) {
        str.getClass();
        v1Var.zzd |= 2;
        v1Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new v1();
        }
        if (i10 == 4) {
            return new u1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
