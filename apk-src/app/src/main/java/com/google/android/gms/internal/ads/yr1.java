package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 extends sn1 {
    private static final yr1 zzj;
    private static volatile qo1 zzk;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private zn1 zzd;
    private zn1 zze;
    private zn1 zzf;
    private int zzg;
    private rr1 zzh;
    private String zzi;

    static {
        yr1 yr1Var = new yr1();
        zzj = yr1Var;
        sn1.t(yr1.class, yr1Var);
    }

    public yr1() {
        to1 to1Var = to1.f10681f;
        this.zzd = to1Var;
        this.zze = to1Var;
        this.zzf = to1Var;
        this.zzg = -1;
        this.zzi = "";
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", tr1.class, "zze", wr1.class, "zzg", "zzb", "zzf", cs1.class, "zzi", "zzh"});
        }
        if (iM == 3) {
            return new yr1();
        }
        if (iM == 4) {
            return new jq1(zzj);
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
        synchronized (yr1.class) {
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
