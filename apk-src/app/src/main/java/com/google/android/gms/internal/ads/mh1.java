package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class mh1 extends sn1 {
    private static final mh1 zzd;
    private static volatile qo1 zze;
    private String zza = "";
    private bn1 zzb = bn1.f3837c;
    private int zzc;

    static {
        mh1 mh1Var = new mh1();
        zzd = mh1Var;
        sn1.t(mh1.class, mh1Var);
    }

    public static mh1 C(byte[] bArr, kn1 kn1Var) {
        sn1 sn1VarX = sn1.x(zzd, bArr, bArr.length, kn1Var);
        sn1.y(sn1VarX);
        return (mh1) sn1VarX;
    }

    public static lh1 D() {
        return (lh1) zzd.q();
    }

    public static mh1 E() {
        return zzd;
    }

    public final bn1 A() {
        return this.zzb;
    }

    public final ei1 B() {
        ei1 ei1VarA = ei1.a(this.zzc);
        return ei1VarA == null ? ei1.UNRECOGNIZED : ei1VarA;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void G(bn1 bn1Var) {
        bn1Var.getClass();
        this.zzb = bn1Var;
    }

    public final /* synthetic */ void H(ei1 ei1Var) {
        this.zzc = ei1Var.h();
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iM == 3) {
            return new mh1();
        }
        if (iM == 4) {
            return new lh1(zzd);
        }
        if (iM == 5) {
            return zzd;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zze;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (mh1.class) {
            try {
                rn1Var = zze;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzd);
                    zze = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final String z() {
        return this.zza;
    }
}
