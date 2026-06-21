package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class er1 extends sn1 {
    private static final er1 zzl;
    private static volatile qo1 zzm;
    private int zza;
    private int zzb;
    private sq1 zzd;
    private uq1 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private wn1 zzg = tn1.f10667f;
    private String zzh = "";
    private zn1 zzj = to1.f10681f;

    static {
        er1 er1Var = new er1();
        zzl = er1Var;
        sn1.t(er1.class, er1Var);
    }

    public static dr1 B() {
        return (dr1) zzl.q();
    }

    public final int A() {
        return this.zzj.size();
    }

    public final /* synthetic */ void C(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void E(sq1 sq1Var) {
        this.zzd = sq1Var;
        this.zza |= 4;
    }

    public final void F(String str) {
        str.getClass();
        zn1 zn1Var = this.zzj;
        if (!((qm1) zn1Var).f9553b) {
            int size = zn1Var.size();
            this.zzj = zn1Var.b(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void G(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        switch (t.z.m(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = sn1Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new uo1(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", eq1.f5043l, "zzj"});
            case 3:
                return new er1();
            case 4:
                return new dr1(zzl);
            case 5:
                return zzl;
            case 6:
                qo1 qo1Var = zzm;
                if (qo1Var != null) {
                    return qo1Var;
                }
                synchronized (er1.class) {
                    try {
                        rn1Var = zzm;
                        if (rn1Var == null) {
                            rn1Var = new rn1(zzl);
                            zzm = rn1Var;
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
        return this.zzc;
    }
}
