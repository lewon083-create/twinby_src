package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 extends sn1 {
    private static final pf1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private tf1 zzb;
    private fh1 zzc;

    static {
        pf1 pf1Var = new pf1();
        zzd = pf1Var;
        sn1.t(pf1.class, pf1Var);
    }

    public static pf1 B(bn1 bn1Var, kn1 kn1Var) {
        return (pf1) sn1.m(zzd, bn1Var, kn1Var);
    }

    public static of1 C() {
        return (of1) zzd.q();
    }

    public final fh1 A() {
        fh1 fh1Var = this.zzc;
        return fh1Var == null ? fh1.E() : fh1Var;
    }

    public final /* synthetic */ void D(tf1 tf1Var) {
        this.zzb = tf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(fh1 fh1Var) {
        this.zzc = fh1Var;
        this.zza |= 2;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new pf1();
        }
        if (iM == 4) {
            return new of1(zzd);
        }
        if (iM == 5) {
            return zzd;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zze;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (pf1.class) {
            try {
                rn1Var = zze;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzd);
                    zze = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final tf1 z() {
        tf1 tf1Var = this.zzb;
        return tf1Var == null ? tf1.C() : tf1Var;
    }
}
