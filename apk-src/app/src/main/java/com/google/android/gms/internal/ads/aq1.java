package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class aq1 extends sn1 {
    private static final aq1 zzd;
    private static volatile qo1 zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        aq1 aq1Var = new aq1();
        zzd = aq1Var;
        sn1.t(aq1.class, aq1Var);
    }

    public static zp1 z() {
        return (zp1) zzd.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new aq1();
        }
        if (iM == 4) {
            return new zp1(zzd);
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
        synchronized (aq1.class) {
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
}
