package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lv0 extends sn1 {
    private static final lv0 zzf;
    private static volatile qo1 zzg;
    private int zza;
    private wn1 zzb = tn1.f10667f;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        lv0 lv0Var = new lv0();
        zzf = lv0Var;
        sn1.t(lv0.class, lv0Var);
    }

    public static jv0 z() {
        return (jv0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void B(int i) {
        List list = this.zzb;
        if (!((qm1) list).f9553b) {
            int size = list.size();
            this.zzb = ((tn1) list).b(size + size);
        }
        ((tn1) this.zzb).f(2);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", ad.f2868y, "zzc", "zzd", "zze"});
        }
        if (iM == 3) {
            return new lv0();
        }
        if (iM == 4) {
            return new jv0(zzf);
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
        synchronized (lv0.class) {
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
