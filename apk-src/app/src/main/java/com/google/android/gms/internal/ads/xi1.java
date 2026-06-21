package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xi1 extends sn1 {
    private static final xi1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private int zzb;
    private bj1 zzc;
    private bn1 zzd = bn1.f3837c;

    static {
        xi1 xi1Var = new xi1();
        zze = xi1Var;
        sn1.t(xi1.class, xi1Var);
    }

    public static xi1 C(bn1 bn1Var, kn1 kn1Var) {
        return (xi1) sn1.m(zze, bn1Var, kn1Var);
    }

    public static wi1 D() {
        return (wi1) zze.q();
    }

    public final bj1 A() {
        bj1 bj1Var = this.zzc;
        return bj1Var == null ? bj1.B() : bj1Var;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void E(bj1 bj1Var) {
        this.zzc = bj1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        this.zzd = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iM == 3) {
            return new xi1();
        }
        if (iM == 4) {
            return new wi1(zze);
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
        synchronized (xi1.class) {
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
