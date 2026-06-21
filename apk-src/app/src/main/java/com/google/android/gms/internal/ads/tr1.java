package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class tr1 extends sn1 {
    private static final tr1 zzn;
    private static volatile qo1 zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private vr1 zzk;
    private sr1 zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        tr1 tr1Var = new tr1();
        zzn = tr1Var;
        sn1.t(tr1.class, tr1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", eq1.f5052u, "zze", eq1.f5051t, "zzf", "zzg", "zzh", "zzi", "zzj", eq1.f5050s, "zzk", "zzl", "zzm"});
        }
        if (iM == 3) {
            return new tr1();
        }
        if (iM == 4) {
            return new jq1(zzn);
        }
        if (iM == 5) {
            return zzn;
        }
        if (iM != 6) {
            throw null;
        }
        qo1 qo1Var = zzo;
        if (qo1Var != null) {
            return qo1Var;
        }
        synchronized (tr1.class) {
            try {
                rn1Var = zzo;
                if (rn1Var == null) {
                    rn1Var = new rn1(zzn);
                    zzo = rn1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rn1Var;
    }
}
