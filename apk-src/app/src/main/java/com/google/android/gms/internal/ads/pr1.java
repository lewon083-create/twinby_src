package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pr1 extends sn1 {
    private static final pr1 zzp;
    private static volatile qo1 zzu;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zn1 zze;
    private String zzf;
    private String zzg;
    private boolean zzh;
    private double zzi;
    private zn1 zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;

    static {
        pr1 pr1Var = new pr1();
        zzp = pr1Var;
        sn1.t(pr1.class, pr1Var);
    }

    public pr1() {
        to1 to1Var = to1.f10681f;
        this.zze = to1Var;
        this.zzf = "";
        this.zzg = "";
        this.zzj = to1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", eq1.f5049r, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", or1.class, "zzc", "zzk", eq1.f5048q, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iM == 3) {
            return new pr1();
        }
        if (iM == 4) {
            return new jq1(zzp);
        }
        if (iM == 5) {
            return zzp;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzu;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (pr1.class) {
            try {
                rn1Var = zzu;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzp);
                    zzu = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
