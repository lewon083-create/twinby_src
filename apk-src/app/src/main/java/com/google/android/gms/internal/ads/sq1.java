package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sq1 extends sn1 {
    private static final sq1 zzh;
    private static volatile qo1 zzi;
    private int zza;
    private rq1 zzb;
    private bn1 zzd;
    private bn1 zze;
    private int zzf;
    private byte zzg = 2;
    private zn1 zzc = to1.f10681f;

    static {
        sq1 sq1Var = new sq1();
        zzh = sq1Var;
        sn1.t(sq1.class, sq1Var);
    }

    public sq1() {
        zm1 zm1Var = bn1.f3837c;
        this.zzd = zm1Var;
        this.zze = zm1Var;
    }

    public static qq1 z() {
        return (qq1) zzh.q();
    }

    public final void A(pq1 pq1Var) {
        zn1 zn1Var = this.zzc;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzc = zn1Var.b(size + size);
        }
        this.zzc.add(pq1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        switch (t.z.m(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                this.zzg = sn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new uo1(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", pq1.class, "zzd", "zze", "zzf"});
            case 3:
                return new sq1();
            case 4:
                return new qq1(zzh);
            case 5:
                return zzh;
            case 6:
                qo1 qo1Var = zzi;
                if (qo1Var != null) {
                    return qo1Var;
                }
                synchronized (sq1.class) {
                    try {
                        rn1Var = zzi;
                        if (rn1Var == null) {
                            rn1Var = new rn1(zzh);
                            zzi = rn1Var;
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
