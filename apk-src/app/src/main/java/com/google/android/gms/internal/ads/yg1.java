package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yg1 extends sn1 {
    private static final yg1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private int zzb;
    private bn1 zzc = bn1.f3837c;
    private ah1 zzd;

    static {
        yg1 yg1Var = new yg1();
        zze = yg1Var;
        sn1.t(yg1.class, yg1Var);
    }

    public static yg1 C(bn1 bn1Var, kn1 kn1Var) {
        return (yg1) sn1.m(zze, bn1Var, kn1Var);
    }

    public static xg1 D() {
        return (xg1) zze.q();
    }

    public static qo1 E() {
        return zze.o();
    }

    public final bn1 A() {
        return this.zzc;
    }

    public final ah1 B() {
        ah1 ah1Var = this.zzd;
        return ah1Var == null ? ah1.D() : ah1Var;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        this.zzc = bn1Var;
    }

    public final /* synthetic */ void G(ah1 ah1Var) {
        this.zzd = ah1Var;
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
            return new uo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iM == 3) {
            return new yg1();
        }
        if (iM == 4) {
            return new xg1(zze);
        }
        if (iM == 5) {
            return zze;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzf;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (yg1.class) {
            try {
                rn1Var = zzf;
                if (rn1Var == null) {
                    rn1Var = new rn1(zze);
                    zzf = rn1Var;
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
