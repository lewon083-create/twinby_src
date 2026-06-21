package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends sn1 {
    private static final vi zzB;
    private static volatile qo1 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private zn1 zzA;
    private int zzl;
    private int zzm;
    private int zzn = 1000;
    private hk zzo;
    private jk zzp;
    private zn1 zzu;
    private kk zzv;
    private ej zzw;
    private yi zzx;
    private rk zzy;
    private sk zzz;

    static {
        vi viVar = new vi();
        zzB = viVar;
        sn1.t(vi.class, viVar);
    }

    public vi() {
        to1 to1Var = to1.f10681f;
        this.zzu = to1Var;
        this.zzA = to1Var;
    }

    public static vi z() {
        return zzB;
    }

    public final void A(ti tiVar) {
        this.zzm = tiVar.f10620b;
        this.zzl |= 1;
    }

    public final void B(jk jkVar) {
        this.zzp = jkVar;
        this.zzl |= 8;
    }

    public final jk C() {
        jk jkVar = this.zzp;
        return jkVar == null ? jk.z() : jkVar;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", ad.f2859p, "zzn", ad.f2867x, "zzo", "zzp", "zzu", gk.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", lj.class});
        }
        if (iM == 3) {
            return new vi();
        }
        if (iM == 4) {
            return new ui(zzB);
        }
        if (iM == 5) {
            return zzB;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzC;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (vi.class) {
            try {
                rn1Var = zzC;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzB);
                    zzC = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
