package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 extends k5 {
    private static final o3 zzg;
    private p5 zzb;
    private p5 zzd;
    private q5 zze;
    private q5 zzf;

    static {
        o3 o3Var = new o3();
        zzg = o3Var;
        k5.m(o3.class, o3Var);
    }

    public o3() {
        y5 y5Var = y5.f14097f;
        this.zzb = y5Var;
        this.zzd = y5Var;
        k6 k6Var = k6.f13854f;
        this.zze = k6Var;
        this.zzf = k6Var;
    }

    public static n3 x() {
        return (n3) zzg.h();
    }

    public static o3 y() {
        return zzg;
    }

    public final void A() {
        this.zzb = y5.f14097f;
    }

    public final void B(List list) {
        List list2 = this.zzd;
        if (!((u4) list2).f13994b) {
            int size = list2.size();
            this.zzd = ((y5) list2).O(size + size);
        }
        t4.c(list, this.zzd);
    }

    public final void C() {
        this.zzd = y5.f14097f;
    }

    public final void D(ArrayList arrayList) {
        q5 q5Var = this.zze;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zze = q5Var.O(size + size);
        }
        t4.c(arrayList, this.zze);
    }

    public final void E() {
        this.zze = k6.f13854f;
    }

    public final void F(Iterable iterable) {
        q5 q5Var = this.zzf;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zzf = q5Var.O(size + size);
        }
        t4.c(iterable, this.zzf);
    }

    public final void G() {
        this.zzf = k6.f13854f;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", b3.class, "zzf", q3.class});
        }
        if (i10 == 3) {
            return new o3();
        }
        if (i10 == 4) {
            return new n3(zzg);
        }
        if (i10 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return this.zzd.size();
    }

    public final q5 t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final List v() {
        return this.zzf;
    }

    public final int w() {
        return this.zzf.size();
    }

    public final void z(Iterable iterable) {
        List list = this.zzb;
        if (!((u4) list).f13994b) {
            int size = list.size();
            this.zzb = ((y5) list).O(size + size);
        }
        t4.c(iterable, this.zzb);
    }
}
