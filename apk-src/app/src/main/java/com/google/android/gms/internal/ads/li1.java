package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class li1 extends sn1 {
    private static final li1 zzj;
    private static volatile qo1 zzk;
    private int zza;
    private int zzb;
    private ni1 zzc;
    private bn1 zzd;
    private bn1 zze;
    private bn1 zzf;
    private bn1 zzg;
    private bn1 zzh;
    private bn1 zzi;

    static {
        li1 li1Var = new li1();
        zzj = li1Var;
        sn1.t(li1.class, li1Var);
    }

    public li1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
        this.zzf = zm1Var;
        this.zzg = zm1Var;
        this.zzh = zm1Var;
        this.zzi = zm1Var;
    }

    public static li1 H(bn1 bn1Var, kn1 kn1Var) {
        return (li1) sn1.m(zzj, bn1Var, kn1Var);
    }

    public static ki1 I() {
        return (ki1) zzj.q();
    }

    public static qo1 J() {
        return zzj.o();
    }

    public final ni1 A() {
        ni1 ni1Var = this.zzc;
        return ni1Var == null ? ni1.F() : ni1Var;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final bn1 C() {
        return this.zze;
    }

    public final bn1 D() {
        return this.zzf;
    }

    public final bn1 E() {
        return this.zzg;
    }

    public final bn1 F() {
        return this.zzh;
    }

    public final bn1 G() {
        return this.zzi;
    }

    public final /* synthetic */ void K() {
        this.zzb = 0;
    }

    public final /* synthetic */ void L(ni1 ni1Var) {
        this.zzc = ni1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void M(zm1 zm1Var) {
        this.zzd = zm1Var;
    }

    public final /* synthetic */ void N(zm1 zm1Var) {
        this.zze = zm1Var;
    }

    public final /* synthetic */ void O(zm1 zm1Var) {
        this.zzf = zm1Var;
    }

    public final /* synthetic */ void P(zm1 zm1Var) {
        this.zzg = zm1Var;
    }

    public final /* synthetic */ void Q(zm1 zm1Var) {
        this.zzh = zm1Var;
    }

    public final /* synthetic */ void R(zm1 zm1Var) {
        this.zzi = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzj, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\b\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iM == 3) {
            return new li1();
        }
        if (iM == 4) {
            return new ki1(zzj);
        }
        if (iM == 5) {
            return zzj;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzk;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (li1.class) {
            try {
                rn1Var = zzk;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzj);
                    zzk = rn1Var;
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
