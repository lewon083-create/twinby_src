package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 extends sn1 {
    private static final ri1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        ri1 ri1Var = new ri1();
        zzd = ri1Var;
        sn1.t(ri1.class, ri1Var);
    }

    public static qi1 C() {
        return (qi1) zzd.q();
    }

    public static ri1 D() {
        return zzd;
    }

    public final bh1 A() {
        bh1 bh1VarA = bh1.a(this.zzb);
        return bh1VarA == null ? bh1.UNRECOGNIZED : bh1VarA;
    }

    public final int B() {
        return this.zzc;
    }

    public final /* synthetic */ void E(bh1 bh1Var) {
        this.zza = bh1Var.h();
    }

    public final /* synthetic */ void F(bh1 bh1Var) {
        this.zzb = bh1Var.h();
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
            return new uo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new ri1();
        }
        if (iM == 4) {
            return new qi1(zzd);
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
        synchronized (ri1.class) {
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
