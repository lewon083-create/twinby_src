package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xc extends sn1 {
    private static final xc zzj;
    private static volatile qo1 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private fd zzg;
    private id zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        xc xcVar = new xc();
        zzj = xcVar;
        sn1.t(xc.class, xcVar);
    }

    public static wc D() {
        return (wc) zzj.q();
    }

    public final boolean A() {
        return this.zze;
    }

    public final fd B() {
        fd fdVar = this.zzg;
        return fdVar == null ? fd.E() : fdVar;
    }

    public final void C() {
        if (this.zzh == null) {
            int i = id.f6463a;
        }
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void F(boolean z5) {
        this.zza |= 8;
        this.zze = z5;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", ad.f2846b, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iM == 3) {
            return new xc();
        }
        if (iM == 4) {
            return new wc(zzj);
        }
        if (iM == 5) {
            return zzj;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzk;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (xc.class) {
            try {
                rn1Var = zzk;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzj);
                    zzk = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }

    public final String z() {
        return this.zzd;
    }
}
