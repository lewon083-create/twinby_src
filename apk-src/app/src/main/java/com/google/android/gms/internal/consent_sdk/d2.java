package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends t5 {
    private static final d2 zzb;
    private int zzd;
    private String zze = "";

    static {
        d2 d2Var = new d2();
        zzb = d2Var;
        t5.l(d2.class, d2Var);
    }

    public static b2 m() {
        return (b2) zzb.g();
    }

    public static /* synthetic */ void n(d2 d2Var) {
        d2Var.zzd |= 1;
        d2Var.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.t5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new o6(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new d2();
        }
        if (i10 == 4) {
            return new b2(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
