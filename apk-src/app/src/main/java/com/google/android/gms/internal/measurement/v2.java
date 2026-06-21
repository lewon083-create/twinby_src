package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends k5 {
    private static final v2 zzh;
    private int zzb;
    private int zzd;
    private o3 zze;
    private o3 zzf;
    private boolean zzg;

    static {
        v2 v2Var = new v2();
        zzh = v2Var;
        k5.m(v2.class, v2Var);
    }

    public static u2 w() {
        return (u2) zzh.h();
    }

    public final /* synthetic */ void A(boolean z5) {
        this.zzb |= 8;
        this.zzg = z5;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new v2();
        }
        if (i10 == 4) {
            return new u2(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final o3 r() {
        o3 o3Var = this.zze;
        return o3Var == null ? o3.y() : o3Var;
    }

    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    public final o3 t() {
        o3 o3Var = this.zzf;
        return o3Var == null ? o3.y() : o3Var;
    }

    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void y(o3 o3Var) {
        this.zze = o3Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void z(o3 o3Var) {
        this.zzf = o3Var;
        this.zzb |= 4;
    }
}
