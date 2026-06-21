package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends t5 {
    private static final c1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        c1 c1Var = new c1();
        zzb = c1Var;
        t5.l(c1.class, c1Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", u0.f13560c, "zzf"});
        }
        if (i10 == 3) {
            return new c1();
        }
        if (i10 == 4) {
            return new v0(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
