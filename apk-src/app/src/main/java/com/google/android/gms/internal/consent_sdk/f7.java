package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class f7 extends t5 {
    private static final f7 zzb;
    private String zzd = "";
    private long zze;
    private int zzf;

    static {
        f7 f7Var = new f7();
        zzb = f7Var;
        t5.l(f7.class, f7Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new f7();
        }
        if (i10 == 4) {
            return new d5(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
