package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ti1 extends sn1 {
    private static final ti1 zzj;
    private static volatile qo1 zzk;
    private int zza;
    private int zzb;
    private vi1 zzc;
    private bn1 zzd;
    private bn1 zze;
    private bn1 zzf;
    private bn1 zzg;
    private bn1 zzh;
    private bn1 zzi;

    static {
        ti1 ti1Var = new ti1();
        zzj = ti1Var;
        sn1.t(ti1.class, ti1Var);
    }

    public ti1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
        this.zzf = zm1Var;
        this.zzg = zm1Var;
        this.zzh = zm1Var;
        this.zzi = zm1Var;
    }

    public static ti1 H(bn1 bn1Var, kn1 kn1Var) {
        return (ti1) sn1.m(zzj, bn1Var, kn1Var);
    }

    public static si1 I() {
        return (si1) zzj.q();
    }

    public static qo1 J() {
        return zzj.o();
    }

    public final vi1 A() {
        vi1 vi1Var = this.zzc;
        return vi1Var == null ? vi1.F() : vi1Var;
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

    public final /* synthetic */ void L(vi1 vi1Var) {
        this.zzc = vi1Var;
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
            return new ti1();
        }
        if (iM == 4) {
            return new si1(zzj);
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
        synchronized (ti1.class) {
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
