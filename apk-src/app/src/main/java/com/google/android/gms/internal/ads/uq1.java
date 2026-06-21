package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends sn1 {
    private static final uq1 zzi;
    private static volatile qo1 zzj;
    private int zza;
    private tq1 zzb;
    private bn1 zzd;
    private bn1 zze;
    private int zzf;
    private bn1 zzg;
    private byte zzh = 2;
    private zn1 zzc = to1.f10681f;

    static {
        uq1 uq1Var = new uq1();
        zzi = uq1Var;
        sn1.t(uq1.class, uq1Var);
    }

    public uq1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
        this.zzg = zm1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        switch (t.z.m(i)) {
            case 0:
                return Byte.valueOf(this.zzh);
            case 1:
                this.zzh = sn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new uo1(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", pq1.class, "zzd", "zze", "zzf", "zzg"});
            case 3:
                return new uq1();
            case 4:
                return new jq1(zzi);
            case 5:
                return zzi;
            case 6:
                qo1 qo1Var = zzj;
                if (qo1Var != null) {
                    return qo1Var;
                }
                synchronized (uq1.class) {
                    try {
                        rn1Var = zzj;
                        if (rn1Var == null) {
                            rn1Var = new rn1(zzi);
                            zzj = rn1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rn1Var;
            default:
                throw null;
        }
    }
}
