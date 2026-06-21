package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lr1 extends sn1 {
    private static final lr1 zzR;
    private static volatile qo1 zzS;
    private jr1 zzA;
    private zn1 zzB;
    private mq1 zzC;
    private String zzD;
    private fq1 zzE;
    private zn1 zzF;
    private wq1 zzG;
    private int zzH;
    private zn1 zzI;
    private zn1 zzJ;
    private long zzK;
    private kr1 zzL;
    private yq1 zzM;
    private String zzN;
    private ir1 zzO;
    private zn1 zzP;
    private int zza;
    private int zzb;
    private int zzc;
    private iq1 zzg;
    private zn1 zzh;
    private zn1 zzi;
    private String zzj;
    private cr1 zzk;
    private boolean zzl;
    private zn1 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private bn1 zzu;
    private gr1 zzv;
    private boolean zzw;
    private String zzx;
    private zn1 zzy;
    private zn1 zzz;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        lr1 lr1Var = new lr1();
        zzR = lr1Var;
        sn1.t(lr1.class, lr1Var);
    }

    public lr1() {
        to1 to1Var = to1.f10681f;
        this.zzh = to1Var;
        this.zzi = to1Var;
        this.zzj = "";
        this.zzm = to1Var;
        this.zzn = "";
        this.zzu = bn1.f3837c;
        this.zzx = "";
        this.zzy = to1Var;
        this.zzz = to1Var;
        this.zzB = to1Var;
        this.zzD = "";
        this.zzF = to1Var;
        this.zzI = to1Var;
        this.zzJ = to1Var;
        this.zzN = "";
        this.zzP = to1Var;
    }

    public static gq1 C() {
        return (gq1) zzR.q();
    }

    public final zn1 A() {
        return this.zzh;
    }

    public final String B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(iq1 iq1Var) {
        this.zzg = iq1Var;
        this.zza |= 32;
    }

    public final void G(er1 er1Var) {
        zn1 zn1Var = this.zzh;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzh = zn1Var.b(size + size);
        }
        this.zzh.add(er1Var);
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void I() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    public final /* synthetic */ void J(cr1 cr1Var) {
        this.zzk = cr1Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void K(gr1 gr1Var) {
        this.zzv = gr1Var;
        this.zza |= 8192;
    }

    public final void L(ArrayList arrayList) {
        zn1 zn1Var = this.zzy;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzy = zn1Var.b(size + size);
        }
        pm1.e(arrayList, this.zzy);
    }

    public final void M(ArrayList arrayList) {
        zn1 zn1Var = this.zzz;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzz = zn1Var.b(size + size);
        }
        pm1.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void N(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        switch (t.z.m(i)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = sn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new uo1(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", er1.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", eq1.f5042k, "zzc", eq1.f5036d, "zzg", "zzj", "zzk", "zzu", "zzi", nr1.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", pr1.class, "zzC", "zzD", "zzE", "zzF", nq1.class, "zzG", "zzH", eq1.f5046o, "zzI", xq1.class, "zzJ", ar1.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", hr1.class});
            case 3:
                return new lr1();
            case 4:
                return new gq1(zzR);
            case 5:
                return zzR;
            case 6:
                qo1 qo1Var = zzS;
                if (qo1Var != null) {
                    return qo1Var;
                }
                synchronized (lr1.class) {
                    try {
                        rn1Var = zzS;
                        if (rn1Var == null) {
                            rn1Var = new rn1(zzR);
                            zzS = rn1Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return rn1Var;
            default:
                throw null;
        }
    }

    public final String z() {
        return this.zzd;
    }
}
