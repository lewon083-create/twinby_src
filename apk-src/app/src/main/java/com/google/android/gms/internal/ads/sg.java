package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class sg extends sn1 {
    private static final sg zzg;
    private static volatile qo1 zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        sg sgVar = new sg();
        zzg = sgVar;
        sn1.t(sg.class, sgVar);
    }

    public static sg E(zm1 zm1Var) {
        sg sgVar = zzg;
        kn1 kn1Var = kn1.f7271a;
        int i = tm1.f10663a;
        sn1 sn1VarM = sn1.m(sgVar, zm1Var, kn1.f7272b);
        sn1.y(sn1VarM);
        return (sg) sn1VarM;
    }

    public static sg F(zm1 zm1Var, kn1 kn1Var) {
        return (sg) sn1.m(zzg, zm1Var, kn1Var);
    }

    public static rg G() {
        return (rg) zzg.q();
    }

    public static sg H() {
        return zzg;
    }

    public final String A() {
        return this.zzc;
    }

    public final long B() {
        return this.zzd;
    }

    public final long C() {
        return this.zze;
    }

    public final long D() {
        return this.zzf;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iM == 3) {
            return new sg();
        }
        if (iM == 4) {
            return new rg(zzg);
        }
        if (iM == 5) {
            return zzg;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzh;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (sg.class) {
            try {
                rn1Var = zzh;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzg);
                    zzh = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final String z() {
        return this.zzb;
    }
}
