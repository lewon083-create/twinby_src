package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zf1 extends sn1 {
    private static final zf1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private bg1 zzb;
    private int zzc;

    static {
        zf1 zf1Var = new zf1();
        zzd = zf1Var;
        sn1.t(zf1.class, zf1Var);
    }

    public static zf1 B(bn1 bn1Var, kn1 kn1Var) {
        return (zf1) sn1.m(zzd, bn1Var, kn1Var);
    }

    public static yf1 C() {
        return (yf1) zzd.q();
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(bg1 bg1Var) {
        this.zzb = bg1Var;
        this.zza |= 1;
    }

    public final /* synthetic */ void E(int i) {
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
            return new uo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new zf1();
        }
        if (iM == 4) {
            return new yf1(zzd);
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
        synchronized (zf1.class) {
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

    public final bg1 z() {
        bg1 bg1Var = this.zzb;
        return bg1Var == null ? bg1.B() : bg1Var;
    }
}
