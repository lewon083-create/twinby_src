package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 extends sn1 {
    private static final zx0 zzl;
    private static volatile qo1 zzm;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzi;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";
    private long zzj = 5;
    private long zzk = 60000;

    static {
        zx0 zx0Var = new zx0();
        zzl = zx0Var;
        sn1.t(zx0.class, zx0Var);
    }

    public static yx0 G() {
        return (yx0) zzl.q();
    }

    public static zx0 H() {
        return zzl;
    }

    public final long A() {
        return this.zzf;
    }

    public final String B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        return this.zzi;
    }

    public final long E() {
        return this.zzj;
    }

    public final long F() {
        return this.zzk;
    }

    public final /* synthetic */ void I(boolean z5) {
        this.zza |= 4;
        this.zzd = z5;
    }

    public final /* synthetic */ void J(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzl, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iM == 3) {
            return new zx0();
        }
        if (iM == 4) {
            return new yx0(zzl);
        }
        if (iM == 5) {
            return zzl;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzm;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (zx0.class) {
            try {
                rn1Var = zzm;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzl);
                    zzm = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final boolean z() {
        return this.zzd;
    }
}
