package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends k5 {
    private static final s1 zzh;
    private int zzb;
    private y1 zzd;
    private v1 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        s1 s1Var = new s1();
        zzh = s1Var;
        k5.m(s1.class, s1Var);
    }

    public static s1 x() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new s1();
        }
        if (i10 == 4) {
            return new r1(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final y1 q() {
        y1 y1Var = this.zzd;
        return y1Var == null ? y1.w() : y1Var;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final v1 s() {
        v1 v1Var = this.zze;
        return v1Var == null ? v1.y() : v1Var;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final boolean u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final String w() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
