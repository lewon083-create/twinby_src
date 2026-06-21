package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tf1 extends sn1 {
    private static final tf1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private vf1 zzb;
    private int zzc;

    static {
        tf1 tf1Var = new tf1();
        zzd = tf1Var;
        sn1.t(tf1.class, tf1Var);
    }

    public static sf1 B() {
        return (sf1) zzd.q();
    }

    public static tf1 C() {
        return zzd;
    }

    public final int A() {
        return this.zzc;
    }

    public final /* synthetic */ void D(vf1 vf1Var) {
        this.zzb = vf1Var;
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
            return new tf1();
        }
        if (iM == 4) {
            return new sf1(zzd);
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
        synchronized (tf1.class) {
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

    public final vf1 z() {
        vf1 vf1Var = this.zzb;
        return vf1Var == null ? vf1.B() : vf1Var;
    }
}
