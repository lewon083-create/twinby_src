package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class if1 extends sn1 {
    private static final if1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private int zzb;
    private lf1 zzc;

    static {
        if1 if1Var = new if1();
        zzd = if1Var;
        sn1.t(if1.class, if1Var);
    }

    public static if1 B(bn1 bn1Var, kn1 kn1Var) {
        return (if1) sn1.m(zzd, bn1Var, kn1Var);
    }

    public static hf1 C() {
        return (hf1) zzd.q();
    }

    public final lf1 A() {
        lf1 lf1Var = this.zzc;
        return lf1Var == null ? lf1.B() : lf1Var;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = i;
    }

    public final /* synthetic */ void E(lf1 lf1Var) {
        this.zzc = lf1Var;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new if1();
        }
        if (iM == 4) {
            return new hf1(zzd);
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
        synchronized (if1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
