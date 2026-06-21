package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final gv1 f5915d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d51 f5918c;

    static {
        gv1 gv1Var;
        if (Build.VERSION.SDK_INT >= 33) {
            c51 c51Var = new c51(4);
            for (int i = 1; i <= 10; i++) {
                c51Var.f(Integer.valueOf(cq0.b(i)));
            }
            gv1Var = new gv1(2, c51Var.h());
        } else {
            gv1Var = new gv1(2, 10);
        }
        f5915d = gv1Var;
    }

    public gv1(int i, int i10) {
        this.f5916a = i;
        this.f5917b = i10;
        this.f5918c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv1)) {
            return false;
        }
        gv1 gv1Var = (gv1) obj;
        return this.f5916a == gv1Var.f5916a && this.f5917b == gv1Var.f5917b && Objects.equals(this.f5918c, gv1Var.f5918c);
    }

    public final int hashCode() {
        d51 d51Var = this.f5918c;
        return (((this.f5916a * 31) + this.f5917b) * 31) + (d51Var == null ? 0 : d51Var.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5918c);
        int i = this.f5916a;
        int length = String.valueOf(i).length();
        int i10 = this.f5917b;
        StringBuilder sb2 = new StringBuilder(length + 38 + String.valueOf(i10).length() + 15 + strValueOf.length() + 1);
        om1.u(sb2, "AudioProfile[format=", i, ", maxChannelCount=", i10);
        return t.z.g(sb2, ", channelMasks=", strValueOf, "]");
    }

    public gv1(int i, Set set) {
        this.f5916a = i;
        d51 d51VarR = d51.r(set);
        this.f5918c = d51VarR;
        d61 d61VarA = d51VarR.a();
        int iMax = 0;
        while (d61VarA.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) d61VarA.next()).intValue()));
        }
        this.f5917b = iMax;
    }
}
