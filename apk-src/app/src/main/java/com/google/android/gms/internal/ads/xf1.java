package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xf1 extends sn1 {
    private static final xf1 zze;
    private static volatile qo1 zzf;
    private int zza;
    private int zzb;
    private bg1 zzc;
    private bn1 zzd = bn1.f3837c;

    static {
        xf1 xf1Var = new xf1();
        zze = xf1Var;
        sn1.t(xf1.class, xf1Var);
    }

    public static xf1 C(bn1 bn1Var, kn1 kn1Var) {
        return (xf1) sn1.m(zze, bn1Var, kn1Var);
    }

    public static wf1 D() {
        return (wf1) zze.q();
    }

    public static qo1 E() {
        return zze.o();
    }

    public final bg1 A() {
        bg1 bg1Var = this.zzc;
        return bg1Var == null ? bg1.B() : bg1Var;
    }

    public final bn1 B() {
        return this.zzd;
    }

    public final /* synthetic */ void F(bg1 bg1Var) {
        this.zzc = bg1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void G(zm1 zm1Var) {
        this.zzd = zm1Var;
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
            return new xf1();
        }
        if (iM == 4) {
            return new wf1(zze);
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
        synchronized (xf1.class) {
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
