package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ux0 extends sn1 {
    private static volatile qo1 zzA;
    private static final ux0 zzz;
    private int zza;
    private int zzb;
    private xx0 zzf;
    private boolean zzg;
    private zx0 zzj;
    private boolean zzy;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zze = true;
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 10;
    private long zzl = 100;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;
    private boolean zzv = true;
    private boolean zzw = true;
    private boolean zzx = true;

    static {
        ux0 ux0Var = new ux0();
        zzz = ux0Var;
        sn1.t(ux0.class, ux0Var);
    }

    public static tx0 X() {
        return (tx0) zzz.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 32768;
        this.zzu = j10;
    }

    public final /* synthetic */ void B(boolean z5) {
        this.zza |= 65536;
        this.zzv = z5;
    }

    public final int C() {
        int i;
        int i10 = this.zzb;
        if (i10 != 0) {
            i = 2;
            if (i10 != 1) {
                i = i10 != 2 ? i10 != 3 ? 0 : 4 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void D(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final boolean E() {
        return this.zzc;
    }

    public final String F() {
        return this.zzd;
    }

    public final boolean G() {
        return this.zze;
    }

    public final xx0 H() {
        xx0 xx0Var = this.zzf;
        return xx0Var == null ? xx0.E() : xx0Var;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final long J() {
        return this.zzh;
    }

    public final long K() {
        return this.zzi;
    }

    public final zx0 L() {
        zx0 zx0Var = this.zzj;
        return zx0Var == null ? zx0.H() : zx0Var;
    }

    public final long M() {
        return this.zzk;
    }

    public final long N() {
        return this.zzl;
    }

    public final long O() {
        return this.zzm;
    }

    public final String P() {
        return this.zzn;
    }

    public final String Q() {
        return this.zzo;
    }

    public final long R() {
        return this.zzp;
    }

    public final long S() {
        return this.zzu;
    }

    public final boolean T() {
        return this.zzv;
    }

    public final boolean U() {
        return this.zzw;
    }

    public final boolean V() {
        return this.zzx;
    }

    public final boolean W() {
        return this.zzy;
    }

    public final /* synthetic */ void Y(boolean z5) {
        this.zza |= 2;
        this.zzc = z5;
    }

    public final /* synthetic */ void Z(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void a0(xx0 xx0Var) {
        this.zzf = xx0Var;
        this.zza |= 16;
    }

    public final /* synthetic */ void b0(long j10) {
        this.zza |= 64;
        this.zzh = j10;
    }

    public final /* synthetic */ void c0(long j10) {
        this.zza |= 128;
        this.zzi = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzz, "\u0004\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011\u0014ဇ\u0012\u0015ဇ\u0013", new Object[]{"zza", "zzb", ad.A, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw", "zzx", "zzy"});
        }
        if (iM == 3) {
            return new ux0();
        }
        if (iM == 4) {
            return new tx0(zzz);
        }
        if (iM == 5) {
            return zzz;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzA;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ux0.class) {
            try {
                rn1Var = zzA;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzz);
                    zzA = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final /* synthetic */ void z(zx0 zx0Var) {
        this.zzj = zx0Var;
        this.zza |= 256;
    }
}
