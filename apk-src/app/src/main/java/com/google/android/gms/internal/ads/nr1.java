package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nr1 extends sn1 {
    private static final nr1 zzh;
    private static volatile qo1 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private wn1 zzd = tn1.f10667f;
    private zn1 zzf = to1.f10681f;
    private bn1 zzg = bn1.f3837c;

    static {
        nr1 nr1Var = new nr1();
        zzh = nr1Var;
        sn1.t(nr1.class, nr1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", mr1.class, "zzg"});
        }
        if (iM == 3) {
            return new nr1();
        }
        if (iM == 4) {
            return new jq1(zzh);
        }
        if (iM == 5) {
            return zzh;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzi;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (nr1.class) {
            try {
                rn1Var = zzi;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzh);
                    zzi = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
