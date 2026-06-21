package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t6 extends t5 {
    private static final t6 zzb;
    private long zzd;
    private int zze;

    static {
        t6 t6Var = new t6();
        zzb = t6Var;
        t5.l(t6.class, t6Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new t6();
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
