package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 extends sn1 {
    private static final ng1 zza;
    private static volatile qo1 zzb;

    static {
        ng1 ng1Var = new ng1();
        zza = ng1Var;
        sn1.t(ng1.class, ng1Var);
    }

    public static ng1 A() {
        return zza;
    }

    public static void z(bn1 bn1Var, kn1 kn1Var) {
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zza, "\u0000\u0000", null);
        }
        if (iM == 3) {
            return new ng1();
        }
        if (iM == 4) {
            return new yj(zza);
        }
        if (iM == 5) {
            return zza;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzb;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ng1.class) {
            try {
                rn1Var = zzb;
                if (rn1Var == null) {
                    rn1Var = new rn1(zza);
                    zzb = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
