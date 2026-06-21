package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hk extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final hk zzh;
    private static volatile qo1 zzi;
    private int zzd;
    private String zze = "";
    private zn1 zzf = to1.f10681f;
    private int zzg;

    static {
        hk hkVar = new hk();
        zzh = hkVar;
        sn1.t(hk.class, hkVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", gk.class, "zzg", ad.f2867x});
        }
        if (iM == 3) {
            return new hk();
        }
        if (iM == 4) {
            return new yj(zzh);
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
        synchronized (hk.class) {
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
