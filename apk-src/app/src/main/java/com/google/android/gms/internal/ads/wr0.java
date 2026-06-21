package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 extends sn1 {
    private static final wr0 zzc;
    private static volatile qo1 zzd;
    private int zza;
    private long zzb;

    static {
        wr0 wr0Var = new wr0();
        zzc = wr0Var;
        sn1.t(wr0.class, wr0Var);
    }

    public static vr0 z() {
        return (vr0) zzc.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void B(int i) {
        this.zza = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iM == 3) {
            return new wr0();
        }
        if (iM == 4) {
            return new vr0(zzc);
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
        synchronized (wr0.class) {
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
}
