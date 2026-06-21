package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qs0 extends sn1 {
    private static final qs0 zzc;
    private static volatile qo1 zzd;
    private zn1 zza = to1.f10681f;
    private long zzb;

    static {
        qs0 qs0Var = new qs0();
        zzc = qs0Var;
        sn1.t(qs0.class, qs0Var);
    }

    public static ps0 z() {
        return (ps0) zzc.q();
    }

    public final void A(wr0 wr0Var) {
        zn1 zn1Var = this.zza;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zza = zn1Var.b(size + size);
        }
        this.zza.add(wr0Var);
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", wr0.class, "zzb"});
        }
        if (iM == 3) {
            return new qs0();
        }
        if (iM == 4) {
            return new ps0(zzc);
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
        synchronized (qs0.class) {
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
