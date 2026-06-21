package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends k5 {
    private static final d3 zzj;
    private int zzb;
    private q5 zzd = k6.f13854f;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        d3 d3Var = new d3();
        zzj = d3Var;
        k5.m(d3.class, d3Var);
    }

    public static c3 z() {
        return (c3) zzj.h();
    }

    public final /* synthetic */ void A(int i, g3 g3Var) {
        J();
        this.zzd.set(i, g3Var);
    }

    public final /* synthetic */ void B(g3 g3Var) {
        g3Var.getClass();
        J();
        this.zzd.add(g3Var);
    }

    public final /* synthetic */ void C(Iterable iterable) {
        J();
        t4.c(iterable, this.zzd);
    }

    public final void D() {
        this.zzd = k6.f13854f;
    }

    public final /* synthetic */ void E(int i) {
        J();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void G(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }

    public final void J() {
        q5 q5Var = this.zzd;
        if (((u4) q5Var).f13994b) {
            return;
        }
        int size = q5Var.size();
        this.zzd = q5Var.O(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", g3.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i10 == 3) {
            return new d3();
        }
        if (i10 == 4) {
            return new c3(zzj);
        }
        if (i10 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final g3 r(int i) {
        return (g3) this.zzd.get(i);
    }

    public final String s() {
        return this.zze;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final int y() {
        return this.zzh;
    }
}
