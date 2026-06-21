package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends k5 {
    private static final h2 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private q5 zzg;
    private q5 zzh;
    private q5 zzi;
    private String zzj;
    private boolean zzk;
    private q5 zzl;
    private q5 zzm;
    private String zzn;
    private String zzo;
    private c2 zzp;
    private j2 zzq;
    private m2 zzr;
    private k2 zzs;
    private i2 zzt;

    static {
        h2 h2Var = new h2();
        zzu = h2Var;
        k5.m(h2.class, h2Var);
    }

    public h2() {
        k6 k6Var = k6.f13854f;
        this.zzg = k6Var;
        this.zzh = k6Var;
        this.zzi = k6Var;
        this.zzj = "";
        this.zzl = k6Var;
        this.zzm = k6Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static g2 F() {
        return (g2) zzu.h();
    }

    public static h2 G() {
        return zzu;
    }

    public final String A() {
        return this.zzn;
    }

    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    public final c2 C() {
        c2 c2Var = this.zzp;
        return c2Var == null ? c2.v() : c2Var;
    }

    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    public final m2 E() {
        m2 m2Var = this.zzr;
        return m2Var == null ? m2.r() : m2Var;
    }

    public final void H(int i, f2 f2Var) {
        q5 q5Var = this.zzh;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zzh = q5Var.O(size + size);
        }
        this.zzh.set(i, f2Var);
    }

    public final void I() {
        this.zzi = k6.f13854f;
    }

    public final void J() {
        this.zzl = k6.f13854f;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", l2.class, "zzh", f2.class, "zzi", o1.class, "zzj", "zzk", "zzl", x3.class, "zzm", d2.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i10 == 3) {
            return new h2();
        }
        if (i10 == 4) {
            return new g2(zzu);
        }
        if (i10 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    public final long q() {
        return this.zzd;
    }

    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    public final String s() {
        return this.zze;
    }

    public final q5 t() {
        return this.zzg;
    }

    public final int u() {
        return this.zzh.size();
    }

    public final f2 v(int i) {
        return (f2) this.zzh.get(i);
    }

    public final q5 w() {
        return this.zzi;
    }

    public final q5 x() {
        return this.zzl;
    }

    public final int y() {
        return this.zzl.size();
    }

    public final List z() {
        return this.zzm;
    }
}
