package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends sn1 {
    private static final fd zzg;
    private static volatile qo1 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        fd fdVar = new fd();
        zzg = fdVar;
        sn1.t(fd.class, fdVar);
    }

    public static fd E() {
        return zzg;
    }

    public final int A() {
        return this.zzc;
    }

    public final boolean B() {
        return this.zzd;
    }

    public final boolean C() {
        return this.zze;
    }

    public final boolean D() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iM == 3) {
            return new fd();
        }
        if (iM == 4) {
            return new cd(zzg);
        }
        if (iM == 5) {
            return zzg;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzh;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (fd.class) {
            try {
                rn1Var = zzh;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzg);
                    zzh = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final boolean z() {
        return this.zzb;
    }
}
