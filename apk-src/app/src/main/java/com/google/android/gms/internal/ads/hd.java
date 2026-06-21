package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hd extends sn1 {
    private static final hd zzi;
    private static volatile qo1 zzj;
    private int zza;
    private long zzb;
    private long zzc;
    private int zzd;
    private long zzg;
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        hd hdVar = new hd();
        zzi = hdVar;
        sn1.t(hd.class, hdVar);
    }

    public static gd z() {
        return (gd) zzi.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 64;
        this.zzh = str;
    }

    public final /* synthetic */ void G(int i) {
        this.zzd = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", ad.f2849e, "zze", "zzf", "zzg", "zzh"});
        }
        if (iM == 3) {
            return new hd();
        }
        if (iM == 4) {
            return new gd(zzi);
        }
        if (iM == 5) {
            return zzi;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzj;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (hd.class) {
            try {
                rn1Var = zzj;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzi);
                    zzj = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
