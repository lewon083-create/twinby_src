package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends k5 {
    private static final q3 zzf;
    private int zzb;
    private int zzd;
    private p5 zze = y5.f14097f;

    static {
        q3 q3Var = new q3();
        zzf = q3Var;
        k5.m(q3.class, q3Var);
    }

    public static p3 u() {
        return (p3) zzf.h();
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i10 == 3) {
            return new q3();
        }
        if (i10 == 4) {
            return new p3(zzf);
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

    public final List r() {
        return this.zze;
    }

    public final int s() {
        return this.zze.size();
    }

    public final long t(int i) {
        return ((y5) this.zze).c(i);
    }

    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void w(List list) {
        List list2 = this.zze;
        if (!((u4) list2).f13994b) {
            int size = list2.size();
            this.zze = ((y5) list2).O(size + size);
        }
        t4.c(list, this.zze);
    }
}
