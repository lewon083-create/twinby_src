package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nw0 extends sn1 {
    private static final nw0 zzn;
    private static volatile qo1 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private yn1 zzk;
    private yn1 zzl;
    private yn1 zzm;

    static {
        nw0 nw0Var = new nw0();
        zzn = nw0Var;
        sn1.t(nw0.class, nw0Var);
    }

    public nw0() {
        ho1 ho1Var = ho1.f6207f;
        this.zzk = ho1Var;
        this.zzl = ho1Var;
        this.zzm = ho1Var;
    }

    public static nw0 Q() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j10) {
        yn1 yn1Var = this.zzm;
        if (!((qm1) yn1Var).f9553b) {
            this.zzm = sn1.k(yn1Var);
        }
        ((ho1) this.zzm).e(j10);
    }

    public final void B() {
        this.zzm = ho1.f6207f;
    }

    public final String C() {
        return this.zzb;
    }

    public final long D() {
        return this.zzc;
    }

    public final int E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final long H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final long J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zza & 64) != 0;
    }

    public final yn1 L() {
        return this.zzk;
    }

    public final int M() {
        return this.zzk.size();
    }

    public final int N() {
        return this.zzl.size();
    }

    public final yn1 O() {
        return this.zzm;
    }

    public final int P() {
        return this.zzm.size();
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void S(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void T(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void U() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void V(boolean z5) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void W(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void Z(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(long j10) {
        yn1 yn1Var = this.zzk;
        if (!((qm1) yn1Var).f9553b) {
            this.zzk = sn1.k(yn1Var);
        }
        ((ho1) this.zzk).e(j10);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iM == 3) {
            return new nw0();
        }
        if (iM == 4) {
            return new mw0(zzn);
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
        synchronized (nw0.class) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(long j10) {
        yn1 yn1Var = this.zzl;
        if (!((qm1) yn1Var).f9553b) {
            this.zzl = sn1.k(yn1Var);
        }
        ((ho1) this.zzl).e(j10);
    }
}
