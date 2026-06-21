package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class yp1 extends sn1 {
    private static final yp1 zzc;
    private static volatile qo1 zzd;
    private wn1 zza;
    private wn1 zzb;

    static {
        yp1 yp1Var = new yp1();
        zzc = yp1Var;
        sn1.t(yp1.class, yp1Var);
    }

    public yp1() {
        tn1 tn1Var = tn1.f10667f;
        this.zza = tn1Var;
        this.zzb = tn1Var;
    }

    public static yp1 z(byte[] bArr, kn1 kn1Var) {
        return (yp1) sn1.n(zzc, bArr, kn1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"zza", "zzb"});
        }
        if (iM == 3) {
            return new yp1();
        }
        if (iM == 4) {
            return new yj(zzc);
        }
        if (iM == 5) {
            return zzc;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzd;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (yp1.class) {
            try {
                rn1Var = zzd;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzc);
                    zzd = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
