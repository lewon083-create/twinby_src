package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nf1 extends sn1 {
    private static final nf1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private int zzb;
    private rf1 zzc;
    private dh1 zzd;

    static {
        nf1 nf1Var = new nf1();
        zze = nf1Var;
        sn1.t(nf1.class, nf1Var);
    }

    public static nf1 C(bn1 bn1Var, kn1 kn1Var) {
        return (nf1) sn1.m(zze, bn1Var, kn1Var);
    }

    public static mf1 D() {
        return (mf1) zze.q();
    }

    public static qo1 E() {
        return zze.o();
    }

    public final rf1 A() {
        rf1 rf1Var = this.zzc;
        return rf1Var == null ? rf1.D() : rf1Var;
    }

    public final dh1 B() {
        dh1 dh1Var = this.zzd;
        return dh1Var == null ? dh1.E() : dh1Var;
    }

    public final /* synthetic */ void F(rf1 rf1Var) {
        this.zzc = rf1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(dh1 dh1Var) {
        this.zzd = dh1Var;
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
            return new uo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iM == 3) {
            return new nf1();
        }
        if (iM == 4) {
            return new mf1(zze);
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
        synchronized (nf1.class) {
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

    public final int z() {
        return this.zzb;
    }
}
