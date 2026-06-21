package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 extends sn1 {
    private static final bz0 zze;
    private static volatile qo1 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        bz0 bz0Var = new bz0();
        zze = bz0Var;
        sn1.t(bz0.class, bz0Var);
    }

    public static bz0 C(zm1 zm1Var) {
        bz0 bz0Var = zze;
        kn1 kn1Var = kn1.f7271a;
        int i = tm1.f10663a;
        sn1 sn1VarM = sn1.m(bz0Var, zm1Var, kn1.f7272b);
        sn1.y(sn1VarM);
        return (bz0) sn1VarM;
    }

    public static az0 D() {
        return (az0) zze.q();
    }

    public static bz0 E() {
        return zze;
    }

    public final qg A() {
        return this.zzb == 2 ? (qg) this.zzc : qg.C();
    }

    public final ng B() {
        ng ngVarA = ng.a(this.zzd);
        return ngVarA == null ? ng.UNSUPPORTED : ngVarA;
    }

    public final /* synthetic */ void F(sg sgVar) {
        sgVar.getClass();
        this.zzc = sgVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void G(qg qgVar) {
        qgVar.getClass();
        this.zzc = qgVar;
        this.zzb = 2;
    }

    public final void H(ng ngVar) {
        this.zzd = ngVar.f8295b;
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
            return new uo1(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", sg.class, qg.class, "zzd", ad.f2858o});
        }
        if (iM == 3) {
            return new bz0();
        }
        if (iM == 4) {
            return new az0(zze);
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
        synchronized (bz0.class) {
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

    public final sg z() {
        return this.zzb == 1 ? (sg) this.zzc : sg.H();
    }
}
