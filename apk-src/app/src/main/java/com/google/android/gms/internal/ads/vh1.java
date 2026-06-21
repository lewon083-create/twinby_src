package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class vh1 extends sn1 {
    private static final vh1 zzc;
    private static volatile qo1 zzd;
    private int zza;
    private zn1 zzb = to1.f10681f;

    static {
        vh1 vh1Var = new vh1();
        zzc = vh1Var;
        sn1.t(vh1.class, vh1Var);
    }

    public static sh1 z() {
        return (sh1) zzc.q();
    }

    public final /* synthetic */ void A(int i) {
        this.zza = i;
    }

    public final void B(uh1 uh1Var) {
        zn1 zn1Var = this.zzb;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzb = zn1Var.b(size + size);
        }
        this.zzb.add(uh1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", uh1.class});
        }
        if (iM == 3) {
            return new vh1();
        }
        if (iM == 4) {
            return new sh1(zzc);
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
        synchronized (vh1.class) {
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
}
