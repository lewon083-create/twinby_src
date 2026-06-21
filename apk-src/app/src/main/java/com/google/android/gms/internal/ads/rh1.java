package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends sn1 {
    private static final rh1 zzc;
    private static volatile qo1 zzd;
    private int zza;
    private zn1 zzb = to1.f10681f;

    static {
        rh1 rh1Var = new rh1();
        zzc = rh1Var;
        sn1.t(rh1.class, rh1Var);
    }

    public static rh1 D(byte[] bArr, kn1 kn1Var) {
        sn1 sn1VarX = sn1.x(zzc, bArr, bArr.length, kn1Var);
        sn1.y(sn1VarX);
        return (rh1) sn1VarX;
    }

    public static rh1 E(ByteArrayInputStream byteArrayInputStream, kn1 kn1Var) throws co1 {
        sn1 sn1VarL = sn1.l(zzc, new dn1(byteArrayInputStream), kn1Var);
        sn1.y(sn1VarL);
        return (rh1) sn1VarL;
    }

    public static oh1 F() {
        return (oh1) zzc.q();
    }

    public final zn1 A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzb.size();
    }

    public final qh1 C(int i) {
        return (qh1) this.zzb.get(i);
    }

    public final /* synthetic */ void G(int i) {
        this.zza = i;
    }

    public final void H(qh1 qh1Var) {
        zn1 zn1Var = this.zzb;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzb = zn1Var.b(size + size);
        }
        this.zzb.add(qh1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", qh1.class});
        }
        if (iM == 3) {
            return new rh1();
        }
        if (iM == 4) {
            return new oh1(zzc);
        }
        if (iM == 5) {
            return zzc;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzd;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (rh1.class) {
            try {
                rn1Var = zzd;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzc);
                    zzd = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final int z() {
        return this.zza;
    }
}
