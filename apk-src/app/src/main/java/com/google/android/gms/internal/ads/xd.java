package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends sn1 {
    private static final xd zzl;
    private static volatile qo1 zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private long zzi;
    private long zzj;
    private long zzk;
    private wn1 zze = tn1.f10667f;
    private zn1 zzh = to1.f10681f;

    static {
        xd xdVar = new xd();
        zzl = xdVar;
        sn1.t(xd.class, xdVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", ae.class, "zzi", "zzj", "zzk"});
        }
        if (iM == 3) {
            return new xd();
        }
        if (iM == 4) {
            return new cd(zzl);
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
        synchronized (xd.class) {
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
