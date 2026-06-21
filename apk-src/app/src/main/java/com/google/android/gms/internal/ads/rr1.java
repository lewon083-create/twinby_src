package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rr1 extends sn1 {
    private static final rr1 zzb;
    private static volatile qo1 zzc;
    private zn1 zza = to1.f10681f;

    static {
        rr1 rr1Var = new rr1();
        zzb = rr1Var;
        sn1.t(rr1.class, rr1Var);
    }

    @Override // com.google.android.gms.internal.ads.sn1
    public final Object v(int i, sn1 sn1Var) {
        qo1 rn1Var;
        int iM = t.z.m(i);
        if (iM == 0) {
            return (byte) 1;
        }
        if (iM == 2) {
            return new uo1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", qr1.class});
        }
        if (iM == 3) {
            return new rr1();
        }
        if (iM == 4) {
            return new jq1(zzb);
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
        synchronized (rr1.class) {
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
}
