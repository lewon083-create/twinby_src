package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 extends sn1 {
    private static final ni1 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private int zzb;
    private ji1 zzc;
    private bn1 zzd;
    private bn1 zze;

    static {
        ni1 ni1Var = new ni1();
        zzf = ni1Var;
        sn1.t(ni1.class, ni1Var);
    }

    public ni1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static ni1 D(bn1 bn1Var, kn1 kn1Var) {
        return (ni1) sn1.m(zzf, bn1Var, kn1Var);
    }

    public static mi1 E() {
        return (mi1) zzf.q();
    }

    public static ni1 F() {
        return zzf;
    }

    public static qo1 G() {
        return zzf.o();
    }

    public final ji1 A() {
        ji1 ji1Var = this.zzc;
        return ji1Var == null ? ji1.B() : ji1Var;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final bn1 C() {
        return this.zze;
    }

    public final /* synthetic */ void H(ji1 ji1Var) {
        this.zzc = ji1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void I(zm1 zm1Var) {
        this.zzd = zm1Var;
    }

    public final /* synthetic */ void J(zm1 zm1Var) {
        this.zze = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new ni1();
        }
        if (iM == 4) {
            return new mi1(zzf);
        }
        if (iM == 5) {
            return zzf;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzg;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ni1.class) {
            try {
                rn1Var = zzg;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzf);
                    zzg = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final int z() {
        return this.zzb;
    }
}
