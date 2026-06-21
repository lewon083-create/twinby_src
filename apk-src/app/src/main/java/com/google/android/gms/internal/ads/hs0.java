package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class hs0 extends sn1 {
    private static final hs0 zzd;
    private static volatile qo1 zze;
    private int zza;
    private zn1 zzb = to1.f10681f;
    private xp1 zzc;

    static {
        hs0 hs0Var = new hs0();
        zzd = hs0Var;
        sn1.t(hs0.class, hs0Var);
    }

    public static es0 A() {
        return (es0) zzd.q();
    }

    public final void B(gs0 gs0Var) {
        zn1 zn1Var = this.zzb;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzb = zn1Var.b(size + size);
        }
        this.zzb.add(gs0Var);
    }

    public final void C() {
        this.zzb = to1.f10681f;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", gs0.class, "zzc"});
        }
        if (iM == 3) {
            return new hs0();
        }
        if (iM == 4) {
            return new es0(zzd);
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
        synchronized (hs0.class) {
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

    public final int z() {
        return this.zzb.size();
    }
}
