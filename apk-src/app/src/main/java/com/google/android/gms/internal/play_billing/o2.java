package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends g3 {
    private static final o2 zzb;
    private int zzd;
    private String zze = "";

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        g3.k(o2.class, o2Var);
    }

    public static n2 n() {
        return (n2) zzb.f();
    }

    public static /* synthetic */ void o(o2 o2Var, String str) {
        o2Var.zzd |= 1;
        o2Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.g3
    public final Object d(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new e4(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new o2();
        }
        if (i10 == 4) {
            return new n2(zzb);
        }
        if (i10 != 5) {
            return null;
        }
        return zzb;
    }
}
