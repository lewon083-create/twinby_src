package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xi extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final xi zzf;
    private static volatile qo1 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        xi xiVar = new xi();
        zzf = xiVar;
        sn1.t(xi.class, xiVar);
    }

    public static wi z() {
        return (wi) zzf.q();
    }

    public final void A(int i) {
        this.zzd = t.z.m(i);
        this.zzc |= 1;
    }

    public final void B(int i) {
        int i10 = 1;
        if (i == 1) {
            i10 = 0;
        } else if (i != 2) {
            if (i != 3) {
                i10 = 4;
                if (i != 4) {
                    throw null;
                }
            } else {
                i10 = 2;
            }
        }
        this.zze = i10;
        this.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", ad.f2861r, "zze", ad.f2860q});
        }
        if (iM == 3) {
            return new xi();
        }
        if (iM == 4) {
            return new wi(zzf);
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
        synchronized (xi.class) {
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
