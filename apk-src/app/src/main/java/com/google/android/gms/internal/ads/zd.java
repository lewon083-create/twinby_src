package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zd extends sn1 {
    private static final zd zzf;
    private static volatile qo1 zzg;
    private int zza;
    private bn1 zzb;
    private bn1 zzc;
    private bn1 zzd;
    private bn1 zze;

    static {
        zd zdVar = new zd();
        zzf = zdVar;
        sn1.t(zd.class, zdVar);
    }

    public zd() {
        zm1 zm1Var = bn1.f3837c;
        this.zzb = zm1Var;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static zd D(byte[] bArr, kn1 kn1Var) throws co1 {
        sn1 sn1VarX = sn1.x(zzf, bArr, bArr.length, kn1Var);
        sn1.y(sn1VarX);
        return (zd) sn1VarX;
    }

    public static yd E() {
        return (yd) zzf.q();
    }

    public final bn1 A() {
        return this.zzc;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final bn1 C() {
        return this.zze;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        this.zza |= 1;
        this.zzb = bn1Var;
    }

    public final /* synthetic */ void G(zm1 zm1Var) {
        this.zza |= 2;
        this.zzc = zm1Var;
    }

    public final /* synthetic */ void H(bn1 bn1Var) {
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final /* synthetic */ void I(zm1 zm1Var) {
        this.zza |= 8;
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
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new zd();
        }
        if (iM == 4) {
            return new yd(zzf);
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
        synchronized (zd.class) {
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

    public final bn1 z() {
        return this.zzb;
    }
}
