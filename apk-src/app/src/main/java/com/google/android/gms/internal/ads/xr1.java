package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class xr1 extends sn1 {
    private static final xr1 zzl;
    private static volatile qo1 zzm;
    private int zza;
    private bn1 zzb = bn1.f3837c;
    private wn1 zzc;
    private long zzd;
    private wn1 zze;
    private zn1 zzf;
    private String zzg;
    private zn1 zzh;
    private yr1 zzi;
    private zr1 zzj;
    private tl1 zzk;

    static {
        xr1 xr1Var = new xr1();
        zzl = xr1Var;
        sn1.t(xr1.class, xr1Var);
    }

    public xr1() {
        tn1 tn1Var = tn1.f10667f;
        this.zzc = tn1Var;
        this.zze = tn1Var;
        to1 to1Var = to1.f10681f;
        this.zzf = to1Var;
        this.zzg = "";
        this.zzh = to1Var;
    }

    public static xr1 z(byte[] bArr, kn1 kn1Var) throws co1 {
        sn1 sn1VarX = sn1.x(zzl, bArr, bArr.length, kn1Var);
        sn1.y(sn1VarX);
        return (xr1) sn1VarX;
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", tr1.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        if (iM == 3) {
            return new xr1();
        }
        if (iM == 4) {
            return new jq1(zzl);
        }
        if (iM == 5) {
            return zzl;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzm;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (xr1.class) {
            try {
                rn1Var = zzm;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzl);
                    zzm = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
