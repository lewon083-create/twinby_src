package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pq1 extends sn1 {
    private static final pq1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private bn1 zzb;
    private bn1 zzc;
    private byte zzd = 2;

    static {
        pq1 pq1Var = new pq1();
        zze = pq1Var;
        sn1.t(pq1.class, pq1Var);
    }

    public pq1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzb = zm1Var;
        this.zzc = zm1Var;
    }

    public static oq1 z() {
        return (oq1) zze.q();
    }

    public final /* synthetic */ void A(zm1 zm1Var) {
        this.zza |= 1;
        this.zzb = zm1Var;
    }

    public final /* synthetic */ void B(bn1 bn1Var) {
        this.zza |= 2;
        this.zzc = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        switch (t.z.m(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                this.zzd = sn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new uo1(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new pq1();
            case 4:
                return new oq1(zze);
            case 5:
                return zze;
            case 6:
                qo1 qo1Var = zzf;
                if (qo1Var != null) {
                    return qo1Var;
                }
                synchronized (pq1.class) {
                    try {
                        rn1Var = zzf;
                        if (rn1Var == null) {
                            rn1Var = new rn1(zze);
                            zzf = rn1Var;
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
