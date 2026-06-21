package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends k5 {
    private static final q1 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private q5 zzf = k6.f13854f;
    private boolean zzg;
    private v1 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        q1 q1Var = new q1();
        zzl = q1Var;
        k5.m(q1.class, q1Var);
    }

    public static p1 B() {
        return (p1) zzl.h();
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void D(int i, s1 s1Var) {
        q5 q5Var = this.zzf;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zzf = q5Var.O(size + size);
        }
        this.zzf.set(i, s1Var);
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", s1.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i10 == 3) {
            return new q1();
        }
        if (i10 == 4) {
            return new p1(zzl);
        }
        if (i10 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final int q() {
        return this.zzd;
    }

    public final String r() {
        return this.zze;
    }

    public final List s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }

    public final s1 u(int i) {
        return (s1) this.zzf.get(i);
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final v1 w() {
        v1 v1Var = this.zzh;
        return v1Var == null ? v1.y() : v1Var;
    }

    public final boolean x() {
        return this.zzi;
    }

    public final boolean y() {
        return this.zzj;
    }

    public final boolean z() {
        return (this.zzb & 64) != 0;
    }
}
