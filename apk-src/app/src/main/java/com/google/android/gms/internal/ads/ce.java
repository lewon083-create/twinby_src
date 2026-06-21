package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ce extends sn1 {
    private static final ce zzh;
    private static volatile qo1 zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        ce ceVar = new ce();
        zzh = ceVar;
        sn1.t(ce.class, ceVar);
    }

    public static be z() {
        return (be) zzh.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 1;
        this.zzb = "0.825731049";
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void F(long j10) {
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
            return new uo1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iM == 3) {
            return new ce();
        }
        if (iM == 4) {
            return new be(zzh);
        }
        if (iM == 5) {
            return zzh;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzi;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ce.class) {
            try {
                rn1Var = zzi;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzh);
                    zzi = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
