package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kk extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final kk zzn;
    private static volatile qo1 zzo;
    private int zzg;
    private int zzh;
    private ij zzi;
    private ij zzj;
    private ij zzk;
    private zn1 zzl = to1.f10681f;
    private int zzm;

    static {
        kk kkVar = new kk();
        zzn = kkVar;
        sn1.t(kk.class, kkVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", ij.class, "zzm"});
        }
        if (iM == 3) {
            return new kk();
        }
        if (iM == 4) {
            return new yj(zzn);
        }
        if (iM == 5) {
            return zzn;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzo;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (kk.class) {
            try {
                rn1Var = zzo;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzn);
                    zzo = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
