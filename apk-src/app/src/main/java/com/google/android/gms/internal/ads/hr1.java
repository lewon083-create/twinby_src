package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hr1 extends sn1 {
    private static final hr1 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private String zzb = "";
    private zn1 zzc;
    private zn1 zzd;
    private String zze;

    static {
        hr1 hr1Var = new hr1();
        zzf = hr1Var;
        sn1.t(hr1.class, hr1Var);
    }

    public hr1() {
        to1 to1Var = to1.f10681f;
        this.zzc = to1Var;
        this.zzd = to1Var;
        this.zze = "";
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new hr1();
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
        synchronized (hr1.class) {
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
