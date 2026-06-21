package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class cr1 extends sn1 {
    private static final cr1 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private bn1 zzd;
    private bn1 zze;

    static {
        cr1 cr1Var = new cr1();
        zzf = cr1Var;
        sn1.t(cr1.class, cr1Var);
    }

    public cr1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static br1 z() {
        return (br1) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void B(bn1 bn1Var) {
        bn1Var.getClass();
        this.zza |= 4;
        this.zzd = bn1Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", eq1.f5041j, "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new cr1();
        }
        if (iM == 4) {
            return new br1(zzf);
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
        synchronized (cr1.class) {
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
