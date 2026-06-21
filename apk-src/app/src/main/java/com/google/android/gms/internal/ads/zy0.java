package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 extends sn1 {
    private static final zy0 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private bz0 zzb;
    private bn1 zzc;
    private bn1 zzd;
    private int zze;

    static {
        zy0 zy0Var = new zy0();
        zzf = zy0Var;
        sn1.t(zy0.class, zy0Var);
    }

    public zy0() {
        zm1 zm1Var = bn1.f3837c;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
    }

    public static yy0 C() {
        return (yy0) zzf.q();
    }

    public final bn1 A() {
        return this.zzc;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void D(bz0 bz0Var) {
        this.zzb = bz0Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 2;
        this.zzc = bn1Var;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final int G() {
        int iC = fs1.c(this.zze);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public final /* synthetic */ void H(int i) {
        this.zze = i - 1;
        this.zza |= 8;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", ad.B});
        }
        if (iM == 3) {
            return new zy0();
        }
        if (iM == 4) {
            return new yy0(zzf);
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
        synchronized (zy0.class) {
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

    public final bz0 z() {
        bz0 bz0Var = this.zzb;
        return bz0Var == null ? bz0.E() : bz0Var;
    }
}
