package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends k5 {
    private static final o1 zzi;
    private int zzb;
    private int zzd;
    private q5 zze;
    private q5 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        o1 o1Var = new o1();
        zzi = o1Var;
        k5.m(o1.class, o1Var);
    }

    public o1() {
        k6 k6Var = k6.f13854f;
        this.zze = k6Var;
        this.zzf = k6Var;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", x1.class, "zzf", q1.class, "zzg", "zzh"});
        }
        if (i10 == 3) {
            return new o1();
        }
        if (i10 == 4) {
            return new n1(zzi);
        }
        if (i10 == 5) {
            return zzi;
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

    public final x1 t(int i) {
        return (x1) this.zze.get(i);
    }

    public final q5 u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final q1 w(int i) {
        return (q1) this.zzf.get(i);
    }

    public final void x(int i, x1 x1Var) {
        q5 q5Var = this.zze;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zze = q5Var.O(size + size);
        }
        this.zze.set(i, x1Var);
    }

    public final void y(int i, q1 q1Var) {
        q5 q5Var = this.zzf;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zzf = q5Var.O(size + size);
        }
        this.zzf.set(i, q1Var);
    }
}
