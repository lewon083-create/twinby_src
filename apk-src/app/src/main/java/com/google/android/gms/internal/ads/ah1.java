package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ah1 extends sn1 {
    private static final ah1 zzc;
    private static volatile qo1 zzd;
    private int zza;
    private bn1 zzb = bn1.f3837c;

    static {
        ah1 ah1Var = new ah1();
        zzc = ah1Var;
        sn1.t(ah1.class, ah1Var);
    }

    public static ah1 B(bn1 bn1Var, kn1 kn1Var) {
        return (ah1) sn1.m(zzc, bn1Var, kn1Var);
    }

    public static zg1 C() {
        return (zg1) zzc.q();
    }

    public static ah1 D() {
        return zzc;
    }

    public static qo1 E() {
        return zzc.o();
    }

    public final bn1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void F(bn1 bn1Var) {
        this.zzb = bn1Var;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zza", "zzb"});
        }
        if (iM == 3) {
            return new ah1();
        }
        if (iM == 4) {
            return new zg1(zzc);
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
        synchronized (ah1.class) {
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

    public final int z() {
        return this.zza;
    }
}
