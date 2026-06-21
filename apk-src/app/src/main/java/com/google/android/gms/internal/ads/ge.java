package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ge extends sn1 {
    private static final ge zzf;
    private static volatile qo1 zzg;
    private int zza;
    private zn1 zzb = to1.f10681f;
    private bn1 zzc = bn1.f3837c;
    private int zzd = 1;
    private int zze = 1;

    static {
        ge geVar = new ge();
        zzf = geVar;
        sn1.t(ge.class, geVar);
    }

    public static fe z() {
        return (fe) zzf.q();
    }

    public final void A(zm1 zm1Var) {
        zn1 zn1Var = this.zzb;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzb = zn1Var.b(size + size);
        }
        this.zzb.add(zm1Var);
    }

    public final /* synthetic */ void B(zm1 zm1Var) {
        this.zza |= 1;
        this.zzc = zm1Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void D(int i) {
        this.zze = i - 1;
        this.zza |= 4;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", ad.f2857n, "zze", ad.f2855l});
        }
        if (iM == 3) {
            return new ge();
        }
        if (iM == 4) {
            return new fe(zzf);
        }
        if (iM == 5) {
            return zzf;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzg;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (ge.class) {
            try {
                rn1Var = zzg;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzf);
                    zzg = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
