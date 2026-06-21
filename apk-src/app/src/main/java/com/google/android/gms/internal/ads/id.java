package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class id extends sn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6463a = 0;
    private static final id zzg;
    private static volatile qo1 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        id idVar = new id();
        zzg = idVar;
        sn1.t(id.class, idVar);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iM == 3) {
            return new id();
        }
        if (iM == 4) {
            return new cd(zzg);
        }
        if (iM == 5) {
            return zzg;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzh;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (id.class) {
            try {
                rn1Var = zzh;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzg);
                    zzh = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
