package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xj extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final xj zzl;
    private static volatile qo1 zzm;
    private int zzf;
    private int zzg = 1000;
    private nj zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        xj xjVar = new xj();
        zzl = xjVar;
        sn1.t(xj.class, xjVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", ad.f2867x, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iM == 3) {
            return new xj();
        }
        if (iM == 4) {
            return new bs1(zzl);
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
        synchronized (xj.class) {
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
}
