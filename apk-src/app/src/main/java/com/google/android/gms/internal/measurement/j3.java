package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 extends k5 {
    private static final j3 zzh;
    private int zzb;
    private q5 zzd = k6.f13854f;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        j3 j3Var = new j3();
        zzh = j3Var;
        k5.m(j3.class, j3Var);
    }

    public static i3 w() {
        return (i3) zzh.h();
    }

    public static i3 x(j3 j3Var) {
        j5 j5VarH = zzh.h();
        j5VarH.f(j3Var);
        return (i3) j5VarH;
    }

    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        t4.c(arrayList, this.zzd);
    }

    public final void B() {
        this.zzd = k6.f13854f;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void E() {
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
            return new l6(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", l3.class, "zze", "zzf", "zzg", u1.f13987j});
        }
        if (i10 == 3) {
            return new j3();
        }
        if (i10 == 4) {
            return new i3(zzh);
        }
        if (i10 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final int q() {
        return this.zzd.size();
    }

    public final l3 r(int i) {
        return (l3) this.zzd.get(i);
    }

    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final /* synthetic */ void y(int i, l3 l3Var) {
        E();
        this.zzd.set(i, l3Var);
    }

    public final /* synthetic */ void z(l3 l3Var) {
        E();
        this.zzd.add(l3Var);
    }
}
