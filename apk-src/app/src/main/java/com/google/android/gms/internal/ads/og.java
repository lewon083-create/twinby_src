package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class og extends sn1 {
    private static final og zze;
    private static volatile qo1 zzf;
    private int zza;
    private sg zzb;
    private bn1 zzc;
    private bn1 zzd;

    static {
        og ogVar = new og();
        zze = ogVar;
        sn1.t(og.class, ogVar);
    }

    public og() {
        zm1 zm1Var = bn1.f3837c;
        this.zzc = zm1Var;
        this.zzd = zm1Var;
    }

    public static og C(zm1 zm1Var, kn1 kn1Var) {
        return (og) sn1.m(zze, zm1Var, kn1Var);
    }

    public static og D(byte[] bArr, kn1 kn1Var) throws co1 {
        sn1 sn1VarX = sn1.x(zze, bArr, bArr.length, kn1Var);
        sn1.y(sn1VarX);
        return (og) sn1VarX;
    }

    public final bn1 A() {
        return this.zzc;
    }

    public final bn1 B() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iM == 3) {
            return new og();
        }
        if (iM == 4) {
            return new cd(zze);
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
        synchronized (og.class) {
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

    public final sg z() {
        sg sgVar = this.zzb;
        return sgVar == null ? sg.H() : sgVar;
    }
}
