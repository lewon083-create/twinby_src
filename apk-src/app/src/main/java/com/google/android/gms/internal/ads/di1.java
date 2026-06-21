package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class di1 extends sn1 {
    private static final di1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private String zzb = "";
    private mh1 zzc;

    static {
        di1 di1Var = new di1();
        zzd = di1Var;
        sn1.t(di1.class, di1Var);
    }

    public static di1 B(bn1 bn1Var, kn1 kn1Var) {
        return (di1) sn1.m(zzd, bn1Var, kn1Var);
    }

    public static ci1 C() {
        return (ci1) zzd.q();
    }

    public static di1 D() {
        return zzd;
    }

    public final mh1 A() {
        mh1 mh1Var = this.zzc;
        return mh1Var == null ? mh1.E() : mh1Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void F(mh1 mh1Var) {
        mh1Var.getClass();
        this.zzc = mh1Var;
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
            return new uo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new di1();
        }
        if (iM == 4) {
            return new ci1(zzd);
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
        synchronized (di1.class) {
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

    public final String z() {
        return this.zzb;
    }
}
