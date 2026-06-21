package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class zc extends sn1 {
    private static final zc zzn;
    private static volatile qo1 zzo;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private zn1 zzb = to1.f10681f;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zc zcVar = new zc();
        zzn = zcVar;
        sn1.t(zc.class, zcVar);
    }

    public static yc z() {
        return (yc) zzn.q();
    }

    public final void A(hd hdVar) {
        zn1 zn1Var = this.zzb;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzb = zn1Var.b(size + size);
        }
        this.zzb.add(hdVar);
    }

    public final void B() {
        this.zzb = to1.f10681f;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void H(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 512;
        this.zzl = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 1024;
        this.zzm = j10;
    }

    public final /* synthetic */ void M(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzn, "\u0004\f\u0000\u0001\b?\f\u0000\u0001\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n", new Object[]{"zza", "zzb", hd.class, "zzc", "zzd", "zze", "zzf", "zzg", ad.f2848d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iM == 3) {
            return new zc();
        }
        if (iM == 4) {
            return new yc(zzn);
        }
        if (iM == 5) {
            return zzn;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzo;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (zc.class) {
            try {
                rn1Var = zzo;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzn);
                    zzo = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
