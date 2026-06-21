package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vj extends sn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final vj zzh;
    private static volatile qo1 zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        vj vjVar = new vj();
        zzh = vjVar;
        sn1.t(vj.class, vjVar);
    }

    public static uj A() {
        return (uj) zzh.q();
    }

    public final void B(boolean z5) {
        this.zzd |= 1;
        this.zze = z5;
    }

    public final void C(boolean z5) {
        this.zzd |= 2;
        this.zzf = z5;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (iM == 3) {
            return new vj();
        }
        if (iM == 4) {
            return new uj(zzh);
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
        synchronized (vj.class) {
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
