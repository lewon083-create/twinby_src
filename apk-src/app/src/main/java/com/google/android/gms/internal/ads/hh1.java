package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hh1 extends sn1 {
    private static final hh1 zzc;
    private static volatile qo1 zzd;
    private int zza;
    private int zzb;

    static {
        hh1 hh1Var = new hh1();
        zzc = hh1Var;
        sn1.t(hh1.class, hh1Var);
    }

    public static gh1 B() {
        return (gh1) zzc.q();
    }

    public static hh1 C() {
        return zzc;
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(bh1 bh1Var) {
        this.zza = bh1Var.h();
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        if (iM == 3) {
            return new hh1();
        }
        if (iM == 4) {
            return new gh1(zzc);
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
        synchronized (hh1.class) {
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

    public final bh1 z() {
        bh1 bh1VarA = bh1.a(this.zza);
        return bh1VarA == null ? bh1.UNRECOGNIZED : bh1VarA;
    }
}
