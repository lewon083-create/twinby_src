package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fq1 extends sn1 {
    private static final fq1 zzy;
    private static volatile qo1 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private zn1 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zn1 zzo;
    private boolean zzp;
    private long zzu;
    private wn1 zzv;
    private boolean zzw;
    private wn1 zzx;

    static {
        fq1 fq1Var = new fq1();
        zzy = fq1Var;
        sn1.t(fq1.class, fq1Var);
    }

    public fq1() {
        to1 to1Var = to1.f10681f;
        this.zze = to1Var;
        this.zzj = "";
        this.zzo = to1Var;
        tn1 tn1Var = tn1.f10667f;
        this.zzv = tn1Var;
        this.zzx = tn1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", eq1.f5035c, "zzc", "zzd", "zze", "zzf", ad.E, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", dq1.class, "zzp", "zzu", "zzv", ad.C, "zzw", "zzx", eq1.f5034b});
        }
        if (iM == 3) {
            return new fq1();
        }
        if (iM == 4) {
            return new yj(zzy);
        }
        if (iM == 5) {
            return zzy;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzz;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (fq1.class) {
            try {
                rn1Var = zzz;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzy);
                    zzz = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
