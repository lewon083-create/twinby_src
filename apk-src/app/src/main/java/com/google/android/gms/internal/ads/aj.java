package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class aj extends sn1 {
    private static final aj zzG;
    private static volatile qo1 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final xn1 zzx = new c6(26);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private wn1 zzw = tn1.f10667f;
    private xi zzy;
    private int zzz;

    static {
        aj ajVar = new aj();
        zzG = ajVar;
        sn1.t(aj.class, ajVar);
    }

    public static aj O(byte[] bArr) throws co1 {
        aj ajVar = zzG;
        int length = bArr.length;
        kn1 kn1Var = kn1.f7271a;
        int i = tm1.f10663a;
        sn1 sn1VarX = sn1.x(ajVar, bArr, length, kn1.f7272b);
        sn1.y(sn1VarX);
        return (aj) sn1VarX;
    }

    public static zi P() {
        return (zi) zzG.q();
    }

    public final void A(int i) {
        this.zzp = a0.u.f(i);
        this.zzn |= 2;
    }

    public final void B(long j10) {
        this.zzn |= 4;
        this.zzu = j10;
    }

    public final void C(long j10) {
        this.zzn |= 8;
        this.zzv = j10;
    }

    public final void D(ArrayList arrayList) {
        List list = this.zzw;
        if (!((qm1) list).f9553b) {
            int size = list.size();
            this.zzw = ((tn1) list).b(size + size);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fk fkVar = (fk) it.next();
            ((tn1) this.zzw).f(fkVar.f5373b);
        }
    }

    public final void E(xi xiVar) {
        this.zzy = xiVar;
        this.zzn |= 16;
    }

    public final void F(int i) {
        this.zzz = a0.u.f(i);
        this.zzn |= 32;
    }

    public final void G(int i) {
        this.zzA = a0.u.f(i);
        this.zzn |= 64;
    }

    public final void H(int i) {
        this.zzB = a0.u.f(i);
        this.zzn |= 128;
    }

    public final void I(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void J(int i) {
        this.zzD = a0.u.f(i);
        this.zzn |= 512;
    }

    public final void K(cj cjVar) {
        this.zzE = cjVar.f4225b;
        this.zzn |= 1024;
    }

    public final void L(long j10) {
        this.zzn |= 2048;
        this.zzF = j10;
    }

    public final long M() {
        return this.zzo;
    }

    public final int N() {
        int i = this.zzp;
        int i10 = i != 0 ? i != 1 ? i != 1000 ? 0 : 3 : 2 : 1;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            ad adVar = ad.f2867x;
            return new uo1(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", adVar, "zzu", "zzv", "zzw", ad.f2865v, "zzy", "zzz", adVar, "zzA", adVar, "zzB", adVar, "zzC", "zzD", adVar, "zzE", ad.f2862s, "zzF"});
        }
        if (iM == 3) {
            return new aj();
        }
        if (iM == 4) {
            return new zi(zzG);
        }
        if (iM == 5) {
            return zzG;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzH;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (aj.class) {
            try {
                rn1Var = zzH;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzG);
                    zzH = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final void z(long j10) {
        this.zzn |= 1;
        this.zzo = j10;
    }
}
