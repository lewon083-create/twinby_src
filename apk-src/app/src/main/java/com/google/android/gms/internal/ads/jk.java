package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class jk extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final jk zzl;
    private static volatile qo1 zzm;
    private int zzf;
    private String zzg = "";
    private zn1 zzh = to1.f10681f;
    private int zzi = 1000;
    private int zzj = 1000;
    private int zzk = 1000;

    static {
        jk jkVar = new jk();
        zzl = jkVar;
        sn1.t(jk.class, jkVar);
    }

    public static jk z() {
        return zzl;
    }

    public final void A(String str) {
        str.getClass();
        this.zzf |= 1;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            ad adVar = ad.f2867x;
            return new uo1(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzf", "zzg", "zzh", gk.class, "zzi", adVar, "zzj", adVar, "zzk", adVar});
        }
        if (iM == 3) {
            return new jk();
        }
        if (iM == 4) {
            return new ik(zzl);
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
        synchronized (jk.class) {
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
