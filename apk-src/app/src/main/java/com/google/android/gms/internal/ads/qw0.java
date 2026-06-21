package com.google.android.gms.internal.ads;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 extends sn1 {
    private static final qw0 zzb;
    private static volatile qo1 zzc;
    private jo1 zza = jo1.f6909c;

    static {
        qw0 qw0Var = new qw0();
        zzb = qw0Var;
        sn1.t(qw0.class, qw0Var);
    }

    public static qw0 B(FileInputStream fileInputStream) throws co1 {
        qw0 qw0Var = zzb;
        dn1 dn1Var = new dn1(fileInputStream);
        kn1 kn1Var = kn1.f7271a;
        int i = tm1.f10663a;
        sn1 sn1VarL = sn1.l(qw0Var, dn1Var, kn1.f7272b);
        sn1.y(sn1VarL);
        return (qw0) sn1VarL;
    }

    public static qw0 C() {
        return zzb;
    }

    public final Map A() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final jo1 D() {
        jo1 jo1Var = this.zza;
        if (!jo1Var.f6910b) {
            this.zza = jo1Var.a();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", pw0.f9196a});
        }
        if (iM == 3) {
            return new qw0();
        }
        if (iM == 4) {
            return new ow0(zzb);
        }
        if (iM == 5) {
            return zzb;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzc;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (qw0.class) {
            try {
                rn1Var = zzc;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzb);
                    zzc = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final int z() {
        return this.zza.size();
    }
}
