package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pg1 extends sn1 {
    private static final pg1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private rg1 zzb;
    private int zzc;

    static {
        pg1 pg1Var = new pg1();
        zzd = pg1Var;
        sn1.t(pg1.class, pg1Var);
    }

    public static pg1 A(bn1 bn1Var, kn1 kn1Var) {
        return (pg1) sn1.m(zzd, bn1Var, kn1Var);
    }

    public static og1 B() {
        return (og1) zzd.q();
    }

    public final /* synthetic */ void C(rg1 rg1Var) {
        this.zzb = rg1Var;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new pg1();
        }
        if (iM == 4) {
            return new og1(zzd);
        }
        if (iM == 5) {
            return zzd;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zze;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (pg1.class) {
            try {
                rn1Var = zze;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzd);
                    zze = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final rg1 z() {
        rg1 rg1Var = this.zzb;
        return rg1Var == null ? rg1.B() : rg1Var;
    }
}
