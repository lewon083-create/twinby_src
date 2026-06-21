package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vd extends sn1 {
    private static final vd zzj;
    private static volatile qo1 zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        vd vdVar = new vd();
        zzj = vdVar;
        sn1.t(vd.class, vdVar);
    }

    public static ud z() {
        return (ud) zzj.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iM == 3) {
            return new vd();
        }
        if (iM == 4) {
            return new ud(zzj);
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
        synchronized (vd.class) {
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
}
