package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class kj extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final kj zzh;
    private static volatile qo1 zzi;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        kj kjVar = new kj();
        zzh = kjVar;
        sn1.t(kj.class, kjVar);
    }

    public static jj A() {
        return (jj) zzh.q();
    }

    public final void B(int i) {
        this.zzd |= 1;
        this.zze = i;
    }

    public final void C(int i) {
        this.zzd |= 2;
        this.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iM == 3) {
            return new kj();
        }
        if (iM == 4) {
            return new jj(zzh);
        }
        if (iM == 5) {
            return zzh;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzi;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (kj.class) {
            try {
                rn1Var = zzi;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzh);
                    zzi = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final void z(int i) {
        this.zzd |= 4;
        this.zzg = i;
    }
}
