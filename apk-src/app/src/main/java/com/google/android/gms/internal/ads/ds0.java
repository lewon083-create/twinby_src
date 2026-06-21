package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.AbstractCollection;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ds0 extends sn1 {
    private static final ds0 zzay;
    private static volatile qo1 zzaz;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private int zzS;
    private int zzT;
    private int zzV;
    private int zza;
    private long zzaf;
    private int zzah;
    private int zzai;
    private int zzaj;
    private vs0 zzak;
    private int zzal;
    private ts0 zzam;
    private is0 zzan;
    private ms0 zzao;
    private ls0 zzap;
    private us0 zzaq;
    private rs0 zzar;
    private os0 zzas;
    private yp1 zzat;
    private ws0 zzav;
    private qs0 zzaw;
    private ks0 zzax;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private String zzd = "";
    private wn1 zzh = tn1.f10667f;
    private String zzo = "";
    private String zzp = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private yn1 zzD = ho1.f6207f;
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzR = "";
    private String zzU = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzag = "";
    private String zzau = "";

    static {
        ds0 ds0Var = new ds0();
        zzay = ds0Var;
        sn1.t(ds0.class, ds0Var);
    }

    public static cs0 B() {
        return (cs0) zzay.q();
    }

    public final /* synthetic */ void A(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzL = i - 2;
    }

    public final /* synthetic */ void C(boolean z5) {
        this.zzi = z5;
    }

    public final /* synthetic */ void D(long j10) {
        this.zzj = j10;
    }

    public final /* synthetic */ void E(long j10) {
        this.zzk = j10;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzo = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzx = str;
    }

    public final /* synthetic */ void H(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzz = str2;
    }

    public final /* synthetic */ void I(int i) {
        this.zzA = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J(AbstractCollection abstractCollection) {
        yn1 yn1Var = this.zzD;
        if (!((qm1) yn1Var).f9553b) {
            this.zzD = sn1.k(yn1Var);
        }
        pm1.e(abstractCollection, this.zzD);
    }

    public final /* synthetic */ void K(int i) {
        this.zzG = i;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzH = j10;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzM = str;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzN = str;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzZ = str;
    }

    public final /* synthetic */ void P(String str) {
        this.zzaa = str;
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzab = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzac = str;
    }

    public final /* synthetic */ void S(String str) {
        this.zzad = str;
    }

    public final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzae = str;
    }

    public final void U(int i) {
        if (i == 11) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i10 = -1;
        switch (i) {
            case 1:
                i10 = 0;
                break;
            case 2:
            case 11:
                break;
            case 3:
                i10 = 1;
                break;
            case 4:
                i10 = 2;
                break;
            case 5:
                i10 = 3;
                break;
            case 6:
                i10 = 4;
                break;
            case 7:
                i10 = 5;
                break;
            case 8:
                i10 = 6;
                break;
            case 9:
                i10 = 7;
                break;
            case 10:
                i10 = 8;
                break;
            default:
                throw null;
        }
        this.zzal = i10;
    }

    public final /* synthetic */ void V(yp1 yp1Var) {
        this.zzat = yp1Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void W(String str) {
        this.zzau = str;
    }

    public final /* synthetic */ void X(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void Y() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzay, "\u0004G\u0000\u0001\u0001GG\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000b", new Object[]{"zza", "zzb", "zzi", "zzj", "zzn", "zzo", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzL", "zzM", "zzN", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzp", "zzv", "zzB", "zzC", "zzD", "zzO", "zzP", "zzX", "zzaf", "zzd", "zze", "zzf", "zzg", "zzk", "zzl", "zzm", "zzh", "zzai", "zzaj", "zzc", "zzam", "zzan", "zzS", "zzU", "zzR", "zzQ", "zzal", "zzT", "zzV", "zzW", "zzy", "zzao", "zzF", "zzap", "zzag", "zzah", "zzak", "zzaq", "zzar", "zzY", "zzas", "zzat", "zzau", "zzw", "zzav", "zzI", "zzJ", "zzK", "zzaw", "zzu", "zzax"});
        }
        if (iM == 3) {
            return new ds0();
        }
        if (iM == 4) {
            return new cs0(zzay);
        }
        if (iM == 5) {
            return zzay;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzaz;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ds0.class) {
            try {
                rn1Var = zzaz;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzay);
                    zzaz = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final /* synthetic */ void z(int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        this.zzE = i - 2;
    }
}
