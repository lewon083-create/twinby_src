package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qh1 extends sn1 {
    private static final qh1 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private kh1 zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        qh1 qh1Var = new qh1();
        zzf = qh1Var;
        sn1.t(qh1.class, qh1Var);
    }

    public static ph1 D() {
        return (ph1) zzf.q();
    }

    public final kh1 A() {
        kh1 kh1Var = this.zzb;
        return kh1Var == null ? kh1.D() : kh1Var;
    }

    public final int B() {
        return this.zzd;
    }

    public final ei1 C() {
        ei1 ei1VarA = ei1.a(this.zze);
        return ei1VarA == null ? ei1.UNRECOGNIZED : ei1VarA;
    }

    public final /* synthetic */ void E(kh1 kh1Var) {
        this.zzb = kh1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void F(int i) {
        this.zzd = i;
    }

    public final /* synthetic */ void G(ei1 ei1Var) {
        this.zze = ei1Var.h();
    }

    public final int H() {
        int i = this.zzc;
        int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void I(int i) {
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
            return new uo1(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new qh1();
        }
        if (iM == 4) {
            return new ph1(zzf);
        }
        if (iM == 5) {
            return zzf;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzg;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (qh1.class) {
            try {
                rn1Var = zzg;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzf);
                    zzg = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final boolean z() {
        return (this.zza & 1) != 0;
    }
}
