package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends t5 {
    private static final r3 zzb;
    private v5 zzd = u5.f13584f;

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        t5.l(r3.class, r3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠬ", new Object[]{"zzd", u0.A});
        }
        if (i10 == 3) {
            return new r3();
        }
        if (i10 == 4) {
            return new k2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
