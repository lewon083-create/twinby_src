package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mq1 extends sn1 {
    private static final mq1 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private lq1 zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        mq1 mq1Var = new mq1();
        zzf = mq1Var;
        sn1.t(mq1.class, mq1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new mq1();
        }
        if (iM == 4) {
            return new jq1(zzf);
        }
        if (iM == 5) {
            return zzf;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzg;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (mq1.class) {
            try {
                rn1Var = zzg;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzf);
                    zzg = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
