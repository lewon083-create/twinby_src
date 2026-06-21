package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 extends sn1 {
    private static final rs0 zzg;
    private static volatile qo1 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        rs0 rs0Var = new rs0();
        zzg = rs0Var;
        sn1.t(rs0.class, rs0Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iM == 3) {
            return new rs0();
        }
        if (iM == 4) {
            return new yj(zzg);
        }
        if (iM == 5) {
            return zzg;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzh;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (rs0.class) {
            try {
                rn1Var = zzh;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzg);
                    zzh = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
