package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ed extends sn1 {
    private static final ed zzo;
    private static volatile qo1 zzp;
    private int zza;
    private long zzc;
    private long zzg;
    private long zzh;
    private long zzj;
    private int zzn;
    private String zzb = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzi = "";
    private String zzk = "";
    private String zzl = "";
    private zn1 zzm = to1.f10681f;

    static {
        ed edVar = new ed();
        zzo = edVar;
        sn1.t(ed.class, edVar);
    }

    public static bd z() {
        return (bd) zzo.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 16;
        this.zzf = str;
    }

    public final /* synthetic */ void F(String str) {
        this.zza |= 1024;
        this.zzl = str;
    }

    public final /* synthetic */ void G(int i) {
        this.zzn = i - 1;
        this.zza |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", dd.class, "zzn", ad.f2847c});
        }
        if (iM == 3) {
            return new ed();
        }
        if (iM == 4) {
            return new bd(zzo);
        }
        if (iM == 5) {
            return zzo;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzp;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ed.class) {
            try {
                rn1Var = zzp;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzo);
                    zzp = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
