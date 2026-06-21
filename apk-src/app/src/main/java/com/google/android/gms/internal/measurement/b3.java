package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends k5 {
    private static final b3 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        b3 b3Var = new b3();
        zzf = b3Var;
        k5.m(b3.class, b3Var);
    }

    public static a3 t() {
        return (a3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new b3();
        }
        if (i10 == 4) {
            return new a3(zzf);
        }
        if (i10 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final long s() {
        return this.zze;
    }

    public final /* synthetic */ void u(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void v(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
