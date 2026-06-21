package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends sn1 {
    private static final fh1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private hh1 zzb;
    private int zzc;
    private int zzd;

    static {
        fh1 fh1Var = new fh1();
        zze = fh1Var;
        sn1.t(fh1.class, fh1Var);
    }

    public static fh1 C(bn1 bn1Var, kn1 kn1Var) {
        return (fh1) sn1.m(zze, bn1Var, kn1Var);
    }

    public static eh1 D() {
        return (eh1) zze.q();
    }

    public static fh1 E() {
        return zze;
    }

    public final int A() {
        return this.zzc;
    }

    public final int B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(hh1 hh1Var) {
        this.zzb = hh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iM == 3) {
            return new fh1();
        }
        if (iM == 4) {
            return new eh1(zze);
        }
        if (iM == 5) {
            return zze;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzf;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (fh1.class) {
            try {
                rn1Var = zzf;
                if (rn1Var == null) {
                    rn1Var = new rn1(zze);
                    zzf = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final hh1 z() {
        hh1 hh1Var = this.zzb;
        return hh1Var == null ? hh1.C() : hh1Var;
    }
}
