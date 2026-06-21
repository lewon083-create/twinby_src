package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mk extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final mk zzv;
    private static volatile qo1 zzw;
    private int zzi;
    private ij zzk;
    private int zzl;
    private kj zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        mk mkVar = new mk();
        zzv = mkVar;
        sn1.t(mk.class, mkVar);
    }

    public static mk z() {
        return zzv;
    }

    public final void A(String str) {
        this.zzi |= 1;
        this.zzj = str;
    }

    public final void B(kj kjVar) {
        this.zzm = kjVar;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            ad adVar = ad.f2867x;
            return new uo1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", adVar, "zzp", adVar, "zzu", adVar});
        }
        if (iM == 3) {
            return new mk();
        }
        if (iM == 4) {
            return new lk(zzv);
        }
        if (iM == 5) {
            return zzv;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzw;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (mk.class) {
            try {
                rn1Var = zzw;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzv);
                    zzw = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
