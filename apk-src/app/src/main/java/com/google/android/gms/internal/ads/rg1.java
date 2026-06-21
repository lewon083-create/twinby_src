package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rg1 extends sn1 {
    private static final rg1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        rg1 rg1Var = new rg1();
        zzd = rg1Var;
        sn1.t(rg1.class, rg1Var);
    }

    public static qg1 A() {
        return (qg1) zzd.q();
    }

    public static rg1 B() {
        return zzd;
    }

    public final /* synthetic */ void C(bh1 bh1Var) {
        this.zza = bh1Var.h();
    }

    public final int D() {
        int i = this.zzb;
        int i10 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int E() {
        int i = this.zzc;
        int i10 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void F(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzb = i - 2;
    }

    public final void G(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzc = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new rg1();
        }
        if (iM == 4) {
            return new qg1(zzd);
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
        synchronized (rg1.class) {
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

    public final bh1 z() {
        bh1 bh1VarA = bh1.a(this.zza);
        return bh1VarA == null ? bh1.UNRECOGNIZED : bh1VarA;
    }
}
