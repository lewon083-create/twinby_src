package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qk extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final qk zzj;
    private static volatile qo1 zzk;
    private int zze;
    private int zzg;
    private ij zzi;
    private String zzf = "";
    private wn1 zzh = tn1.f10667f;

    static {
        qk qkVar = new qk();
        zzj = qkVar;
        sn1.t(qk.class, qkVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", ad.f2867x, "zzh", "zzi"});
        }
        if (iM == 3) {
            return new qk();
        }
        if (iM == 4) {
            return new yj(zzj);
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
        synchronized (qk.class) {
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
