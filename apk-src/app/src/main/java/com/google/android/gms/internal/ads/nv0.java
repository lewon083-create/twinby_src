package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends sn1 {
    private static final nv0 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private lv0 zze;

    static {
        nv0 nv0Var = new nv0();
        zzf = nv0Var;
        sn1.t(nv0.class, nv0Var);
    }

    public static mv0 z() {
        return (mv0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void B(lv0 lv0Var) {
        this.zze = lv0Var;
        this.zza |= 8;
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
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", ad.f2869z, "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new nv0();
        }
        if (iM == 4) {
            return new mv0(zzf);
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
        synchronized (nv0.class) {
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
