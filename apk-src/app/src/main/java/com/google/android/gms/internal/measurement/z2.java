package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends k5 {
    private static final z2 zzd;
    private q5 zzb = k6.f13854f;

    static {
        z2 z2Var = new z2();
        zzd = z2Var;
        k5.m(z2.class, z2Var);
    }

    public static w2 q() {
        return (w2) zzd.h();
    }

    public static z2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.k5
    public final Object o(int i) {
        int i10 = i - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new l6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", y2.class});
        }
        if (i10 == 3) {
            return new z2();
        }
        if (i10 == 4) {
            return new w2(zzd);
        }
        if (i10 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        q5 q5Var = this.zzb;
        if (!((u4) q5Var).f13994b) {
            int size = q5Var.size();
            this.zzb = q5Var.O(size + size);
        }
        t4.c(arrayList, this.zzb);
    }
}
