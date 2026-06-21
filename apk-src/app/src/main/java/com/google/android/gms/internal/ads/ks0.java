package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ks0 extends sn1 {
    private static final ks0 zzi;
    private static volatile qo1 zzj;
    private long zzb;
    private long zzc;
    private boolean zzd;
    private long zze;
    private long zzf;
    private int zzh;
    private String zza = "";
    private String zzg = "";

    static {
        ks0 ks0Var = new ks0();
        zzi = ks0Var;
        sn1.t(ks0.class, ks0Var);
    }

    public static js0 z() {
        return (js0) zzi.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void B(long j10) {
        this.zzb = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zzc = j10;
    }

    public final /* synthetic */ void D(boolean z5) {
        this.zzd = z5;
    }

    public final /* synthetic */ void E(long j10) {
        this.zze = j10;
    }

    public final /* synthetic */ void F(long j10) {
        this.zzf = j10;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void H(int i) {
        this.zzh = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzi, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iM == 3) {
            return new ks0();
        }
        if (iM == 4) {
            return new js0(zzi);
        }
        if (iM == 5) {
            return zzi;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzj;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ks0.class) {
            try {
                rn1Var = zzj;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzi);
                    zzj = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
