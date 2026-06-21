package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lf1 extends sn1 {
    private static final lf1 zzb;
    private static volatile qo1 zzc;
    private int zza;

    static {
        lf1 lf1Var = new lf1();
        zzb = lf1Var;
        sn1.t(lf1.class, lf1Var);
    }

    public static jf1 A() {
        return (jf1) zzb.q();
    }

    public static lf1 B() {
        return zzb;
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iM == 3) {
            return new lf1();
        }
        if (iM == 4) {
            return new jf1(zzb);
        }
        if (iM == 5) {
            return zzb;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzc;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (lf1.class) {
            try {
                rn1Var = zzc;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzb);
                    zzc = rn1Var;
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
