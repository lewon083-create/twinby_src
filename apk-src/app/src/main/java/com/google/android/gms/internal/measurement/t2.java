package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends k5 {
    private static final t2 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        t2 t2Var = new t2();
        zzk = t2Var;
        k5.m(t2.class, t2Var);
    }

    public static s2 w() {
        return (s2) zzk.h();
    }

    public static t2 x() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z5) {
        this.zzb |= 4;
        this.zzf = z5;
    }

    public final /* synthetic */ void B(boolean z5) {
        this.zzb |= 8;
        this.zzg = z5;
    }

    public final /* synthetic */ void C(boolean z5) {
        this.zzb |= 16;
        this.zzh = z5;
    }

    public final /* synthetic */ void D(boolean z5) {
        this.zzb |= 32;
        this.zzi = z5;
    }

    public final /* synthetic */ void E(boolean z5) {
        this.zzb |= 64;
        this.zzj = z5;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new t2();
        }
        if (i10 == 4) {
            return new s2(zzk);
        }
        if (i10 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean p() {
        return this.zzd;
    }

    public final boolean q() {
        return this.zze;
    }

    public final boolean r() {
        return this.zzf;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzj;
    }

    public final /* synthetic */ void y(boolean z5) {
        this.zzb |= 1;
        this.zzd = z5;
    }

    public final /* synthetic */ void z(boolean z5) {
        this.zzb |= 2;
        this.zze = z5;
    }
}
