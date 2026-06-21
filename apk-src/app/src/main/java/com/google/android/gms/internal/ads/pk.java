package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class pk extends sn1 {
    private static final pk zzF;
    private static volatile qo1 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private xi zzA;
    private vi zzB;
    private dj zzC;
    private ek zzD;
    private wj zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private kj zzw;
    private mk zzy;
    private nk zzz;
    private String zzp = "";
    private int zzv = 1000;
    private yn1 zzx = ho1.f6207f;

    static {
        pk pkVar = new pk();
        zzF = pkVar;
        sn1.t(pk.class, pkVar);
    }

    public static ok K() {
        return (ok) zzF.q();
    }

    public final void A(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final vi B() {
        vi viVar = this.zzB;
        return viVar == null ? vi.z() : viVar;
    }

    public final void C(wj wjVar) {
        this.zzE = wjVar;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(ArrayList arrayList) {
        yn1 yn1Var = this.zzx;
        if (!((qm1) yn1Var).f9553b) {
            this.zzx = sn1.k(yn1Var);
        }
        pm1.e(arrayList, this.zzx);
    }

    public final void E() {
        this.zzx = ho1.f6207f;
    }

    public final void F(mk mkVar) {
        this.zzy = mkVar;
        this.zzn |= 32;
    }

    public final void G(vi viVar) {
        this.zzB = viVar;
        this.zzn |= 256;
    }

    public final void H(dj djVar) {
        this.zzC = djVar;
        this.zzn |= 512;
    }

    public final void I(ek ekVar) {
        this.zzD = ekVar;
        this.zzn |= 1024;
    }

    public final String J() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", ad.f2867x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        if (iM == 3) {
            return new pk();
        }
        if (iM == 4) {
            return new ok(zzF);
        }
        if (iM == 5) {
            return zzF;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzG;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (pk.class) {
            try {
                rn1Var = zzG;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzF);
                    zzG = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final mk z() {
        mk mkVar = this.zzy;
        return mkVar == null ? mk.z() : mkVar;
    }
}
