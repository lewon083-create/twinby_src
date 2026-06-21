package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pg extends sn1 {
    private static final pg zzd;
    private static volatile qo1 zze;
    private int zza;
    private qg zzb;
    private bn1 zzc = bn1.f3837c;

    static {
        pg pgVar = new pg();
        zzd = pgVar;
        sn1.t(pg.class, pgVar);
    }

    public static pg D() {
        return zzd;
    }

    public final qg A() {
        qg qgVar = this.zzb;
        return qgVar == null ? qg.C() : qgVar;
    }

    public final boolean B() {
        return (this.zza & 2) != 0;
    }

    public final bn1 C() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new pg();
        }
        if (iM == 4) {
            return new cd(zzd);
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
        synchronized (pg.class) {
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

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
